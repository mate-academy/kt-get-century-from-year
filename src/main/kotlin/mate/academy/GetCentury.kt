package mate.academy

private const val YEARS_PER_CENTURY = 100
private const val ZERO_DIVIDE_REST = 0
private const val ONE_DIVIDE_REST = 1

fun getCentury(year: Int): Int {
    return year / YEARS_PER_CENTURY +
            if (year % YEARS_PER_CENTURY != ZERO_DIVIDE_REST) ONE_DIVIDE_REST else ZERO_DIVIDE_REST
}
