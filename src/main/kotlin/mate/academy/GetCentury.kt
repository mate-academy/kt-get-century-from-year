package mate.academy

const val CENTURY_LENGTH = 100
const val ONE_YEAR = 1
const val ZERO = 0

fun getCentury(year: Int): Int {
    if (year % CENTURY_LENGTH == ZERO) {
        return year / CENTURY_LENGTH
    }
    return year / CENTURY_LENGTH + ONE_YEAR
}
