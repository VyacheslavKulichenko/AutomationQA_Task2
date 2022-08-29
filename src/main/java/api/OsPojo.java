package api;

public class OsPojo {
    public String name;
    public String code;
    public String url;
    public String family;
    public String family_code;
    public String family_vendor;
    public String icon;
    public String icon_large;

    public OsPojo(String name, String code, String url, String family, String family_code, String family_vendor, String icon, String icon_large) {
        this.name = name;
        this.code = code;
        this.url = url;
        this.family = family;
        this.family_code = family_code;
        this.family_vendor = family_vendor;
        this.icon = icon;
        this.icon_large = icon_large;
    }

    public OsPojo() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setFamily_code(String family_code) {
        this.family_code = family_code;
    }

    public void setFamily_vendor(String family_vendor) {
        this.family_vendor = family_vendor;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setIcon_large(String icon_large) {
        this.icon_large = icon_large;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getUrl() {
        return url;
    }

    public String getFamily() {
        return family;
    }

    public String getFamily_code() {
        return family_code;
    }

    public String getFamily_vendor() {
        return family_vendor;
    }

    public String getIcon() {
        return icon;
    }

    public String getIcon_large() {
        return icon_large;
    }
}
