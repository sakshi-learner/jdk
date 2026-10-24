package org.example.CollectionApi;

import java.util.*;

public class GenericRegister<T,ID> {
    private Map<ID, T> store = new HashMap<>();

    public void save(ID id, T item){
        store.put(id, item);
    }

    public T findById(ID id){
        return store.get(id);
    }

    public boolean deleteById(ID id){
        return store.remove(id) != null;
    }

    public Set<ID> getAllIds(){
        return new HashSet<>(store.keySet());
    }

    public List<T> findAllSorted(Comparator<T> comparator) {
        List<T> list = new ArrayList<>(store.values());
        list.sort(comparator);
        return list;
    }
}
