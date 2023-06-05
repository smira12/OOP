package hw6_java_OOP.DIP;

import java.util.List;

public class PrintReport2 implements ReportOutput{
    public void printAll(List<ReportItem> items) {

    }

    @Override
    public void output(List<ReportItem> items) {
        printAll(items);
    }
}
