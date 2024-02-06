public class Student {
    int age;
    int year;
    String firstName;
    String lastName;
    Address address;
    public Student(int i, String fn, String ln, int a, Address d) {
        age = i;
        firstName = fn;
        lastName = ln;
        year = a;
        address = d;
    }
    public int getAge() {
        return age;
    }
    public int getYear() {
        return year;
    }
    public void setFirstName(String a){
        firstName = a;
    }
    public void setLastName(String a) {
        lastName = a;
    }
    public void setAger(int i) {
        age = i;
    }
    public void setYear(int i) {
        year = i;
    }
    public void setAddress(Address a) {
        address = a;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Address getAddress(){
        return address;
    }
    private void addOneAge(){
        age++;
    }
    public int birthday() {
        addOneAge();
        return age;
    }
    @Override
    public String toString(){
        return firstName + " " + lastName + ", age " + age + ", year " + year+  ", "+ address.toString();
    }
}
