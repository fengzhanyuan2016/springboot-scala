package com.imooc.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "meta_database")
public class MetaDatabase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Integer id;

    @Basic
    @Column(name = "name",unique = true,nullable = false)
    private String name;

    @Basic
    @Column(name = "location",nullable = false)
    private String location;
}
