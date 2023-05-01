package es.deusto.spq.pojo;

public class UserData {

    private String login;
    private String password;

    public UserData() {
        // required by serialization
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password1) {
        this.password = password1;
    }
    public String toString() {
        return "[login=" + login + ", password=" + password + "]";
    }
}