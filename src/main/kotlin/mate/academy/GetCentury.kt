package mate.academy

const val CENTURY = 100
const val NULL = 0

fun getCentury(year: Int) : Int {
    var result = year / CENTURY;
    if (year % CENTURY > NULL) {
        ++result;
    }
    return  result
}
