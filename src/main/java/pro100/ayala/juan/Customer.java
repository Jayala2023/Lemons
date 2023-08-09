package pro100.ayala.juan;

public class Customer {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;

    public Customer(String username, String password, String firstName, String lastName, String email,
                    String phone, String address, String city, String state, String zip){
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setPassword(password);
        setUsername(username);
        setPhone(phone);
        setState(state);
        setZip(zip);
        setEmail(email);
    }

    public Customer(){
        setFirstName("temporary");
        setLastName("testing");
        setAddress("111 N 111 S");
        setCity("testville");
        setPassword("w0rdP@ss");
        setUsername("TestArticle");
        setPhone("111-222-3333");
        setState("UT");
        setZip("12345");
        setEmail("fake@email.com");
    }

    public void setFirstName(String name){
        this.firstName = name;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String name){
        this.lastName = name;
    }
    public String getLastName(){
        return lastName;
    }

    public void setUsername(String name){
        this.username = name;
    }
    public String getUsername(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }

    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }

    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }

    public void setZip(String zip){
        this.zip = zip;
    }
    public String getZip(){
        return zip;
    }
}
