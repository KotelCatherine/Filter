package ru.itk.filter;

public class PositiveIntegerImplFilter implements Filter<Integer> {

    @Override
    public Integer apply(Integer o) {
        return o <= 0 ? null : o;
    }

}
