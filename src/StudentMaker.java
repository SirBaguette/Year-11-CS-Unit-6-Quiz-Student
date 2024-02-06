public class StudentMaker {
  
  public static void main(String[] args) {
    Address ad = new Address("Causeway Bay", "Tung Lo Wan Road", 180);
    Student st = new Student(17, "Belinda", "Yu", 12, ad);
    st.setFirstName("Bella");
    System.out.println(st.getAge());
    int age = st.birthday();
    System.out.println(age);
    System.out.println(st.toString());
  }
  
}
