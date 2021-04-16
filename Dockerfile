FROM openjdk:11-jre
LABEL maintainer="BOOTCAMP-HACKATHON"
COPY target/categories-*SNAPSHOT.jar /opt/app.jar
ENTRYPOINT ["java", "-Djava.file.encoding=UTF-8","-jar","/opt/app.jar"]