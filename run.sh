#!/bin/bash

set -e

./build.sh
cd bin
java Main
