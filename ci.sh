#!/bin/bash
git pull
mvn clean package
java -jar target/cdtest-0.0.1-SNAPSHOT.jar