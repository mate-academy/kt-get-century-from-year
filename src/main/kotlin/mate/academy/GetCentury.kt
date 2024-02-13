package mate.academy

import kotlin.math.ceil

fun getCentury(year: Int) : Int {
    var center = 100.00;
    return ceil( year / center).toInt();
}
