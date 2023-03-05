#!/bin/bash
echo "Masukkan dua bilangan untuk dijumlahkan:"
read bil1
read bil2
hasil=$(($bil1 + $bil2))
echo "Hasil penjumlahan: $hasil"
