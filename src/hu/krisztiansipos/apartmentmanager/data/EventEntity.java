package hu.krisztiansipos.apartmentmanager.data;

import hu.krisztiansipos.apartmentmanager.data.base.BaseEntity;
import hu.krisztiansipos.apartmentmanager.ui.Group;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "EVENT")
public class EventEntity extends BaseEntity {
    @Id
    @Column(name = "EVENT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DATE")
    private Date date;

    @Column(name = "PLACE")
    private String place;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "EVENT_OWNER")
    private ItemEntity owner;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EventEntity event = (EventEntity) obj;
        return Objects.equals(id, event.id);
    }
}
