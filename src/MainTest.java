import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 2022/1/3
 * leetcode
 * horace
 */
public class MainTest {
    public static void main(String[] args) {
        int[] arg1 = {9, 29, 49, 50};
        String test = "cbcd";
        SlowestKey1629 lastRemaining390 = new SlowestKey1629();
        int i = lastRemaining390.slowestKey(arg1, test);
        System.out.println(i);

    }
}
