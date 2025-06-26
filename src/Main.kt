import kotlin.system.exitProcess

fun main() {
    print("Please enter the first number: ")
    val firstEntry = getNumber()

    print("Please enter the second number: ")
    val secondEntry = getNumber()

    println("Ok now what kind of operation do you want to do?")
    println("1 - Sum")
    println("2 - Division")
    println("3 - Multiplication")
    println("4 - Subtraction")
    print("Enter your choice: ")
    val operation = getChoice()

    print("The result of the operation is: ")
    when (operation) {
        1 -> println(firstEntry + secondEntry)
        2 -> println(firstEntry / secondEntry)
        3 -> println(firstEntry * secondEntry)
        4 -> println(firstEntry - secondEntry)
        else -> println("Invalid operation selected!")
    }
}

fun getNumber(): Int {
    var attempts = 0

    while (true) {
        val entry = readlnOrNull()?.toIntOrNull()

        if (entry != null) return entry

        attempts += 1
        if (attempts == 1) println("Please, don't you know what an integer is?")
        if (attempts == 2) println("I'm starting to question your intelligence...")
        if (attempts == 3) {
            println("Okay, I won't bump heads with you anymore, bye.")
            exitProcess(1)
        }
        print("Please try again: ")
    }
}

fun getChoice(): Int {
    var attempts = 0

    while (true) {
        val choice = readlnOrNull()?.toIntOrNull()

        if (choice != null && choice in 1..4) return choice

        attempts += 1
        if (attempts == 1) println("Please, don't you know how to read the options?")
        if (attempts == 2) println("I'm starting to question your intelligence...")
        if (attempts == 3) {
            println("Okay, I won't bump heads with you anymore, bye.")
            exitProcess(1)
        }
        print("Please try again: ")
    }
}