FROM openjdk:17-jdk

RUN mkdir /cafe

WORKDIR /cafe

VOLUME /cafe

ARG JAR_FILE=build/libs/cafe-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} cafe-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "cafe-0.0.1-SNAPSHOT.jar"]