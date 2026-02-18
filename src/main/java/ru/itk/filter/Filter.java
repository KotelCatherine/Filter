package ru.itk.filter;

public interface Filter<T> {
    T apply(T o);
}
