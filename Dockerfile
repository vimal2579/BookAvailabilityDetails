# Pull base image.
# FROM ubuntu:latest
FROM tomcat:8.0-alpine

RUN \
# Update
apt-get update -y && \
# Install Java
apt-get install default-jre -y

ADD .\target\BookAvailabilityDetails.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]