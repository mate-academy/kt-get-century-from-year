package mate.academy

fun getCentury(year: Int) : Int {
    val result = year / 100
    if (year % 100 != 0) {
        return result + 1
    }
    return result
}
