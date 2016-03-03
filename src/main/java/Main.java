

/**
 * Created by blstream on 3/3/2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new List<Integer>();
        list.addElement(2);
        list.addElement(4);
        list.addElement(6);
        list.addElement(8);
        list.addElement(10);
        System.out.println(list.contains(2));
        System.out.println(list.contains(0));
        System.out.println(list.contains(100));
    }
}
