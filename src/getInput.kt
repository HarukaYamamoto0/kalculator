import kotlin.system.exitProcess

fun <T> getInput(
    prompt: String,
    errorMessages: List<String>,
    parse: (String) -> T?,
    isValid: (T) -> Boolean = { true }
): T {
    var attempts = 0

    while (attempts < errorMessages.size) {
        print(prompt)
        readlnOrNull()?.let { it -> parse(it)?.takeIf(isValid)?.let { return it } }

        println(errorMessages[attempts])
        attempts++
    }
    exitProcess(1)
}