##==> [docker image build -t apptwitter-frontend . ]
##==> [docker run -it --name apptwitter-frontend -p 5050:5050 apptwitter-frontend:latest]
##==> [docker exec -it apptwitter-frontend sh]
##==> [docker logs -tf apptwitter-frontend]
FROM openjdk:8-jdk-alpine
MAINTAINER "felipegeorge13 <felipegeorge13@gmail.com>"

VOLUME /tmp

RUN apk add git

RUN mkdir /home/apptwitter-frontend
WORKDIR /home/apptwitter-frontend

RUN git clone https://github.com/felipegeorge/teste-case-apptwitter-frontend.git
WORKDIR /home/apptwitter-frontend/teste-case-apptwitter-frontend

CMD ["java", "-Dspring.profiles.active=docker", "-jar", "AppTwitter-front/target/AppTwitter-front-1.0.0.jar", "&"]
