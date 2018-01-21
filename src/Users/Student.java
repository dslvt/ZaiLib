package Users;

import Users.Patron;

public class Student extends Patron {

    Student(String name, String address, String phoneNumber, int ID) {
        super(name, address, phoneNumber, ID);
    }

    @Override
    protected void checkOut() {

    }

}
