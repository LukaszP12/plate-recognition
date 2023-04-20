
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
    "type",
    "box"
})
@Generated("jsonschema2pojo")
public class Vehicle {

    @JsonProperty("score")
    private Double score;
    @JsonProperty("type")
    private String type;
    @JsonProperty("box")
    private Box__1 box;
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

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("box")
    public Box__1 getBox() {
        return box;
    }

    @JsonProperty("box")
    public void setBox(Box__1 box) {
        this.box = box;
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
        return "Vehicle{" +
                "score=" + score +
                ", type='" + type + '\'' +
                ", box=" + box +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
