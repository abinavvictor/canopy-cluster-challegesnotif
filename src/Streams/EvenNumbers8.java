package Streams;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import entity.Employee;

import static java.util.List.of;


public class EvenNumbers8 {

   public String  firstNonRepeating(){

       String tempStr = "ababsdedaa";

       return Arrays.stream(tempStr.split("")).filter((str ->tempStr.indexOf(str) == tempStr.lastIndexOf(str)).findFirst().orElse());



   }
    public int lastElementinArray( ){

        int [] arr = {1,2,4,5,6,78};

        Integer lastelem =   Arrays.stream(arr).boxed().reduce((first,last) -> last).orElse(-1)


    }
    public List<Integer> evenNumbers(List<Integer> list){

      return  list.stream().filter(n-> n%2 ==0).collect(Collectors.toList());


    }

    public List<String> upperCaseConv(List<String> strlist){

        return strlist.stream().map(String::toUpperCase).collect(Collectors.toList());
    }


    public Optional<Integer> firstElemGreaterThanFifty(List<Integer> list){

        return list.stream().filter(n-> n> 50).findFirst();
    }

    public Map<String, List<Employee>> groupByDepartment(){

        List<Employee>  empList =  List.of((Employee) of(
                new Employee("Alice", "HR", 50000 ),
                new Employee("Bob", "Engineering",70000 ),
                new Employee("Charlie", "HR", 60000),
                new Employee("David", "Engineering", 90000 ),
                new Employee("Eva", "Finance" ,85000)
        ));

        return empList.stream().collect(Collectors.groupingBy(Employee::getDept));


    }


    public Map<String, DoubleSummaryStatistics >  numberOfEmployeeAndAverageSalary() {
        List<Employee> empList = List.of((Employee) of(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "Engineering", 70000),
                new Employee("Charlie", "HR", 60000),
                new Employee("David", "Engineering", 90000),
                new Employee("Eva", "Finance", 85000)
        ));

        return empList.stream().collect(Collectors.groupingBy(
                 Employee::getDept, Collectors.summarizingDouble(Employee::getSalary)
        ));




    }



}
