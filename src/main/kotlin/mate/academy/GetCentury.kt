package mate.academy

fun getCentury(year: Int) : Int {
    val result = year / 100
    if (year % 100 == 0) {
        return result
    }
    return result + 1
}
