package beans;

import java.util.Objects;

/**
 * @author Charchit [charchit.patodi@gmail.com]
 * Part of Coronathon
 * on 29/03/20.
 */

public class Report {
    int id;
    int user_id;
    String title;
    String city;
    String state;
    int pinCode;
    String address;
    String contactNumber;
    String latitude;
    String longitude;
    String description;
    String image_url;

    public Report() {}

    public Report(int id, int user_id, String title, String city, String state, int pinCode, String address, String contactNumber, String latitude, String longitude, String description, String image_url) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.address = address;
        this.contactNumber = contactNumber;
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
        this.image_url = image_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", description='" + description + '\'' +
                ", image_url='" + image_url + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return getId() == report.getId() &&
                getUser_id() == report.getUser_id() &&
                getPinCode() == report.getPinCode() &&
                getTitle().equals(report.getTitle()) &&
                getCity().equals(report.getCity()) &&
                getState().equals(report.getState()) &&
                Objects.equals(getAddress(), report.getAddress()) &&
                getContactNumber().equals(report.getContactNumber()) &&
                Objects.equals(getLatitude(), report.getLatitude()) &&
                Objects.equals(getLongitude(), report.getLongitude()) &&
                Objects.equals(getDescription(), report.getDescription()) &&
                getImage_url().equals(report.getImage_url());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUser_id(), getTitle(), getCity(), getState(), getPinCode(), getAddress(), getContactNumber(), getLatitude(), getLongitude(), getDescription(), getImage_url());
    }
}
