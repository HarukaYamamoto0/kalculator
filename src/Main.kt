fun main() {
    val firstEntry = getInput(
        prompt = "Please enter the first number: ",
        errorMessages = numberErrorMessages,
    ).toDouble()

    val secondEntry = getInput(
        prompt = "Please enter the second number: ",
        errorMessages = numberErrorMessages,
    ).toDouble()

    println("Operations available:")
    val operations = listOf("Sum", "Subtraction", "Division", "Multiplication")
    operations.forEachIndexed { index, option ->
        println("${index + 1} - $option")
    }

    val operation = getInput(
        prompt = "Enter your choice (1-${operations.size}): ",
        errorMessages = choiceErrorMessage,
        isValid = { it in 1..operations.size }
    )

    print(
        "The result of the operation is: ${
            when (operation) {
                1 -> firstEntry + secondEntry
                2 -> firstEntry - secondEntry
                3 -> {
                    if (secondEntry == 0.0)
                        return println("Are you by any chance trying to make me crash using division by zero???")
                    firstEntry / secondEntry
                }

                4 -> firstEntry * secondEntry
                else -> "Invalid operation selected!"
            }
        }"
    )
}