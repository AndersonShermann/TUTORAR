from ubuntu:latest as build

run apt-get update
run apt-get install openjdk-17-jdk -y
copy . .

run apt-get install maven -y
run mvn clean install

from openjdk:17-jdk-slim

expose 8080

copy --from=build /target/Tutorar-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", "-jar", "add.jar" ]