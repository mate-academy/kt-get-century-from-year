package mate.academy

const val CENTURY_LENGTH = 100
const val ONE_YEAR = 1
const val ZERO = 0

fun getCentury(year: Int) : Int {
    return if (year % CENTURY_LENGTH == ZERO) year / CENTURY_LENGTH else year / CENTURY_LENGTH + ONE_YEAR
}
