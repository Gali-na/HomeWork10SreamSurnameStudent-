import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String nameGroup;

    public Student(String name, String surname, int age, String nameGroup) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nameGroup = nameGroup;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name) &&
                surname.equals(student.surname) &&
                nameGroup.equals(student.nameGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, nameGroup);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", nameGroup='" + nameGroup + '\'' +
                '}';
    }
}
