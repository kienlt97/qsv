FROM openjdk:8-jdk-alpine
EXPOSE 8098
ADD target/qsv-0.0.1-SNAPSHOT.jar qsv-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/qsv-0.0.1-SNAPSHOT.jar"]