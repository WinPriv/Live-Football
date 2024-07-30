package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;
import m8.l;
import m8.n;
import m8.p;
import m8.q;
import m8.s;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes2.dex */
public final class c extends s8.b {
    public static final a H = new a();
    public static final s I = new s("closed");
    public final ArrayList E;
    public String F;
    public n G;

    /* compiled from: JsonTreeWriter.java */
    /* loaded from: classes2.dex */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public c() {
        super(H);
        this.E = new ArrayList();
        this.G = p.f32941s;
    }

    @Override // s8.b
    public final void P(long j10) throws IOException {
        c0(new s(Long.valueOf(j10)));
    }

    @Override // s8.b
    public final void Q(Boolean bool) throws IOException {
        if (bool == null) {
            c0(p.f32941s);
        } else {
            c0(new s(bool));
        }
    }

    @Override // s8.b
    public final void S(Number number) throws IOException {
        if (number == null) {
            c0(p.f32941s);
            return;
        }
        if (!this.f35278x) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        c0(new s(number));
    }

    @Override // s8.b
    public final void X(String str) throws IOException {
        if (str == null) {
            c0(p.f32941s);
        } else {
            c0(new s(str));
        }
    }

    @Override // s8.b
    public final void Y(boolean z10) throws IOException {
        c0(new s(Boolean.valueOf(z10)));
    }

    public final n a0() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return this.G;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final n b0() {
        return (n) this.E.get(r0.size() - 1);
    }

    @Override // s8.b
    public final void c() throws IOException {
        l lVar = new l();
        c0(lVar);
        this.E.add(lVar);
    }

    public final void c0(n nVar) {
        if (this.F != null) {
            nVar.getClass();
            if (!(nVar instanceof p) || this.A) {
                ((q) b0()).n(nVar, this.F);
            }
            this.F = null;
            return;
        }
        if (this.E.isEmpty()) {
            this.G = nVar;
            return;
        }
        n b02 = b0();
        if (b02 instanceof l) {
            ((l) b02).o(nVar);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // s8.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            arrayList.add(I);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // s8.b
    public final void d() throws IOException {
        q qVar = new q();
        c0(qVar);
        this.E.add(qVar);
    }

    @Override // s8.b
    public final void f() throws IOException {
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty() && this.F == null) {
            if (b0() instanceof l) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // s8.b
    public final void g() throws IOException {
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty() && this.F == null) {
            if (b0() instanceof q) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // s8.b
    public final void h(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (!this.E.isEmpty() && this.F == null) {
            if (b0() instanceof q) {
                this.F = str;
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // s8.b
    public final s8.b j() throws IOException {
        c0(p.f32941s);
        return this;
    }

    @Override // s8.b
    public final void m(double d10) throws IOException {
        if (!this.f35278x && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
        c0(new s(Double.valueOf(d10)));
    }

    @Override // s8.b, java.io.Flushable
    public final void flush() throws IOException {
    }
}
