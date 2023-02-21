fun main() {

    // For Array
    var array = arrayOf("Satria", "wira", "bakti")
    var total = 0

    for (name in array) {
        println(name)
        total++
    }
    println("total perulangan = $total")

    //For Range
    for (nilaiX in 0..100 step 7) {
        println(nilaiX)
    }

    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray) {
        println("Index $i = ${array.get(i)}")
    }
}