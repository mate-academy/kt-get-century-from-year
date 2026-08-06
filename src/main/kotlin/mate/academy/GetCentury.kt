package mate.academy

private const val CENTURY_DIVIDER = 100
private const val ONE = 1

fun getCentury(year: Int) : Int {
    return if (year % CENTURY_DIVIDER >= ONE) year / CENTURY_DIVIDER + ONE else year / CENTURY_DIVIDER
}
