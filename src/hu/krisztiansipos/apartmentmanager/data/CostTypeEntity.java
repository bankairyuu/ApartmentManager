package hu.krisztiansipos.apartmentmanager.data;

import hu.krisztiansipos.apartmentmanager.data.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "COSTTYPE")
public class CostTypeEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
