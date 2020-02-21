FROM openjdk:8
EXPOSE 8081
ADD target/boot-jenkins-docker-integration.jar boot-jenkins-docker-integration.jar
ENTRYPOINT ["java","-jar","/boot-jenkins-docker-integration.jar"]