package api;

public class Browser {
    private String name;
    private String version;
    private String version_major;
    private String engine;

    public Browser(String name, String version, String version_major, String engine) {
        this.name = name;
        this.version = version;
        this.version_major = version_major;
        this.engine = engine;
    }

    public String getName() {
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
