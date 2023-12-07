import java.util.Collection;
import java.util.Iterator;

public class HashMap<E> implements Set<E> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private Object[] table;
    private int size;

    public HashMap(){
        this.table = new Object[DEFAULT_CAPACITY+2];
        this.size = 0;
    }
    private int Hash(Object o){
        return o == null ? 0 : o.hashCode() % table.length;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        int index = Hash(o);
        while(table[index] != null){
            if(table[index].equals(o)){
                return true;
            }
            index = (index+1)% table.length;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (size + 1 > table.length * LOAD_FACTOR) {
            resize();
        }
        int index = Hash(e);
        // Linear probing to find the next available slot
        while (table[index] != null) {
            if (table[index].equals(e)) {
                return false; // Already exists
            }
            index = (index + 1) % table.length;
        }
        table[index] = e;
        size++;
        return true;
    }
    private void resize(){
        int newCapacity = table.length*2;
        Object[] newTable = new Object[newCapacity];

        for(Object item: table){
            int index = Hash(item);

            while(newTable[index] != null){
                index = (index+1)%newTable.length;
            }
            newTable[index] = item;
        }
    }
    @Override
    public boolean remove(Object o) {
        int index= Hash(o);

        while(table[index] != null){
            if(table[index].equals(o)){
                table[index] = null;
                size--;
                index = (index+1) % table.length;
                while(table[index] != null){
                    Object temp = table[index];
                    table[index] = null;
                    size--;
                    add((E) temp);
                    index = (index + 1)% table.length;
                }
                return true;
            }
            index = (index+1)% table.length;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for(Object item : c){
            if(!contains(item)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean addAll = false;
        for(E item : c){
            if(add(item)){
                addAll = true;
            }
        }
        return addAll;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean removeAll = false;
        for(Object item : c){
            if(remove(item)){
                removeAll = true;
            }
        }
        return removeAll;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean retainAll = false;
        for(int i = 0 ; i < table.length ; i++){
            Object[] array = (Object[]) table[i];

            if(array != null){
                int newSize = 0;

                for (Object value : array) {
                    if (value != null && c.contains(value)) {
                        array[newSize++] = value;
                    } else {
                        retainAll = true;
                    }
                }
                if(newSize > 0){
                    for(int j = newSize ; j < array.length ; j++){
                        array[j] = null;
                    }
                }else{
                    table[i] = null;
                }
            }
        }
        return retainAll;
    }

    @Override
    public void clear() {
        table = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void printElement(){
        System.out.println("Element in the HashMap: ");
        for(Object item : table){
            if(item != null){
                System.out.println(item);
            }
        }
    }
}
