package pl.piwowarski.lukasz.platerecognition.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.piwowarski.lukasz.platerecognition.repository.entity.PlateEntity;

@Repository
public interface PlateRepository extends JpaRepository<PlateEntity, Long> { }
