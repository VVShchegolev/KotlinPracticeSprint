package Ex_1

fun main() {

    val student1: Byte = 3
    val student2: Byte = 4
    val student3: Byte = 3
    val student4: Byte = 5

    val sum = student1 + student2 + student3 + student4

    val average = sum.toDouble() / 4

    println("Средний бал по английскому: $average")

}