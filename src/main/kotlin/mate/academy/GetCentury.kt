package mate.academy

private const val YEARS_IN_CENTURY = 100
private const val OFFSET = YEARS_IN_CENTURY - 1

fun getCentury(year: Int) : Int {
    return (year + OFFSET) / YEARS_IN_CENTURY
}
