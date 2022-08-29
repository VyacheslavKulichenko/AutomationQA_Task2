package api;

public  class BrowserPojo {
    private  String name;
    private String version;
    private String version_major;
    private String engine;

    public BrowserPojo(String name, String version, String version_major, String engine) {
        this.name = name;
        this.version = version;
        this.version_major = version_major;
        this.engine = engine;
    }

    public BrowserPojo() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setVersion_major(String version_major) {
        this.version_major = version_major;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public  String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getVersion_major() {
        return version_major;
    }

    public String getEngine() {
        return engine;
    }
}
