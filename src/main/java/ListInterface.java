/**
 * Created by blstream on 3/3/2016.
 */
public interface ListInterface <E> {
    int getSize();

    void addElement(E element);

    void removeId(int index);

    void removeFirst();

    void clear();

    boolean contains(E element);

    E get(int index);

    void showList();

}
