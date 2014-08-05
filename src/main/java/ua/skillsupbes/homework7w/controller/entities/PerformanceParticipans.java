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
@Table(name = "PERFORMANCE_PERTICIPANTS")
public class PerformanceParticipans {

    @OneToOne(targetEntity = Student.class)
    @JoinColumn(name = "ID")    
    private Student student_id;

    @Id
    @Column(name = "PERFORMANCE_ID")
    private Integer performance_id;

}
