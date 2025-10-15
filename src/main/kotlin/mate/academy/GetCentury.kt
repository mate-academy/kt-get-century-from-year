package mate.academy

const val CENTURY_DURATION = 100

fun getCentury(year: Int): Int {
    return if (year % CENTURY_DURATION == 0) year / CENTURY_DURATION
    else year / CENTURY_DURATION + 1
}
