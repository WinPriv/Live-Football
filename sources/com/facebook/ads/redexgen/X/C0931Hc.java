package com.facebook.ads.redexgen.X;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.ads.redexgen.X.Hc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0931Hc extends BufferedOutputStream {
    public boolean A00;

    public C0931Hc(OutputStream outputStream) {
        super(outputStream);
    }

    public C0931Hc(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }

    public final void A00(OutputStream outputStream) {
        H6.A04(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A00 = true;
        Throwable e10 = null;
        try {
            flush();
        } catch (Throwable th) {
            e10 = th;
        }
        try {
            this.out.close();
        } catch (Throwable thrown) {
            if (e10 == null) {
                e10 = thrown;
            }
        }
        if (e10 != null) {
            C0940Hl.A0Y(e10);
        }
    }
}
