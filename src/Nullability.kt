fun main(args: Array<String>) {

    var name : String = "John Doe"
    //name = null

    var nullName : String? = "Apakah nilai ini bisa berubah menjadi null"
    // nullName = null

    //println(nullName.length)

    var length = 0;
    if (nullName != null) {
        length = nullName.length
    } else {
        length = -1
    }

    println(length)

    val l = if (nullName != null) nullName.length else -1
    println(l)

    // Second method Safe Call Operator ==> ?
    println(nullName?.length)

    // Third method Elvis Operator
    val len = nullName?.length ?: -1
    println(len)

    val noName = nullName ?: "Tidak ada nama..."
    println(noName)

    // !! NullPointerException or NPE
    println(nullName!!.length)

}