package FlamyMap.com.pwflamy.collections.task2;

public class Tests {

    public static void main(String[] args) throws Exception {
        AmazingInfIntegerList myList = new AmazingInfIntegerList();

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

        for (int i = 0; i < 2000000; i++) {
            myList.add(i);
        }

        check(myList.size() == 2000002);
        check(myList.get(2000001) == 1999999);

        for (int i = 0; i < 2; i++) {
            myList.remove(0);
        }

        check(myList.size() == 2000000);
        check(myList.getLast() == 1999999);
        check(myList.get(0) == 0);

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
