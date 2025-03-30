@echo off

REM Mengompilasi file Teks.java, Colors.java, dan Utama.java ke direktori bin
javac -d bin .\tes123\Teks.java .\tes123\Colors.java .\tes123\Utama.java

REM Menjalankan program dengan classpath menunjuk ke folder bin
java -cp bin Utama

pause