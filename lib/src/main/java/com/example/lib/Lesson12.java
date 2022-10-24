package com.example.lib;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson12 {
    public static void main(String[] args) {
        Stream streamGenerate = Stream.generate(()-> "hello world").limit(100);
        System.out.println(streamGenerate.collect(Collectors.toList()));

        IntStream intStream = IntStream.range(1,11);
        System.out.println(Arrays.toString(intStream.toArray()));

//Stream streamFilter = Stream.of("apple", "banana", "kiwi").filter(
//        element -> element.contains("a")
//);
//        System.out.println(streamFilter.findFirst());


//        Stream streamFilter2 = Stream.of("apple", "banana", "kiwi").skip(2);
//        System.out.println(streamFilter2.collect(Collectors.toList()));

//        Stream streamFilter3 = Stream.of("apple", "banana", "kiwi", "apple").distinct();
//        System.out.println(streamFilter3.collect(Collectors.toList()));

//        Stream<String> streamMap = Stream.of("apple", "banana", "kiwi", "apple");
//        String mappedString = streamMap.map(Object::toString).collect(Collectors.joining("||"));
//        System.out.println(mappedString);

//        Stream<String> streamMap2 = Stream.of("apple", "banana", "kiwi", "apple");
//        String mappedString2 = streamMap2.map(element -> element + " mapped")
//                .collect(Collectors.joining(" "));
//        System.out.println(mappedString2);



        Stream<String> streamMap3 = Stream.of("apple", "banana", "kiwi", "apple");
        String mappedString3 = streamMap3.map(String::toUpperCase)
                .collect(Collectors.joining(" "));
        System.out.println(mappedString3);


    }
}

