package com.github.gfx.helium.widget;

import android.support.annotation.NonNull;
import android.view.View;

public interface OnItemClickListener<T> {

    void onItemClick(@NonNull View view, T item);
}
