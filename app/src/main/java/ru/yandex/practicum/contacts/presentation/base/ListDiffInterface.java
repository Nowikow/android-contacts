package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    boolean theSameAs(T newItem); //сравнение объектов с указанием типа T

    @Override
    boolean equals(Object object); //обязательный к реализации метод с возможностью переопределения
}
