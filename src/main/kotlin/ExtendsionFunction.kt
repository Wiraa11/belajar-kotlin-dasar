fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name = "Satria"

    println(name.hello())

    name.printHello()

    "Wira".printHello()
}