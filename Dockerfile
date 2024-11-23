FROM eclipse-temurin:17
COPY target/fullflow.jar fullflow.jar
CMD ["java","-jar","fullflow.jar"]