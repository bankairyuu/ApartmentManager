package hu.krisztiansipos.apartmentmanager.data;

import hu.krisztiansipos.apartmentmanager.data.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "GROUP")
public class GroupEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private List<UserEntity> userList;
    private List<CostEntity> costList;
    private List<TaskEntity> taskList;
    private List<EventEntity> eventList;
}
