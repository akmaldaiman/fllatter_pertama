// This is a basic Flutter widget test.
//
// To perform an interaction with a widget in your test, use the WidgetTester
// utility that Flutter provides. For example, you can send tap and scroll
// gestures. You can also use WidgetTester to find child widgets in the widget
// tree, read text, and verify that the values of widget properties are correct.

import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';

import 'package:flutter_pertama/main.dart';

void main() {
  //tipe data dan variabele
  //var
  var mahasiswa = "jejen";
  var umur = 20;

  print(mahasiswa + " umur = " + umur.toString());

  //string
  String mahasiswaString;
  mahasiswaString = "aan";

  print(mahasiswaString);

  //int
  int semester;
  semester = 6;

  print(semester);

  //double
  double ipk;
  ipk = 3;

  print(ipk);

  //boolean
  bool benar = true;
  bool salah = false;
  bool tidakbenar = !true;
  bool tidaksalah = !false;

  //List
  List jurusan = [
    "Teknik Informatika",
    "Sistem Informasi",
    "DKV",
    semester.toString(),
    ipk.toString()
  ];

  print(jurusan);

  //Map
  Map<String, dynamic> kelas = {
    "nama": "beben",
    "kelas": "TI 2",
  };

  print(kelas);
  print(kelas['nama']);
  print(kelas['kelas']);

  //oprator
  int a, b;
  a = 9;
  b = 7;
  print("a = " + a.toString());
  print("b = " + b.toString());

  print({a + b});
  print({a - b});
  print({a / b});
  print({a = b});
  print({a > b});
  print({a < b});
  print({a >= b});
  print({a <= b});

  //conditional
  print("conditional");
  var nilai;
  nilai = 80;

  if (nilai >= 80) {
    print("A");
  } else if (nilai <= 80 && nilai >= 50) {
    print("B");
  } else {
    print("tidak lulus");
  }

  print("..........");
  nilai >= 80 ? print("A") : print("tidak A");
}
