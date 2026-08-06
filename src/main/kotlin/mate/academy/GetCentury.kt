package mate.academy

const val DIVIDER = 100

fun getCentury(year: Int): Int {
    return if (year % DIVIDER == 0) {
        year / DIVIDER
    } else {
        year / DIVIDER + 1
    }
}
