package ru.itk;

import ru.itk.filter.Filter;

import java.lang.reflect.Array;

public class ArrayFilter {

    public <T> T[] filter(T[] array, Class<? extends Filter<T>> filterClass) {

        try {

            Filter<T> castFilter = filterClass.getDeclaredConstructor().newInstance();
            int count = 0;

            for (T element : array) {
                if (castFilter.apply(element) != null) {
                    count++;
                }
            }

            T element = array[0];
            T[] newArray = (T[]) Array.newInstance(element.getClass(), count);
            int newArrayIndex = 0;

            for (T t : array) {

                T filtredValue = castFilter.apply(t);

                if (filtredValue != null) {
                    newArray[newArrayIndex++] = filtredValue;
                }

            }

            return newArray;

        } catch (NoSuchMethodException ex) {
            throw new RuntimeException("Подходящий конструктор не найден!");
        } catch (Exception ex) {
            throw new RuntimeException("Не удалось создать фильтр");
        }

    }

}
