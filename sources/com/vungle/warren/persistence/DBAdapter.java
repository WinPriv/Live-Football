package com.vungle.warren.persistence;

import android.content.ContentValues;

/* loaded from: classes2.dex */
public interface DBAdapter<T> {
    T fromContentValues(ContentValues contentValues);

    String tableName();

    ContentValues toContentValues(T t10);
}
