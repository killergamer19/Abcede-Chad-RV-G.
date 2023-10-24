/*Chad RV G. Abcede
  BSIT-2B
*/

import java.util.Date;

public class Person {
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private Date birthday;
  private String address;

  // Constructors
  public Person() {
    // Default constructor
  }

  public Person(String firstName, String middleName, String lastName, int age,
      Date birthday, String address) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.age = age;
    this.birthday = birthday;
    this.address = address;
  }

  // Getters and Setters for attributes
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  
  public static void main(String[] args) {
    Person person = new Person("Chad RV", "Galamiton", "Abcede", 20, new Date("July 24 2003"),
        "Prk 3 Gabi, Ubay, Bohol");

    System.out.println("First Name: " + person.getFirstName());
    System.out.println("Middle Name: " + person.getMiddleName());
    System.out.println("Last Name: " + person.getLastName());
    System.out.println("Age: " + person.getAge());
    System.out.println("Birthday: " + person.getBirthday());
    System.out.println("Address: " + person.getAddress());
  }
}
