package hw6_java_OOP.DIP;

public class Program {
    // (2 задание ) Доработать самостоятельно
    public static void main(String[] args) {

        Report report = new Report(new PrintReport());
        report.calculate();
        report.output();
    }
}
