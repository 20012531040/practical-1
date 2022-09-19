class Car(type:String, model:String, owner:String, miles:Int, price:Int,
          cprice:Int){
    var ty:String = type
    var mo =model
    var ow = owner
    var m:Int = miles
    var p:Int = price
    var cp:Int = cprice
    fun getCarprice(){
        println("Car Information : $ty , $mo\nCar Owner: $ow\nMiles Driven:$m\nOriginal Car Price. $p, \nCurrent Car Price: $cp ")
    }
}
fun main(){
    var Cars = arrayOf(Car("BMW","2013","VAMSHI",102,100000,59000),
        Car("Benz","2015","mahesh",105,100000,65200),
        Car("Toyata","2019","sai",156,104400,957410),
        Car("Maruti","2020","karna",240,150000,24569))
    println("Creating Car Class Object Car1 in next line")
    println("Object of Class is created and Init is called.\n")
    for (i in Cars){
        i.getCarprice()
        print("-----------------\n")
    }
}
