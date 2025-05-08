package mate.academy

const val CENTURY_DIVIDER = 100
const val NEXT_CENTURY_INCREMENT = 1

fun getCentury(year: Int) : Int {
    return if (year % CENTURY_DIVIDER == 0) {
        year / CENTURY_DIVIDER
    } else {
        year / CENTURY_DIVIDER + NEXT_CENTURY_INCREMENT
    }
}
