01 Buat Project baru di Android Studio dengan kriteria sebagai berikut:
02 Selanjutnya kita akan membangun antarmuka (interface) seperti ini:
03 Kondisikan activity_main.xm menjadi seperti ini :
04 Jangan lupa untuk menambahkan berkas dimens.xml secara manual di dalam res → values. Dan isikan berkas dimens.xml seperti berikut.
05 Untuk resource stringnya juga perlu kita tambahkan. Kita tambahkan semua string yang akan digunakan di project ini, buka berkas strings.xml dan tambahkan kode berikut ini.
06.01 Kemudian untuk MainActivity.java tambahkan beberapa baris yang berfungsi untuk meperkenalkan button yang sudah ditambahkan di layout activity_main.xml seperti ini :
06.02 Lalu tambahkan beberapa baris yang berfungsi untuk menambahkan event onClick pada button btnMoveActivity seperti ini.
07.01 Button btnMoveActivity akan memiliki fungsi untuk berpindah Activity ke Activity lain. Sekarang kita buat Activity baru dengan cara sebagai berikut: Klik kanan di package utama aplikasi package name → New → Activity → Empty Activity.
07.02 Lalu isikan MoveActivity pada dialog. Ketika sudah klik Finish.
08 Untuk menandakan bahwa perpindahan activity berhasil, silakan tambahkan satu TextView dan kondisikan activity_move.xml menjadi seperti berikut.
09 Setelah activity tujuan sudah berhasil diciptakan, sekarang saatnya menambahkan suatu intent pada method onClick() di MainActivity.java menjadi sebagai berikut.
10 Selesai! Langkah pertama untuk memindahkan satu activity ke activity lain sudah selesai, sekarang silakan jalankan aplikasi Anda dengan mengklik tombol pada menu bar. Seharusnya sekarang anda sudah bisa memindahkan activity dengan mengklik tombol ‘Pindah Activity’.
