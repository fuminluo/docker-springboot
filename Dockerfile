FROM openjdk:8u181-jdk-alpine
ARG workdir=/usr/local
WORKDIR ${workdir}
VOLUME ${workdir}
ADD springboot-docker-0.0.1.jar app.jar
EXPOSE 8086
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]