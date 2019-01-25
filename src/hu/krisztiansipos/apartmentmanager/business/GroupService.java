package hu.krisztiansipos.apartmentmanager.business;

import hu.krisztiansipos.apartmentmanager.business.base.BaseService;
import hu.krisztiansipos.apartmentmanager.data.GroupDao;
import hu.krisztiansipos.apartmentmanager.data.base.BaseDao;

import javax.persistence.EntityManager;

public class GroupService extends BaseService {
    public GroupService(EntityManager em) {
        super(new GroupDao(em));
    }


}
