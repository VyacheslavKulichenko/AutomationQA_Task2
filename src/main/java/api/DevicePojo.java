package api;

public class DevicePojo {

    public boolean is_mobile_device;
    public String type;
    public Object brand;
    public Object brand_code;
    public Object brand_url;
    public Object name;

    public DevicePojo(boolean is_mobile_device, String type, Object brand, Object brand_code, Object brand_url, Object name) {
        this.is_mobile_device = is_mobile_device;
        this.type = type;
        this.brand = brand;
        this.brand_code = brand_code;
        this.brand_url = brand_url;
        this.name = name;
    }

    public DevicePojo() {
    }

    public void setIs_mobile_device(boolean is_mobile_device) {
        this.is_mobile_device = is_mobile_device;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(Object brand) {
        this.brand = brand;
    }

    public void setBrand_code(Object brand_code) {
        this.brand_code = brand_code;
    }

    public void setBrand_url(Object brand_url) {
        this.brand_url = brand_url;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public boolean isIs_mobile_device() {
        return is_mobile_device;
    }

    public String getType() {
        return type;
    }

    public Object getBrand() {
        return brand;
    }

    public Object getBrand_code() {
        return brand_code;
    }

    public Object getBrand_url() {
        return brand_url;
    }

    public Object getName() {
        return name;
    }
}
