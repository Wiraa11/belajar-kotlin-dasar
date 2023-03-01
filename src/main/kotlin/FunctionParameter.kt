fun sayHello(name: String,alamat:String?){
    if (alamat == null){
        println("Nama Saya $name")
    } else {
        println("Nama Saya $name , $alamat")
    }
}

fun main() {
    sayHello("wira","Sidoarjo")
    sayHello("wira",null)

}