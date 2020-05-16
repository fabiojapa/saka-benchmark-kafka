## saka-quarkus-kafka

### start kafka local
> docker-compose -f ../etc/local/docker-compose.yml up

### start application
> ./mvnw quarkus:dev

### single test
> curl -X POST http://localhost:8087/kafka/publish

### multi test
> for i in {1..100}; do curl -X POST http://localhost:8087/kafka/publish; done;
