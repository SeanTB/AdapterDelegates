package com.hannesdorfmann.adapterdelegates4

interface ItemsCommittedCallback<T> {
    fun onCommitted(committedItems: List<T>?)
}