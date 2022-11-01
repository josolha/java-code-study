package comparator_comparable;

import java.rmi.server.ServerNotActiveException;

public class Problem1 {
    // 이곳은 빈 칸으로 두세요.
}

class SnackList implements Comparable<SnackList>{

    public String name;
    public int price;

    public SnackList(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public int compareTo(SnackList o) {
        return 0;
    }
}
