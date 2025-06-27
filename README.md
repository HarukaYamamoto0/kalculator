# Kalculator - A Kotlin Console Calculator 🧮

![Kotlin Version](https://img.shields.io/badge/Kotlin-1.9.0-blueviolet)

Kalculator is a smart and slightly sassy command-line calculator written in pure Kotlin. It features intelligent input validation with progressively sassier error messages, making number crunching both efficient and entertaining!

## Features ✨

- **Four Basic Operations**: Addition, subtraction, multiplication, and division
- **Smart Input Validation**: Handles non-integer inputs gracefully
- **Personality-Packed Error Messages**: Gets progressively sassier with repeated mistakes
- **Zero-Tolerance Policy**: Exits after three failed attempts (it has limits!)
- **Division Protection**: Prevents division by zero errors
- **Clean Interface**: Simple and intuitive menu system

## Installation ⚙️

### Using GitHub
```bash
git clone https://github.com/HarukaYamamoto0/kalculator.git
cd kalculator
./gradlew run
```

### Using Compiler
```bash
kotlinc src/main/kotlin/Main.kt -include-runtime -d kalculator.jar
java -jar kalculator.jar
```

## Usage 🖥️

1. Run the program
2. Enter two integers when prompted
3. Select an operation from the menu
4. Get your result!

```plaintext
Please enter the first number: 8
Please enter the second number: haruka
Please, don't you know what an integer is?
Please enter the second number: 9
Operations available:
1 - Sum
2 - Subtraction
3 - Division
4 - Multiplication
Enter your choice (1-4): dev
Please, don't you know how to read the options?
Enter your choice (1-4): 4
The result of the operation is: 72
```

**Warning**: This calculator will question your intelligence after multiple incorrect inputs. Use responsibly! 😉
