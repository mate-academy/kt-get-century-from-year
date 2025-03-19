package mate.academy

fun getCentury(year: Int) : Int {
    val centuryOffset = 99
    val centurySize = 100
    return (year + centuryOffset) / centurySize
}
