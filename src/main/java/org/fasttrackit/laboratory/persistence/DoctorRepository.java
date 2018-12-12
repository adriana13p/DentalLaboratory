package org.fasttrackit.laboratory.persistence;

import org.fasttrackit.laboratory.domain.Doctor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DoctorRepository
        extends
        PagingAndSortingRepository<Doctor, Long> {
}
