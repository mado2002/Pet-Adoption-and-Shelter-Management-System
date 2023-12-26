package com.example.pets.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shelter")
@Data
@NoArgsConstructor
public class Shelter {

    @Id
    @GeneratedValue
    private Long shelterId;
    private String shelterName;
    private String shelterAddress;
    private String shelterPhone;

    @OneToOne(mappedBy = "shelter", cascade = CascadeType.ALL)
    private Staff shelterAdmin;

    @OneToMany(mappedBy = "staff", cascade = CascadeType.ALL)
    private List<Staff> staffs;
}
