package hw7_java_OOP;

public interface Observer {
    void receiveOffer(String companyName, double salary);

    void receiveVacancy(Job vacancy);
}
