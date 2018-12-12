package org.fasttrackit.laboratory.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 *  Doctor object:
 *  - contains: doctor's id, name, phone and address
 *
 *  -mandatory for repository: - only id, name and phone fields must NOT be null for the repository
 *                             - address field can be null in repository
 *                             - id_pk is primary key (idDoctor)
 *
 *  -ex: idDoctor = 1, doctorName = "Dan Dumitru", doctorPhone = 0740654321, doctorAddress = "";
 *  -ex: idDoctor = 1, doctorName = "Dan Dumitru", doctorPhone = 0740654321, doctorAddress = "str. Campului , nr 7"
 */

@Entity
@Table(name = "doctors")
public class Doctor  implements Serializable {

    @Id
    @Column(name = "id_pk")
    @GeneratedValue(generator = "doctor_generator")
    @SequenceGenerator(
            name = "doctor_generator",
            sequenceName = "doctor_sequence",
            initialValue = 1
    )
    private Long idDoctor;

    @Column(name = "doctor_name")
    private  String doctorName;

    @Column(name = "doctor_phone")
    private Integer doctorPhone;

    @Column(name = "doctor_address")
    private  String doctorAddress;


    public Long getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Long idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Integer getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(Integer doctorPhone) {
        this.doctorPhone = doctorPhone;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }
}
