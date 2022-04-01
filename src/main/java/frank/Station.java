package frank;

public class Station {
public static final Station Taipei_Station =
       new Station( id:100, name: "Taipei");
public static final Station TAICHUNG_Station =
        new Station( id:200, name: "Taichung");
public static final Station KAOHSIUNG_STATION =
        new Station( id:300, name: "Kaohsiung");
int id;
String name;
public Station(int id, String name) {
    this.id = id;
    this.name = name;
}
}
