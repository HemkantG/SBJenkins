FROM java	

COPY target/springbootapp.jar /opt/springboot/

WORKDIR /opt/springboot/

ENTRYPOINT java $JAVA_OPTS -jar ./springbootapp.jar

EXPOSE 8080


