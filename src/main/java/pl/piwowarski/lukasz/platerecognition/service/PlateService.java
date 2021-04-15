package pl.piwowarski.lukasz.platerecognition.service;

import org.springframework.stereotype.Service;
import pl.piwowarski.lukasz.platerecognition.repository.PlateRepository;
import pl.piwowarski.lukasz.platerecognition.repository.entity.PlateEntity;
import pl.piwowarski.lukasz.platerecognition.service.mapper.PlateMapper;
import pl.piwowarski.lukasz.platerecognition.web.model.PlateModel;

import java.util.List;

@Service
public class PlateService {
    //toDo Logger
    private PlateRepository plateRepository;

    private PlateMapper plateMapper;

    public PlateService(PlateRepository plateRepository, PlateMapper plateMapper) {
        this.plateRepository = plateRepository;
        this.plateMapper = plateMapper;
    }

    public List<PlateModel> list(){
        return null;
    }

    public PlateModel create(PlateModel plateModel){
        PlateEntity plateEntity = plateMapper.from(plateModel);
        PlateEntity savedPlateEntity = plateRepository.save(plateEntity);
//        plateMapper.from()
        return null;
    }

    public PlateModel read(Long id){
        return null;
    }

    public PlateModel update(Long id,PlateModel plateModel){
        return null;
    }

    public void delete(Long id){

    }

}
