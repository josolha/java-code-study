package comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem3 {
    public static List<Snack> Solution(List<Snack> snackList) {
        List<Snack> answer = Collections.emptyList();
        Collections.sort(snackList, new Comparator<Snack>() {
            @Override
            public int compare(Snack o1, Snack o2) {
                if(o1.price == o2.price){
                    return o1.name.compareTo(o2.name);
                }
                return o2.price - o1.price;
            }
        });
//        가격 높은 순으로 배열하되, 가격이 똑같으면 이름 순으로 배열하는 프로그램을 만들어달라고 했습니다. 편돌이는 화가났습니다.
        answer = snackList;
        return answer;
    }
}
