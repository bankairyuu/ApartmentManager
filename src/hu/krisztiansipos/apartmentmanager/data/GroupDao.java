package hu.krisztiansipos.apartmentmanager.data;

import hu.krisztiansipos.apartmentmanager.data.base.BaseDao;

import javax.persistence.EntityManager;

public class GroupDao extends BaseDao {
    public GroupDao(EntityManager entityManager) {
        super(entityManager, GroupEntity.class);
    }
}
