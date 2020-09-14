package by.epamlab.originator;

public class AccountOwner {

    private String firstName;
    private String lastName;
    private int passportId;
    private String electronicSignature;

    public AccountOwner() {
    }

    public AccountOwner(String firstName, String lastName, int passportId, String electronicSignature) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.electronicSignature = electronicSignature;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public String getElectronicSignature() {
        return electronicSignature;
    }

    public void setElectronicSignature(String electronicSignature) {
        this.electronicSignature = electronicSignature;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account Owner {");
        sb.append("first name='").append(firstName).append('\'');
        sb.append(", last name='").append(lastName).append('\'');
        sb.append(", passportId=").append(passportId);
        sb.append(", electronic signature='").append(electronicSignature).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
