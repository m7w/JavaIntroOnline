package com.github.m7w.mod02._4decomp;

import java.lang.reflect.Array;

/**
 * Вспомогательный класс для некоторых заданий этого модуля.
 */
public class RArrayGen<E> {

    private int reservedLength = 10;

    private int currentLength = 0;

    private int currentIndex = 0;

    private Object[] array;

    public RArrayGen() {

        array = new Object[reservedLength];
    }

    public RArrayGen(int size) {

        reservedLength = size;
        array = new Object[size];
    }

    public RArrayGen(E[] arr) {

        if (arr.length == 0) {
            array = new Object[reservedLength];
        } else {
            reservedLength = arr.length;
            currentLength = arr.length;
            array = new Object[reservedLength];
            System.arraycopy(arr, 0, array, 0, reservedLength);
            currentIndex = currentLength - 1;
        }
    }

    public int length() {

        return currentLength;
    }

    @SuppressWarnings("unchecked")
    public E at(int index) {

        if (index > currentIndex) {
            throw new IndexOutOfBoundsException(
                    "Индекс: " + index + " выходит за границы массива размером: " + currentLength);
        }
        return (E) array[index];
    }

    public void append(E el) {

        if (currentLength == reservedLength) {
            grow(reservedLength * 2);
        }
        array[++currentIndex] = el;
        currentLength++;
    }

    public void appendAll(RArrayGen<E> ra) {

        int newLength = currentLength + ra.length();
        if (newLength > reservedLength) {
            grow(reservedLength + newLength);
        } 
        System.arraycopy(ra.toArray(), 0, array, currentLength, ra.length());
        currentLength = newLength;
        currentIndex = currentLength - 1;
    }

    public void appendAll(E[] arr) {

        int newLength = currentLength + arr.length;
        if (newLength > reservedLength) {
            grow(reservedLength + newLength);
        } 
        System.arraycopy(arr, 0, array, currentLength, arr.length);
        currentLength = newLength;
        currentIndex = currentLength - 1;
    }

    public void insertAt(int index, E el) {

        if (index > currentIndex) {
            throw new IndexOutOfBoundsException("Индекс: " + index + " выходит за границы массива размером: " + currentLength);
        }
        int tailLength = currentLength - index;
        currentLength++;
        if (currentLength > reservedLength) {
            grow(currentLength);
        }
        System.arraycopy(array, index, array, index + 1, tailLength);
        array[index] = el;
        currentIndex++;
    }

    public void insertAt(int index, RArrayGen<E> rArr) {

        if (index > currentIndex) {
            throw new IndexOutOfBoundsException("Индекс: " + index + " выходит за границы массива размером: " + currentLength);
        }
        Object[] arr = rArr.toArray();
        int tailLength = currentLength - index;
        currentLength = currentLength + arr.length;
        if (currentLength > reservedLength) {
            grow(currentLength);
        }
        System.arraycopy(array, index, array, index + arr.length, tailLength);
        System.arraycopy(arr, 0, array, index, arr.length);
        currentIndex = currentLength - 1;
    }

    public void insertAt(int index, E[] arr) {

        if (index > currentIndex) {
            throw new IndexOutOfBoundsException("Индекс: " + index + " выходит за границы массива размером: " + currentLength);
        }
        int tailLength = currentLength - index;
        currentLength = currentLength + arr.length;
        if (currentLength > reservedLength) {
            grow(currentLength);
        }
        System.arraycopy(array, index, array, index + arr.length, tailLength);
        System.arraycopy(arr, 0, array, index, arr.length);
        currentIndex = currentLength - 1;
    }

    public Object[] toArray() {

        if (currentLength < reservedLength) {
            trim(currentLength);
        }
        return array;
    }
    
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] arr) {

        int length = arr.length;
        if (currentLength <= length) {
            System.arraycopy(array, 0, arr, 0, currentLength);
            for (int i = currentLength; i < length; i++)
                arr[i] = null;
            return arr;
        }
        T[] arr1 = (T[]) Array.newInstance(arr.getClass().getComponentType(), currentLength);
        System.arraycopy(array, 0, arr1, 0, currentLength);
        return arr1;
    }

    private void trim(int length) {

        if (length < reservedLength) {
            Object[] tmpArray = new Object[length];
            System.arraycopy(array, 0, tmpArray, 0, length);
            reservedLength = length;
            array = tmpArray;
        }
    }

    private void grow(int length) {

        Object[] tmpArray = new Object[length];
        System.arraycopy(array, 0, tmpArray, 0, reservedLength);
        reservedLength = length;
        array = tmpArray;
    }
}
