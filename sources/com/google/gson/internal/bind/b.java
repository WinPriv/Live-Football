package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import m8.l;
import m8.n;
import m8.p;
import m8.q;
import m8.s;
import o8.r;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes2.dex */
public final class b extends s8.a {
    public static final a L = new a();
    public static final Object M = new Object();
    public Object[] H;
    public int I;
    public String[] J;
    public int[] K;

    /* compiled from: JsonTreeReader.java */
    /* loaded from: classes2.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public b(n nVar) {
        super(L);
        this.H = new Object[32];
        this.I = 0;
        this.J = new String[32];
        this.K = new int[32];
        r0(nVar);
    }

    private String P() {
        return " at path " + j(false);
    }

    private String j(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.I;
            if (i10 < i11) {
                Object[] objArr = this.H;
                Object obj = objArr[i10];
                if (obj instanceof l) {
                    i10++;
                    if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                        int i12 = this.K[i10];
                        if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                            i12--;
                        }
                        sb2.append('[');
                        sb2.append(i12);
                        sb2.append(']');
                    }
                } else if ((obj instanceof q) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                    sb2.append('.');
                    String str = this.J[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override // s8.a
    public final boolean Q() throws IOException {
        n0(8);
        boolean e10 = ((s) q0()).e();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return e10;
    }

    @Override // s8.a
    public final double S() throws IOException {
        int f02 = f0();
        if (f02 != 7 && f02 != 6) {
            throw new IllegalStateException("Expected " + com.ironsource.adapters.facebook.a.z(7) + " but was " + com.ironsource.adapters.facebook.a.z(f02) + P());
        }
        double f = ((s) p0()).f();
        if (!this.f35267t && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new s8.c("JSON forbids NaN and infinities: " + f);
        }
        q0();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return f;
    }

    @Override // s8.a
    public final int X() throws IOException {
        int f02 = f0();
        if (f02 != 7 && f02 != 6) {
            throw new IllegalStateException("Expected " + com.ironsource.adapters.facebook.a.z(7) + " but was " + com.ironsource.adapters.facebook.a.z(f02) + P());
        }
        int h10 = ((s) p0()).h();
        q0();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return h10;
    }

    @Override // s8.a
    public final long Y() throws IOException {
        int f02 = f0();
        if (f02 != 7 && f02 != 6) {
            throw new IllegalStateException("Expected " + com.ironsource.adapters.facebook.a.z(7) + " but was " + com.ironsource.adapters.facebook.a.z(f02) + P());
        }
        long l10 = ((s) p0()).l();
        q0();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return l10;
    }

    @Override // s8.a
    public final String Z() throws IOException {
        return o0(false);
    }

    @Override // s8.a
    public final void b() throws IOException {
        n0(1);
        r0(((l) p0()).iterator());
        this.K[this.I - 1] = 0;
    }

    @Override // s8.a
    public final void b0() throws IOException {
        n0(9);
        q0();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // s8.a
    public final void c() throws IOException {
        n0(3);
        r0(new r.b.a((r.b) ((q) p0()).f32942s.entrySet()));
    }

    @Override // s8.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.H = new Object[]{M};
        this.I = 1;
    }

    @Override // s8.a
    public final String d0() throws IOException {
        int f02 = f0();
        if (f02 != 6 && f02 != 7) {
            throw new IllegalStateException("Expected " + com.ironsource.adapters.facebook.a.z(6) + " but was " + com.ironsource.adapters.facebook.a.z(f02) + P());
        }
        String m10 = ((s) q0()).m();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m10;
    }

    @Override // s8.a
    public final void f() throws IOException {
        n0(2);
        q0();
        q0();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // s8.a
    public final int f0() throws IOException {
        if (this.I == 0) {
            return 10;
        }
        Object p02 = p0();
        if (p02 instanceof Iterator) {
            boolean z10 = this.H[this.I - 2] instanceof q;
            Iterator it = (Iterator) p02;
            if (it.hasNext()) {
                if (z10) {
                    return 5;
                }
                r0(it.next());
                return f0();
            }
            if (z10) {
                return 4;
            }
            return 2;
        }
        if (p02 instanceof q) {
            return 3;
        }
        if (p02 instanceof l) {
            return 1;
        }
        if (p02 instanceof s) {
            Serializable serializable = ((s) p02).f32943s;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (p02 instanceof p) {
            return 9;
        }
        if (p02 == M) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new s8.c("Custom JsonElement subclass " + p02.getClass().getName() + " is not supported");
    }

    @Override // s8.a
    public final void g() throws IOException {
        n0(4);
        this.J[this.I - 1] = null;
        q0();
        q0();
        int i10 = this.I;
        if (i10 > 0) {
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // s8.a
    public final String i() {
        return j(false);
    }

    @Override // s8.a
    public final String k() {
        return j(true);
    }

    @Override // s8.a
    public final boolean l() throws IOException {
        int f02 = f0();
        if (f02 != 4 && f02 != 2 && f02 != 10) {
            return true;
        }
        return false;
    }

    @Override // s8.a
    public final void l0() throws IOException {
        int c10 = s.f.c(f0());
        if (c10 != 1) {
            if (c10 != 9) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        q0();
                        int i10 = this.I;
                        if (i10 > 0) {
                            int[] iArr = this.K;
                            int i11 = i10 - 1;
                            iArr[i11] = iArr[i11] + 1;
                            return;
                        }
                        return;
                    }
                    o0(true);
                    return;
                }
                g();
                return;
            }
            return;
        }
        f();
    }

    public final void n0(int i10) throws IOException {
        if (f0() == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + com.ironsource.adapters.facebook.a.z(i10) + " but was " + com.ironsource.adapters.facebook.a.z(f0()) + P());
    }

    public final String o0(boolean z10) throws IOException {
        String str;
        n0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) p0()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.J;
        int i10 = this.I - 1;
        if (z10) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i10] = str;
        r0(entry.getValue());
        return str2;
    }

    public final Object p0() {
        return this.H[this.I - 1];
    }

    public final Object q0() {
        Object[] objArr = this.H;
        int i10 = this.I - 1;
        this.I = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void r0(Object obj) {
        int i10 = this.I;
        Object[] objArr = this.H;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.H = Arrays.copyOf(objArr, i11);
            this.K = Arrays.copyOf(this.K, i11);
            this.J = (String[]) Arrays.copyOf(this.J, i11);
        }
        Object[] objArr2 = this.H;
        int i12 = this.I;
        this.I = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // s8.a
    public final String toString() {
        return b.class.getSimpleName() + P();
    }
}
