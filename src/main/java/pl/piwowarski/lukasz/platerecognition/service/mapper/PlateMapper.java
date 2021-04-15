package pl.piwowarski.lukasz.platerecognition.service.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import pl.piwowarski.lukasz.platerecognition.repository.entity.PlateEntity;
import pl.piwowarski.lukasz.platerecognition.web.model.PlateModel;

import java.util.logging.Logger;

@Component
public class PlateMapper {

    private static final Logger LOGGER = Logger.getLogger(PlateMapper.class.getName());

    public PlateEntity from(PlateModel plateModel) {
        LOGGER.info("from(" + plateModel + ")");
        ModelMapper modelMapper = new ModelMapper();
        PlateEntity plateEntity = modelMapper.map(plateModel, PlateEntity.class);

        LOGGER.info("from(...)=" + plateEntity);
        return plateEntity;
    }

    public PlateModel from(PlateEntity plateEntity){
        LOGGER.info("from(" + plateEntity + ")");
        ModelMapper modelMapper = new ModelMapper();
        PlateModel plateModel = modelMapper.map(plateEntity, PlateModel.class);

        LOGGER.info("from(...)=" + plateModel);
        return plateModel;
    }


}
