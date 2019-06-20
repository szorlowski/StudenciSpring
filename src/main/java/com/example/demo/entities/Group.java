package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Table(name = "s_groups")
@Entity
public class Group {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String name;

    @OneToMany(mappedBy = "group", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Student> students;

    @ManyToOne
    @JoinColumn(name = "spec_id")
    private Spec spec;
}
