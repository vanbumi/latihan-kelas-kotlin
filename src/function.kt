fun main(args: Array<String>) {

    // #1
    fun tugas(){
        println("Anda telah melakukan tugas dengan baik")
    }

    tugas()

    // #2
    fun playFootBall(ball: String){
        println(ball)
    }

    // call
    playFootBall("Fooball player run to the goal keeper")

    // #3
    fun calculateNumber(players: Int, coaches: Int): Int {
        val totalTeam = players + coaches
        return totalTeam
    }

    // call
    val theTeam = calculateNumber(5, 2)

    // cara 1
    println("Jumlah satu team dalam bola basket adalah ${ calculateNumber(5, 2) } orang")

    // cara 2
    print("Jumlah satu team dalam bola basket adalah $theTeam orang")

    // # 4
    fun reaksiPenonton(aksi: String = "Marah"){
        println(aksi)
    }

    reaksiPenonton()
    reaksiPenonton("Semangat")
}