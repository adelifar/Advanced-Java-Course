public class ContactManager {
    private Contact[] contacts;
    private int counter;

    public ContactManager() {
        counter = 0;
        contacts = new Contact[100];
    }

    public boolean addContact(Contact contact) {
        if (counter < 100) {
            contacts[counter] = new Contact(contact.getName(), contact.getNumber());
            contacts[counter].setEmail(contact.getEmail());
            contacts[counter].setAddress(contact.getAddress());
            counter++;
            return true;
        } else {
            return false;
        }
    }

    public Contact[] searchContactByName(String name) {
        Contact[] contacts1 = new Contact[100];
        int cnt = 0;
        for (int i=0;i<counter ;i++) {
            if (contacts[i].getName().contains(name)) {
                contacts1[cnt] = new Contact(contacts[i].getName(), contacts[i].getNumber());
                contacts1[cnt].setEmail(contacts[i].getEmail());
                contacts1[cnt].setAddress(contacts[i].getAddress());
                cnt++;
            }
        }
        return contacts1;
    }

    public Contact[] searchContactByNumber(String number) {
        Contact[] contacts1 = new Contact[100];
        int cnt = 0;
        for (int i=0;i<counter ;i++) {
            if (contacts[i].getNumber().contains(number)) {
                contacts1[cnt] = new Contact(contacts[i].getName(), contacts[i].getNumber());
                contacts1[cnt].setEmail(contacts[i].getEmail());
                contacts1[cnt].setAddress(contacts[i].getAddress());
                cnt++;
            }
        }
        return contacts1;
    }

    public boolean editContact(Contact contact, int index) {
        if (index < 0 || index >= 100) {
            System.out.println("Entered Wrong index");
            return false;
        }
        contacts[index].setName(contact.getName());
        contacts[index].setNumber(contact.getNumber());
        contacts[index].setEmail(contact.getEmail());
        contacts[index].setAddress(contact.getAddress());
        return true;
    }

    public int getContactIndexByName(String name) {
        for (int i = 0; i <= counter; i++) {
            if (contacts[i].getName().equals(name))
                return i;
        }
        return -1;
    }

    public boolean deleteContact(int index) {
        if (index > counter || index < 0) return false;
        for (int i = index; i < counter-1; i++) {
            contacts[i].setName(contacts[i + 1].getName());
            contacts[i].setNumber(contacts[i + 1].getNumber());
            contacts[i].setEmail(contacts[i + 1].getEmail());
            contacts[i].setAddress(contacts[i + 1].getAddress());
        }
        contacts[counter] = null;
        counter--;
        return true;
    }
    public Contact[] getContacts(){return contacts;}

    public int getCount() {
        return counter;
    }
}
