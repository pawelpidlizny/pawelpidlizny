public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;

    }
    public int getAge() {
        return this.age;

    }
    public int averageAge() {
        return this.age;
    }
    public static void main(String[] args) {
        User magda = new User("Magda", 8);
        User irena = new User("Irena", 10);
        User amelia = new User("Amelia", 30);
        User dawid = new User("Dawid", 35);

        User[] users = {magda, irena, amelia, dawid,};
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getName());
        }
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].getAge();
            System.out.println(users[i].averageAge());
        }
    }
}