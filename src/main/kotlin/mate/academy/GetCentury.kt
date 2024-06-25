package mate.academy

private const val YEARS_IN_CENTURY = 100
private const val CENTURY_START = 1

fun getCentury(year: Int) : Int {
    return (year - CENTURY_START) / YEARS_IN_CENTURY + CENTURY_START
}
