FROM openjdk:8

COPY target/demo-0.0.1-SNAPSHOT.jar /work/
WORKDIR /work
CMD ["java", "-Dfile.encoding=UTF-8", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US.UTF-8
ENV LC_ALL en_US.UTF-8