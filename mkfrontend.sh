#!/usr/bin/env bash

rm -Rf webroot
rm -Rf dist && mkdir dist
cd frontend && npm install && NODE_ENV='production' npm run compile
cd ..