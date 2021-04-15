package pl.piwowarski.lukasz.platerecognition.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import pl.piwowarski.lukasz.platerecognition.repository.entity.PlateEntity;

@SpringBootTest
class PlateRepositoryTest {

    @Autowired
    private PlateRepository plateRepository; // tylko przez autowired, gdyż w klasie testowej nie można
    // użyć konstruktora

    @Test
    public void givenRepository() {
        //given
        PlateEntity plateEntity = new PlateEntity();
        plateEntity.setNumber("8APAS9834YU");
        //when
        PlateEntity savedPlateEntity = plateRepository.save(plateEntity);
        //then

        Assertions.assertAll(
                () -> Assertions.assertNotNull(savedPlateEntity,"The saved plate entity is null"),
                () -> Assertions.assertNotNull(savedPlateEntity.getId(),"The saved plate entity ID is null")
        );
    }


}