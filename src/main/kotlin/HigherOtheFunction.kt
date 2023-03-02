fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "hello $nameTransform"
    }

    val lambdaUpper = { value: String -> value.uppercase() }
    println(hello("satria wira bakti", lambdaUpper))

    println(hello("satria", { value: String -> value.uppercase() }))

    // trailing lambda
    var result1 = hello("WIRA") { value: String -> value.lowercase() }
    var result2 = hello("WIRA") { value: String ->
        value.lowercase()
    }
}