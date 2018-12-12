package org.fasttrackit.laboratory.persistence;

import org.fasttrackit.laboratory.domain.Technician;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TechnicianRepository
        extends
        PagingAndSortingRepository<Technician, Long> {
}
