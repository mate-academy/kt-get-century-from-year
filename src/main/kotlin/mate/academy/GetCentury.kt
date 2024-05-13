package mate.academy

const val CENTURY = 100
const val YEAR = 1
const val ZERO = 0

fun getCentury(year: Int) : Int {
    val remindResult = year % CENTURY
    return if (remindResult == ZERO) {
        year / CENTURY
    } else {
        (year / CENTURY) + YEAR
    }
}
