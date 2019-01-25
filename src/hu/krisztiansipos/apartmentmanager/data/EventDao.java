package hu.krisztiansipos.apartmentmanager.data;

import hu.krisztiansipos.apartmentmanager.data.base.BaseDao;

import javax.persistence.EntityManager;

public class EventDao extends BaseDao {
    public EventDao(EntityManager entityManager) {
        super(entityManager, EventEntity.class);
    }
}
