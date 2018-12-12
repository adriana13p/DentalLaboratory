package org.fasttrackit.laboratory.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *  ProstheticWork object:
 *  -contains: ProstheticWork's id, type, color, start date, sample date, final date, patient name,
 *  technician1 (technician's id will be used), technician2 (technician's id will be used),
 *  doctor (doctor's id will be used -foreign key), scheme and notifications
 *
 *  -mandatory for repository: - only idProstheticWork, doctorProstheticWork and patientName fields must NOT be null for the repository
 *                             -  id_pk is primary key (idProstheticWork)
 *                             -  id_technician1_fk is foreign key for id_technician from technicians table (technician1)
 *                             -  id_technician2_fk is foreign key for id_technician from technicians table (technician2)
 *                             -  id_doctor_fk is foreign key for id_doctor from doctors table (doctorProstheticWork)
 *
 *  -ex: idProstheticWork = 1, prostheticWorkType = "metalo-ceramica", color= "A2", startDate= 10.05.2018,
 *  sampleDate = 15.05.2018, finalDate = 20.05.2018, pacientName = "Popescu Ion",
 *  technician1-id = 2 and technician2-id = 1, doctorProstheticWork -id = 5, prostheticWorkScheme= "2.2 x 2.4 x x 2.7",
 *  notifications: "extractie recenta pe 2.3, doresc coprp de punte ovat / trimit pacientul la culoare / pacient tanar "
 */

@Entity
@Table(name = "dental_prosthesis")
public class ProstheticWork implements Serializable {

    @Id
    @Column(name = "id_pk")
    @GeneratedValue(generator = "prostheticWork_generator")
    @SequenceGenerator(
            name = "prostheticWork_generator",
            sequenceName = "prostheticWork_sequence",
            initialValue = 1
    )
    private Long idProstheticWork;

    @Column(name = "prosthetic_work_type")
    private String prostheticWorkType;

    @Column(name = "color")
    private String color;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "sample_date")
    private Date sampleDate;

    @Column(name = "final_date")
    private Date finalDate;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "technician1_id_fk")
    //TODO set OneToOne or OneTOMany or ManyTOMany
    private Technician technician1;

    @Column(name = "technician2_id_fk")
    //TODO set OneToOne or OneTOMany or ManyTOMany
    private Technician technician2;

    @Column(name = "doctor_id_fk")
    //TODO set OneToOne or OneTOMany or ManyTOMany
    private Doctor doctorProstheticWork;

    @Column(name = "prosthetic_work_scheme")
    private String prostheticWorkScheme;

    @Column(name = "notifications")
    private String notifications;


    public Long getIdProstheticWork() {
        return idProstheticWork;
    }

    public void setIdProstheticWork(Long idProstheticWork) {
        this.idProstheticWork = idProstheticWork;
    }

    public String getProstheticWorkType() {
        return prostheticWorkType;
    }

    public void setProstheticWorkType(String prostheticWorkType) {
        this.prostheticWorkType = prostheticWorkType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getSampleDate() {
        return sampleDate;
    }

    public void setSampleDate(Date sampleDate) {
        this.sampleDate = sampleDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Technician getTechnician1() {
        return technician1;
    }

    public void setTechnician1(Technician technician1) {
        this.technician1 = technician1;
    }

    public Technician getTechnician2() {
        return technician2;
    }

    public void setTechnician2(Technician technician2) {
        this.technician2 = technician2;
    }

    public Doctor getDoctorProstheticWork() {
        return doctorProstheticWork;
    }

    public void setDoctorProstheticWork(Doctor doctorProstheticWork) {
        this.doctorProstheticWork = doctorProstheticWork;
    }

    public String getProstheticWorkScheme() {
        return prostheticWorkScheme;
    }

    public void setProstheticWorkScheme(String prostheticWorkScheme) {
        this.prostheticWorkScheme = prostheticWorkScheme;
    }

    public String getNotifications() {
        return notifications;
    }

    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }
}
