import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       Map<Car,CarData> map=new HashMap<>();
       map.put(new Car(1, 3916), new CarData(1997,"Mers",700000,"Red"));
       map.put(new Car(2, 9999), new CarData(1999,"Nissan X-trail",800000,"Black"));
       map.put(new Car(3, 7777), new CarData(2000,"Audi",500000,"White"));
       map.put(new Car(4, 1234), new CarData(2009,"Fit",600000,"Black"));
       map.put(new Car(5, 1111), new CarData(2020,"Lexus 570",2000000,"Black"));


       for (Map.Entry<Car,CarData> i : map.entrySet()){
           System.out.println(i.getKey());
           System.out.println(i.getValue());
       }

    }
}