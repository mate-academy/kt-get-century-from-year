package mate.academy

fun getCentury(year: Int) : Int {
    val temp = year / 100
    val diff = year % 100
    return if (diff == 0) {
        temp
    } else {
        temp + 1
    }
}
