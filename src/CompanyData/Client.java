package CompanyData;

public class Client {

    /*private HashMap<String, String> clientData;

    Company.Client(String clientEmail) {
        this.clientData = new HashMap<>();
        this.clientData.put("clientEmail", clientEmail);
    }

    protected void setClientName(String clientName) {
        this.clientData.put("clientName", clientName);
    }

    protected String getClientEmail() {
        return this.clientData.get("clientEmail");
    }

    protected String getClientName() {
        return this.clientData.get("clientName");
    }*/

    private String email;
    private String password;
    private String firstName;

    public Client(String email, String firstName) {
        this.email = email;
        this.firstName = firstName;
    }

    public String getClientEmail() {
        return this.email;
    }

    public String getClientFirstName() {
        return this.firstName;
    }

}
