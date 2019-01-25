package hu.krisztiansipos.apartmentmanager.data;

import hu.krisztiansipos.apartmentmanager.data.base.BaseDao;

import javax.persistence.EntityManager;

public class CostDao extends BaseDao {
    public CostDao(EntityManager entityManager) {
        super(entityManager, CostEntity.class);
    }
}
