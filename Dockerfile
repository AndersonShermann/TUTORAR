from unbuntu:latest as build

run apt-get update
run apt-get install openjdk-17-jdk -y
copy . .

run apt-get install maven -y
run mvn clean install

from openjdk:17-jdk-slim

expose 8080

copy --from=build /target/deploy_render-1.0.0.jar app.jar

ENTRYPOINT [ "java", "-jar", "add.jar" ]