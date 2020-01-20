fun main() {

    for (i in 0..10) { //forward loop
        print("$i\t")
    }
    println()
    for (i in 0 until 10) {
        print("$i\t")
    }
    println()

    for (i in 10 downTo 0) { //reverse loop
        print("$i\t")
    }
    println()

    for (i in 1 .. 10 step 3) { //stepping loop
        print("$i\t")
    }
    println()


    for (i in 10.downTo(0).step(2)) { //reverse loop with step
        print("$i\t")
    }
    println()
    print("outside the loop")
}