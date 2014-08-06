/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.skillsupbes.homework7w.controller.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Andr
 */
@Entity
@Table(name = "PERFORMANCE_PERTICIPANTS")
public class PerformanceParticipans {

    @Id
    @OneToOne(targetEntity = Student.class)
    @JoinColumn(name = "STUDENT_ID")
    private Student student_id;

    @ManyToOne(targetEntity = Performance.class)
    @JoinColumn(name = "PERFORMANCE_ID")
    private Performance performance_id;
    
}
