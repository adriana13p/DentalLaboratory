package org.fasttrackit.laboratory.service;

import org.fasttrackit.laboratory.domain.ProstheticWork;
import org.fasttrackit.laboratory.domain.Technician;
import org.fasttrackit.laboratory.exception.NotFoundException;
import org.fasttrackit.laboratory.persistence.ProstheticWorkRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProstheticWorkService {

    @Autowired
    private ProstheticWorkRepository prostheticWorkRepository;


    public ProstheticWork findOneProstheticWork(Long idProstheticWork) {
        //find a ProstheticWork in the repository by idProstheticWork
        ProstheticWork prostheticWork = prostheticWorkRepository.findOne(idProstheticWork);
        //check if the ProstheticWork id exists in repository
        if (prostheticWork == null) {
            //if the id does not exist in repository, throw an exception
            throw new NotFoundException("" + idProstheticWork);
        }
        return prostheticWork;
    }


    public void saveProstheticWork(ProstheticWork prostheticWork) {
        //save a ProstheticWork in repository (doctorProstheticWork and patientName must not be null)
        //check technician name
        if (prostheticWork.getDoctorProstheticWork() == null) {
            //if doctorProstheticWork is null throw an exception
            throw new IllegalArgumentException("Doctor's id can not be null");
        }

        //check patientName
        if (prostheticWork.getProstheticWorkScheme() == null) {
            //if patientName is null throw an exception
            throw new IllegalArgumentException("Patient's name can not be null");
        }

        try {
            prostheticWorkRepository.save(prostheticWork);
        } catch (Exception e) {
            System.out.print("Error when saving prostheticWork " + e);
        }
    }


}
