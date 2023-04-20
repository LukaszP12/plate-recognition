
package pl.piwowarski.lukasz.platerecognition.service.platerecognizer.model;

import java.util.LinkedHashMap;
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
    "score",
    "plate"
})
@Generated("jsonschema2pojo")
public class Candidate {

    @JsonProperty("score")
    private Double score;
    @JsonProperty("plate")
    private String plate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    @JsonProperty("plate")
    public String getPlate() {
        return plate;
    }

    @JsonProperty("plate")
    public void setPlate(String plate) {
        this.plate = plate;
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
        return "Candidate{" +
                "score=" + score +
                ", plate='" + plate + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
