package pl.piwowarski.lukasz.platerecognition.service;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import pl.piwowarski.lukasz.platerecognition.service.platerecognizer.model.PlateRecognizerResponse;

import java.util.logging.Logger;

@Service
public class PlateRecognizerApiService {

    private static final Logger LOGGER = Logger.getLogger(PlateRecognizerApiService.class.getName());

    public PlateRecognizerResponse recognize(Resource resource) {
        LOGGER.info("recognize()");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);
        httpHeaders.add("Authorization", "Token c25bfb45c151a67d5c768988bdfd8ba197df9b75");

        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("upload", resource);

        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, httpHeaders);
        String serverUrl = "https://api.platerecognizer.com/v1/plate-reader/";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PlateRecognizerResponse> responseEntity = restTemplate.postForEntity(
                serverUrl,
                requestEntity,
                PlateRecognizerResponse.class);

        LOGGER.info("recognize()=" + responseEntity);
        return responseEntity.getBody();
    }

}
