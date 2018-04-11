//create docker container for mysql database;

$ docker run --name=docker-mysql --env="MYSQL_ROOT_PASSWORD=root" --env="MYSQL_PASSWORD=root" --env="MYSQL_DATABASE=wagawin_family" mysql

//create image for spring boot application

FROM java:8 //java: openjdk8

VOLUME /tmp

EXPOSE 8080

ADD /var/wagawin/task/person-0.0.1-SNAPSHOT.jar wagawin-code-task.jar

ENTRYPOINT ["java","-jar","wagawin-code-task.jar"]
