package hu.krisztiansipos.apartmentmanager.data;

import hu.krisztiansipos.apartmentmanager.data.base.BaseDao;

import javax.persistence.EntityManager;

public class TaskDao extends BaseDao {
    public TaskDao(EntityManager entityManager) {
        super(entityManager, TaskEntity.class);
    }
}
