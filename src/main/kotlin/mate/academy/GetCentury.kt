package mate.academy

const val CENTURY_DIVISOR = 100
const val OFFSET = 99

fun getCentury(year: Int): Int {
    return (year + OFFSET) / CENTURY_DIVISOR
}
