package entity;

public class Student {


    private String id;
    private String name;
    private String dbSource;

    public Student() {
    }

    public Student(String id, String name, String dbSource) {
        this.id = id;
        this.name = name;
        this.dbSource = dbSource;
    }

    public String getId() {
        return id;
    }

    public Student setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    //开启链式赋值的条件
    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getDbSource() {
        return dbSource;
    }

    //开启链式赋值的条件
    public Student setDbSource(String dbSource) {
        this.dbSource = dbSource;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dbSource='" + dbSource + '\'' +
                '}';
    }
}
