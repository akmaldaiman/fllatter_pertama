import 'dart:ffi';

void main(List<String> arguments) async {
  var p = Person();

  print('job 1');
  print('job 2');
  await p.getDataAsnyc().then((_) {
    print('job 3 : ' + p.name);
  });
  print('job 4');
}

class Person {
  String name = ' default name';

  void getData() {
    name = 'joko'; //misalnya: ambil Data dari Database (3 detik)
    print('get data [done]');
  }

  Future<void> getDataAsnyc() async {
    await Future.delayed(Duration(seconds: 3));
    name = 'joko'; //misalnya ambil Data dari Database (3 detik)
    print('get data [done]');
  }
}
