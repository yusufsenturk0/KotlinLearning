package com.example.kotlinlearning

class Sanatci (var isim: String,var yas:Int,var enstruman:String) {
    //Encapsulation,Inheritance(Kalıtım)
    //!!!!genelde val olarak tanımlarnır parametreler
    //!!!!Class satırında parmetreleri belirlerken başına var konulursa diğer sınıflardan erişilebilir ve değiştrilebilir.
    //!!!!Class satırında parmetreleri belirlerken başına val konulursa diğer sınıflardan erişilebilir ama değişrilemez.
    //!!!!Class satırında parmetreleri belirlerken başına hiç bir şey koymaz isek diğer sınıflardan ne erişilebilir ne de değiştirilebilir.
    var sacRengi=""
    private var tur="İnsan"
    init {//Obje oluşturulunca çalıştıırlır constuctır gibi..
        print("İnit çağırıldı.")
    }

    fun sarkiSoyle(){
        println("${isim} şarkı söyledi.")
    }

    fun turuYazdir(){
        println("Tür: ${tur}")
    }
}