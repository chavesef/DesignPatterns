package com.sippar.pattern.behavioral.iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
