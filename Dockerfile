FROM openjdk:8
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac -cp /usr/src/myapp -cp Pokemon.jar -encoding utf8 *.java
RUN jar cfm MyJar.jar *.class
RUN java -jar MyJar.jar