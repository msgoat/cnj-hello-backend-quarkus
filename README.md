# cnj-hello-backend-quarkus

Simplest possible cloud native java application based on Quarkus.

## Status

![Build status](https://drone.cloudtrain.aws.msgoat.eu/api/badges/msgoat/cnj-hello-backend-quarkus/status.svg)

## Release Information

A changelog can be found in [changelog.md](changelog.md).

## Docker Pull Command

`docker pull docker.cloudtrain.aws.msgoat.eu/cloudtrain/cnj-hello-backend-quarkus`

## Run this application

```shell 
docker run --name cnj-hello-backend-quarkus -p 8080:8080 docker.cloudtrain.aws.msgoat.eu/cloudtrain/cnj-hello-backend-quarkus
```

## Build this application

```shell 
mvn clean verify -P pre-commit-stage
```

Build results: a Docker image containing a Quarkus application.
