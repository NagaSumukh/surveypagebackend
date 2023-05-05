FROM ubuntu
RUN apt-get update && apt-get install -y openjdk-17-jdk && apt-get install -y unzip
RUN mkdir test

COPY backend.war /test
RUN unzip test/backend.war
CMD ["bash"]

CMD ["/usr/bin/java", "-jar", "/target/swe645hw4-0.0.1-SNAPSHOT.jar"]



EXPOSE 8080