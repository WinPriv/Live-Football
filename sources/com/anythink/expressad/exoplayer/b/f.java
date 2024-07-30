package com.anythink.expressad.exoplayer.b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f7351a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(int r4, int r5, int r6) {
            /*
                r3 = this;
                java.lang.String r0 = "Unhandled format: "
                java.lang.String r1 = " Hz, "
                java.lang.String r2 = " channels in encoding "
                java.lang.StringBuilder r4 = a3.l.r(r0, r4, r1, r5, r2)
                r4.append(r6)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.b.f.a.<init>(int, int, int):void");
        }
    }

    void a(ByteBuffer byteBuffer);

    boolean a();

    boolean a(int i10, int i11, int i12);

    int b();

    int c();

    int d();

    void e();

    ByteBuffer f();

    boolean g();

    void h();

    void i();
}
