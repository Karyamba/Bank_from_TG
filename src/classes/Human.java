package classes;

public class Human {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected int documentId;

    public Human(String firstName, String lastName, int age, int documentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.documentId = documentId;
    }

    @Override
    public String toString() {
        return "Document: \n" +
                "First name:  " + firstName + '\n' +
                "Last name:   " + lastName + '\n' +
                "Age:         " + age + '\n' +
                "Document Id: " + documentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentsId) {
        this.documentId = documentsId;
    }
}
