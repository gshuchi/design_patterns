### Steps to implement singleton design pattern

Declare constructor of class as private so that no-one instantiate class outside of it.

Declare a static reference variable of class.

Declare a static method with return type as object of class which should check if class is already instantiated once.


### Use of singleton design pattern for automation

-How to keep track of same driver instance throughout the execution

-Database connectivity.

-Loading external files like properties, excelfiles etc once rather than loading again and again.

-Logger.