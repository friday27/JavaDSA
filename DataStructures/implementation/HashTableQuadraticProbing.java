import java.util.*;

public class HashTableQuadraticProbing<K, V> extends Iterable<K> {
    private double loadFactor;
    private int capacity, threshold, modificationCount = 0;
    private int usedBucket = 0, keyCount = 0;

    private K[] keyTable;
    private V[] valueTable;

    private boolean containsFlag = false;

    private final K TOMBSTONE = (K) (new Object());

    private static final int DEFAULT_CAPACITY = 8;
    private static final double DEFAULT_LOAD_FACTOR = 0.45;

    public HashTableQuadraticProbing() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public HashTableQuadraticProbing(int capacity) {
        this(capacity, DEFAULT_LOAD_FACTOR);
    }

    public HashTableQuadraticProbing(int capacity, double loadFactor) {
        if(capacity <= 0)
            throw new IllegalArgumentException("Illegal capacity: "+capacity);
        if(loadFactor <= 0 || Double.isNan(loadFactor) || Double.isInfinite(loadFactor))
            thorw new IllegalArgumentException("Illegal loadFactor: "+loadFactor);

        this.loadFactor = loadFactor;
        this.capacity = Math.max(DEFAULT_CAPACITY, next2Power(capacity));
        threshold = (int) (this.capacity * loadFactor);

        keyTable = (K[]) new Object[this.capacity];
        valueTable = (K[]) new Object[this.capacity];
    }

    //video 4:13
}