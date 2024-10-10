/**
 *  author: Samruddhi Kadam
 *  roll no: 2441
 *  Title: Parliament of India
 *  Start Date: 26 September 2024
 *  Modified Date: 6 October 2024
 *  Description: This program shows the functionality and working of the Parliament of India
 *  and performs various operations related to managing and displaying members.
 */
public class Member {
    private String name;
    private House house;

    public Member(String name, House house) {
        this.name = name;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void updateDetails(String name, House house) {
        setName(name);
        setHouse(house);
    }
}