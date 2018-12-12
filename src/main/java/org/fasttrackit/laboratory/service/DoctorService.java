package org.fasttrackit.laboratory.service;

import org.fasttrackit.laboratory.domain.Doctor;
import org.fasttrackit.laboratory.exception.NotFoundException;
import org.fasttrackit.laboratory.persistence.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DoctorService{

        @Autowired
        private DoctorRepository doctorRepository;

        public Doctor findOneDoctor(Long idDoctor) {
            //find a doctor in the repository by idDoctor
            Doctor doctor = doctorRepository.findOne(idDoctor);
            //check if the doctor id exists in repository
            if (doctor == null) {
                //if the id does not exist in repository, throw an exception
                throw new NotFoundException("" + idDoctor);
            }
            return doctor;
        }

        public void saveDoctor(Doctor doctor) {
            //save a doctor in repository (only doctor name and phone must not be null)
            //check doctor's name
            if (doctor.getDoctorName() == null) {
                //if name is null throw an exception
                throw new IllegalArgumentException("Doctor's name can not be null");
            }

            //check technician's phone
            if (doctor.getDoctorPhone() == null) {
                //if doctorPhone is null throw an exception
                throw new IllegalArgumentException("Doctor's phone can not be null");
            }

            try {
                doctorRepository.save(doctor);
            } catch (Exception e) {
                System.out.print("Error when saving doctor " + e);
            }
        }
}
