package hu.krisztiansipos.apartmentmanager.data;

import hu.krisztiansipos.apartmentmanager.data.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EVENT")
public class EventEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Date date;
    private String place;
}
