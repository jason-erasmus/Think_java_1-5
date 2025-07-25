#!/bin/bash

set -e

if ! command -v docker &> /dev/null; then
    echo "Docker is not installed, Please install Docker and try again."
    exit 1
fi

echo "Docker is installed. Continuing build..."

REPO_URL="https://github.com/jason-erasmus/Think_java_1-5.git"
REPO_NAME="Think_java_1-5"
DOCKER_IMAGE="think_java_runner"

echo "Cloning the repository..."
rm -rf $CLONE_DIR
git clone $REPO_URL $CLONE_DIR

cd $CLONE_DIR

echo "Building Docker image..."
docker build -t "$DOCKER_IMAGE".

echo "Launching Java Binary Tree..."
docker docker run --rm "$DOCKER_IMAGE"


