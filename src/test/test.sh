#!/bin/bash



curl -X POST -H 'Content-Type:application/json' -d '{"id":"11","name":"Tom"}' localhost:8080/user/list
curl -X POST -H 'Content-Type:application/json' -d '{"id":"11"}' localhost:8080/user/list

curl -X POST -d {} localhost:8080/empty