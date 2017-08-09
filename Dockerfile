FROM java:8
VOLUME /tmp
ADD target/bookingservice-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 9000
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]