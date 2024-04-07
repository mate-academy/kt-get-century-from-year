package mate.academy

const val CENTURY = 100
const val ZER0 = 0
const val ONE = 1;

fun getCentury(year: Int) : Int {
    if(year % CENTURY == ZER0){
        return year / CENTURY
    }
    return year / CENTURY + ONE
}
