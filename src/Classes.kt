class Car(val make: String, val model: String, var color: String) {

    fun accelerate() {
        println("This car can move forward & backward")
    }

    fun details() {
        println("Mobil yang tersedia adalah warna $color $make $model")
    }
}

class Truck(val make: String, val model: String, val towingCapacity: Int) {

    fun towing() {
        println("Truck ready for angkut barang hasil bumi")
    }

    fun details() {
        println("Truck yang siap digunakan adalah $make $model dengan kapasitas angkut $towingCapacity ton")
    }

}

// Inheritance

//open class Vehicle(val make: String, val model: String) {
//
//    open fun accelerate() {
//        println("Car bergerak maju")
//    }
//
//    fun park() {
//        println("Car or Truck set to parkir")
//    }
//
//    fun brake() {
//        println("Car Stop!")
//    }
//
//}
//
//class Car(make: String, model: String, color: String) : Vehicle(make, model) {
//    override fun accelerate() {
//        println("Mobil berjalan mundur")
//        super.accelerate()
//    }
//}
//
//class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
//    fun load() {
//        println("Truck on loading")
//    }
//}

fun main(args: Array<String>) {

    val car = Car("Toyota", "Avanza", "Blue")
    println(car.make)
    println(car.model)
    car.accelerate()
    car.details()

    val truck = Truck("Isuzu", "F-Series", 1000)
    truck.towing()
    truck.details()

//    val bmw = Car("BMW", "Seri-520i", "red")
//    bmw.accelerate()
//
//    val truck = Truck("Mitsubishi", "Fuso", 1000)
//    truck.park()
//    truck.load()

}


