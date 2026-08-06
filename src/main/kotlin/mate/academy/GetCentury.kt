package mate.academy

const val CENTURY_DIVISOR = 100
const val ZERO = 0
const val ONE = 1

fun getCentury(year: Int): Int {
    return if (year % CENTURY_DIVISOR == ZERO) {
        year / CENTURY_DIVISOR
    } else {
        year / CENTURY_DIVISOR + ONE
    }
}
