package models;

public class Member {
    String FirstName;
    String LastName;
    String Mobile;
    String LinkedIn;
    String Skills;
    String Education;

    public Member(String firstName, String lastName, String mobile, String linkedIn, String skills, String education) {
        FirstName = firstName;
        LastName = lastName;
        Mobile = mobile;
        LinkedIn = linkedIn;
        Skills = skills;
        Education = education;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getLinkedIn() {
        return LinkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        LinkedIn = linkedIn;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String skills) {
        Skills = skills;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }
}
