package mate.academy

const val HUNDRED = 100
const val ONE = 1
fun getCentury(year: Int) : Int {

      val result = if (year % 2 == 0) {
        year / HUNDRED
    }
    else {
        year / HUNDRED + ONE
    }
    return result
}
