package com.we.parent.weparent.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "parent")
public class Parent extends BaseEntity implements Serializable {

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    //Child

}
