fun main() {

    val age = 23

    when {
        age < 18 -> println("in 1st block")
        (age > 18 && age != 20) -> {
            println("in 2nd block")
        }
        age >= 18 ->
            println("in 3rd block")
        else -> {
            println("in else block")
        }
    }

    when ("Uzair") {
        "Uzair" -> println("user matched")
        "Arbaz" -> {
            println("User name is Arbaz")
            println("User not matched")
        }
        else -> println("user not matched")
    }


}