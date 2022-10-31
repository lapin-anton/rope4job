package ru.lapinlisss.rope4job.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "vacancy")
public class Vacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "site_id")
    private Site site;

    private String title;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    private String salary;

    private String description;

    private String skills;

    private String url;

}
