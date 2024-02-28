package IB_QUESTIONS.src.university;

public class Professor extends Person implements GradingSystem {
    int officeHours;

    public void calculateGrade() {
    }

    public void updateTranscript() {
    }

    public Professor(int officeHours, int Date_Of_Birth, String name,
              String address, String phoneNumber) {
        this.officeHours = officeHours;
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.Date_Of_Birth = Date_Of_Birth;
    }

    @Override
    public String toString() {
         return name;
//        return String.format("Professor Information: \nname: %s, phone number: %s, age: %d, office hours: %d",
//                name, phoneNumber, age, officeHours);
    }
}
