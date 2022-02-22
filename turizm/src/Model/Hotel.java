package Model;

public class Hotel {
    String name, address, mail, location, facilityProperties, hostelType;
    int star, phoneNum;

    public Hotel (String name, String address, String mail, String location, String facilityFeatures, String hostelType, int star, int phoneNum) {
        this.name = name;
        this.address = address;
        this.mail = mail;
        this.location = location;
        this.facilityProperties = facilityFeatures;
        this.hostelType = hostelType;
        this.star = star;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFacilityProperties() {
        return facilityProperties;
    }

    public void setFacilityProperties(String facilityProperties) {
        this.facilityProperties = facilityProperties;
    }

    public String getHostelType() {
        return hostelType;
    }

    public void setHostelType(String hostelType) {
        this.hostelType = hostelType;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

}
