package pl.piwowarski.lukasz.platerecognition.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.net.URLDecoder;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PlateRecognizerApiServiceTest {

    @Autowired
    private PlateRecognizerApiService plateRecognizerApiService;

    @Test
    void recognize() {
        // given
        Resource resource = new ClassPathResource(URLDecoder.decode("car_example_plate.jpg"));

        // when
        plateRecognizerApiService.recognize(resource);

        // then

    }
}