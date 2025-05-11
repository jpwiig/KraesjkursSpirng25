#!/usr/bin/env bash

docker run --rm -P -p 127.0.0.1:5432:5432 --name db-Kreasj -e POSTGRES_PASSWORD=eplerOgBanan postgres:latest