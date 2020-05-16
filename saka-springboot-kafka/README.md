

curl -X POST -F 'message=test' http://localhost:9000/kafka/publish

for i in {1..100}; do curl -X POST -F 'message=test' http://localhost:9000/kafka/publish; done;