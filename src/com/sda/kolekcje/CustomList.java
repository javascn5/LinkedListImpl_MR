package com.sda.kolekcje;

public interface CustomList<E> {

    public E get(int index);
    public void add(E e);
    public int size();
}
