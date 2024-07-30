package com.ironsource.sdk.controller;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f26096a = a.f26098a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f26097b = new ArrayList();

    /* JADX WARN: Enum class init method not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f26098a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f26099b = 2;
    }

    public b(String str) {
    }

    public final synchronized void a() {
        this.f26096a = a.f26099b;
    }

    public final synchronized void b() {
        this.f26096a = a.f26098a;
    }

    public final synchronized void c() {
        Object[] array = this.f26097b.toArray();
        for (int i10 = 0; i10 < array.length; i10++) {
            ((Runnable) array[i10]).run();
            array[i10] = null;
        }
        this.f26097b.clear();
    }

    public final synchronized void a(Runnable runnable) {
        if (this.f26096a != a.f26099b) {
            this.f26097b.add(runnable);
        } else {
            runnable.run();
        }
    }
}
