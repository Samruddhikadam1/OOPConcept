/**
 *  author: Samruddhi Kadam
 *  roll no: 2441
 *  Title: Parliament of India
 *  Start Date: 26 September 2024
 *  Modified Date: 6 October 2024
 *  Description: This program shows the functionality and working of the Parliament of India
 *  and performs various operations related to managing and displaying members.
 */
import java.util.ArrayList;

public class Parliament {
    private ArrayList<Member> members = new ArrayList<>();

    public void addMember(String name, House house) {
        members.add(new Member(name, house));
        System.out.println("Member added successfully.\n");
    }

    public void listMembers() {
        if (members.isEmpty()) {
            System.out.println("No members are added ;)");
        } else {
            System.out.println("List of Members:");
            for (Member member : members) {
                System.out.println("Name: " + member.getName() + " | House: " + member.getHouse().name);
            }
        }
    }

    public void updateMember(String name, String newName, House newHouse) {
        Member member = findMember(name);
        if (member != null) {
            member.updateDetails(newName, newHouse);
            System.out.println("Member details updated successfully.");
        } else {
            System.out.println("Member not found.");
        }
    }

    public void deleteMember(String name) {
        Member member = findMember(name);
        if (member != null) {
            members.remove(member);
            System.out.println("Member deleted successfully.");
        } else {
            System.out.println("Member not found.");
        }
    }

    private Member findMember(String name) {
        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                return member;
            }
        }
        return null;
    }

    public void displayLokSabhaDetails() {
        House lokSabha = new LokSabha();
        lokSabha.displayDetails();
    }

    public void displayRajyaSabhaDetails() {
        House rajyaSabha = new RajyaSabha();
        rajyaSabha.displayDetails();
    }
}