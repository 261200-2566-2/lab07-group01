import java.util.Collection;
import java.util.Iterator;
import java.util.HashMap;

public class HashSet<E,Boolean> implements Set<E> {
    private HashMap<E, java.lang.Boolean> map = new HashMap<E, java.lang.Boolean>();

    /** Using this constructor for create HashSet object.
     *  effects: Display text when create object complete.
     */
    public HashSet() {
        System.out.println("Create HashMap Object");
    }

    /** Using to return size of this set.
     *  @return size of this set.
     */
    @Override
    public int size() {
        return map.size();
    }

    /** Using to return true when set is empty.
     * @return true when set is empty.
     */
    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    /** Check that object contains in this set.
     *  @param o element whose presence in this collection is to be tested
     *  @return true when that object contains in this set.
     */
    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }
    /** This lab shouldn't implement.
     *  @return null
     */
    @Override
    public Iterator<E> iterator() {
        return null;
    }
    /** This lab shouldn't implement.
     *  @return null
     */
    @Override
    public Object[] toArray() {
        return new Object[0];
    }
    /** This lab shouldn't implement.
     *  @return null
     */
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /** Using to add parameter to this set.
     *  @param e element whose presence in this collection is to be ensured
     *  @return true when can add parameter in set.
     */
    @Override
    public boolean add(E e) {
        return map.put(e,true) == null;
    }

    /** Using to remove the object in set.
     *  @param o element to be removed from this collection, if present
     *  @return true when archive to remove.
     */
    @Override
    public boolean remove(Object o) {
        return map.remove(o) != null;
    }

    /** Using for check c collection are contain in this set (⊂) operator.
     *  @param c collection to be checked for containment in this collection
     *  @return true when c collection are contain in this set.
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        return map.keySet().containsAll(c);
    }

    /** Using to add all elements in c collection to this set (∪) operator.
     *  @param c collection containing elements to be added to this collection
     *  @return true when archive to add all elements to this set.
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean addAll = false;
        for (E element : c) {
            if (add(element)) {
                addAll = true;
            }
        }
        return addAll;
    }
    /** Using to remove all element in c collection in this set (-) operator.
     * @param c collection containing elements to be removed from this collection.
     * @return true when archive to removeAll().
     */
    @Override
    public boolean removeAll(Collection<?> c) { return map.keySet().removeAll(c);}

    /** Using to intersect elements in c collector and this set (∩) operator.
     *  @param c collection containing elements to be retained in this collection.
     *  @return true when archive to retain.
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        return map.keySet().retainAll(c);
    }

    /** Using to clear all elements in this set.
     *  effects: remove all elements in this set.
     */
    @Override
    public void clear() {
        map.clear();
    }

    /** Using to print each element in this set.
     *  effect: Display text Element in this HashSet: and show each element in this set.
     */
    @Override
    public void printElement(){
        System.out.println("Element in the HashSet: ");
        for(Object item : map.keySet()){
            if(item != null){
                System.out.println(item);
            }
        }
    }
}
