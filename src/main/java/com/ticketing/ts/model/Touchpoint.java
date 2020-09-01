package com.ticketing.ts.model;

import javax.persistence.*;

@Entity
@Table(name = "touchpoint")
public class Touchpoint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
