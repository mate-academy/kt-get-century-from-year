package mate.academy
private const val YEARS_IN_CENTURY = 100

fun getCentury(year: Int) : Int {
    return (year - 1) / YEARS_IN_CENTURY + 1
}
