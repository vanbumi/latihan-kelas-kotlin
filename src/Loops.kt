fun main(args: Array<String>) {

    val flowers = arrayListOf("Melati", "Matahari", "Mawar", "Tulip")

    // For loop
    for (flower in flowers) {
        println("Nama bunga: $flower")
    }

    // map collection
    val phoneBooks = hashMapOf("Name" to "Phone Number", "Adress" to "City", "Hobby" to "Sport")

    for ((key, value) in phoneBooks) {
        println("$key harus di ikuti dengan $value")
    }

    // while loop

//    var x = 10
//
//    while (x > 0) {
//        println(x)
//        x--
//    }

    var x = 0

    while (x <= 10) {
        println(x)
        x++
    }

}