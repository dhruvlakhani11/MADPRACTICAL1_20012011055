class Car constructor(cmodel: String, oprice: Int, cowner: String, mdrive: Int, cprice: Int) {
    var model: String
    var originalPrice: Int
    var owner: String
    var mileDrive: Int
    var currentPrice: Int

    init {
        this.model = cmodel
        this.originalPrice = oprice
        this.owner = cowner
        this.mileDrive = mdrive
        this.currentPrice = cprice
        println("Object has been created and init called")
        println("--------------------------------")
        println("Car's Model : $model")
        println("Car owner : $owner")
        println("Miles Drive : $mileDrive")
        println("Original Price : $originalPrice")
        println("Current Price : $currentPrice")
        println("--------------------------------\n")
    }

    fun getCarInformation() {
        println("Car's Model : $model")
    }

    fun carOwner() {
        println("Car owner : $owner")
    }

    fun mileDrove() {
        println("Miles Drive : $mileDrive")
    }

    fun getOriginalCarPrice() {
        println("Original Price : $originalPrice")
    }

    fun getCurrentCarPrice() {
        println("Current Price : $currentPrice")
    }

    fun displayCarInfo() {
        getCarInformation()
        carOwner()
        mileDrove()
        getOriginalCarPrice()
        getCurrentCarPrice()
    }
}

fun main() {
    println("Created car1 named object of class Car")
    var car1 = Car("G-wagon ,2018", 26000000, "Dhruv", 10000, 18500000)

    println("Created car2 named object of class Car")
    var car2 = Car("Ciaz ,2017", 1250000, "SanjayBhai", 41000, 850000)

    println("Created car3 named object of class Car")
    var car3 = Car("Scorpio ,2010", 1700000, "Jeet", 40000, 100000)
}