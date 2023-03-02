fun hello(fristName:String, lastName: String? = null){
    if (lastName == null){
        println("hello $fristName")
    }else{
        println("hello $fristName $lastName")
    }
}

fun main() {
    hello("Satria")
    hello("Satria","Wira")
}