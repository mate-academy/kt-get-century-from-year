package mate.academy

const val CENTURY_YEARS = 100

fun getCentury(year: Int) : Int {
    if (year % CENTURY_YEARS == 0) {
        return year / CENTURY_YEARS
    }
    return year / CENTURY_YEARS + 1
}
