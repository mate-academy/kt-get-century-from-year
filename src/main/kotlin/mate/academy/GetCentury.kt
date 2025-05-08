package mate.academy

const val CENTURY = 100
fun getCentury(year: Int) : Int {

    return (if (year % CENTURY == 0)  0 else 1) + year / CENTURY
}
