FROM amazoncorretto:17-alpine-jdk
MAINTAINER jmc
COPY target/com-0.0.1-SNAPSHOT.jar portfolio-app.jar
ENTRYPOINT ["java","-jar","/portfolio-app.jar"]