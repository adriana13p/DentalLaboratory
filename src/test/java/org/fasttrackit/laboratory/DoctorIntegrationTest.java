package org.fasttrackit.laboratory;

import org.fasttrackit.laboratory.domain.Doctor;
import org.fasttrackit.laboratory.domain.Technician;
import org.fasttrackit.laboratory.service.DoctorService;
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
 * Tests for doctors
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DentalLaboratoryApplication.class, loader = SpringApplicationContextLoader.class, initializers = ConfigFileApplicationContextInitializer.class)

public class DoctorIntegrationTest {

    @Autowired
    private DoctorService doctorService;

    @Test
    public void testSaveDoctor() {
        //save a doctor
        Doctor doctor = new Doctor();
        doctor.setDoctorName("Dan Dumitru");
        doctor.setDoctorPhone(0740654321);
        doctor.setDoctorAddress("str. Campului , nr 7");
        doctorService.saveDoctor(doctor);
    }

    @Test
    public void testFindDoctor() {
        //find a doctor
        Doctor doctorOne = doctorService.findOneDoctor(1L);
        Assert.assertNotNull(doctorOne);
    }
}
