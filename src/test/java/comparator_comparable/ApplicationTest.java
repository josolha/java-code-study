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
            assertThat(snacks.get(2).price).isEqualTo(2000);
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
            assertThat(snacks.get(2).name).isEqualTo("초코비");


        }
    }

    @Nested
    class Problem3Test {
        @Test
        void case1() {
            List<Snack> snack = new ArrayList<>();
            snack.add(new Snack("새우깡", 1500));
            snack.add(new Snack("고래밥", 1700));
            snack.add(new Snack("초코파이", 2800));
            snack.add(new Snack("초코비", 2000));
            snack.add(new Snack("사또밥", 1400));
            snack.add(new Snack("오징어땅콩", 2800));
            snack.add(new Snack("아리가또밥", 600));
            snack.add(new Snack("엉클밥", 1700));

            List<Snack> snacks = Problem3.Solution(snack);

            List<Snack> snacksAnswer = new ArrayList<>();
            snacksAnswer.add(new Snack("오징어땅콩", 2800));
            snacksAnswer.add(new Snack("초코파이", 2800));
            snacksAnswer.add(new Snack("초코비", 2000));
            snacksAnswer.add(new Snack("고래밥", 1700));
            snacksAnswer.add(new Snack("엉클밥", 1700));
            snacksAnswer.add(new Snack("새우깡", 1500));
            snacksAnswer.add(new Snack("사또밥", 1400));
            snacksAnswer.add(new Snack("아리가또밥", 600));

            assertThat(snacks.get(4).name).isEqualTo("엉클밥");

        }
        @Test
        void case2() {
            List<Snack> snack = new ArrayList<>();
            snack.add(new Snack("새우깡", 1500));
            snack.add(new Snack("고래밥", 1700));
            snack.add(new Snack("초코파이", 2800));
            snack.add(new Snack("초코비", 2000));
            snack.add(new Snack("사또밥", 1400));
            snack.add(new Snack("오징어땅콩", 2800));
            snack.add(new Snack("아리가또밥", 600));
            snack.add(new Snack("엉클밥", 1700));

            List<Snack> snacks = Problem3.Solution(snack);

            assertThat(snacks.get(1).name).isEqualTo("초코파이");

        }
        @Test
        void case3() {
            List<Snack> snack = new ArrayList<>();
            snack.add(new Snack("새우깡", 1500));
            snack.add(new Snack("고래밥", 1700));
            snack.add(new Snack("초코파이", 2800));
            snack.add(new Snack("초코비", 2000));
            snack.add(new Snack("사또밥", 1400));
            snack.add(new Snack("오징어땅콩", 2800));
            snack.add(new Snack("아리가또밥", 600));
            snack.add(new Snack("엉클밥", 1700));

            List<Snack> snacks = Problem3.Solution(snack);

            assertThat(snacks.get(7).name).isEqualTo("아리가또밥");

        }
    }


}
