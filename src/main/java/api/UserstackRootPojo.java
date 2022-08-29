package api;

public class UserstackRootPojo {
    public String ua;
    public String type;
    public Object brand;
    public Object name;
    public String url;
    public OsPojo os;
    public DevicePojo device;
    public BrowserPojo browser;
    public CrawlerPojo crawler;

    public UserstackRootPojo(String ua, String type, Object brand, Object name, String url, OsPojo os, DevicePojo device, BrowserPojo browser, CrawlerPojo crawler) {
        this.ua = ua;
        this.type = type;
        this.brand = brand;
        this.name = name;
        this.url = url;
        this.os = os;
        this.device = device;
        this.browser = browser;
        this.crawler = crawler;
    }

    public UserstackRootPojo() {
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(Object brand) {
        this.brand = brand;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setOs(OsPojo os) {
        this.os = os;
    }

    public void setDevice(DevicePojo device) {
        this.device = device;
    }

    public void setBrowser(BrowserPojo browser) {
        this.browser = browser;
    }

    public void setCrawler(CrawlerPojo crawler) {
        this.crawler = crawler;
    }

    public String getUa() {
        return ua;
    }

    public String getType() {
        return type;
    }

    public Object getBrand() {
        return brand;
    }

    public Object getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public OsPojo getOs() {
        return os;
    }

    public DevicePojo getDevice() {
        return device;
    }

    public BrowserPojo getBrowser() {
        return browser;
    }

    public CrawlerPojo getCrawler() {
        return crawler;
    }
}
