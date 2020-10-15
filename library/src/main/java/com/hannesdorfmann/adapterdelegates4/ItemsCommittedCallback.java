package com.hannesdorfmann.adapterdelegates4;

import java.util.List;

interface ItemsCommittedCallback<T> {
    void onCommitted(List<T> committedItems);
}
