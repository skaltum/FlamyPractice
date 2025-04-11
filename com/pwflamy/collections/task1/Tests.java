package FlamyMap.com.pwflamy.collections.task1;

public class Tests {

    public static void main(String[] args) throws Exception {
        AmazingIntegerList myList = new AmazingIntegerList(10);

        myList.add(10000);
        myList.add(10001);

        check(myList.size() == 2);

        myList.add(10002);

        check(myList.size() == 3);
        check(myList.get(0) == 10000);
        check(myList.get(2) == 10002);

        myList.remove(1);

        check(myList.size() == 2);
        check(myList.get(1) == 10002);

        for (int i = 0; i < 8; i++) {
            myList.add(i);
        }

        check(myList.size() == 10);
        check(myList.get(9) == 7);

        try {
            myList.add(666);
            throw new Exception("HAHAHAHAHHAA");
        } catch (RuntimeException e) {
            // good
        }

        for (int i = 0; i < 5; i++) {
            myList.remove(0);
        }

        check(myList.size() == 5);
        check(myList.getLast() == 7);
        check(myList.get(0) == 3);

        myList.clear();

        check(myList.size() == 0);

        try {
            myList.get(0);
            throw new Exception("HAHAHAHAHHAA");
        } catch (RuntimeException e) {
            // good
        }

        myList.add(1);
        myList.add(2);

        check(myList.size() == 2);
    }

    private static void check(boolean check) {
        if (!check) {
            throw new RuntimeException("Ошибка Ошибка Ошибка ...");
        }
    }
}
