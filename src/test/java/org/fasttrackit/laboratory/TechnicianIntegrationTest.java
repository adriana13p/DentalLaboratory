package org.fasttrackit.laboratory;

import org.fasttrackit.laboratory.domain.Technician;
import org.fasttrackit.laboratory.service.TechnicianService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Tests for technicians
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DentalLaboratoryApplication.class, loader = SpringApplicationContextLoader.class, initializers = ConfigFileApplicationContextInitializer.class)
public class TechnicianIntegrationTest {

    @Autowired
    private TechnicianService technicianService;


    @Test
    public void testSaveTechnician() {
        //save a technician
        Technician technician = new Technician();
        technician.setTechnicianName("Adriana");
        technician.setTechnicianPhone(0750123456);
        technicianService.saveTechnician(technician);
    }

    @Test
    public void testFindTechnician() {
        //find a technician
        Technician technicianOne = technicianService.findOneTechnician(1L);
        Assert.assertNotNull(technicianOne);
    }
}
