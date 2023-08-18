public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 60; //в килограммах
        double height = 1.6; //в метрах
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}