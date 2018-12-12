package org.fasttrackit.laboratory.persistence;

import org.fasttrackit.laboratory.domain.ProstheticWork;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProstheticWorkRepository
        extends
        PagingAndSortingRepository<ProstheticWork, Long> {
}
