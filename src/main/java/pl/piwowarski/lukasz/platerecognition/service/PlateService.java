package pl.piwowarski.lukasz.platerecognition.service;

import org.springframework.stereotype.Service;
import pl.piwowarski.lukasz.platerecognition.api.exception.PlateNotFoundException;
import pl.piwowarski.lukasz.platerecognition.repository.PlateRepository;
import pl.piwowarski.lukasz.platerecognition.repository.entity.PlateEntity;
import pl.piwowarski.lukasz.platerecognition.service.mapper.PlateMapper;
import pl.piwowarski.lukasz.platerecognition.web.model.RegistrationPlateModel;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class PlateService {
    //toDo Logger

    private static final Logger LOGGER = Logger.getLogger(PlateMapper.class.getName());

    private PlateRepository plateRepository;

    private PlateMapper plateMapper;

    public PlateService(PlateRepository plateRepository, PlateMapper plateMapper) {
        this.plateRepository = plateRepository;
        this.plateMapper = plateMapper;
    }

    public List<RegistrationPlateModel> list() {
        return null;
    }

    public RegistrationPlateModel create(RegistrationPlateModel registrationPlateModel) {
        LOGGER.info("" + registrationPlateModel + "");
        PlateEntity plateEntity = plateMapper.from(registrationPlateModel);
        PlateEntity savedPlateEntity = plateRepository.save(plateEntity);
//        plateMapper.from()
        return null;
    }

    public RegistrationPlateModel read(Long id) throws Exception {
        Optional<PlateEntity> plateEntityOptional = plateRepository.findById(id);
//        if (plateEntityOptional.isPresent()) {
//            PlateEntity plateEntity = plateEntityOptional.get();
//        }
        PlateEntity plateEntity = plateEntityOptional.orElseThrow(
                () -> new PlateNotFoundException("Plate not found for id: " + id));
        RegistrationPlateModel registrationPlateModel = plateMapper.from(plateEntity);

        return registrationPlateModel;
    }

    public RegistrationPlateModel update(Long id, RegistrationPlateModel registrationPlateModel) {
        registrationPlateModel.setId(id);
        PlateEntity plateEntity = plateMapper.from(registrationPlateModel);
        PlateEntity savedPlateEntity = plateRepository.save(plateEntity);
        RegistrationPlateModel savedRegistrationPlateModel = plateMapper.from(savedPlateEntity);
//        Optional<PlateEntity> byId = plateRepository.findById(id);
//        PlateEntity savePlated = plateRepository.save(byId);
//        PlateModel plateModel = plateMapper.from(savePlated);

        return savedRegistrationPlateModel;
    }

    public void delete(Long id) {
        LOGGER.info("from(" + id + ")");
        plateRepository.deleteById(id);
    }

}
