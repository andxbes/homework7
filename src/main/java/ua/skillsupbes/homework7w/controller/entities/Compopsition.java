/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ua.skillsupbes.homework7w.controller.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Andr
 */
@Entity
@Table(name = "COMPOSITION")
public class Compopsition {
    @Id
    @OneToOne(targetEntity = Performance.class)
    @JoinColumn(name = "ID")    
    private Integer id;

    
    @Column(name = "TITLE")
    private String title;
    
    @Column(name = "AUTHOR")
    private String author;
    
}
