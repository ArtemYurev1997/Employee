package by.pvt.workers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
        public static void main(String[] args) {
            Employee employee1 = new Employee(1, "Gena", "Bukin", 37);
            Employee employee2 = new Employee(2, "Slava", "Marlow", 22);
            Employee employee3 = new Employee(3, "Alisher", "Morgenshtern", 23);
            Employee employee4 = new Employee(4, "Kevin", "Dark", 35);
            Employee employee5 = new Employee(5, "John", "Snow", 39);
            Employee employee6 = new Employee(6, "Olaf", "Tor", 45);
            Employee employee7 = new Employee(7, "Nick", "Jonson", 30);
            Employee employee8 = new Employee(8, "Alex", "Mason", 27);
            List<Employee> list = new ArrayList<>();
            list.add(employee1);
            list.add(employee2);
            list.add(employee3);
            list.add(employee4);
            list.add(employee5);
            list.add(employee6);
            list.add(employee7);
            list.add(employee8);

            Map<Employee, String> mapka = new HashMap<>();
            mapka.put(employee1, "employee");
            mapka.put(employee2, "employee");
            mapka.put(employee3, "employee");
            mapka.put(employee4, "employee");
            mapka.put(employee5, "employee");
            mapka.put(employee6, "employee");
            mapka.put(employee7, "employee");
            mapka.put(employee8, "employee");
            System.out.println(mapka);

            Map<String, List<Employee>> inverseMap = new HashMap<>();
            for(Map.Entry<Employee, String> entry: mapka.entrySet()) {
                inverseMap.put(entry.getValue(), list);
            }
            System.out.println(inverseMap);
        }
}
