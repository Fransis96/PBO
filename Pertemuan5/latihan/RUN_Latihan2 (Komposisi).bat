@echo off

REM Mengompilasi file Teks.java, Colors.java, dan Utama.java ke direktori bin
javac -d bin ./*.java bin/Main2.java

REM Menjalankan program dengan classpath menunjuk ke folder bin
java -cp bin Main2

pause