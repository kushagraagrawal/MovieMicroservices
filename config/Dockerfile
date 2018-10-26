FROM openjdk:10
ADD ./target/config-0.0.1-SNAPSHOT.jar  /usr/src/config-0.0.1-SNAPSHOT.jar
EXPOSE 8888
WORKDIR /usr/src
ENTRYPOINT ["java","-jar", "config-0.0.1-SNAPSHOT.jar"]

