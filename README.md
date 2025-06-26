# Kalculator - A Kotlin Console Calculator 🧮

![Kotlin Version](https://img.shields.io/badge/Kotlin-1.9.0-blueviolet)

Kalculator is a smart and slightly sassy command-line calculator written in pure Kotlin. It features intelligent input validation with progressively sassier error messages, making number crunching both efficient and entertaining!

## Features ✨

- **Four Basic Operations**: Addition, subtraction, multiplication, and division
- **Smart Input Validation**: Handles non-integer inputs gracefully
- **Personality-Packed Error Messages**: Gets progressively sassier with repeated mistakes
- **Zero-Tolerance Policy**: Exits after 3 failed attempts (it has limits!)
- **Division Protection**: Prevents division by zero errors
- **Clean Interface**: Simple and intuitive menu system

## Installation ⚙️

### Prerequisites
- Kotlin 1.9.0 or higher
- Java JDK 17 or higher

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
Please enter the first number: 42
Please enter the second number: seven
Please, don't you know what an integer is?
Please try again: 7

Operations available:
1 - Sum
2 - Division
3 - Multiplication
4 - Subtraction

Enter your choice (1-4): 5
Please, don't you know how to read the options?
Please try again: 2

The result is: 6
```

## Future Enhancements 🚀

- [ ] Support for decimal numbers
- [ ] Additional operations (exponents, modulo)
- [ ] Calculation history
- [ ] Colorful terminal interface
- [ ] Unit conversion features

**Warning**: This calculator will question your intelligence after multiple incorrect inputs. Use responsibly! 😉
