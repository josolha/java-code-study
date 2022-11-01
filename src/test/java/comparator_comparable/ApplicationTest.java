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

            List<Snack> snackList = new ArrayList<>();
            snackList.add(new Snack("새우깡", 1500));
            snackList.add(new Snack("고래밥", 1700));
            snackList.add(new Snack("초코파이", 2800));
            Collections.sort(snackList);
            assertThat(snackList.get(0).name).isSameAs("초코파이");
        }


    }
}
