fun main() {

//    val nilai = 'A'
//
//    when(nilai) {
//        'A' -> println("Amazing")
//        'B' -> println("Good")
//        'C' -> println("Not Bad")
//        'D' -> println("Bad")
//        else -> {
//            println("Upss")
//        }
//    }

//    when(nilai){
//        'A','B','C' -> {
//            println("Selamat Anda Lulus")
//        }
//        else -> {
//            println("Anda Gagal")
//        }
//    }

    var nilai = "A"
    val nilaiLulus: Array<String> = arrayOf("A","B","C")
    when(nilai) {
        in nilaiLulus -> println("Anda Lulus")
        !in nilaiLulus -> println("Anda tidak lulus")
    }

    val nilaiUjian = 90
    when{
        nilaiUjian >= 90 -> println("Sangat Bagus")
        nilaiUjian >= 80 -> println("Bagus")
        nilaiUjian >= 70 -> println("Cukup")
        else -> println("Tidak Lulus")
    }
}