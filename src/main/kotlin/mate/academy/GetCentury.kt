package mate.academy

private const val CENTURY_DEVIDER = 100

private const val NEXT_CENTURY = 1

private const val ZERO = 0

fun getCentury(year: Int) : Int {
    return if (year % CENTURY_DEVIDER == ZERO) year / CENTURY_DEVIDER else year / CENTURY_DEVIDER + NEXT_CENTURY
}
