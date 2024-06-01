package com.example.kotlinlearning

fun main(){
//    println("yusuf")
//    println("Hello world")
//    var x=10
//    println("${x} büyüktür 10'dan")-->String in içine $ ile başka değişkenler konulabilir
//   ------------ Değişkenler--------------
//    var x=10//var can change
//    val z=20//z cant change in other lines because of val
//
//    var ornek: Long =10//we can change varibale type like this
//    ---------------- Strings-------------
//    var userName="Yusuf"
//    var userLastName="Şentürk"
//    var reversFullName=""
//
//    for(letter in userName+userLastName){
//        reversFullName=letter+reversFullName
//    }
//
//    print(reversFullName.lowercase())
//    --------------convertions var to var------------------
//    val age = "37"
//    val ageInt=age.toInt()
//    print(age+"yusuf"+"---->"+ageInt*5)
//    println("Hata var lan")
//     -------------------Data Stucters (Arrays,HashMaps...)-------------------
//-------Arrays---------
    val myArray= arrayOf("yusuf","Şentürk","Akif","Muratta")
    println(myArray[0])
    println(myArray.contains("yusuf"))//can't add elements to array
//------ArrayList-----
    val myArray2= arrayListOf(2,1,2,3)
    myArray2.add(12)//can add element to the arrayList
    println(myArray2.get(4))
    myArray2.remove(12)//removing element from list
    myArray2.removeAt(0)

    myArray2.forEach { print(it) }
    println()
//------Set---------(have unique element(can't be same element))----------------
    val examSet= setOf(10,12,12,23,34,45,34)//does count once for same elements
    println(examSet.size)

    examSet.forEach { (print(it)) }//print once for same elements
    println()

//----------HasSet-------------
    val hasSet=HashSet<String>()
    hasSet.add("Yusuf")
    hasSet.add("Yusuf")
    hasSet.add("Şentürk")
    hasSet.add("Şentürk")//hasset keep one of  the same elements
    hasSet.forEach{print(it)}
    println()
    myArray2.toHashSet()//we can convert like this myArray2 is normal array

//-----------HasMap-(Key-->Value)-----------------

    var foodChaloryArray=HashMap<String,Int>()
    foodChaloryArray.put("Apple",120)
    foodChaloryArray.put("Orange",90)
    foodChaloryArray.put("Banana",160)
    foodChaloryArray.put("Apple",20)//if you add same element it just update the value

    foodChaloryArray.forEach{
        println(it.key+"-->"+it.value)
    }
    println(foodChaloryArray.get("Apple"))


}