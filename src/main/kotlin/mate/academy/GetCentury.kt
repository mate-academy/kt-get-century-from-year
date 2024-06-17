package mate.academy

private const val YEARS_OF_CENTURY = 100

fun getCentury(year: Int) : Int {
    var century = year / YEARS_OF_CENTURY
    if (year % YEARS_OF_CENTURY == 0) return century
    return ++century
}
