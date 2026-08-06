package mate.academy

const val CENTURIES = 100;
const val YEARS = 99;
fun getCentury(year: Int) : Int {
    return (year + YEARS) / CENTURIES;
}
