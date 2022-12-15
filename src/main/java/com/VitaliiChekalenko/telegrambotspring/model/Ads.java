package com.VitaliiChekalenko.telegrambotspring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "adsTable")
public class Ads {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String ad;
}
