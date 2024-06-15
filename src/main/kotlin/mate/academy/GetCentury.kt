package mate.academy

fun getCentury(year: Int) : Int {
    var century = year / 100
    if (year % 100 == 0) {
        return century
    }
    return ++century
}
