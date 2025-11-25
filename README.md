Abi merhabalar, genel olarak panel yapısını ve Swing kütüphanesini, thread kullanımını unuttuğumdan dolayı google'dan yardım aldım.
Projede topları oluşturtabilip thread problemlerini ve render problemlerini aştıktan sonra en büyük sorun if else kullanmadan boundary kontrol yapmaktaydı.
Mülakatta adını unutmuş olduğum polymorphism'i tekrar okuyup videolarını izledikten sonra fark ettim ki olay polymorphism'de.
ortak kullanılan update metodunda 2 farklı class verdikten sonra olay biraz daha çözülme aşamasına geldi ama tam çözülmedi çünkü boundary control için hala if-else benzeri bir yapı kullanmam gerekiyordu.
2 farklı motion class'ı yazıp update fonksiyonlarını onlara göre düzenledim. Sonra boundary control'ü de Math sınıfının absolute methoduyla çözdüm. 
MAth.abs fonksiyonu da kendi içerisinde if else kullanıyor ama matematiğin en temel formüllerinden biri olduğundan bu aklıma gelen ilk çözümdü. 
Eğer istediğiniz farklı bir şekilde çözümse üzerine daha uğraşabilirim.
