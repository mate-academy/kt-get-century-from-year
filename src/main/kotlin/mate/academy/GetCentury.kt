package mate.academy

import kotlin.math.roundToInt

const val CENTRY : Int = 100;
fun getCentury(year: Int) : Int {
    if (year % CENTRY == 0) {
        var century : Int = year / CENTRY
        return century.toDouble().roundToInt();
    } else {
        return ((year / CENTRY ).toInt() + 1);
    }
}
