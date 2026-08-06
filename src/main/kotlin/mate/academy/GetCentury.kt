package mate.academy
const val CENTURY_AMOUNT = 100
const val ZERO = 0
const val ONE = 1

fun getCentury(year: Int) : Int {

    return if (year % CENTURY_AMOUNT == ZERO) {
        year / CENTURY_AMOUNT
    } else {
        year / CENTURY_AMOUNT + ONE
    }
}
