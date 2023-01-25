package com.Homes2Rent.Homes2Rent.repository;

import com.Homes2Rent.Homes2Rent.model.Annulering;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnuleringRepository extends CrudRepository<Annulering, Long> {


    List<Annulering> findAllAnnuleringByIdEqualsIgnoreCase(String id);
}
