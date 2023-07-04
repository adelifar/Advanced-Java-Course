import java.util.Scanner;

public class Menu {
    private ContactManager contactManager;

    public Menu() {
        this.contactManager = new ContactManager();
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int selectedOption = 0;
        while (selectedOption != 8) {


            System.out.println("--------------------------------***************************--------------------------------");
            System.out.print("1.show contacts\n2.add new contact\n3.search contact by name\n4.search contact by number\n" +
                    "5. get contact index by name\n6. edit contact\n7. delete contact\n8.exit\n");
            System.out.println("--------------------------------***************************--------------------------------");
            selectedOption = scanner.nextInt();
            processOption(selectedOption);
        }
    }

    private void processOption(int selectedOption) {
        Scanner scanner = new Scanner(System.in);
        switch (selectedOption) {
            case 1:
                Contact[] contacts = contactManager.getContacts();
                printContacts(contacts);
                break;
            case 2:
                Contact cnt = getContactInfo();
                contactManager.addContact(cnt);
                break;
            case 3:
                System.out.println("Enter name");
                String name = scanner.nextLine();
                Contact[] contacts1 = contactManager.searchContactByName(name);
                printContacts(contacts1);
                break;
            case 4:
                System.out.println("Enter number");
                String number = scanner.nextLine();
                Contact[] contacts2 = contactManager.searchContactByNumber(number);
                printContacts(contacts2);
                break;
            case 5:
                System.out.println("Enter name");
                String name1 = scanner.nextLine();
                int index = contactManager.getContactIndexByName(name1);
                System.out.println(index);
                break;
            case 6:
                System.out.println("Enter index");
                int editIndex = scanner.nextInt();
                Contact cntEdit = getContactInfo();
                contactManager.editContact(cntEdit, editIndex);
                break;
            case 7:
                System.out.println("Enter index ");
                int deleteIndex = scanner.nextInt();
                contactManager.deleteContact(deleteIndex);
                break;
        }
    }

    private Contact getContactInfo() {
        Scanner scanner = new Scanner(System.in);
        Contact cnt = new Contact();
        System.out.println("Enter name:");
        cnt.setName(scanner.nextLine());
        System.out.println("Enter number");
        cnt.setNumber(scanner.nextLine());
        System.out.println("Enter Email");
        cnt.setEmail(scanner.nextLine());
        System.out.println("Enter Address");
        cnt.setAddress(scanner.nextLine());
        return cnt;
    }

    private void printContacts(Contact[] contacts) {
        for (Contact contact : contacts) {
            if (contact == null)
                break;
            System.out.printf("Name: %s Number: %s Email: %s Address:%s\n", contact.getName(), contact.getNumber(), contact.getEmail(), contact.getAddress());
        }

    }

}
