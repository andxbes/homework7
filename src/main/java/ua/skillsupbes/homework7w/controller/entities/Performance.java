/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ua.skillsupbes.homework7w.controller.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Andr
 */
@Entity
@Table(name = "PERFORMANCE")
public class Performance {
    @Id
    @Column(name = "ID")    
    private Integer id;

    @OneToMany(targetEntity = Composition.class)
    @JoinColumn(name = "COMPOSITION_ID")
    private List<Composition> composition_id;
    
    
}
