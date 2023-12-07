import java.util.Collection;
public interface Set<E> extends Collection<E>{
    public int size();
    public boolean isEmpty();
    public boolean contains(Object o);
    public boolean add(E e);
    public boolean remove(Object o);
    public boolean containsAll(Collection<?> c);
    public boolean addAll(Collection<? extends E> c);
    public boolean removeAll(Collection<?> c);
    public boolean retainAll(Collection<?> c);
    public void clear();
    public void printElement();
}
