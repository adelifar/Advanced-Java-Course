package com.tosinso;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Integer> integerStream=Stream.of(1,2,3,4,5,6,7,8,9);
       // System.out.println( integerStream.reduce((i, j) ->i+j ));
        System.out.println(integerStream.reduce(Integer::sum));
        //5+(6+3)==(5+6)+3
        System.out.println((6-(3-2)));
        System.out.println(((6-3)-2));
        //int long double char byte short
        //IntStream LongStream CharStream
        IntStream stream=IntStream.of(1,2,3,4,5,6,7,8,9);
        System.out.println("stream.count() = " + stream.count());
        IntStream gStream=IntStream.generate(() ->(int) (Math.random()*100));
//        gStream.forEach(value -> System.out.println(value));

        IntStream rStream =IntStream.range(0,100);
        rStream.forEach(System.out::println);

        IntStream rcStream=IntStream.rangeClosed(0,100);
        rcStream.forEach(System.out::println);

        Stream<String> planets=Stream.of("Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune");
        IntStream planetInt=planets.mapToInt(v->v.length());
//        System.out.println(Arrays.toString( planetInt.toArray()));
        Stream<Integer> streamPlanetLength=planetInt.boxed();
//        OptionalInt
        Stream<Integer> parallelIntegerStream= streamPlanetLength.parallel();
        Stream<String> planets2=Stream.of("Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune");
        int[] shortWords=new int[7];
        Stream<String> parallelPlanets= planets2.parallel();
        parallelPlanets.forEach(s->{if (s.length()<7)shortWords[s.length()]++;});
        System.out.println("shortWords = " +Arrays.toString( shortWords));
        //race condition
    }
}
