/**
 * Created by blstream on 3/3/2016.
 */
public class List<E> implements ListInterface<E> {
    public int size;
    private Node head;

    public List() {
        head = new Node(null);
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void addElement(E o) {
        if (size == 0) {
            head.element = o;
        } else {
            Node tmpNode = head;
            while (tmpNode.nextPointer != null) {
                tmpNode = tmpNode.nextPointer;
            }
            tmpNode.nextPointer = new Node(o, tmpNode, null);
        }
        size++;

    }

    @Override
    public void removeId(int index) {
        if (index != 0) {
            Node tmpNode = head;
            for (int i = 0; i < index; i++) {
                tmpNode = tmpNode.nextPointer;
            }
            tmpNode.previousPointer.nextPointer = tmpNode.nextPointer;
            size--;
        } else {
            removeFirst();
        }


    }

    @Override
    public void removeFirst() {
        head = head.nextPointer;
        size--;
    }


    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public boolean contains(E element) {
        Node tmpNode = head;
        for (int i = 0; i < size; i++) {
            if(tmpNode.element == element)
                return true;
            tmpNode = tmpNode.nextPointer;
        }

        return false;
    }

    @Override
    public E get(int index) {
        if(index > size - 1){
            return null;
        }
        else{
            Node tmpNode = head;
            for (int i = 0; i < index - 1; i++) {
                tmpNode = tmpNode.nextPointer;
            }
            
            return (E) tmpNode.element;

        }



    }

    @Override
    public void showList() {
        Node tmpNode = head;
        for (int i = 0; i < size; i++) {
            System.out.println(tmpNode.element);
            tmpNode = tmpNode.nextPointer;
        }
    }

}
