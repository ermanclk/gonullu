Kurulum 

kodu githubdan indirin. 

git clone https://github.com/msaint72/gonullu.git 

username password sorar, daha sonra ssh keyinizi githuba eklerseniz herseferinde şifre girmekten kurtulursunuz.

idea import projects -> maven template > yaparak import edebilirsiniz, veya ideada import from version control diyerek ilk aşamada idea ile kodu indirebilirsiniz. 

frontend ve backend klasorleri, sol menude projects toolbarda gorunuyor olmalı.

npm install  komutu bulunduğu klasordeki  “package.json” dosyasına bakarak bu dosyada bulunan dependencyleri indirir. bu sebepten Idea terminal ile cd frontend yaparak frontend klasorune giriyoruz. 

bu klasorde;
npm install
komutunu çalıştıralım.  
npm package.json dosyasındaki configurasyona bakarak gerekli dependencyleri indiriyor.
Projedeki frontend ile ilgili run scriptleri configurasyonu da package.json da tanımlı.
dolayısı ile npm komutu daima bu dosyanın olduğu klasorde çalışmalı.

npm install komutu butun javascript dependecyleri bu klasore download edicek. global dependecyler bigisayarınızda her projenin erişebileceği bir klasore iniyor lokal olan node_modules klasorune indiriliyorlar. 

frontend altında node_modules klasöru oluşacak, bu klasör içeriğini  npm yönetiyor biz dokunamayacagız. 


Backend konfigurasyonu: 
pom.xml dosyasını bulup, sağ click > add as maven project var ise onu seçiyoruz. yoksa zaten maven projesidir yine maven menüsündende reimport diyoruz.
Daha sonra idea da maven tabından clean compile yaparsak java dependencyleri maven indiricek.
Sonrasında run edince backend de calısıyor olmalı. 




Frontend:

Ornek proje acıldıgında 5 link goruluyor:


Home: açılış sayfası
Service: Ornek bir backen cağrısı, basit bir backend call yapıyor ve texti ekranda gosteriyor. 
User: Basit bir user create işlemi, database kadar giderek useri create ediyor. 
Login sayfası: Ornek Login, basit anlamda bir login işlemi yapılmış.
Protected: Sadece Login olunduğunda contenti gorulebilen bir sayfa. 

Login kullanıcı dı sifresi, uygulamadaki application.properties dosyasında yazıyor. daha sonra databaseden okuyacak.



















