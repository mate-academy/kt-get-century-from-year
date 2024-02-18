package mate.academy

fun getCentury(year: Int) : Int {
    val result : Int
    if (year % 10 == 0) {
        result = year / 100
    } else {
        result = year / 100 + 1
    }
    return result
}
