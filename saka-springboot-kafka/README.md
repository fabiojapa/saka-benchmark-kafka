## saka-springboot-kafka

### start kafka local
> docker-compose -f ../etc/local/docker-compose.yml up

### start application
> ./gradlew bootRun

### single test
> curl -X POST -F 'message=test' http://localhost:9000/kafka/publish

### multi test
> for i in {1..100}; do curl -X POST -F 'message=test' http://localhost:9000/kafka/publish; done;
