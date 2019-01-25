package hu.krisztiansipos.apartmentmanager.data.base;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public abstract class BaseDao<T> implements Dao<T> {
    private EntityManager entityManager;
    final Class<T> typeParameterClass;

    public BaseDao(EntityManager entityManager, Class<T> typeParameterClass) {
        this.entityManager = entityManager;
        this.typeParameterClass = typeParameterClass;
    }

    @Override
    public T get(long id) {
        return (T)entityManager.find(typeParameterClass.getClass(), id);
    }

    @Override
    public List<T> getAll() {
        return entityManager.createQuery("SELECT * FROM " + typeParameterClass.getName() + " t").getResultList();
    }

    @Override
    public void save(T t) {
        executeInsideTransaction(entityManager -> entityManager.persist(t));
    }

    @Override
    public void update(T t, List<? extends Object> params) {

    }

    @Override
    public void delete(T t) {
        executeInsideTransaction(entityManager1 -> entityManager.remove(t));
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            action.accept(entityManager);
            tx.commit();
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }
    }
}
