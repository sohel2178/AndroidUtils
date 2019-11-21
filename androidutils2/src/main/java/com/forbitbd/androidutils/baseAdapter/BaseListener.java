package com.forbitbd.androidutils.baseAdapter;

public interface BaseListener<T> {
    void onItemClick(int position);
    void onItemUpdate(int position);
    void onItemRemove(int position);
}
