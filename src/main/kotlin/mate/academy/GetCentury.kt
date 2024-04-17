package mate.academy

const val HUNDRED : Int = 100
const val ONE : Int = 1
fun getCentury(year: Int) : Int {
        return (year - ONE) / HUNDRED + ONE
    }


