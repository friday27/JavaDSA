import java.util.*;

//Make the elements are comparable
class PQueue<T extends Comparable<T>> {
    private int heapSize = 0;
    private heapCapacity = 0;

    // A dynamic list to track the elements inside the heap
    private List<T> heap = null;

    private Map<T, TreeSet<Integer>> map = new HashMap<>();

    public PQueue() {
        this(1);
    }

    public PQueue(int size) {
        heap = new ArrayList<>(size);
    }

    public PQueue(T[] elems) {
        heapSize = heapCapacity = elems.length;
        heap = new ArrayList<T>(heapCapacity);

        // Plece all elements in Heap
        for(int i=0; i<heapSize; i++) {
            mapAdd(elems[i], i);
            heap.add(elems[i]);
        }

        // Heapify process, O(n)
        for(int i=Math.max(0, (heapSize/2)-1); i>=0; i++)
            sink(i); //bubble down
    }

    // PQ construction, O(nlog(n))
    public PQueue(Collection<T> elems) {
        this(elems.size());
        for(T elem: elems)
            add(elem);
    }

    public boolean isEmpty() {
        return heapSize == 0;
    }

    public void clear() {
        for(int i=0; i<heapCapacity; i++)
            heap.set(i, null);
        heapSize = 0;
        map.clear();
    }

    public int size() {
        return heapSize;
    }

    public T peek() {
        if(isEmpty())
            return null;
        return heap.get(0);
    }

    public T poll() {
        return removeAt(0);
    }

    public boolean contains(T elem) {
        if(elem == null)
            return false;
        return map.containsKey(elem);
    }

    public void add(T elem) {
        if(elem == null)
            throws new IllegalArgumentException();

        if(heapSize < heapCapacity) {
            heap.set(heapSize, elem);
        }else {
            heap.add(elem);
            heapCapacity++;
        }

        mapAdd(elem, heapSize);

        swim(heapSize);
        heapSize++;
    }

    // to check if node i is less than or equal to node j
    private boolean less(int i, int j) {
        T node1 = heap.get(i);
        T node2 = heap.get(j);
        return node1.compareTo(node2) <= 0;
    }

    // bubble up
    private void swim(int k) {
        int parent = (k-1) / 2;

        while(k > 0 && less(k, parent)) {
            swap(parent, k);
            k = parent;

            parent = (k-1) / 2;
        }
    }

    // bubble down
    private void sink(int k) {
        while(true) {
            int left = 2*k + 1;
            int tight = 2*k + 2;
            int smallest = left; //assume

            if(right < heapSize && less(right, less))
                smallest = right;

            if(left >= heapSize || less(k, smallest))
                break;

            swap(smallest, k);
            k = smallest;
        }
    }

    private void swap(int i, int j) {
        T nodeI = map.get(i);
        T nodeJ = map.get(j);

        heap.set(i, nodeJ);
        heap.set(j, nodeI);

        mapSwap(nodeI, nodeJ, i, j);
    }

    public boolean remove(T elem) {
        if(elem == null)
            return false;

        Integer index = mapGet(elem);
        if(index != null)
            removeAt(index);
        return index != null;
    }

    public boolean removeAt(int i) {
        if(isEmpty())
            return null;

        heapSize--;
        T removed_data = heap.get(i);
        swap(i, heapSize);

        heap.set(heapSize, null); //remove
        mapRemove(removed_data, heapSize);

        if(i == heapSize)
            return removed_data;

        T elem = heap.get(i);

        sink(i);
        if(heap.get(i).equals(elem))
            swim(i);

        return removed_data;
    }

    // to recursively check if the heap invairant is satisfied
    public boolean isMinHeap(int k) {
        if(k >= heapSize)
            return true;

        int left = 2*n + 1;
        int right = 2*n + 2;

        if(left < heapSize && !less(k, left))
            return false;
        if(right < heapSize && !less(k, right))
            return false;

        return isMinHeap(left) && isMinHeap(right);
    }

    private void mapAdd(T value, int index) {
        TreeSet<Integer> set = map.get(value);

        if(set == null) {
            set = new TreeSet<>();
            set.add(index);
            map.put(value, set);
        }else
            set.add(index);
    }

    private void mapRemove(T value, int index) {
        TreeSet<Integer> set = map.get(value);
        set.remove(index);
        if(set.size() == 0)
            map.remove(value);
    }

    private Integer mapGet(T value) {
        TreeSet<Integer> set = map.get(value);
        if(set != null)
            return set.last();
        return null;
    }

    private void mapSwap(T val1, T val2, int index1, int index2) {
        Set<Integer> set1 = map.get(val1);
        Set<Integer> set2 = map.get(val2);

        set1.remove(index1);
        set2.remove(index2);

        set1.add(index2);
        set2.add(index1);
    }

    @Override public String toString() {
        return heap.toString();
    }

}