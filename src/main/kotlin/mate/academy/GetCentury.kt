package mate.academy
const val YEAR_DIVISOR = 100
const val ZERO_REMAINDER = 0
const val CENTURY_ADDITION = 1

fun getCentury(year: Int) : Int {
    return if (year % YEAR_DIVISOR == ZERO_REMAINDER) {
        year / YEAR_DIVISOR
    } else {
        year / YEAR_DIVISOR + CENTURY_ADDITION
    }
}
