# cnj-hello-backend-quarkus

Simplest possible cloud native java application based on Quarkus.

## Status

![Build status](https://codebuild.eu-west-1.amazonaws.com/badges?uuid=eyJlbmNyeXB0ZWREYXRhIjoiQUozNVd6bDdCd1RBQWVubE53OHJUazJyZDkyQmNPdGdRQzcyRGxMUzg4KzhlYjRwUkJaMXF1Y1hMSnl5UzRCdFBYVlh3T0ROY1MzSVgrcjF3OEZwYnY0PSIsIml2UGFyYW1ldGVyU3BlYyI6ImhRc0g3blJMdlpzM3kzMmgiLCJtYXRlcmlhbFNldFNlcmlhbCI6MX0%3D&branch=main)

## Release Information

A changelog can be found in [changelog.md](changelog.md).

## Docker Pull Command

`docker pull docker.cloudtrain.aws.msgoat.eu/cloudtrain/cnj-hello-backend-quarkus`

## HOW-TO build this application locally

If all prerequisites are met, just run the following Maven command in the project folder:

```shell 
mvn clean verify -P pre-commit-stage
```

Build results: a Docker image containing the showcase application.

## HOW-TO run this showcase locally

In order to run the whole showcase locally, just run the following docker commands in the project folder:

```shell 
docker compose up -d
docker compose logs -f 
```
The showcase application will be accessible via `http://localhost:38080`.

Press `Ctlr+c` to stop tailing the container logs and run the following docker command to stop the show case:

```shell 
docker compose down
```
