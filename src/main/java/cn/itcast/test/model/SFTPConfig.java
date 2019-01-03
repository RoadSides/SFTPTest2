package cn.itcast.test.model;

public class SFTPConfig {

    private String username;
    private String password;
    private int port;
    private String host;
    private boolean login;
    private boolean logout;
    private boolean check;

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public boolean isLogout() {
        return logout;
    }

    public void setLogout(boolean logout) {
        this.logout = logout;
    }

    public SFTPConfig(String username, String password, int port, String host, boolean login, boolean logout, boolean check) {
        this.username = username;
        this.password = password;
        this.port = port;
        this.host = host;
        this.login = login;
        this.logout = logout;
        this.check = check;
    }
}
