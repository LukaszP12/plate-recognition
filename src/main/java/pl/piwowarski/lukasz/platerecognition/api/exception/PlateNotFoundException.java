package pl.piwowarski.lukasz.platerecognition.api.exception;

public class PlateNotFoundException extends Exception {

    public PlateNotFoundException(String message) {
        super(message);
    }

    public PlateNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
