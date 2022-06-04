public class Application {
    String name;
    double age;
    double height;

    public Application (String name,double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void chekUser(){
        if (name!= null){
            if (age> 30 && height > 160){
                System.out.println("Użytkownik ma więcej niż 30 lat i więcej niż 160 cm");
            }else {
                System.out.println("Użytkownik ma 30 (lub mniej) lub 160 cm (lub mniej)");
            }
        }
    }
    public static void main(String[] args) {
        Application application = new Application("Adam",40 ,160);
        application.chekUser();
    }
}