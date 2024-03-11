package mate.academy

fun main() {
    println(getCentury(1705))
    println(getCentury(1900))
    println(getCentury(1601))
    println(getCentury(2000))
}

fun getCentury(year: Int) : Int {
    var century = year / 100

    if (year % 100 > 0) {
        century++
    }
    return century
}
