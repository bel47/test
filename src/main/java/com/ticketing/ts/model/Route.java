package com.ticketing.ts.model;

import javax.persistence.*;

@Entity
@Table(name = "route")
public class Route {
    @Id
    @GeneratedValue(strategy = Genergit ationType.AUTO)
    private long id;


}
