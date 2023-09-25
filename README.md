#Java Encoder/Decoder

## Description

A simple application for encoding and decoding strings based on a dynamically generated shift table.

## Overview

This application provides a mechanism to encode and decode strings using a reference table and a dynamically generated shift table. The shift table is created by specifying a character, which then defines the shift offset.

## Features

Dynamic Shift Table Generation: The user can provide any character from the reference table to generate a unique shift table for encoding/decoding.
Encoding: Converts a given string based on the dynamically generated shift table.
Decoding: Converts an encoded string back to its original form using the same shift table.

## Usage

Run the application.
When prompted, enter a character for the shift.
The program will display the encoded and decoded versions of the test string "HELLO WORLD".

## Prerequisites

Java JDK

## Setup

Clone the repository:

```bash
git clone https://github.com/dingzheng9/JavaEncoderDecoder.git
```

Navigate to the project directory:

```bash
cd JavaEncoderDecoder
```

Compile and run the application:

```bash

javac -d bin src/com/example/myapp/*.java
java -cp bin com.example.myapp.Main

```
