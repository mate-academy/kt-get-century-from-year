package mate.academy

const val CENTURY_DIVIDER = 100
const val CENTURY_BASE = 1

fun getCentury(year: Int): Int {
    return (year + CENTURY_DIVIDER - CENTURY_BASE) / CENTURY_DIVIDER
}
