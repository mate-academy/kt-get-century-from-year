package mate.academy

private const val YEARS_IN_CENTRUM = 100

fun getCentury(year: Int) : Int {
    if (year % YEARS_IN_CENTRUM == 0) {
        return year/YEARS_IN_CENTRUM
    }
    return year/YEARS_IN_CENTRUM +1
}
