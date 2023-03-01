fun fullName(
    firstName: String,
    middleName: String,
    lastName: String,
) {
    println("hello $firstName $lastName $middleName")
}

fun main() {
    fullName(
        firstName = "Satria",
        lastName = "wira",
        middleName = "Bakti"
    )
}