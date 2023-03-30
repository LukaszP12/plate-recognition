package pl.piwowarski.lukasz.platerecognition.service.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pl.piwowarski.lukasz.platerecognition.repository.entity.PlateEntity;
import pl.piwowarski.lukasz.platerecognition.web.model.RegistrationPlateModel;

import java.util.logging.Logger;

@Component
public class PlateMapper {

    private static final Logger LOGGER = Logger.getLogger(PlateMapper.class.getName());

    public PlateEntity from(RegistrationPlateModel registrationPlateModel) {
        LOGGER.info("from(" + registrationPlateModel + ")");
        ModelMapper modelMapper = new ModelMapper();
        PlateEntity plateEntity = modelMapper.map(registrationPlateModel, PlateEntity.class);

        LOGGER.info("from(...)=" + plateEntity);
        return plateEntity;
    }

    public RegistrationPlateModel from(PlateEntity plateEntity){
        LOGGER.info("from(" + plateEntity + ")");
        ModelMapper modelMapper = new ModelMapper();
        RegistrationPlateModel registrationPlateModel = modelMapper.map(plateEntity, RegistrationPlateModel.class);

        LOGGER.info("from(...)=" + registrationPlateModel);
        return registrationPlateModel;
    }


}
