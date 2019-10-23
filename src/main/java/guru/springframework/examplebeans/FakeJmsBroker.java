package guru.springframework.examplebeans;

public class FakeJmsBroker {
    private String user;
    private String password;
    private String url;

    public FakeJmsBroker(){

    }

    public String getUsername() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
