package hu.krisztiansipos.apartmentmanager.data;

import hu.krisztiansipos.apartmentmanager.data.base.BaseDao;

import javax.persistence.EntityManager;

public class ItemDao extends BaseDao {
    public ItemDao(EntityManager entityManager) {
        super(entityManager, ItemEntity.class);
    }
}
