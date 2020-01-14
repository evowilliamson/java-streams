package generics;

import java.util.ArrayList;
import java.util.List;

class Tryout {
    public static void main(String[] args) {

        List<Integer> ints = Lists.<Integer>toList(1, 2, 3);
        List<Object> objs = Lists.<Object>toList(1, "two");
        System.out.println(ints);
        System.out.println(objs);

    }
}


class Lists {
    public static <T> List<T> toList(T... arr) {
    List<T> list = new ArrayList<T>();
    for (T elt : arr) {
        list.add(elt);
    }
    return list;
    }
}
    