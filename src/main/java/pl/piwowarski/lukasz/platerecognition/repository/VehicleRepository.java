package pl.piwowarski.lukasz.platerecognition.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.piwowarski.lukasz.platerecognition.repository.entity.VehicleEntity;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity,Long> { }
