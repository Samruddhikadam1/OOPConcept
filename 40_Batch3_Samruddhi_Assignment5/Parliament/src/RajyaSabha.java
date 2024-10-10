/**
 *  author: Samruddhi Kadam
 *  roll no: 2441
 *  Title: Parliament of India
 *  Start Date: 26 September 2024
 *  Modified Date: 6 October 2024
 *  Description: This program shows the functionality and working of the Parliament of India
 *  and performs various operations related to managing and displaying members.
 */
public class RajyaSabha extends House {

    public RajyaSabha() {
        super("Rajya Sabha");
    }

    @Override
    public void displayDetails() {
        System.out.println("Rajya Sabha: Council of States");
        System.out.println("Total members: 250");
        System.out.println("Term: 6 years");
        System.out.println("Presiding Officer: Vice President\n");
    }
}