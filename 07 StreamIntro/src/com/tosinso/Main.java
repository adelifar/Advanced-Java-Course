package com.tosinso;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String[] wordArray={"Mehdi","Adeli","Hosein","Ahmadi","Mohammad","Nasiri"};
        List<String> words= Arrays.asList(wordArray);

        long count=0;
        count=words.stream().filter(s -> s.length()>5).count();
        System.out.println(count);

        count=words.parallelStream().filter(s->s.length()>5).count();
        System.out.println(count);

        Stream<String> words2=words.stream();

        Stream<String> words3=Stream.of(wordArray);
//        words3.forEach(System.out::println);
        System.out.println(words3.count());

        Stream<String> cars=Stream.of("BMW","Pride","Renault");
        System.out.println(cars.filter(s->s.length()>3).count());

        Stream<String> words4=Arrays.stream(wordArray,0,4);
        words4.filter(a->a.length()>2).forEach(a-> System.out.println(a));
        System.out.println(words4.count());

        Stream<String> emptyStream=Stream.empty();

        Stream<String> hellos=Stream.generate(()->"Hello");
//        hellos.forEach(System.out::println);
        Stream<Double> randomNumber=Stream.generate(Math::random);

        Stream<Integer> integerStream=Stream.iterate(4,integer -> integer+2);
//        integerStream.forEach(System.out::println);


    }
}
