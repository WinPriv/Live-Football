package com.anythink.core.common.c;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    protected b f5272a;

    public a(b bVar) {
        this.f5272a = bVar;
    }

    public final synchronized SQLiteDatabase a() {
        return this.f5272a.a();
    }

    public final synchronized SQLiteDatabase b() {
        return this.f5272a.b();
    }
}
