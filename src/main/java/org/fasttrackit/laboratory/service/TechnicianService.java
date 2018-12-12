package org.fasttrackit.laboratory.service;

import org.fasttrackit.laboratory.domain.Technician;
import org.fasttrackit.laboratory.exception.NotFoundException;
import org.fasttrackit.laboratory.persistence.TechnicianRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TechnicianService {

    @Autowired
    private TechnicianRepository technicianRepository;

    public Technician findOneTechnician(Long idTechnician) {
        //find a technician in the repository by idTechnician
        Technician technician = technicianRepository.findOne(idTechnician);
        //check if the technician id exists in repository
        if (technician == null) {
            //if the id does not exist in repository, throw an exception
            throw new NotFoundException("" + idTechnician);
        }
        return technician;
    }

    public void saveTechnician(Technician technician) {
        //save a technician in repository (technician name and phone must not be null)
        //check technician name
        if (technician.getTechnicianName() == null) {
            //if name is null throw an exception
            throw new IllegalArgumentException("Technician's name can not be null");
        }

        //check technician phone
        if (technician.getTechnicianPhone() == null) {
            //if technicianPhone is null throw an exception
            throw new IllegalArgumentException("Technician's phone can not be null");
        }

        try {
            technicianRepository.save(technician);
        } catch (Exception e) {
            System.out.print("Error when saving technician " + e);
        }
    }

    public void deleteTechnician(Technician technician) {
        //delete a technician from repository
        //check technician ID

        //TODO - ar trebui adaugata undeva o validare care sa verifica daca id-ul exista in repository?

        try {
            technicianRepository.delete(technician);
        } catch (Exception e) {
            System.out.print("Error when deleting technician " + e);
        }
    }


}
