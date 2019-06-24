01.B - extract string resource
02 - buka res string
03 - buat dimens.xml di values
04.1 - buka main activity.java lalu masukkan logika sederhana
04.2 - Kemudian inisiasi variabel yang telah kita buat dengan menambahkan kode berikut di dalam metode onCreate.
04.3 - Kemudian tambahkan implementasi interface onClickListener pada kelas MainActivity.

06 - Jika terdapat baris merah seperti ini :
2018111209435526d64916135ea2bf20359909c26e7840

Jangan khawatir! Silakan klik di atas baris merah tersebut dan klik pada ikon bola lampu. Atau dengan tekan tombol Alt + Enter (option + return pada Mac) atau menekan lampu merah yang muncul lalu pilih implement methods.

04.4 Maka, secara otomatis akan ditambahkan metode onClick di kelas MainActivity. Tambahkan kode berikut ini.
04.5 Terakhir tambahkan kode untuk validasi nilai double.
04.D Akhirnya kelas MainActivity akan memiliki kode seperti berikut ini.


05.1 Apakah kita sudah selesai?
Belum! Masih ada yang kurang. Ketika nilai volume sudah dihitung dan kemudian terjadi pergantian orientasi (portrait-landscape) pada peranti, maka hasil perhitungan tadi akan hilang. 
Untuk mengatasinya tambahkan beberapa baris berikut pada MainActivity.java.

05.2 Kemudian tambahkan juga beberapa baris berikut pada baris terakhir metode onCreate.
