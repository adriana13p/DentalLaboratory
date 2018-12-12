package org.fasttrackit.laboratory.web;

import org.fasttrackit.laboratory.domain.Technician;
import org.fasttrackit.laboratory.service.TechnicianService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/laboratory")
public class TechnicianController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TechnicianController.class);

    @Autowired
    private TechnicianService technicianService;

    @RequestMapping(value = {"/{blueprintId}"}, method = RequestMethod.GET)
    public Technician findTechnician(@PathVariable("idTechnician") Long idTechnician) {
        LOGGER.info("idTechnician >> {}", idTechnician);

        return technicianService.findOneTechnician(idTechnician);
    }

}
