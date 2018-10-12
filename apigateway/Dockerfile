FROM openjdk:10
ADD ./target/apigateway-0.0.1-SNAPSHOT.jar  /usr/src/apigateway-0.0.1-SNAPSHOT.jar
EXPOSE 8081
WORKDIR /usr/src
ENTRYPOINT ["java","-jar", "apigateway-0.0.1-SNAPSHOT.jar"]

