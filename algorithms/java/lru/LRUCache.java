import java.util.LinkedHashMap;
 
public class LRUCache {
    private int capacity = 0;
    private LinkedHashMap<Integer, Integer> cache = null;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<Integer, Integer>(16, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest) {
                return size() > capacity;
            };
        };
    }
    
    public int get(int key) {
        Integer val = cache.get(key);
        return val == null ? -1 : val;
    }
    
    public void put(int key, int value) {
        cache.put(key, value);
    }
}
