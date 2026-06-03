# Laboratory Work No.4: Exception Handling

## Overview
This repository contains the implementation of Laboratory Work No.4 for the Moscow Technical University of Communications and Informatics (MTUCI). 

The primary focus of this project is to explore and implement robust exception handling mechanisms in Java. The work is divided into three practical tasks covering standard error catching, safe file input/output operations, and the creation of custom exceptions with an automated logging system.

## Tasks Description

### Task 1: Array Average Calculator
A program designed to calculate the arithmetic mean of an array containing mixed data types (strings and numbers). 
* Core Focus: Basic try-catch implementation.
* Error Handling: 
  * Captures ArrayIndexOutOfBoundsException caused by deliberate boundary logic errors.
  * Captures NumberFormatException when attempting to parse non-numeric strings into integers.
  * Includes a fallback Exception handler for any unexpected runtime errors.

### Task 2: File Copy Utility
A utility that safely copies the contents of a source text file to a destination file using byte streams.
* Core Focus: I/O stream management and resource cleanup.
* Mechanics: Uses FileInputStream and FileOutputStream to read and write data byte by byte.
* Error Handling: 
  * Catches standard IOExceptions during read/write operations.
  * Utilizes the finally block to ensure all file streams are securely closed, preventing memory leaks and file locks regardless of whether the program completes successfully or crashes.

### Task 3: Custom Stack and Error Logging
Implementation of a custom LIFO (Last In, First Out) stack data structure with integrated logging capabilities.
* Custom Exception: Introduces CustomEmptyStackException, which is explicitly thrown when attempting to extract an element from an empty stack.
* Error Logger: Includes an ErrorLogger class that utilizes FileWriter in append mode. Instead of merely printing the error to the console, it automatically records the exception message to an external errors.txt file for auditing.

## Technologies Used
* Language: Java
* Core Concepts: Exception Handling (try, catch, finally, throw, throws), Custom Exceptions, File I/O Streams, LIFO Data Structures.

## Key Learnings and Conclusion
This project successfully demonstrates a progressive approach to handling runtime errors in Java. Starting from basic try-catch blocks for standard exceptions, the project advances to handling external file resources safely using the finally block. The culmination of the work is a custom data structure that manages its own specific error states through custom exceptions and logs these incidents to an external text file, ensuring better traceability and system stability.

---

## Author
* Name: Pavel Petrovich Koshelev
* Group: BST 2401
* Institution: MTUCI
* Year: 2026
