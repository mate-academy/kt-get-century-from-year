package mate.academy
const val CENTURY = 100

fun getCentury(year: Int) : Int {
    return if (year % CENTURY == 0) year/CENTURY else year/CENTURY + 1
}
