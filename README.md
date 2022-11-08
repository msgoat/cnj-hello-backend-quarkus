# cnj-hello-backend-quarkus

Simplest possible cloud native java application based on Quarkus.

## Status

![Build status](https://codebuild.eu-west-1.amazonaws.com/badges?uuid=eyJlbmNyeXB0ZWREYXRhIjoiQUozNVd6bDdCd1RBQWVubE53OHJUazJyZDkyQmNPdGdRQzcyRGxMUzg4KzhlYjRwUkJaMXF1Y1hMSnl5UzRCdFBYVlh3T0ROY1MzSVgrcjF3OEZwYnY0PSIsIml2UGFyYW1ldGVyU3BlYyI6ImhRc0g3blJMdlpzM3kzMmgiLCJtYXRlcmlhbFNldFNlcmlhbCI6MX0%3D&branch=main)

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
