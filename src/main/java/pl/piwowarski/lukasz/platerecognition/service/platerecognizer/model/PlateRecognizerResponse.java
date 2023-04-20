
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
        "processing_time",
        "results",
        "filename",
        "version",
        "camera_id",
        "timestamp"
})
@Generated("jsonschema2pojo")
public class PlateRecognizerResponse {

    @JsonProperty("processing_time")
    private Double processingTime;
    @JsonProperty("results")
    private List<Result> results;
    @JsonProperty("filename")
    private String filename;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("camera_id")
    private Object cameraId;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("processing_time")
    public Double getProcessingTime() {
        return processingTime;
    }

    @JsonProperty("processing_time")
    public void setProcessingTime(Double processingTime) {
        this.processingTime = processingTime;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    @JsonProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("camera_id")
    public Object getCameraId() {
        return cameraId;
    }

    @JsonProperty("camera_id")
    public void setCameraId(Object cameraId) {
        this.cameraId = cameraId;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
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
        return "PlateRecognizerResponse{" +
                "processingTime=" + processingTime +
                ", results=" + results +
                ", filename='" + filename + '\'' +
                ", version=" + version +
                ", cameraId=" + cameraId +
                ", timestamp='" + timestamp + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
