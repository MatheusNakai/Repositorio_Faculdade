import 'dart:async';
import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

class Anime extends StatefulWidget {
  const Anime({Key? key}) : super(key: key);

  @override
  _AnimeState createState() => _AnimeState();
}

class _AnimeState extends State<Anime> {
  var animeid, title, description, score, coverPhoto, genre;
  @override
  void initState() {
    super.initState();
    attInterface();
  }

  var list;
  void attInterface() async {
    final respose = await http.get(Uri.parse('http://localhost:8080/anime/2'));
    list = await http.get(Uri.parse('http://localhost:8080/anime'));
    list = jsonDecode(list.body);
    print(list);
    setState(() {
      if (respose.body == null) {
      } else {
        var jsonData = json.decode(respose.body);
        animeid = jsonData['anime_id'].toString();
        title = jsonData['title'].toString();
        description = jsonData['description'].toString();
        score = jsonData['score'].toString();
        coverPhoto = jsonData['coverPhoto'].toString();
        genre = jsonData['genre'].toString();
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SingleChildScrollView(
        child: Column(
          children: <Widget>[
            Text(title),
            Text(description),
            Text(score),
            Text(genre),
            Image.network(coverPhoto),
            for (var i in list) Image.network(i['coverPhoto'].toString()),
          ],
        ),
      ),
    );
  }
}

void main(List<String> args) {
  runApp(MaterialApp(
    home: Anime(),
  ));
}
