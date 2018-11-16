package me.jimmy.springmvc;

public class Account {
    private Integer id;
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public Account setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Account setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Account setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
