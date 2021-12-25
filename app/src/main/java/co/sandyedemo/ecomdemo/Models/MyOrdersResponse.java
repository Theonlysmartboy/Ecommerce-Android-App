package co.sandyedemo.ecomdemo.Models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyOrdersResponse {
    private String success;

    private String userid;
    private String useremail;
    private String tax;
    private String shipping;
    private List<Order> orders = null;
    private Map<String, Object> additionalProperties = new HashMap<>();

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public List<Order> getOrderes() {
        return orders;
    }

    public void setOrderes(List<Order> orders) {
        this.orders = orders;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
