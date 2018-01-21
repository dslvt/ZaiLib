package Users;

import Users.Patron;

public class Facility extends Patron {

    Facility(String name, String address, String phoneNumber, int ID) {
        super(name, address, phoneNumber, ID);
    }

    @Override
    protected void checkOut() {

    }

}
