package mate.academy

fun main() {
    println(getCentury(1601))
}

fun getCentury(year: Int) : Int {
    return (year + 99) / 100
}
