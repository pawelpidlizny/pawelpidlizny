public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(10);
        System.out.println("Pole okręgu o promieniu 10 jest równe: " + area); //[1]

        double p = Calculator.PI;
        System.out.println("Wartość stałej pi jest równa" + p );             //[2]

        Calculator calculator2 = new Calculator();                           //[3]
        System.out.println(Calculator.counter);
        }
    }
