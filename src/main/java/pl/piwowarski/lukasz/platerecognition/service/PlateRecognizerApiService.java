package pl.piwowarski.lukasz.platerecognition.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class PlateRecognizerApiService {

    private static final Logger LOGGER = Logger.getLogger(PlateRecognizerApiService.class.getName());

    public void recognize(){
        LOGGER.info("recognize()");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);
        httpHeaders.add("Authorization"," Token ");

    }

}
