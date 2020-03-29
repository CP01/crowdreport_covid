package beans;

import java.util.Objects;

/**
 * @author Charchit [charchit.patodi@gmail.com]
 * Part of Coronathon
 * on 29/03/20.
 */

public class User {
    int id;
    String user_google_id;
    String firebase_id;
    String email;
    String name;

    public User() {}

    public User(int id, String user_google_id, String firebase_id, String email, String name) {
        this.id = id;
        this.user_google_id = user_google_id;
        this.firebase_id = firebase_id;
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_google_id() {
        return user_google_id;
    }

    public void setUser_google_id(String user_google_id) {
        this.user_google_id = user_google_id;
    }

    public String getFirebase_id() {
        return firebase_id;
    }

    public void setFirebase_id(String firebase_id) {
        this.firebase_id = firebase_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_google_id='" + user_google_id + '\'' +
                ", firebase_id='" + firebase_id + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                Objects.equals(getUser_google_id(), user.getUser_google_id()) &&
                Objects.equals(getFirebase_id(), user.getFirebase_id()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUser_google_id(), getFirebase_id(), getEmail(), getName());
    }
}
