# Dockerfile para a aplicação Java 21

# Imagem base do OpenJDK 21
FROM eclipse-temurin:21-jdk

# Definir diretório de trabalho
WORKDIR /app

#RUN mvn clean install

# Copiar o arquivo JAR da aplicação para o contêiner
COPY target/*.jar app.jar

# Expor a porta da aplicação
EXPOSE 8080

# Comando para executar a aplicação
CMD ["java", "-jar", "app.jar"]
