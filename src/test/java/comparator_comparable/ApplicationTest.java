package comparator_comparable;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationTest {

    @Nested
    class Problem1Test {
        @Test
        void case1() {

            List<SnackList> snackList = new ArrayList<>();
            snackList.add(new SnackList("새우깡", 1500));
            snackList.add(new SnackList("고래밥", 1700));
            snackList.add(new SnackList("초코파이", 2800));

            Collections.sort(snackList);
            assertThat(snackList.get(0).name).isSameAs("초코파이");
        }
    }

    @Nested
    class Problem2Test {
        @Test
        void case1() {
            List<Snack> snack = new ArrayList<>();
            snack.add(new Snack("새우깡", 1500));
            snack.add(new Snack("고래밥", 1700));
            snack.add(new Snack("초코파이", 2800));
            snack.add(new Snack("초코비", 2000));
            List<Snack> snacks = Problem2.priceAscendingOrder(snack);

            List<Snack> snacksAnswer = new ArrayList<>();
            snacksAnswer.add(new Snack("새우깡", 1500));
            snacksAnswer.add(new Snack("고래밥", 1700));
            snacksAnswer.add(new Snack("초코비", 2000));
            snacksAnswer.add(new Snack("초코파이", 2800));
            assertThat(snacks).isEqualTo(snacksAnswer);
        }

        @Test
        void case2() {
            List<Snack> snack = new ArrayList<>();
            snack.add(new Snack("새우깡", 1500));
            snack.add(new Snack("고래밥", 1700));
            snack.add(new Snack("초코파이", 2800));
            snack.add(new Snack("초코비", 2000));
            List<Snack> snacks = Problem2.nameAscendingOrder(snack);

            List<Snack> snacksAnswer = new ArrayList<>();

            snacksAnswer.add(new Snack("고래밥", 1700));
            snacksAnswer.add(new Snack("새우깡", 1500));
            snacksAnswer.add(new Snack("초코비", 2000));
            snacksAnswer.add(new Snack("초코파이", 2800));
            assertThat(snacks).isEqualTo(snacksAnswer);


        }
    }


}
