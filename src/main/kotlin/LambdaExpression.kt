fun toUpper(value: String): String = value.uppercase()

fun main() {

    val contohLamda: (String,Int) -> String = {
        firstName: String, Age: Int -> val result = "$firstName, umur $Age tahun"
        result
    }

    val result = contohLamda("Wira",21)
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("wira"))

    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("satria wira bakti"))
}