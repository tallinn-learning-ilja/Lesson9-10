package example.client;

public abstract class AbstractClient {

    public String url;
    public int port;
    public int timeout;
    public int retries;

    public void configure(Configuration configuration) {
        this.url = configuration.getUrl();
        this.port = configuration.getPort();
        this.timeout = configuration.getTimeout();
        this.retries = configuration.getRetries();
    }
}
