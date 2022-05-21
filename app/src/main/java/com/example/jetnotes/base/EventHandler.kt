package com.example.jetnotes.base

interface EventHandler<T> {
    fun obtainEvent(event: T)
}