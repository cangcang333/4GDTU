#!/bin/bash



curl -X POST -H 'Content-Type:application/json' -d '{"id":"23","name":"Jordan"}' localhost:8080/user/add
curl -X POST -H 'Content-Type:application/json' -d '{"id":"11","name":"Tom"}' localhost:8080/user/list
curl -X POST -H 'Content-Type:application/json' -d '{"id":"11"}' localhost:8080/user/list
curl -X POST -H 'Content-Type:application/json' -d '{}' localhost:8080/user/list | python3 -m json.tool

curl -X POST -d {} localhost:8080/empty