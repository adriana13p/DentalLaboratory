package org.fasttrackit.laboratory.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 *  Technician object:
 *  -contains: technician's id, name and phone
 *
 *  -mandatory for repository: - all fields must NOT be null for the repository
 *                             - id_pk is primary key (idTechnician)
 *
 *  -ex: idTechnician = 1, technicianName = "Adriana", technicianPhone = 0740123456
 */
@Entity
@Table(name = "technicians")
public class Technician implements Serializable {

    @Id
    @Column(name = "id_pk")
    @GeneratedValue(generator = "technician_generator")
    @SequenceGenerator(
            name = "technician_generator",
            sequenceName = "technician_sequence",
            initialValue = 1
    )
    private Long idTechnician;

    @Column(name = "technician_name")
    private  String technicianName;

    @Column(name = "technician_phone")
    private Integer technicianPhone;


    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    public Long getIdTechnician() {
        return idTechnician;
    }

    public void setIdTechnician(Long idTechnician) {
        this.idTechnician = idTechnician;
    }


    public Integer getTechnicianPhone() {
        return technicianPhone;
    }

    public void setTechnicianPhone(Integer technicianPhone) {
        this.technicianPhone = technicianPhone;
    }
}
