FROM openjdk:11
LABEL Shalini Mittal
EXPOSE 8761
WORKDIR /app

# Copy maven executable to the image
COPY mvnw .
COPY .mvn .mvn

# Copy the pom.xml file
COPY pom.xml .

# Copy the project source
COPY ./src ./src
COPY ./pom.xml ./pom.xml

RUN chmod 755 /app/mvnw

RUN ./mvnw clean package -DskipTests


ENTRYPOINT ["java","-jar","target/eureka.jar"]