package mate.academy

const val YEAR_OFFSET = 99
const val CENTURY_DIVISOR = 100

fun getCentury(year: Int) = (year + YEAR_OFFSET) / CENTURY_DIVISOR
