package com.sippar.pattern.behavioral.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
