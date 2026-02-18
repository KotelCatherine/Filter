package ru.itk.filter;

public class UpperCaseImplFilter implements Filter<String> {

    @Override
    public String apply(String o) {
        return o.toUpperCase();
    }

}
