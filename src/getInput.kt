import kotlin.system.exitProcess

fun getInput(
    prompt: String,
    errorMessages: List<String>,
    isValid: (Number) -> Boolean = { true }
): Number {
    var attempts = 0

    while (attempts < errorMessages.size) {
        print(prompt)
        readlnOrNull()?.let { it -> parse(it)?.takeIf(isValid)?.let { return it } }

        println(errorMessages[attempts])
        attempts++
    }
    exitProcess(1)
}

fun parse(input: String): Number? {
    return input.toIntOrNull()
        ?: input.toLongOrNull()
        ?: input.toFloatOrNull()
        ?: input.toDoubleOrNull()
}