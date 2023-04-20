package pl.piwowarski.lukasz.platerecognition.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import pl.piwowarski.lukasz.platerecognition.service.platerecognizer.model.PlateRecognizerResponse;

import java.net.URLDecoder;


@SpringBootTest
class PlateRecognizerApiServiceTest {

    @Autowired
    private PlateRecognizerApiService plateRecognizerApiService;

    @Test
    void recognize() {
        // given
        Resource resource = new ClassPathResource(URLDecoder.decode("car_example_plate.jpg"));

        // when
        PlateRecognizerResponse plateRecognizerResponse = plateRecognizerApiService.recognize(resource);

        // then
        Assertions.assertNotNull(plateRecognizerResponse, "response is null");

    }
}