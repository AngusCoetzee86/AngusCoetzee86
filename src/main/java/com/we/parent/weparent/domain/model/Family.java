package com.we.parent.weparent.domain.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "family")
public class Family extends BaseEntity implements Serializable{

    @OneToMany(cascade = CascadeType.ALL)
    private List<Parent> parents;

    
    
}
