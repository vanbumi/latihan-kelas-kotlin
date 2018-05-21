import org.omg.PortableInterceptor.SUCCESSFUL

fun main(args: Array<String>) {

    val printMessage = { message: String -> println(message) }

//    fun printMessage(message: String) {
//        println(message)
//    }

    printMessage("Hello Kotlin")

    // Contoh #1
    val sumA = { x: Int, y: Int -> x + y }
    println(sumA(5, 3))

    // Keluar type nya dari expression
    val sumB : (Int, Int) -> Int = {x, y -> x + y}
    println(sumB(10, 5))

    // contoh request function
    fun downloadData(url: String, completion: () -> Unit) {
      // doing something, misalnya sent request
      // mendapatkan data yang di reques
      // no network error dsb
      completion()
    }

    // call downloadDataFunction
    downloadData("fakeUrl.com", {
        println("Call function ini hanya akan berjalan " + "jika function completion() telah selesai")
    })

    // Contoh lain dengan melewatkan data
    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        // download request
        // pengembalian data
        var car = Car("BMW", "Seri 501i", "Red")
        completion(car)
    }

    downloadCarData("fakeUrl.com") { car ->
        println(car.make)
        println(car.model)
    }

    downloadCarData("fakeUrl.com") {
        println(it.make)
        println(it.model)
    }

    // contoh lain request function
    fun donwloadTruckData(url: String, sukses: (Truck?, Boolean) -> Unit) {
        // make the web request
        // we get the result back
        val webRequestSuccess = true
        if (webRequestSuccess) {
            // menerima data
            val truck = Truck("Isuzu", "I-Series", 1000)
            sukses(truck, true)
        } else {
            sukses(null, false)
        }
    }

    donwloadTruckData("fakeUrl.com") {truck, success ->
        if (success == true) {
            // do something with our truck
            truck?.towing()
        } else {
            println("Something went wrong")
        }
    }


}