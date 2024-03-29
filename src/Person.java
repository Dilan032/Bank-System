public class Person {
    private String fullName;
    private String birthDay;
    private String address;
    double roughIncome = 0;

    public Person(String name, String dob, String address){
        this.fullName = name;
        this.birthDay = dob;
        this.address  = address;

    }

    public double getRoughIncome() {
        return roughIncome;
    }

    public void setRoughIncome(double roughIncome) {
        this.roughIncome = roughIncome;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
