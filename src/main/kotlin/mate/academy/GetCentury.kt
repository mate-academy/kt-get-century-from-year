package mate.academy

const val CENTURY_OFFSET = 99
const val YEAR_DIVISOR = 100

fun getCentury(year: Int) : Int {
    return (year + CENTURY_OFFSET) / YEAR_DIVISOR
}
