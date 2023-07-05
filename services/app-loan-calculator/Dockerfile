FROM eclipse-temurin:17-jdk-jammy

RUN mkdir -p /home/java/services/app-loan-calculator

WORKDIR /home/java/services/app-loan-calculator

COPY services/app-loan-calculator/build/libs/*.jar app-loan-calculator.jar

CMD ["java", "-jar", "app-loan-calculator.jar"]

EXPOSE 9090
