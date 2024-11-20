package mate.academy

const val CENTURY_COEFFICIENT = 100

fun getCentury(year: Int): Int {
    if (year % CENTURY_COEFFICIENT == 0) {
        return year / CENTURY_COEFFICIENT
    } else {
        return (year / CENTURY_COEFFICIENT) + 1
    }
}
