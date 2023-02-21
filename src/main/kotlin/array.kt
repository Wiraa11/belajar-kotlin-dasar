fun main() {

    val names: Array<String> = arrayOf("budi","aldi","hendra")

    // Mengubah
    names.set(0,"asep")
    names[0] = "Rudi"
    println(names[0])

    // nullable
    val numbers: Array<Int?> = arrayOfNulls(10)
    numbers[0] = 12
    numbers[1] = 13
    numbers[2]
    numbers[3] = 32
    numbers[4] = 21
    println(numbers[2])

}