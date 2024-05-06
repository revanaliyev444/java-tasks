package fileExample;

public class Student {
    private final int id;
    private final String name;
    private final String surname;
    private final int age;

    public Student(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(id)
                .append(',')
                .append(name)
                .append(',')
                .append(surname)
                .append(',')
                .append(age)
                .toString();
    }

    public static Student fromString(String studentText){
        String[] split = studentText.split(",");

        Student student = new Student(
                Integer.parseInt(split[0]),
                split[1],
                split[2],
                Integer.parseInt(split[3])
        );

        return student;
    }
}
