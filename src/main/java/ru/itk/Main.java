package ru.itk;

import ru.itk.filter.PositiveIntegerImplFilter;
import ru.itk.filter.UpperCaseImplFilter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] array = {1, -1, 2, 0};

        ArrayFilter arrayFilter = new ArrayFilter();
        Integer[] filter1 = arrayFilter.filter(array, PositiveIntegerImplFilter.class);

        String[] strArray = {"Hello", "First", "min"};
        String[] filter2 = arrayFilter.filter(strArray, UpperCaseImplFilter.class);

        System.out.println(Arrays.toString(filter1)); //[1, 2]
        System.out.println(Arrays.toString(filter2)); //["HELLO", "FIRST", "MIN"]

    }
}