# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
# copy WAR into image
COPY target/moments-1.0-SNAPSHOT.jar /app.jar
# run application with this command line
EXPOSE 8080
CMD ["/usr/bin/java", "-jar", "/app.jar"]
