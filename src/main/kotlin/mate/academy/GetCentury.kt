package mate.academy
private const val YEARS_IN_CENTURY = 100

fun getCentury(year: Int) : Int {
    if (year%YEARS_IN_CENTURY==0)
        return year/YEARS_IN_CENTURY
    return year/YEARS_IN_CENTURY+1
}
