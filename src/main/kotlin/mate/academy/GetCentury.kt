package mate.academy

fun getCentury(year: Int) : Int {

    return (if (year % 100 == 0)  0 else 1) + year / 100
}
