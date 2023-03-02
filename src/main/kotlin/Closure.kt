fun main() {

    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("lambda increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("anonymous function increment")
        counter++
    }

    fun functionIncrement() {
        println("function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}