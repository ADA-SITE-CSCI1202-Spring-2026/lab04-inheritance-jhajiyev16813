public class Person {

    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return firstName + " " + lastName + " (" + gender + ")";
    }

    public boolean equals(Person p) {
        if (p == null) return false;

        return this.firstName.equals(p.firstName)
                && this.lastName.equals(p.lastName)
                && this.gender.equals(p.gender);
    }
}

class Teacher extends Person {

    private String department;
    private String courses;

    public Teacher(String firstName, String lastName, String gender,
                   String department, String courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public String getCourses() {
        return courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String toString() {
        return super.toString() + " - " + department + " [" + courses + "]";
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;

        return super.equals(t)
                && this.department.equals(t.department)
                && this.courses.equals(t.courses);
    }
}

class Student extends Person {

    private String studentId;

    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return super.toString() + " - StudentID: " + studentId;
    }

    public boolean equals(Student s) {
        if (s == null) return false;

        return super.equals(s)
                && this.studentId.equals(s.studentId);
    }
}