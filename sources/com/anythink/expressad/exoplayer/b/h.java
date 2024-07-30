package com.anythink.expressad.exoplayer.b;

import com.anythink.expressad.exoplayer.v;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface h {

    /* renamed from: a, reason: collision with root package name */
    public static final long f7370a = Long.MIN_VALUE;

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }

        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f7371a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(int r4, int r5, int r6, int r7) {
            /*
                r3 = this;
                java.lang.String r0 = "AudioTrack init failed: "
                java.lang.String r1 = ", Config("
                java.lang.String r2 = ", "
                java.lang.StringBuilder r5 = a3.l.r(r0, r4, r1, r5, r2)
                r5.append(r6)
                r5.append(r2)
                r5.append(r7)
                java.lang.String r6 = ")"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r3.<init>(r5)
                r3.f7371a = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.b.h.b.<init>(int, int, int, int):void");
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void a(int i10);

        void a(int i10, long j10, long j11);
    }

    /* loaded from: classes.dex */
    public static final class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f7372a;

        public d(int i10) {
            super("AudioTrack write failed: ".concat(String.valueOf(i10)));
            this.f7372a = i10;
        }
    }

    long a(boolean z10);

    v a(v vVar);

    void a();

    void a(float f);

    void a(int i10, int i11, int i12, int[] iArr, int i13, int i14);

    void a(com.anythink.expressad.exoplayer.b.b bVar);

    void a(c cVar);

    boolean a(int i10);

    boolean a(ByteBuffer byteBuffer, long j10);

    void b();

    void b(int i10);

    void c();

    void c(int i10);

    boolean d();

    boolean e();

    v f();

    void g();

    void h();

    void i();

    void j();
}
