public class Notebook {
    String weight;
    int price;

    public Notebook(String weight, int price) {
        this.weight = weight;
        this.price = price;
    }
    public void checkPrice(){
        if (this.price < 900) {
            System.out.println("Ten notebook jest tani");
        } else {
            System.out.println("Ten notebook jest dość drogi");
            }
        }
    }

