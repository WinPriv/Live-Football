package com.anythink.expressad.exoplayer.k;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class x extends BufferedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9136a;

    public x(OutputStream outputStream) {
        super(outputStream);
    }

    public final void a(OutputStream outputStream) {
        a.b(this.f9136a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f9136a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9136a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            af.a(th);
        }
    }

    public x(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}
