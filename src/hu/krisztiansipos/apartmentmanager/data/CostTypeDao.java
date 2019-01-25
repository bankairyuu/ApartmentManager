package hu.krisztiansipos.apartmentmanager.data;

import hu.krisztiansipos.apartmentmanager.data.base.BaseDao;

import javax.persistence.EntityManager;

public class CostTypeDao extends BaseDao {
    public CostTypeDao(EntityManager entityManager) {
        super(entityManager, CostTypeEntity.class);
    }
}
