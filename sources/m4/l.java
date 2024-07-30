package m4;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import k4.d1;
import k4.i0;
import m4.f;

/* compiled from: AudioSink.java */
/* loaded from: classes2.dex */
public interface l {

    /* compiled from: AudioSink.java */
    /* loaded from: classes2.dex */
    public static final class b extends Exception {

        /* renamed from: s, reason: collision with root package name */
        public final int f32750s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f32751t;

        /* renamed from: u, reason: collision with root package name */
        public final i0 f32752u;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(int r4, int r5, int r6, int r7, k4.i0 r8, boolean r9, java.lang.RuntimeException r10) {
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
                r3.f32750s = r4
                r3.f32751t = r9
                r3.f32752u = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m4.l.b.<init>(int, int, int, int, k4.i0, boolean, java.lang.RuntimeException):void");
        }
    }

    /* compiled from: AudioSink.java */
    /* loaded from: classes2.dex */
    public interface c {
    }

    /* compiled from: AudioSink.java */
    /* loaded from: classes2.dex */
    public static final class d extends Exception {
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
                java.lang.StringBuilder r5 = com.ironsource.adapters.facebook.a.k(r0, r5, r1)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m4.l.d.<init>(long, long):void");
        }
    }

    /* compiled from: AudioSink.java */
    /* loaded from: classes2.dex */
    public static final class e extends Exception {

        /* renamed from: s, reason: collision with root package name */
        public final int f32753s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f32754t;

        /* renamed from: u, reason: collision with root package name */
        public final i0 f32755u;

        public e(int i10, i0 i0Var, boolean z10) {
            super(a3.l.i("AudioTrack write failed: ", i10));
            this.f32754t = z10;
            this.f32753s = i10;
            this.f32755u = i0Var;
        }
    }

    void a(d1 d1Var);

    boolean b();

    boolean c(i0 i0Var);

    d1 d();

    int f(i0 i0Var);

    void flush();

    void g() throws e;

    boolean h();

    void i(o oVar);

    void j(int i10);

    long k(boolean z10);

    void l();

    void m(i0 i0Var, int[] iArr) throws a;

    void n();

    void o();

    boolean p(ByteBuffer byteBuffer, long j10, int i10) throws b, e;

    void pause();

    void play();

    void q(m4.d dVar);

    void r(boolean z10);

    void reset();

    void setVolume(float f);

    /* compiled from: AudioSink.java */
    /* loaded from: classes2.dex */
    public static final class a extends Exception {

        /* renamed from: s, reason: collision with root package name */
        public final i0 f32749s;

        public a(f.b bVar, i0 i0Var) {
            super(bVar);
            this.f32749s = i0Var;
        }

        public a(String str, i0 i0Var) {
            super(str);
            this.f32749s = i0Var;
        }
    }

    default void e(l4.w wVar) {
    }

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }
}
