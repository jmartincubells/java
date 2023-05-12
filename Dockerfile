FROM amazoncorretto:17-alpine-jdk
MAINTAINER jmc
COPY target/com-0.0.1-SNAPSHOT.jar com-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/com-0.0.1-SNAPSHOT.jar"]