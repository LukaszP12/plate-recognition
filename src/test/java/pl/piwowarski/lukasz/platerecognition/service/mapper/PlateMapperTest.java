package pl.piwowarski.lukasz.platerecognition.service.mapper;

import org.junit.jupiter.api.Test;
import pl.piwowarski.lukasz.platerecognition.repository.entity.PlateEntity;
import pl.piwowarski.lukasz.platerecognition.web.model.PlateModel;

import static org.junit.jupiter.api.Assertions.*;

class PlateMapperTest {

    @Test
    public void given_when_then(){

        // given
        PlateMapper plateMapper = new PlateMapper();
        PlateModel plateModel = new PlateModel();
        plateModel.setId(1L);

        // when
        PlateEntity plateEntity = plateMapper.from(plateModel);

        // then
        assertNotNull(plateEntity,"plateEntity is null");
        assertNotNull(plateEntity.getId(),"plateEntity is null");
    }

    @Test
    public void givenPlateEntity_when_then(){
        //given
        PlateMapper plateMapper = new PlateMapper();
        PlateEntity plateEntity = new PlateEntity();
        plateEntity.setId(1L);

        //when
        PlateModel plateModel = plateMapper.from(plateEntity);

        //then
        assertNotNull(plateModel,"plateModel is null");
        assertNotNull(plateModel.getId(),"plateModel is null");
    }

}