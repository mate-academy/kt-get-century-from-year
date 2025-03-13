package mate.academy

const val CENTURY_DIVISOR = 100
const val CENTURY_OFFSET = 1
const val NO_REMAINDER = 0

fun getCentury(year: Int) : Int {
    if (year % CENTURY_DIVISOR == NO_REMAINDER) {
        return year / CENTURY_DIVISOR
    } else {
        return (year / CENTURY_DIVISOR) + CENTURY_OFFSET
    }
}
