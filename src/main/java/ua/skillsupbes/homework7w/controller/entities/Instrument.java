/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ua.skillsupbes.homework7w.controller.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Andr
 */
@Entity
@Table(name="INSTRUMENT")
public class Instrument {
    
    @Column(name = "ID")
    @Id
    Integer id ;
    
    @Column(name = "TYPE_")
    String type ;
    
    @Column(name = "PRODUCER")
    String producer ;
    
    @Column(name = "PROD_DATE")
    Date prodDate;
    
    @Column(name = "PURCH_DATE")
    Date purchDate;

    
    
}
