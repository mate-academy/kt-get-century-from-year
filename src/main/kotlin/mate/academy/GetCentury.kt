package mate.academy
const val CENTURY = 100

fun getCentury(year: Int) : Int {
    var i = year / CENTURY
    return if (year % CENTURY == 0) i else ++i
}
