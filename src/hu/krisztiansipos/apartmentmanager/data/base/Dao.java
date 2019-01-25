package hu.krisztiansipos.apartmentmanager.data.base;

import java.util.List;

public interface Dao<T> {
    T get(long id);

    List<T> getAll();

    void save(T t);

    void update(T t, List<? extends Object> params);

    void delete(T t);
}
