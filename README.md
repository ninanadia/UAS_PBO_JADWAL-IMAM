# UAS PBO Jadwal Solat
Percobaan penerapan konsep OOP dan implementasi JDBC antara Java dan Mysql

### Pemrograman Berbasis Objek – B
Nama Anggota Kelompok 5 :
-1177050010	Aisyah Amini Nur
-1177050078	Nida Luthfi Awwaliyah
-1177050079	Nina Nadia Syafitri Husein

## Yang dibutuhkan :
- XAMPP (untuk MySQL, Apache, phpmyadmin)

- Netbeans (untuk membuka Project)

## Langkah - Langkah Menjalankan Aplikasi :
1. Persiapkan aplikasi yang di butuhkan
2. Download/clone source code project, dengan cara (Pilih) :
    
	- Menclone langsung melalui Netbeans
 	  [Tutorial](https://www.joe0.com/2018/02/16/how-to-cloning-github-project-into-netbeans/)
    
	- Aplikasi git
		1. Buka git, kemudian masukan command
         
					 ```
         
	  		 git clone https://github.com/ninanadia/Jadwal_Imam.git
					```
		2. Buka aplikasi Netbeans, lalu pilih **Open Project**
     
		3. Pilihlah folder dimana tempat clone berada	
   
  	 - Download .zip **Clone or download**  
		1. Pada atas kanan, klik **Clone or download** dan **Download ZIP**
 
     		2. Ekstrak .zip tersebut

    		3. Buka aplikasi Netbeans, lalu pilih **Open Project**

      		4. Pilihlah folder dimana tempat ekstrak berada
3. Buka aplikasi XAMPP, lalu Aktifkan Mysql dan Apache   
4. Buka link localhost phpmyadmin pada browser, dengan cara (Pilih) :
	- Tekan button **Admin** pada sebelah kanan baris **MySQL**

   	- [Click Me !](http://localhost/phpmyadmin/index.php)
5. Pada phpmyadmin, klik tab **Database** lalu buatlah databaase baru dengan nama **jadwal**
6. Pada phpmyadmin, klik tab **Import** lalu click _Choose File_ dan pilih **jadwal.sql** yang berada pada subdirectory project */sql/*
	...
	.../Jadwal_Imam/sql/
	...
7. Buka aplikasi Netbeans, lalu pilih dan jalankan **Data.java**, dengan cara (Pilih) :
	- Pada sidebar kiri, buka package **Default Package** lalu klik kanan pada **Data.java** dan pilih **Run File**
	- Pada tab Run (diantara **Refactor** dan **Debug** ), klik **Run Project**, dan pilih **Data.java** sebagai class utama
_Anda dapat membuild project dengan cara mengklik _ __Clean and Build Project__ _pada tab Run__ _, sehingga jika anda ingin menjalankan aplikasi tidak perlu membuka netBeans, namun cukup dengan menjalankan_ __Jadwal_Imam.jar__ _ yang berada pada directory build berada, default:_
	```
		.../Jadwal_Imam/dist/Jadwal_Imam.jar/
	```
## keterangan menggunakan aplikasi 
- lebih detail nya anda dapat lihat pada [User Manual] (

##TLDR;
Clone project ini, buat database baru bernama **jadwal**, import file **jadwal.sql** yang terdapat pada folder /sql/, lalu Run **Data.java** melalui netBeans

_Aplikasi ini dibuat pada netBeans versi 8.2_
