package mate.academy

const val CENTURY = 100

fun getCentury(year: Int) : Int {
    var result = year / 100;
    if (year % CENTURY > 0) {
        ++result;
    }
    return  result
}
