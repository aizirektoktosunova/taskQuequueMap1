import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> arrayList = new ArrayList<>();
        arrayList.add(new City(7, "Moscow"));
        TreeSet<City> treeSet = new TreeSet<>(arrayList);
        arrayList.add(new City(971, "Sharjah"));
        arrayList.add(new City(3120, "Amsterdam"));
        arrayList.sort(sortByCode);
        for (City a : arrayList) {
            if (a.getCode() % 2 == 1) {
                treeSet.add(a);
                System.out.println(a);

            }
        }
    }

    static Comparator<City> sortByCode = new Comparator<City>() {
        @Override
        public int compare(City o1, City o2) {
            return o2.getCode() - o1.getCode();
        }
    };
}