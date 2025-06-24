package Lesson_3_Ex_4

fun main() {

    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    val moveString = "[$from-$to; $moveNumber]"
    println(moveString)

    from = "D2"
    to = "D3"
    moveNumber = 3

    val nextMoveString = "[$from-$to; $moveNumber]"
    println(nextMoveString)

}