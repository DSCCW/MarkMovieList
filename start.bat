@echo off

REM needs maven installed as well as Java 17

REM Start Java Spring Back-End in a new command prompt window
start cmd /k "cd MovieListServer && mvn spring-boot:run"

REM Start React Front-End in a new command prompt window
start cmd /k "cd markmovieclient && npm start"





