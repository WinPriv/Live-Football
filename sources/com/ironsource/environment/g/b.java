package com.ironsource.environment.g;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class b<T> {

    /* loaded from: classes2.dex */
    public static final class a<T> extends b<T> {

        /* renamed from: a, reason: collision with root package name */
        public Callable<T> f24683a;

        public a(Callable<T> callable) {
            super(0);
            this.f24683a = callable;
        }
    }

    /* renamed from: com.ironsource.environment.g.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0324b<T> extends b<T> {

        /* renamed from: a, reason: collision with root package name */
        public T f24684a;

        public C0324b(T t10) {
            super(0);
            this.f24684a = t10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T> extends b<T> {

        /* renamed from: a, reason: collision with root package name */
        public Callable<T> f24685a;

        /* renamed from: b, reason: collision with root package name */
        public Exception f24686b;

        public c(Callable<T> callable, Exception exc) {
            super(0);
            this.f24685a = callable;
            this.f24686b = exc;
        }
    }

    private b() {
    }

    public /* synthetic */ b(int i10) {
        this();
    }
}
