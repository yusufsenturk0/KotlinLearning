package com.example.kotlinlearning

fun main(){
//    println("yusuf")
//    println("Hello world")
//    var x=10
//    println("${x} büyüktür 10'dan")-->String in içine $ ile başka değişkenler konulabilir
//   ********************* Değişkenler******************
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
//  *******************Data Stucters (Arrays,HashMaps...)*********************
//-------Arrays---------
//    val myArray= arrayOf("yusuf","Şentürk","Akif","Muratta")
//    println(myArray[0])
//    println(myArray.contains("yusuf"))//can't add elements to array
////------ArrayList-----
//    val myArray2= arrayListOf(2,1,2,3)
//    myArray2.add(12)//can add element to the arrayList
//    println(myArray2.get(4))
//    myArray2.remove(12)//removing element from list
//    myArray2.removeAt(0)
//
//    myArray2.forEach { print(it) }
//    println()
////------Set---------(have unique element(can't be same element))----------------
//    val examSet= setOf(10,12,12,23,34,45,34)//does count once for same elements
//    println(examSet.size)
//
//    examSet.forEach { (print(it)) }//print once for same elements
//    println()
//
////----------HasSet-------------
//    val hasSet=HashSet<String>()
//    hasSet.add("Yusuf")
//    hasSet.add("Yusuf")
//    hasSet.add("Şentürk")
//    hasSet.add("Şentürk")//hasset keep one of  the same elements
//    hasSet.forEach{print(it)}
//    println()
//    myArray2.toHashSet()//we can convert like this myArray2 is normal array
//
////-----------HasMap-(Key-->Value)-----------------
//
//    var foodChaloryArray=HashMap<String,Int>()
//    foodChaloryArray.put("Apple",120)
//    foodChaloryArray.put("Orange",90)
//    foodChaloryArray.put("Banana",160)
//    foodChaloryArray.put("Apple",20)//if you add same element it just update the value
//
//    foodChaloryArray.forEach{
//        println(it.key+"-->"+it.value)
//    }
//    println(foodChaloryArray.get("Apple"))

//********************Kontroller and Donguler(if,for,while)************************
//----------if-else----------
//    var  skor=5
//    if (skor==10){
//        println("ooooooooooo")
//    }
//    else if(skor>10){
//        println("aaaaaaaaaaaaaaaa")
//    }
//    else{
//        println("iiiiiiiiiiiiiiii")
//    }
////-----------whene(swich case)------------
//
//    val not=0
//    var notStr=""
//    when(not){
//        0->notStr="FF"
//        1->notStr="DD"
//        2->notStr="CC"
//        3->notStr="BB"
//        4->notStr="AA"
//        else->println("Katılmadı")
//
//
//    }
////---------While-----------
//    var j=0
//    while(j<10){
//        print(j)
//        j++
//    }
////----------For-------------
//    val dizi= arrayListOf(5,10,15,20,25)
//
//    for(num in dizi){
//        println(num/5*3)
//    }
//    //range(0..9)
//    for(num in 0..9){
//        println(num)
//    }

//****************Fonksiyonlar********************
//    firstFun()
//    addTwoNum(12,23)
////----------Return----------
//    var result=add(12,23)
//    println(result)

//********************Classes********************
//    val superman=SuperKahraman("Clark Cent",20,"Gazateci")
//
//    println("Name-->${superman.name}\n" +
//            "Age-->${superman.age}\n" +
//            "Jıb-->${superman.job}\n")
//***************Nullability*********************
//    //(ornegin uygulama girdisi alırken ve onu integera cevirirken int ya da null yap diyoruz ve böylelikle hatalardan kurtuluyoruz stringi int e cevirmek gibi)
//    val userInput="yusuf şentürk"
//    val userInputInt=userInput.toIntOrNull()//burda toInt yaparsak ve "yusf" string böle ise uygulama hata olur bu yuzden ıntornull kullanıyoruz
//    if(userInputInt!=null){
//        println(userInputInt*2)//burda eger toIntOrNull kullanmayıp direk inte cevirip iki ile carparsak hata alabiliriz burda bu toIntOrNull methodu bunu engelliyor.int cevirdigimiz sey null degil ise islemi gerceklestir
//    }
//
//    var myDouble:Double?   //(degiskeni nullable olarak tanimliyoruz)

//----------------Lateinit---------------
    //mesela bu sınfım icinde ama main dısında superkahraman sınfından bir obje olusturcan ama degeri orda atmıcan-->
    //javada mesela (SuperKahraman superKahraman;   )bu sekil yapıyoruz ya ama kotlinde böyle yapıyoz -->
    //kotlinde mesela( lateinit var superKahraman : SuperKahraman ) böyle yapıyoz
    //late initi böyle kullanıyoruz ama bunu basit int , string gibi degiskenlerde kullanamazsın

    //-------->------------>OOP<---------<----------------<----------
    //-----Encapsulation(private,public,protected,internal)-----
    //Inheritance---->Diğer sınıfların fonksiyonlarını ve methodlarını kalıtım ile kullanabiliyoruz(kalıtım yapılan sınıfın basşına "open" yazılması gerekir)
    //Polymorphism---->Aynı isimde fonksiyon yazabilde parametre sayısını değiştirerek
    //Abstraction(Abstract class , Interface sınıf)----->
    var atil=Sanatci("Atil",80,"Gitar")
    println(atil.isim)
    println(atil.enstruman)

    var zeynep=Sanatci("Zeynep",35,"Batari")
    atil.sarkiSoyle()
    zeynep.sarkiSoyle()

    atil.turuYazdir()
    zeynep.turuYazdir()




}



//****************Fonksiyonlar ve Siniflar********************
//fun firstFun(){//we call this fun in Main function
//    println("Birinci fonksiyon çalıştı")
//}
//fun addTwoNum(num1: Int,num2: Int){//we call this fun in Main function
//    println("Result : ${num1*num2}")
//}
////---------Return------------
//fun add(num1:Int,num2:Int):Int{//:Int (return type)
//    return num1+num2
//}