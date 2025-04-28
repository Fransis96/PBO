@echo off

REM Kompile file java
javac -d bin ./*.java

REM Menjalankan file java
java -cp bin latihan.Komposisi

pause