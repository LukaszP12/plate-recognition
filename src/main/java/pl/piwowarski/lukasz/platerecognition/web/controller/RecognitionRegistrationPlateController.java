package pl.piwowarski.lukasz.platerecognition.web.controller;

import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pl.piwowarski.lukasz.platerecognition.service.RecognitionRegistrationPlateService;
import pl.piwowarski.lukasz.platerecognition.web.model.RegistrationPlateModel;

import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/recognize")
public class RecognitionRegistrationPlateController {
    private static final Logger LOGGER = Logger.getLogger(RecognitionRegistrationPlateController.class.getName());

    private RecognitionRegistrationPlateService recognitionRegistrationPlateService;

    public RecognitionRegistrationPlateController(RecognitionRegistrationPlateService recognitionRegistrationPlateService) {
        this.recognitionRegistrationPlateService = recognitionRegistrationPlateService;
    }

    @PostMapping
    public RegistrationPlateModel recognize(MultipartFile upload) {
        LOGGER.info("recognize()");
        Resource resource = upload.getResource();
        RegistrationPlateModel registrationPlateModel = recognitionRegistrationPlateService.recognize(resource);

        LOGGER.info("recognize()=" + registrationPlateModel);
        return registrationPlateModel;
    }
}
