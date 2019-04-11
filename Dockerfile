FROM java:alpine
ARG JAR_FILE=target/authservice-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} authservice.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/authservice.jar"]