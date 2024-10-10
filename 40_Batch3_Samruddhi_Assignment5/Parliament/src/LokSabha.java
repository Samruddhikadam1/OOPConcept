/**
 *  author: Samruddhi Kadam
 *  roll no: 2441
 *  Title: Parliament of India
 *  Start Date: 26 September 2024
 *  Modified Date: 6 October 2024
 *  Description: This program shows the functionality and working of the Parliament of India
 *  and performs various operations related to managing and displaying members.
 */
public class LokSabha extends House {

    public LokSabha() {
        super("Lok Sabha");
    }

    @Override
    public void displayDetails() {
        System.out.println("Lok Sabha: House of the People");
        System.out.println("Total members: 543");
        System.out.println("Term: 5 years");
        System.out.println("Presiding Officer: Speaker\n");
    }
}