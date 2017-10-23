package seedu.address.storage;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores the information from VCard file.
 */

public class VCard {

    private String phone;
    private String email;
    private String address;
    private String birthday;
    private String name;
    private String organisation;
    private List<String> tag;
    private String Organization;
    private String note;

    public VCard() {
        name = "";
        tag = new ArrayList<String>();


    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public void setTag(List<String> label) {
        tag = label;
    }

    public void setOrganization(String organization) {
        Organization = organization;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getOrganisation() {
        return organisation;
    }

    public List<String> getTag() {
        return tag;
    }

    public String getOrganization() {
        return Organization;
    }

    public String getNote() {
        return note;
    }
}
