# Fundamental Performance Test
Performance test adalah teknik non functional test untuk menentukan parameter sistem dalam hal stabilitas dan responsif pada saat melakukan load kerja. 

 

Pengukuran kualitas performance test pada atribut: 



* Stabilitas 
* Ketahanan (reability) 
* Penggunaan sumber daya 

 

Hal yang diukur : 



* Performa aplikasi sampai batas tertentu 
* Berbagai macam bentuk untuk memahami reability, standbility dan availability pada environment 
* Bukan merupakan functional test 

 

Langkah yang dilakukan saat performance test: 



* Membuat test plan 
* Membuat script test 
* Melakukan performance test 
* Menganalisa hasil performance test 

 

Smoke testing dilakukan untuk verify script yang sudah dibuat tersebut dapat handle minimal load dan tanpa masalah. 

 

Load testing adalah pengujian sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu 

 

Stress testing digunakan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem.  

 

Spike testing sama seperti stress testing namun kenaikannya langsung menuju melebihi puncak dalam waktu singkat seperti pada saat flash sale di suatu e-commerce 


# Performance Testing With JMeter
Apache JMeter adalah perangkat lunak sumber terbuka, aplikasi desktop Java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web. Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya.

plugin adalah pengaya perangkat lunak yang diinstal pada suatu program, untuk menjalankan fitur tambahan dalam aplikasi atau program


beberapa komponen yang ada di JMeter adalah sbb
    -Listeners
    -Timers
    -Assertions
    -Pre-Post Processors


# Post Processor JMeter
Post Processors adalah elemen rencana pengujian yang digunakan untuk melakukan tindakan tertentu setelah pemrosesan permintaan sampel. Pemroses pos ini biasanya digunakan untuk mengekstraksi nilai-nilai tertentu dari respons permintaan sampel, mis. kita dapat mengekstraksi nilai variabel sesi dari permintaan HTTP dan meneruskan nilai variabel sesi ke permintaan berikutnya.



JMeter JSON Extractor menyediakan cara untuk menggunakan ekspresi JSON Path untuk mengekstraksi nilai dari respons berbasis JSON di JMeter. Pemroses pos ini harus ditempatkan sebagai anak Sampler HTTP atau sampler lain yang memiliki respons
