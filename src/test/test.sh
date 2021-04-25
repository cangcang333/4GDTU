#!/bin/bash



curl -X POST -H 'Content-Type:application/json' -d '{"id":"23","name":"Jordan"}' localhost:8080/user/add
curl -X POST -H 'Content-Type:application/json' -d '{"id":"11","name":"Tom"}' localhost:8080/user/list
curl -X POST -H 'Content-Type:application/json' -d '{"id":"11"}' localhost:8080/user/list
curl -X POST -H 'Content-Type:application/json' -d '{}' localhost:8080/user/list | python3 -m json.tool

curl -X POST -d {} localhost:8080/empty


curl -X POST -H 'Content-Type:application/json' -d '{}' localhost:8088/settlementData/list | python -m json.tool
curl -X POST -H 'Content-Type:application/json' -d '{"pointName":"X5"}' localhost:8088/settlementData/list | python -m json.tool
curl -X POST -H 'Content-Type:application/json' -d '{"time":"2021.04.25", "settlingValue":"805", "pointName":"X5"}' localhost:8088/settlementData/add
