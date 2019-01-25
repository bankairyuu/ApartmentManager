package hu.krisztiansipos.apartmentmanager.data;

import hu.krisztiansipos.apartmentmanager.data.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "COST")
public class CostEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Long amount;
    private CostTypeEntity costType;
}
