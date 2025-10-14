package mate.academy

const val CENTURY_DIVISOR = 100
const val CENTURY_OFFSET = 99

fun getCentury(year: Int): Int {
    return (year + CENTURY_OFFSET) / CENTURY_DIVISOR
}
