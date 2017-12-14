FROM java:8
VOLUME /tmp
ADD target/frontend-service-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/urandom", "-Deureka.client.serviceUrl.defaultZone=http://registry:1111/eureka/", "-jar", "/app.jar"]