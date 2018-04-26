fun main(args: Array<String>) {
    val str = "Apakah anda sudah sarapan pagi ini?"
    println(str)

    // Escape Character
//    val str1 = "Apakah anda sudah \"sarapan pagi\" ini?"
//    println(str1)
//
//    val str2 = "Apakah anda sudah 'sarapan pagi' ini?"
//    println(str2)

    // \n dan \t
//    val str3 = "Apakah anda sudah \nsarapan pagi ini?"
//    println(str3)
//
//    val str4 = "Apakah anda sudah \tsarapan pagi ini?"
//    println(str4)

    // \b, \r dan \$
//    val str5 = "Apakah anda sudah sarapan\b pagi ini?"
//    println(str5)
//
//    val str6 = "Apakah anda sudah sarapan\r pagi ini?"
//    println(str6)
//
//    val str7 = "Apakah anda sudah \$sarapan pagi ini?"
//    println(str7)
//
//    val rawStr = """|Apakah anda sudah
//        |sarapan pagi ini...?
//        |karena kami menyediakan segalanya
//        |untuk anda""".trimMargin()
//    println(rawStr)

    // Looping

//    for (char in str){
//        println(char)
//    }

    // contentEquals
    val contentEq = str.contentEquals("Apakah sudah sarapan pagi ini?")
    println(contentEq)

    //contains
    val contains = str.contains("Pagi", true)
    println(contains)

    // Upper & Lower Case
    val upper = str.toUpperCase()
    val lower = str.toLowerCase()
    println(upper)
    println(lower)

    // Conversion
    val num = 10
    val strNum = num.toString()
    println(strNum)
    val r = strNum + "Uhuy"
    println(r)
    val s = strNum + 8
    println(s)

    // Subsequence
    val subseq = str.subSequence(2, 20)
    println(subseq)

    // Concatenation
    val kapitan = "Joni Sang Kapitan"
    val weapon = "Pedang Panjang"
    val ride = "Kuda Warna Hitam"
    val foot = 4

    println(kapitan + " mempunyai " + weapon + " dan berjalan menunggang " + ride + " berkaki " + foot)

    print("$kapitan mempunyai $weapon dan berjalan menunggang $ride berkaki $foot")
}