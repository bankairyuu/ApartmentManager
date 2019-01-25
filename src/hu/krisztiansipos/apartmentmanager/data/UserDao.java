package hu.krisztiansipos.apartmentmanager.data;

import hu.krisztiansipos.apartmentmanager.data.base.BaseDao;

import javax.persistence.EntityManager;

public class UserDao extends BaseDao<UserEntity> {
    public UserDao(EntityManager entityManager) {
        super(entityManager, UserEntity.class);
    }
}
