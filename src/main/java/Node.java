/**
 * Created by blstream on 3/3/2016.
 */
public class Node {
    Object element;
    Node nextPointer;
    Node previousPointer;


    public Node(Object object, Node previousPointer, Node nextPointer) {
        this.element = object;
        this.nextPointer = nextPointer;
        this.previousPointer = previousPointer;
    }


    public Node(Object o) {
        this.element = o;
    }
}
