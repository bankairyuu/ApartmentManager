package hu.krisztiansipos.apartmentmanager.data;

import hu.krisztiansipos.apartmentmanager.data.base.BaseEntity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ITEM")
public class ItemEntity extends BaseEntity {
    @Id
    @Column(name = "ITEM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OWNER_ID")
    private GroupEntity owner;

    @OneToMany(mappedBy = "COST_OWNER")
    private List<CostEntity> costList;

    @OneToMany(mappedBy = "TASK_OWNER")
    private List<TaskEntity> taskList;

    @OneToMany(mappedBy = "EVENT_OWNER")
    private List<EventEntity> eventList;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupEntity getOwner() {
        return owner;
    }

    public void setOwner(GroupEntity owner) {
        this.owner = owner;
    }

    public List<CostEntity> getCostList() {
        return costList;
    }

    public void setCostList(List<CostEntity> costList) {
        this.costList = costList;
    }

    public List<TaskEntity> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<TaskEntity> taskList) {
        this.taskList = taskList;
    }

    public List<EventEntity> getEventList() {
        return eventList;
    }

    public void setEventList(List<EventEntity> eventList) {
        this.eventList = eventList;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ItemEntity item = (ItemEntity) obj;
        return Objects.equals(id, item.id);
    }
}
