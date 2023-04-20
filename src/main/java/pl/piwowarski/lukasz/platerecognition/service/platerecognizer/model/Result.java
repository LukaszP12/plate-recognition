
package pl.piwowarski.lukasz.platerecognition.service.platerecognizer.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "box",
        "plate",
        "region",
        "score",
        "candidates",
        "dscore",
        "vehicle"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("box")
    private Box box;
    @JsonProperty("plate")
    private String plate;
    @JsonProperty("region")
    private Region region;
    @JsonProperty("score")
    private Double score;
    @JsonProperty("candidates")
    private List<Candidate> candidates;
    @JsonProperty("dscore")
    private Double dscore;
    @JsonProperty("vehicle")
    private Vehicle vehicle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("box")
    public Box getBox() {
        return box;
    }

    @JsonProperty("box")
    public void setBox(Box box) {
        this.box = box;
    }

    @JsonProperty("plate")
    public String getPlate() {
        return plate;
    }

    @JsonProperty("plate")
    public void setPlate(String plate) {
        this.plate = plate;
    }

    @JsonProperty("region")
    public Region getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(Region region) {
        this.region = region;
    }

    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    @JsonProperty("candidates")
    public List<Candidate> getCandidates() {
        return candidates;
    }

    @JsonProperty("candidates")
    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    @JsonProperty("dscore")
    public Double getDscore() {
        return dscore;
    }

    @JsonProperty("dscore")
    public void setDscore(Double dscore) {
        this.dscore = dscore;
    }

    @JsonProperty("vehicle")
    public Vehicle getVehicle() {
        return vehicle;
    }

    @JsonProperty("vehicle")
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Result{" +
                "box=" + box +
                ", plate='" + plate + '\'' +
                ", region=" + region +
                ", score=" + score +
                ", candidates=" + candidates +
                ", dscore=" + dscore +
                ", vehicle=" + vehicle +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
