package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.applovin.exoplayer2.b.d0;
import com.applovin.exoplayer2.m.q;
import d6.g0;
import j5.u;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DrmSessionEventListener.java */
/* loaded from: classes2.dex */
public interface e {

    /* compiled from: DrmSessionEventListener.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f19977a;

        /* renamed from: b, reason: collision with root package name */
        public final u.b f19978b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0231a> f19979c;

        /* compiled from: DrmSessionEventListener.java */
        /* renamed from: com.google.android.exoplayer2.drm.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0231a {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f19980a;

            /* renamed from: b, reason: collision with root package name */
            public final e f19981b;

            public C0231a(Handler handler, e eVar) {
                this.f19980a = handler;
                this.f19981b = eVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a() {
            Iterator<C0231a> it = this.f19979c.iterator();
            while (it.hasNext()) {
                C0231a next = it.next();
                g0.N(next.f19980a, new o4.a(this, next.f19981b, 1));
            }
        }

        public final void b() {
            Iterator<C0231a> it = this.f19979c.iterator();
            while (it.hasNext()) {
                C0231a next = it.next();
                g0.N(next.f19980a, new e0.g(8, this, next.f19981b));
            }
        }

        public final void c() {
            Iterator<C0231a> it = this.f19979c.iterator();
            while (it.hasNext()) {
                C0231a next = it.next();
                g0.N(next.f19980a, new d0(5, this, next.f19981b));
            }
        }

        public final void d(int i10) {
            Iterator<C0231a> it = this.f19979c.iterator();
            while (it.hasNext()) {
                C0231a next = it.next();
                g0.N(next.f19980a, new o4.b(this, next.f19981b, i10));
            }
        }

        public final void e(Exception exc) {
            Iterator<C0231a> it = this.f19979c.iterator();
            while (it.hasNext()) {
                C0231a next = it.next();
                g0.N(next.f19980a, new q(this, next.f19981b, exc, 1));
            }
        }

        public final void f() {
            Iterator<C0231a> it = this.f19979c.iterator();
            while (it.hasNext()) {
                C0231a next = it.next();
                g0.N(next.f19980a, new o4.a(this, next.f19981b, 0));
            }
        }

        public a(CopyOnWriteArrayList<C0231a> copyOnWriteArrayList, int i10, u.b bVar) {
            this.f19979c = copyOnWriteArrayList;
            this.f19977a = i10;
            this.f19978b = bVar;
        }
    }

    default void A(int i10, u.b bVar) {
    }

    default void B(int i10, u.b bVar) {
    }

    default void I(int i10, u.b bVar) {
    }

    default void P(int i10, u.b bVar) {
    }

    default void K(int i10, u.b bVar, int i11) {
    }

    default void N(int i10, u.b bVar, Exception exc) {
    }
}
