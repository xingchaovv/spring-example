#!/usr/bin/env bash
workDir=$(cd "$(dirname "$0")" && pwd); cd "${workDir}" || exit 1
nohup java -jar -Dspring.profiles.active=XXX XXX-1.0-SNAPSHOT.jar >./nohup.log 2>&1 &
