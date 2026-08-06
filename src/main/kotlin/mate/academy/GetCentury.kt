package mate.academy

private const val YEAR_IN_CENTURY = 100

fun getCentury(year: Int) : Int {
    return if (year % YEAR_IN_CENTURY == 0) year / YEAR_IN_CENTURY else year / YEAR_IN_CENTURY + 1
}
