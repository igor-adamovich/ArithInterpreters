# Примеры специализации объектно-ориентированных интерпретаторов и измерение производительности

## Structure
Исходная версия интерпретатора, работающего рекурсивным спуском, лежит тут:
src/main/java/examples/descend/

Исходная версия интерпретатора, реализованно на основе шаблона "Посетитель", лежит тут: \
src/main/java/examples/visitor/

Специализированные версии интерпретаторов находятся в подкаталогах spec каждой из исходный версий, т.е. тут: \
src/main/java/examples/descend/spec/ \
src/main/java/examples/visitor/spec/

## Benchmarking
Для измерения производительности следует пользоваться инструментом Java Microbenchmark Harness (JMH): \
https://github.com/openjdk/jmh

Следующий файл содержит исходный код измеряющий производительность с помощью JMH: \
src/main/java/ru/psiras/intbenchmark/InterpreterBenchmark.java

Переменная "static double eps = 1e-256" задаёт точность, с которой необходи вычислить корень.