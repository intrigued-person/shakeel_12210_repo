FROM openjdk:18
WORKDIR /app
COPY ./target/obss1-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "obss1-0.0.1-SNAPSHOT.jar"]
