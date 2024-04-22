FROM openjdk:21-jdk

EXPOSE 8080

ARG JAR_FILE=target/spring-boot-sample-api-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} spring-app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-app.jar"]

#   mvn package
#   docker image build --tag sb-app .