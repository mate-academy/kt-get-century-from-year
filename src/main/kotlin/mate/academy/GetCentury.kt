package mate.academy

const val YEARS_IN_CENTURY = 100

fun getCentury(year: Int): Int {
    if (year % YEARS_IN_CENTURY == 0) {
        return year / YEARS_IN_CENTURY
    } else {
        return year / YEARS_IN_CENTURY + 1
    }
}
