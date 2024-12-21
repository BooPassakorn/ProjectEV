package com.itsci.projectev.repositories;

import com.itsci.projectev.models.StationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationTypeRepository extends JpaRepository<StationType, String> {
}
