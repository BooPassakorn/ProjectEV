package com.itsci.projectev.repositories;

import com.itsci.projectev.models.ChargingType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargingTypeRepository extends JpaRepository<ChargingType, String> {
}
