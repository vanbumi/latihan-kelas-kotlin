fun main(args: Array<String>) {

    // Imutable "listOf"
    val memberFam = listOf("Ayah", "Ibu", "Kakak", "Budi", "Adik")

    println(memberFam)

    // sortir
    println(memberFam.sorted())

    // akses index
    println(memberFam[3])

    println(memberFam.first())
    println(memberFam.last())

    // boolean
    println(memberFam.contains("Ayah"))
    println(memberFam.contains("Nenek"))

    // Mutable "arrayListOf"

    // size
    val flowers = arrayListOf("Melati", "Matahari", "Mawar", "Tulip")
    println(flowers.size)

    // add
    flowers.add("Kamboja")
    println(flowers)

    // add dengan posisi index
    flowers.add(0, "Deposito")
    println(flowers)

    // posisi index
    println(flowers.indexOf("Tulip"))

    // remove
    flowers.remove("Deposito")
    println(flowers)

    // remove dengan index
    flowers.removeAt(0)
    println(flowers)

    // Map Imutable "mapOf"

    val phoneBookMap = mapOf("Name" to "Phone Number", "Address" to "City")
    println(phoneBookMap)

    val numberMap = mapOf("Two" to 2)

    // akses collection Map
    println(phoneBookMap["Name"])
    println(phoneBookMap.get("Address"))
    println(phoneBookMap.getOrDefault("Hobby", "Hobby belum ada"))

    // print all
    println(phoneBookMap.keys)

    println(phoneBookMap)

    // Mutable Map Colllection "hasMapOf"

    val phoneBook = hashMapOf("Name" to "Phone Number", "Address" to "City", "Hobby" to "Sport")
    println(phoneBook)

    // rubah value
    phoneBook["Address"] = "Country"
    println(phoneBook)

    phoneBook.put("Age", "Form Age")
    println(phoneBook)

    // remove
    phoneBook.remove("Hobby")
    println(phoneBook)

    // clear
    phoneBook.clear()

    // boolean
    println(phoneBook.isEmpty())

}