public class CLass1 {
    String name;
    int age;

    public CLass1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CLass1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
