package mate.academy

fun getCentury(year: Int) : Int {
    var i = year / 100
    return if (year % 100 == 0) i else ++i
}
