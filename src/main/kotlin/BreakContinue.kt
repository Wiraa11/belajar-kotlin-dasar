fun main() {
    // Break
    var i = 0
    while (true){
        println("Data Ke $i ")
        i++
        if (i > 100){
            break
        }
    }

    // Continue
    for (i in i..1000){

        if(i % 2 == 0) {
            continue
        }
        println("bilangan ke $i")
    }
}