package Nested_Classes_Local_Types_Anonymous_Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Challlenge {

    // 1. Record: Sadece veri taşıyacak kutumuz
    record Employee(String firstName, String lastName, String hireDate) {}

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        
        // Elemanları listeye ekliyoruz
        list.add(new Employee("Hakan", "Gündoğ", "27.07.2026"));
        list.add(new Employee("Henry", "Cavill", "12.08.2026"));
        list.add(new Employee("Alan", "Ritchson", "13.08.2023")); // Yılını 2023 yaptık ki kıyaslayabilelim

        // Metodumuzu çağırıyoruz
        method(list);
    }

    public static void method(List<Employee> list) {

        // =======================================================
        // LOCAL CLASS: Yardımcı Sınıfımız (Metodun İÇİNDE)
        // =======================================================
        class Wrapper {
            private Employee employee;

            public Wrapper(Employee employee) {
                this.employee = employee;
            }

            public String getFullName() {
                return employee.firstName() + " " + employee.lastName();
            }

            public int getYearsWorked() {
                // "27.07.2023" formatından yılı çekiyoruz
                int year = Integer.parseInt(employee.hireDate().substring(6));
                return 2026 - year; // İçinde bulunduğumuz yıl
            }

            public Employee getEmployee() {
                return employee;
            }
        }

        // 1. İşlem: Employee listesini Wrapper listesine dönüştürelim
        List<Wrapper> wrapperList = new ArrayList<>();
        for (Employee e : list) {
            wrapperList.add(new Wrapper(e));
        }

        // =======================================================
        // ANONYMOUS CLASS: İsimsiz Comparator ile İsmine Göre Sıralama
        // =======================================================
        Collections.sort(wrapperList, new Comparator<Wrapper>() {
            @Override
            public int compare(Wrapper w1, Wrapper w2) {
                // Wrapper içindeki getFullName() metodunu kullanıyoruz!
                return w1.getFullName().compareTo(w2.getFullName());
            }
        });

        System.out.println("--- İsmine Göre Alfabetik Sıralı ---");
        for (Wrapper w : wrapperList) {
            System.out.println(w.getFullName() + " - Çalıştığı Yıl: " + w.getYearsWorked());
        }

        // =======================================================
        // ANONYMOUS CLASS: Çalıştığı Yıla Göre Sıralama
        // =======================================================
        Collections.sort(wrapperList, new Comparator<Wrapper>() {
            @Override
            public int compare(Wrapper w1, Wrapper w2) {
                // Çalıştığı yıla göre büyükten küçüğe sıralayalım
                return Integer.compare(w2.getYearsWorked(), w1.getYearsWorked());
            }
        });

        System.out.println("\n--- Çalıştığı Yıla Göre Sıralı (Çoktan Aza) ---");
        for (Wrapper w : wrapperList) {
            System.out.println(w.getFullName() + " - " + w.getYearsWorked() + " yıl");
        }
    }
}