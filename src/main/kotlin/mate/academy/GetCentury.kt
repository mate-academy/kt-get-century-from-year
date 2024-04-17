package mate.academy

const val hundred : Int = 100
const val one : Int = 1
fun getCentury(year: Int) : Int {
        return (year - one) / hundred + one
    }


