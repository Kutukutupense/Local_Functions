//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    normalfonksiyon()
    // ozelfonksiyon
    // yazıldığında bulunamayacak yorum satırını kaldır bak

}
fun normalfonksiyon(){
    println("Normal Fonksiyon")
    fun ozelfonksiyon(x: String): String{
        return x
    }
    var sonuc = ozelfonksiyon("Hi")
    println(sonuc)
}
// local fonksiyonlar fonksiyon içinde fonksiyonlardır. oluşturulma sebebi ise
// fonksiyonun değiştirilmesini ve ulaşılmasını engellemektir.
// bankacılık sistemlerinde özellikle kullanılır