FROM openjdk:10
ADD ./target/eureka-server-0.0.1-SNAPSHOT.jar  /usr/src/eureka-server-0.0.1-SNAPSHOT.jar
EXPOSE 9090
WORKDIR /usr/src
ENTRYPOINT ["java","-jar", "eureka-server-0.0.1-SNAPSHOT.jar"]

