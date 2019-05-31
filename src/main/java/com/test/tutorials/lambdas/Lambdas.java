package com.test.tutorials.lambdas;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

    public static void main (String args []){

        // method reference
        // We know the Input is Word and It goes to the String Utils , so we ignore it
        List<String> messages = Arrays.asList("hi","i","am","here");
        messages.forEach(word ->StringUtils.capitalize(word));
        messages.forEach(StringUtils::capitalize);


        List<Integer> numbers = Arrays.asList(1,9,4,2,7);


        // Use an Inner Class Implementation and Pass that to Sorted Method
        Comparator aComp = new IntegerComparator();
        numbers.stream().sorted(aComp);


        // Use Inner Class Method to compare the Objects , long form of Lambdas
        // We know sorted method will return 2 parameters and will expect Integer as an Output
        // How do we know that sorted acceots 2 parameter -> the contract is defined in the method parameter Comparator -> functional Interface of sorted Interface
        numbers.stream().sorted((a,b)-> aComp.compare(a,b));



        // Use Anonymous inner class to implement the sorted method
        numbers.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1.compareTo(o2);
            }
        });


        // Use Method Reference to implement the sorted method
        // Note here Integer has to do nothing with the Comparator Interface
        // All it does is , it access two parms as input and returns and int so Sorted does'nt complain
        numbers.stream().sorted(Integer::compareTo);



        // Use Method Reference to implement the sorted method
        // We are just going to use some random method to pass to sorted , which just accepts 2 parms and returns an int
        numbers.stream().sorted(LambdaCompare::xyz);


        // Using Constructors in the lambdas to initialize the Class
        List<String> bikeBrands = Arrays.asList("Giant", "Scott", "Trek", "GT");
        bikeBrands.stream().map(bike -> new Bicycle(bike));

    }

    public static class IntegerComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;

            return i1.compareTo(i1);
        }
    }
}
