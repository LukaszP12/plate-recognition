package pl.piwowarski.lukasz.platerecognition.web.model;

public class RegistrationPlateModel {

    private Long id;
    private String number;

    public RegistrationPlateModel() {
    }

    public RegistrationPlateModel(Long id, String number) {
        this.id = id;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "RegistrationPlateModel{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
