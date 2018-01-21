package Users;

public abstract class User {

    String name;
    String address;
    String phoneNumber;
    int ID;

    User(String name, String address, String phoneNumber, int ID){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.ID = ID;

    }

    protected void searchFor(){
    }

}
