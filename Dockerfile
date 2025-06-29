FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY build/libs/venue-service-0.0.1-SNAPSHOT.jar app.jar

ARG MONGODB_URI
ENV MONGODB_URI=${MONGODB_URI}

EXPOSE 8080

CMD ["sh", "-c", "java -jar app.jar --spring.profiles.active=prod --spring.data.mongodb.uri=$MONGODB_URI"]
