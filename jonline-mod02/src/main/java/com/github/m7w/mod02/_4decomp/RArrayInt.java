package com.github.m7w.mod02._4decomp;

/**
 * Helper class for some tasks of this module.
 */
public class RArrayInt {

    private int reservedLength = 10;

    private int currentLength = 0;

    private int currentIndex = -1;

    private int[] array;

    public RArrayInt() {

        array = new int[reservedLength];
    }

    public RArrayInt(int size) {

        reservedLength = size;
        array = new int[size];
    }

    public RArrayInt(int[] arr) {

        if (arr.length == 0) {
            array = new int[reservedLength];
        } else {
            reservedLength = arr.length;
            currentLength = arr.length;
            array = new int[reservedLength];
            System.arraycopy(arr, 0, array, 0, reservedLength);
            currentIndex = currentLength - 1;
        }
    }

    public int length() {

        return currentLength;
    }

    public int get(int index) {

        if (index > currentIndex) {
            throw new IndexOutOfBoundsException("Индекс: " + index + " выходит за границы массива размером: " + currentLength);
        }
        return array[index];
    }

    public int set(int index, int el) {

        if (index > currentIndex) {
            throw new IndexOutOfBoundsException(
                    "Индекс: " + index + " выходит за границы массива размером: " + currentLength);
        }
        int oldEl = array[index];
        array[index] = el;
        return oldEl;
    }

    public void append(int el) {

        if (currentLength == reservedLength) {
            grow(reservedLength * 2);
        }
        array[++currentIndex] = el;
        currentLength++;
    }

    public void appendAll(RArrayInt ra) {

        int newLength = currentLength + ra.length();
        if (newLength > reservedLength) {
            grow(reservedLength + newLength);
        } 
        System.arraycopy(ra.toArray(), 0, array, currentLength, ra.length());
        currentLength = newLength;
        currentIndex = currentLength - 1;
    }

    public void appendAll(int[] arr) {

        int newLength = currentLength + arr.length;
        if (newLength > reservedLength) {
            grow(reservedLength + newLength);
        } 
        System.arraycopy(arr, 0, array, currentLength, arr.length);
        currentLength = newLength;
        currentIndex = currentLength - 1;
    }

    public void insertAt(int index, int el) {

        currentIndex++;
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
    }

    public void insertAt(int index, RArrayInt rArr) {

        int[] arr = rArr.toArray();
        int tailLength = currentLength - index;
        currentLength = currentLength + arr.length;
        currentIndex = currentLength - 1;

        if (index > currentIndex) {
            throw new IndexOutOfBoundsException("Индекс: " + index + " выходит за границы массива размером: " + currentLength);
        }
        if (currentLength > reservedLength) {
            grow(currentLength);
        }
        System.arraycopy(array, index, array, index + arr.length, tailLength);
        System.arraycopy(arr, 0, array, index, arr.length);
    }

    public void insertAt(int index, int[] arr) {

        int tailLength = currentLength - index;
        currentLength = currentLength + arr.length;
        currentIndex = currentLength - 1;

        if (index > currentIndex) {
            throw new IndexOutOfBoundsException("Индекс: " + index + " выходит за границы массива размером: " + currentLength);
        }
        if (currentLength > reservedLength) {
            grow(currentLength);
        }
        System.arraycopy(array, index, array, index + arr.length, tailLength);
        System.arraycopy(arr, 0, array, index, arr.length);
    }

    public int[] toArray() {

        if (currentLength < reservedLength) {
            trim(currentLength);
        }
        return array;
    }

    private void trim(int length) {

        if (length < reservedLength) {
            int[] tmpArray = new int[length];
            System.arraycopy(array, 0, tmpArray, 0, length);
            reservedLength = length;
            array = tmpArray;
        }
    }

    private void grow(int length) {

        int[] tmpArray = new int[length];
        System.arraycopy(array, 0, tmpArray, 0, reservedLength);
        reservedLength = length;
        array = tmpArray;
    }
}
