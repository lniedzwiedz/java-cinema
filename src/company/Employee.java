package company;

import javax.xml.crypto.Data;

public class Employee {

    private String lastName;
    private int PESELNumber;
    private int phone;
    private int email;
    private String jobTitle;
    private String typeOfContract;
    private Data contractStartDate;
    private Data contractEndDate;
    private String password;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPESELNumber() {
        return PESELNumber;
    }

    public void setPESELNumber(int PESELNumber) {
        this.PESELNumber = PESELNumber;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getTypeOfContract() {
        return typeOfContract;
    }

    public void setTypeOfContract(String typeOfContract) {
        this.typeOfContract = typeOfContract;
    }

    public Data getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Data contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Data getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Data contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
