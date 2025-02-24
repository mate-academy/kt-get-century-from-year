package mate.academy

fun getCentury(year: Int) : Int {
    var centuries = year / 100
    if (year % 100 > 0) {
        ++centuries
    }
    return centuries
}
