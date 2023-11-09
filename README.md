## Table of Contents
1. [General Info](#general-info)
2. [Technologies](#technologies)
3. [Installation](#installation)
4. [FAQs](#faqs)
### General Info
***
Exercise "Tasca 5 Sprint 1" Java Utils. For programming course. Corrected version. 

The exercises of the 3 levels must be executed from the command line, not just from the editor. Create a file named “readme.txt” to explain the command to execute for each exercise.


Use Eclipse or IntelliJ for all exercises.
You do not have to always use Java classes in packages.
You can build Maven, Gradle or just Java projects.
Endavant!

Level 1
You can use Java exclusively, or use the Apache Commons IO library if you prefer.

- Exercise 1
Create a class that alphabetically lists the contingency of a directory by parameter.

- Exercise 2
Affecting the previous type of exercise, the functionality of listing a directory tree with the contingency of all six levels (recursively) so that it is printed on the screen in alphabetical order for each level, indicating further whether it is a directori (D) or a fitxer (F), and the last modification date.

- Exercise 3
Modify the previous exercise. Ara, instead of displaying the result on the screen, saves the result in a TXT filer.

- Exercise 4
Affect the functionality of getting any TXT fitxer and displaying the next contingency for the console.

- Exercise 5
Now the program must serialize a Java Object to a fitxer .ser and after deserializing.


Level 2


- Exercise 1
Execute exercise 3 of the previous level, parameterizing all the methods in a configuration adjuster.

You can use a Java Properties plugin, or use the Apache Commons Configuration library if you prefer.

From the previous exercise, parameterize the following:

Directory to arrive.
Name and directory of the resulting TXT fitxer.
Level 3
- Exercise 1
Create a utility that encrypts and decrypts the files resulting from the previous levels.

The AES algorithm can be used in the form of ECB or CBC with the PKCS5Padding implementation method. You can buy javax.crypto or org.apache.commons.crypto.
### Screenshot
![Image text](https://repository-images.githubusercontent.com/702881438/17ed3924-3931-4d34-9b9e-1df239e54942)
## Technologies
***
A list of technologies used within the project:
* [junit-jupiter](https://junit.org/junit5/docs/current/user-guide/): Version 5.10.0
* [commons-io](https://commons.apache.org/proper/commons-io/): Version 2.11.0
* [assertj-core](https://assertj.github.io/doc/): Version 3.24.2
## Installation
***
A little intro about running the program. 
```
$ git clone https://github.com/joseRodriguezCubero/Tasca_S1_05_Java_Utils.git
$ cd Documents[Java-program-folder]
$ ../path/to/the/file
```
Run these commands for each exercise folder.
```
javac -encoding UTF-8 -d .\bin -cp .\src .src\main\java\n1exercici1\Main.java
java -cp bin Main.Main
```
Side information: To use the application in a special environment use ```eclipse``` or ```inetelijj``` or something similiar to build the program.

## FAQs
***
A list of frequently asked questions
1. **How to run the program from the command line?**

tutorial to run java classes from the command line; [link](https://vidatecno.net/como-ejecutar-un-programa-java-desde-el-simbolo-del-sistema/). 

2. __In what order should I run the files?__ 

It is recommended to go according to the directory numbering order:
* n1exercici1
* n1exercici2
* n1exercici3...
