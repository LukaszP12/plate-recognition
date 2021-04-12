package pl.piwowarski.lukasz.platerecognition.repository.entity;

import javax.persistence.*;

@Entity
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private PlateEntity plate;




}
