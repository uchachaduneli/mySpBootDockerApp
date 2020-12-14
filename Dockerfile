FROM openjdk:8-jdk-alpine
ADD target/mySpBootDockerApp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080

#           build & push to dockerHub
#docker build -t uchachaduneli/any-name-for-repo .
#docker push uchachaduneli/same-name-for-repo

#  next step enter into docker installed server & run container from image of dockerhub
#  pattern sudo docker run -p outer-port:inner-port uchachaduneli/same-name-for-repo
#  Examle:  sudo docker run -p 8080:8080 uchachaduneli/same-name-for-repo
