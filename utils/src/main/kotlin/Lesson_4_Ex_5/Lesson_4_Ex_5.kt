package Lesson_4_Ex_5

fun main() {

    println("Введите наличие повреждений корабля (true/false):")
    val isShipDamage = readln().toBoolean()
    println("Введите количество членов экипажа:")
    val crewSize = readln().toInt()
    println("Введите количество ящиков с провизией:")
    val provisionBoxes = readln().toInt()
    println("Введите благоприятность погоды (true/false):")
    val isWeatherFavorable = readln().toBoolean()

    val isMainScenarioMet = !isShipDamage &&
                            crewSize >= MIN_CREW_SIZE &&
                            crewSize <= MAX_CREW_SIZE &&
                            provisionBoxes > MIN_PROVISION_BOXES
    val isAlternativeScenarioMet = isShipDamage &&
                                  crewSize == REQUIRED_CREW_SIZE_FOR_DAMAGE &&
                                  isWeatherFavorable &&
                                  provisionBoxes >= MIN_PROVISION_BOXES
    val isReadyToSail = isMainScenarioMet ||
                        isAlternativeScenarioMet

    println("Корабль может отправиться в плавание: $isReadyToSail")

}

const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val REQUIRED_CREW_SIZE_FOR_DAMAGE = 70
const val MIN_PROVISION_BOXES = 50
