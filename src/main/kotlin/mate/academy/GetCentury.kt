package mate.academy

private const val YEARS_IN_CENTRUM = 100

fun getCentury(year: Int) : Int {
    if (year % 100 == 0) {
        return year/100
    }
    return year/100 +1
}
