package pl.piwowarski.lukasz.platerecognition.service.mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.piwowarski.lukasz.platerecognition.repository.entity.PlateEntity;
import pl.piwowarski.lukasz.platerecognition.service.platerecognizer.model.PlateRecognizerResponse;
import pl.piwowarski.lukasz.platerecognition.service.platerecognizer.model.Result;
import pl.piwowarski.lukasz.platerecognition.web.model.RegistrationPlateModel;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlateMapperTest {

    @Test
    public void given_when_then() {

        // given
        PlateMapper plateMapper = new PlateMapper();
        RegistrationPlateModel registrationPlateModel = new RegistrationPlateModel();
        registrationPlateModel.setId(1L);

        // when
        PlateEntity plateEntity = plateMapper.from(registrationPlateModel);

        // then
        assertNotNull(plateEntity, "plateEntity is null");
        assertNotNull(plateEntity.getId(), "plateEntity is null");
    }

    @Test
    public void givenPlateEntity_when_then() {
        //given
        PlateMapper plateMapper = new PlateMapper();
        PlateEntity plateEntity = new PlateEntity();
        plateEntity.setId(1L);

        //when
        RegistrationPlateModel registrationPlateModel = plateMapper.from(plateEntity);

        //then
        assertNotNull(registrationPlateModel, "plateModel is null");
        assertNotNull(registrationPlateModel.getId(), "plateModel is null");
    }

    @Test
    void fromResponse() {
        // given
        PlateMapper plateMapper = new PlateMapper();

        PlateRecognizerResponse plateRecognizerResponse = new PlateRecognizerResponse();
        List<Result> results = new ArrayList<>();
        Result result = new Result();
        result.setPlate("WX 102 502");
        results.add(result);
        plateRecognizerResponse.setResults(results);

        // when
        RegistrationPlateModel registrationPlateModel = plateMapper.fromResponse(plateRecognizerResponse);

        // then
        Assertions.assertNotNull(registrationPlateModel.getNumber(), "number is null");
    }

}