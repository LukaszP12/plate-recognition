
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
    "xmin",
    "ymin",
    "xmax",
    "ymax"
})
@Generated("jsonschema2pojo")
public class Box {

    @JsonProperty("xmin")
    private Integer xmin;
    @JsonProperty("ymin")
    private Integer ymin;
    @JsonProperty("xmax")
    private Integer xmax;
    @JsonProperty("ymax")
    private Integer ymax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("xmin")
    public Integer getXmin() {
        return xmin;
    }

    @JsonProperty("xmin")
    public void setXmin(Integer xmin) {
        this.xmin = xmin;
    }

    @JsonProperty("ymin")
    public Integer getYmin() {
        return ymin;
    }

    @JsonProperty("ymin")
    public void setYmin(Integer ymin) {
        this.ymin = ymin;
    }

    @JsonProperty("xmax")
    public Integer getXmax() {
        return xmax;
    }

    @JsonProperty("xmax")
    public void setXmax(Integer xmax) {
        this.xmax = xmax;
    }

    @JsonProperty("ymax")
    public Integer getYmax() {
        return ymax;
    }

    @JsonProperty("ymax")
    public void setYmax(Integer ymax) {
        this.ymax = ymax;
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
        return "Box{" +
                "xmin=" + xmin +
                ", ymin=" + ymin +
                ", xmax=" + xmax +
                ", ymax=" + ymax +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
