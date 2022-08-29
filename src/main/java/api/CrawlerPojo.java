package api;

public class CrawlerPojo {

    private boolean is_crawler;
    private Object category;
    private Object last_seen;

    public CrawlerPojo(boolean is_crawler, Object category, Object last_seen) {
        this.is_crawler = is_crawler;
        this.category = category;
        this.last_seen = last_seen;
    }

    public CrawlerPojo() {
    }

    public void setIs_crawler(boolean is_crawler) {
        this.is_crawler = is_crawler;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public void setLast_seen(Object last_seen) {
        this.last_seen = last_seen;
    }

    public boolean isIs_crawler() {
        return is_crawler;
    }

    public Object getCategory() {
        return category;
    }

    public Object getLast_seen() {
        return last_seen;
    }
}

