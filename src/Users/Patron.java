package Users;


public abstract class Patron extends User {

    Patron(String name, String address, String phoneNumber, int ID) {
        super(name, address, phoneNumber, ID);
    }

    protected abstract void checkOut();

    protected void returnDoc(){

    }
}
