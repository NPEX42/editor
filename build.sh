#!/bin/bash

set -e

find -name "*.java" > sources.txt

javac @sources.txt -d ./bin
