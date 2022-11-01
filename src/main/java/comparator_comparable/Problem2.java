package comparator_comparable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem2 {

    public static List<Snack> priceAscendingOrder(List<Snack> snackList) {
        List<Snack> answer = Collections.emptyList();
        Collections.sort(snackList, new Comparator<Snack>() {
            @Override public int compare(Snack o1, Snack o2) {
                return o1.price - o2.price;
            }
        });
        answer = snackList;
        return answer;
    }

    public static List<Snack> nameAscendingOrder(List<Snack> snackList) {
        List<Snack> answer = Collections.emptyList();
        Collections.sort(snackList, new Comparator<Snack>() {
            @Override public int compare(Snack o1, Snack o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        answer = snackList;
        return answer;
    }
}

class Snack {
    public String name;
    public int price;

    public Snack(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
