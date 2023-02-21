fun main() {
    var nama: String = "Wira"

    var alamat: String = """
        Ds Mojoruntut Rt 16 Rw 08
        Kecamatan krembung 
        Kabupaten Sidoarjo
    """.trimIndent()

    var alamat2: String = """
        Ds Mojoruntut Rt 16 Rw 08
        Kecamatan krembung 
        >Kabupaten Sidoarjo
    """.trimIndent().trimMargin(">")

    println(nama)
    println(alamat)
    println()
    println(alamat2)

    var firstName: String = "Satria"
    var fullName: String = firstName + " " + nama
    var fullName2: String = "$firstName $nama"
    var desc: String ="$fullName2 lenght = ${fullName2.length}"

    println(fullName)
    println(fullName2)
    println(desc)

}