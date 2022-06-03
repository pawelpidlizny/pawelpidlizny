public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600g", 500, 2017);
        System.out.println(notebook.weight + "   " + notebook.price + "   " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook("2000g", 1500, 2018);
        System.out.println(heavyNotebook.weight + "   " + heavyNotebook.price +  "   " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        notebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook("1200g", 1000, 2015);
        System.out.println(oldNotebook.weight + "   " + oldNotebook.price + "   " + oldNotebook.year);
        oldNotebook.checkPrice();
        notebook.checkWeight();
        oldNotebook.checkYearAndPrice();

    }
}
