public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("Ten notebook jest bardzo tani");
        } else if (this.price <= 1000) {
            System.out.println("Cena jest dobra.");
        } else if (this.price > 1100) {
            System.out.println("Ten notebook jest drogi.");

        }
    }
    public void checkWeight(){
        if (this.weight.equals ("600g")){
            System.out.println("Dane urządzenie jest lekkie");

        }else if (this.weight.equals("1600")){
            System.out.println("Dane urządządznie nie zbyt ciężkie");

        }else if (this.weight.equals("2000")){
            System.out.println("Dane urządzenie bardzo ciężkie");
        }
    }

    public void checkYearAndPrice(){
        if (this.year < 2018 && this.price >= 600 && this.price <= 1000) {
            System.out.println("Ten komputer jest stary i ma umiarkowaną cenę");

        }else if (this  .year > 2018 && this.price >= 600  && this.price > 1000) {
            System.out.println("Ten komputer jest nowy i w umiarkowanej cenie");

        }else if (this.year < 2018 && this.price > 600 ){
            System.out.println("Ten komputer jest stary i tani");

        }else if (this.year > 2018 && this.price > 600) {
            System.out.println("Ten komputer jest nowy i tani");

        }if (this.year> 2018 && this.price < 1000){
            System.out.println("Ten komputer jest nowy i drogi");

        }
    }
}
