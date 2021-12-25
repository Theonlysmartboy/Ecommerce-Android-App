package co.sandyedemo.ecomdemo.Models;

import java.util.HashMap;
import java.util.Map;

public class SignUpResponse {

    private String success;
    private String message;
    private Integer userid;
    private Map<String, Object> additionalProperties = new HashMap<>();

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}