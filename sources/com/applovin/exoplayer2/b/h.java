package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.am;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface h {

    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f13391a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13392b;

        /* renamed from: c, reason: collision with root package name */
        public final com.applovin.exoplayer2.v f13393c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(int r4, int r5, int r6, int r7, com.applovin.exoplayer2.v r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                java.lang.String r0 = "AudioTrack init failed "
                java.lang.String r1 = " Config("
                java.lang.String r2 = ", "
                java.lang.StringBuilder r5 = a3.l.r(r0, r4, r1, r5, r2)
                java.lang.String r0 = ")"
                e0.i.n(r5, r6, r2, r7, r0)
                if (r9 == 0) goto L14
                java.lang.String r6 = " (recoverable)"
                goto L16
            L14:
                java.lang.String r6 = ""
            L16:
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r3.<init>(r5, r10)
                r3.f13391a = r4
                r3.f13392b = r9
                r3.f13393c = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.h.b.<init>(int, int, int, int, com.applovin.exoplayer2.v, boolean, java.lang.Exception):void");
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void a(int i10, long j10, long j11);

        default void a(long j10) {
        }

        void a(boolean z10);

        default void b() {
        }

        default void a(Exception exc) {
        }

        default void b(long j10) {
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final long f13394a;

        /* renamed from: b, reason: collision with root package name */
        public final long f13395b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(long r3, long r5) {
            /*
                r2 = this;
                java.lang.String r0 = "Unexpected audio track timestamp discontinuity: expected "
                java.lang.String r1 = ", got "
                java.lang.StringBuilder r0 = com.ironsource.adapters.facebook.a.k(r0, r5, r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.f13394a = r3
                r2.f13395b = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.h.d.<init>(long, long):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f13396a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13397b;

        /* renamed from: c, reason: collision with root package name */
        public final com.applovin.exoplayer2.v f13398c;

        public e(int i10, com.applovin.exoplayer2.v vVar, boolean z10) {
            super(a3.l.i("AudioTrack write failed: ", i10));
            this.f13397b = z10;
            this.f13396a = i10;
            this.f13398c = vVar;
        }
    }

    long a(boolean z10);

    void a();

    void a(float f);

    void a(int i10);

    void a(am amVar);

    void a(com.applovin.exoplayer2.b.d dVar);

    void a(c cVar);

    void a(k kVar);

    void a(com.applovin.exoplayer2.v vVar, int i10, int[] iArr) throws a;

    boolean a(com.applovin.exoplayer2.v vVar);

    boolean a(ByteBuffer byteBuffer, long j10, int i10) throws b, e;

    int b(com.applovin.exoplayer2.v vVar);

    void b();

    void b(boolean z10);

    void c() throws e;

    boolean d();

    boolean e();

    am f();

    void g();

    void h();

    void i();

    void j();

    void k();

    void l();

    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.v f13390a;

        public a(Throwable th, com.applovin.exoplayer2.v vVar) {
            super(th);
            this.f13390a = vVar;
        }

        public a(String str, com.applovin.exoplayer2.v vVar) {
            super(str);
            this.f13390a = vVar;
        }
    }
}
