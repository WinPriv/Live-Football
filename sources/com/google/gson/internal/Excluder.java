package com.google.gson.internal;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m8.a0;
import m8.b0;
import m8.i;
import n8.c;
import n8.d;
import s8.b;

/* loaded from: classes2.dex */
public final class Excluder implements b0, Cloneable {

    /* renamed from: x, reason: collision with root package name */
    public static final Excluder f21314x = new Excluder();

    /* renamed from: s, reason: collision with root package name */
    public final double f21315s = -1.0d;

    /* renamed from: t, reason: collision with root package name */
    public final int f21316t = 136;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f21317u = true;

    /* renamed from: v, reason: collision with root package name */
    public final List<m8.a> f21318v = Collections.emptyList();

    /* renamed from: w, reason: collision with root package name */
    public final List<m8.a> f21319w = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class a<T> extends a0<T> {

        /* renamed from: a, reason: collision with root package name */
        public a0<T> f21320a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f21321b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f21322c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f21323d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r8.a f21324e;

        public a(boolean z10, boolean z11, i iVar, r8.a aVar) {
            this.f21321b = z10;
            this.f21322c = z11;
            this.f21323d = iVar;
            this.f21324e = aVar;
        }

        @Override // m8.a0
        public final T a(s8.a aVar) throws IOException {
            if (this.f21321b) {
                aVar.l0();
                return null;
            }
            a0<T> a0Var = this.f21320a;
            if (a0Var == null) {
                a0Var = this.f21323d.h(Excluder.this, this.f21324e);
                this.f21320a = a0Var;
            }
            return a0Var.a(aVar);
        }

        @Override // m8.a0
        public final void b(b bVar, T t10) throws IOException {
            if (this.f21322c) {
                bVar.j();
                return;
            }
            a0<T> a0Var = this.f21320a;
            if (a0Var == null) {
                a0Var = this.f21323d.h(Excluder.this, this.f21324e);
                this.f21320a = a0Var;
            }
            a0Var.b(bVar, t10);
        }
    }

    public static boolean d(Class cls) {
        boolean z10;
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        if ((cls.getModifiers() & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            return false;
        }
        return true;
    }

    @Override // m8.b0
    public final <T> a0<T> a(i iVar, r8.a<T> aVar) {
        boolean z10;
        boolean z11;
        Class<? super T> rawType = aVar.getRawType();
        boolean b10 = b(rawType);
        if (!b10 && !c(rawType, true)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!b10 && !c(rawType, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return null;
        }
        return new a(z11, z10, iVar, aVar);
    }

    public final boolean b(Class<?> cls) {
        boolean z10;
        if (this.f21315s != -1.0d && !e((c) cls.getAnnotation(c.class), (d) cls.getAnnotation(d.class))) {
            return true;
        }
        if (!this.f21317u) {
            boolean z11 = false;
            if (cls.isMemberClass()) {
                if ((cls.getModifiers() & 8) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    z11 = true;
                }
            }
            if (z11) {
                return true;
            }
        }
        return d(cls);
    }

    public final boolean c(Class<?> cls, boolean z10) {
        List<m8.a> list;
        if (z10) {
            list = this.f21318v;
        } else {
            list = this.f21319w;
        }
        Iterator<m8.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() throws CloneNotSupportedException {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean e(c cVar, d dVar) {
        boolean z10;
        boolean z11;
        double d10 = this.f21315s;
        if (cVar != null && d10 < cVar.value()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        if (dVar != null && d10 >= dVar.value()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return false;
        }
        return true;
    }
}
