FROM gradle:8.2.1-jdk11 as builder
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build bootjar

FROM eclipse-temurin:11-alpine
EXPOSE 8080
RUN mkdir /app
COPY --from=builder /home/gradle/src/build/libs/*-SNAPSHOT.jar /app/bootjar.jar
ENTRYPOINT ["java", "-jar","/app/bootjar.jar"]