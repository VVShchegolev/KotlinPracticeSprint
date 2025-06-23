package Lesson_1

fun main() {

    var workerCount: Int = 2000
    val numberOfOrder: Int = 75
    val textWithThanks: String = "Благодарим вас за покупку в нашем магазине!!!\nПокупайте у нас снова!!!"

//    println("Количество работников в Интернет-магазине: $workerCount")

    workerCount -= 1 // либо можно так "workerCount = 1999"
    println("Количество работников в Интернет-магазине: $workerCount")
    println("Товаров в магазине $numberOfOrder")
    println(textWithThanks)

//    либо можно так
//    println("""
//        |Количество работников в Интернет-магазине: $workerCount
//        |Товаров в магазине $numberOfOrder
//        |$textWithThanks
//    """.trimMargin())
}