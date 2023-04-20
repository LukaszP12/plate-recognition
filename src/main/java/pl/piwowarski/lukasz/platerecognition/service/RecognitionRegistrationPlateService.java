package pl.piwowarski.lukasz.platerecognition.service;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import pl.piwowarski.lukasz.platerecognition.service.mapper.PlateMapper;
import pl.piwowarski.lukasz.platerecognition.service.platerecognizer.model.PlateRecognizerResponse;
import pl.piwowarski.lukasz.platerecognition.web.model.RegistrationPlateModel;

@Service
public class RecognitionRegistrationPlateService {

    private final PlateService plateService;
    private final PlateRecognizerApiService plateRecognizerApiService;
    private final PlateMapper plateMapper;

    public RecognitionRegistrationPlateService(PlateService plateService,
                                               PlateRecognizerApiService plateRecognizerApiService,
                                               PlateMapper plateMapper) {
        this.plateService = plateService;
        this.plateRecognizerApiService = plateRecognizerApiService;
        this.plateMapper = plateMapper;
    }

    public RegistrationPlateModel recognize(Resource resource) {
        PlateRecognizerResponse plateRecognizerResponse = plateRecognizerApiService.recognize(resource);
        RegistrationPlateModel registrationPlateModel = plateMapper.fromResponse(plateRecognizerResponse);

        RegistrationPlateModel createdRegistrationPlateModel = plateService.create(registrationPlateModel);
        return createdRegistrationPlateModel;
    }
}
