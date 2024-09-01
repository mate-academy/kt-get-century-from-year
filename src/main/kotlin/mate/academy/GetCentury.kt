package mate.academy

const val YEARS_OF_CENTURY = 100
const val ZERO = 0
const val ONE_CENTURY = 1
const val ROUNDING_THRESHOLD = 10

fun getCentury(year: Int) : Int {
    return if (year % ROUNDING_THRESHOLD != ZERO) year / YEARS_OF_CENTURY + ONE_CENTURY else year / YEARS_OF_CENTURY
}
