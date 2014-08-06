/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
exemple https://github.com/logart-skillsup/java1-hibernate.git
 */
package ua.skillsupbes.homework7w.controller.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Andr
 */
@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @Column(name = "ID")
    private Integer id;
    
    @ManyToOne(targetEntity = Instrument.class)
    @JoinColumn(name = "INSTRUMENT_ID")
    private Instrument instrument_id;
    
    @Column(name = "FIRST_NAME")
    private String firstName;
    
    @Column(name = "LAST_NAME")
    private String lastName;
    
    @Column(name = "BIRTH_DATE")
    private Date birthDate;

   
}
