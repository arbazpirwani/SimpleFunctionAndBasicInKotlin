fun main() {

    addition(1, 4)

    minus(23, 4)

    minus(13)

    addition(b = 3, a = 4)

    multiply(5, 6)

    multiply(b = 7)
}

fun addition(a: Int, b: Int) {
    println(a + b)
}

fun minus(a: Int, b: Int = 3) {
    println(a - b)
}

fun multiply(a: Int = 3, b: Int) {
    println(a * b)
}

