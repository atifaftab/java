package atif.immutable;

import java.util.HashMap;

public final class ImmutableExample {
    private final String name;
    private final int id;
    private final HashMap<String, Integer> hashMap;

    public ImmutableExample(String name, int id, HashMap<String, Integer> hashMap) {
        this.name = name;
        this.id = id;
        this.hashMap = (HashMap<String, Integer>) hashMap.clone();
    }

    public String getName(String name) {return name;}

    public int getId(int id) {return id;}

    public HashMap<String, Integer> getHashMap(HashMap<String, Integer> hashMap) {
        return (HashMap<String, Integer>) hashMap.clone();
    }
}
