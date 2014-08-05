/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ua.skillsupbes.homework7w.controller.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Andr
 */
@Entity
@Table()
public class Performance {
      @Id
    @Column(name = "ID")    
    private Integer id;

  
    @Column(name = "COMPOSITION_ID")
    private Integer composition_id;
}
