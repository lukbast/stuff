import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {1 ,3,3 ,4,0,7,8,9,0, 5,2, 1,};
        arrayDuplicateChecker(array);
    }

    public static void arrayDuplicateChecker(Integer[] integers){
        Set<Integer> check = new HashSet<>();
        for (Integer integer : integers) {
            if (check.add(integer)) {
                check.add(integer);
            } else System.out.println("duplicate is " + integer);
        }
    }
}
