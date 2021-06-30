package com.we.parent.weparent.domain.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate = Timestamp.valueOf(LocalDateTime.now());

    @Column(name = "last_modified", nullable = true)
    private Timestamp lastModified;
    
}
