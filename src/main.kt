fun main() {
var I=Human("JANNIE",23,47.0)
    println(I)
    I.eat(10)
    println(I.weight)
    I.speak("I want to be a champion in Kotlin")
    I.Birthday(1)

    var me=Champions("jannie","wanjiku","wanjikujanee@gmail.com",1420561073,1050)
println(me.firstname)
    println(me.lastname)
    println(me.email)
    println(me.phonenumber)
    println(me.password)
}



class Human(var name:String,var age:Int,var weight:Double){
fun eat(foodweight:Int){
    println("I am eating $foodweight kgs of food")
    weight+=foodweight
}
    fun speak(speech:String){
        println(speech)
    }
    fun Birthday(add:Int){
        age+=1
        println(age)



    }
}
data class Champions(var firstname:String,var lastname:String,val email:String,var phonenumber:Int,var password :Int)
