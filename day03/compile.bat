@echo off
set /p fname=class Name :
javac -encoding utf8 -d dist %fname%.java
cd dist
cls

java %fname&%
cd ..
cls