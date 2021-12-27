## Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
MAINTAINER d n mallik <narasimha.dasari@valuemomentum.com>

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
#EXPOSE 7777

## The application's jar file
ARG JAR_FILE=target/search_functionality-0.0.1-SNAPSHOT.jar

## Add the application's jar to the container
ADD ${JAR_FILE} search_functionality-0.0.1-SNAPSHOT.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/search_functionality-0.0.1-SNAPSHOT.jar"]
