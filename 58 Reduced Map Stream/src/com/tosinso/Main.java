package com.tosinso;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;
public class Main {
    public static class PersonCountry{
        private String name;
        private String country;
        private int age;

        public PersonCountry(String name, String country, int age) {
            this.name = name;
            this.country = country;
            this.age = age;
        }

        public PersonCountry(String name, String country) {
            this.name = name;
            this.country = country;
        }

        public PersonCountry() {
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "PersonCountry{" +
                    "name='" + name + '\'' +
                    ", country='" + country + '\'' +
                    ", age=" + age +
                    "}\n";
        }
    }
    public static Stream<PersonCountry> personCountryStream(){
        return Stream.of(new PersonCountry("Mehdi","Iran",20)
                ,new PersonCountry("Bill","USA",15),
                new PersonCountry("John","UK",45),
                new PersonCountry("Chang","China",33),
                new PersonCountry("Khan","India",28),
                new PersonCountry("Pouyan","Iran",74),
                new PersonCountry("Jack","USA",41));
    }
    public static void main(String[] args) {
        //list set
        Map<String, Set<PersonCountry>> personSets=personCountryStream()
                .collect(groupingBy(PersonCountry::getCountry,toSet()));
        System.out.println("personSets = " + personSets);
        Map<String,Long> count=personCountryStream()
                .collect(groupingBy(PersonCountry::getCountry,counting()));
        System.out.println("count = " + count);
        Map<String,Integer> sumAges=personCountryStream()
                .collect(groupingBy(PersonCountry::getCountry,summingInt(PersonCountry::getAge)));
        System.out.println("sumAges = " + sumAges);
        Map<String, Optional<PersonCountry>> maxAges=personCountryStream()
                .collect(groupingBy(PersonCountry::getCountry,maxBy(Comparator.comparing(PersonCountry::getAge))));
        System.out.println("maxAges = " + maxAges);
        Map<String, Optional<PersonCountry>> minAges=personCountryStream()
                .collect(groupingBy(PersonCountry::getCountry,minBy(Comparator.comparing(PersonCountry::getAge))));
        System.out.println("maxAges = " + minAges);
        Map<String,Optional<String>> personCountry=personCountryStream()
                .collect(groupingBy(PersonCountry::getCountry,mapping(PersonCountry::getName,maxBy(Comparator.comparing(String::length)))));
        System.out.println("personCountry = " + personCountry);
        IntSummaryStatistics intSummaryStatistics=new IntSummaryStatistics();
        intSummaryStatistics.accept(5);
        intSummaryStatistics.accept(4);
        System.out.println("intSummaryStatistics.getCount() = " + intSummaryStatistics.getCount());
        System.out.println("intSummaryStatistics = " + intSummaryStatistics.getSum());
        Map<String,IntSummaryStatistics> personSummary=personCountryStream()
                .collect(groupingBy(PersonCountry::getCountry,summarizingInt(PersonCountry::getAge)));
        System.out.println("personSummary.get(\"Iran\").getCount() = " + personSummary.get("Iran").getCount());
        System.out.println("personSummary.get(\"Iran\").getAverage() = " + personSummary.get("Iran").getAverage());
    }
}
