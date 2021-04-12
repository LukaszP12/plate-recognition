package pl.piwowarski.lukasz.platerecognition.service.mapper;

import org.springframework.stereotype.Component;
import pl.piwowarski.lukasz.platerecognition.repository.entity.PlateEntity;
import pl.piwowarski.lukasz.platerecognition.web.model.PlateModel;

@Component
public class PlateMapper {


    public PlateEntity from(PlateModel plateModel){
        PlateEntity plateEntity = new PlateEntity();
        plateEntity.setId(plateModel.getId());
        return plateEntity;
    }


}
