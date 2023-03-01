fun jumlah(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int): Int {
    if (b == 0) {
        return 0
    } else {
        val hasil = a / b
        return hasil
    }
}

fun main() {
    println(jumlah(10, 10))

    val result = jumlah(200, 200)
    println(result)

    println(bagi(10, 0))

    val hasil = jumlah(200, 200)
    println(hasil)


}