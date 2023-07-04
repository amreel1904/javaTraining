package day9;

import java.util.ArrayList;
import java.util.List;

public class Tiga {
    int id;

    public Tiga(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        List<Tiga> list = new ArrayList<Tiga>();
        list.add(new Tiga(111));
        list.add(new Tiga(222));
        for (Tiga account : list) {
            System.out.println(account.id);
        }
    }
}
