package m4;

import android.media.AudioTrack;
import android.os.SystemClock;
import d6.g0;
import java.lang.reflect.Method;
import m4.r;

/* compiled from: AudioTrackPositionTracker.java */
/* loaded from: classes2.dex */
public final class n {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;

    /* renamed from: a, reason: collision with root package name */
    public final a f32766a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f32767b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f32768c;

    /* renamed from: d, reason: collision with root package name */
    public int f32769d;

    /* renamed from: e, reason: collision with root package name */
    public int f32770e;
    public m f;

    /* renamed from: g, reason: collision with root package name */
    public int f32771g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f32772h;

    /* renamed from: i, reason: collision with root package name */
    public long f32773i;

    /* renamed from: j, reason: collision with root package name */
    public float f32774j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f32775k;

    /* renamed from: l, reason: collision with root package name */
    public long f32776l;

    /* renamed from: m, reason: collision with root package name */
    public long f32777m;

    /* renamed from: n, reason: collision with root package name */
    public Method f32778n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f32779p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f32780q;

    /* renamed from: r, reason: collision with root package name */
    public long f32781r;

    /* renamed from: s, reason: collision with root package name */
    public long f32782s;

    /* renamed from: t, reason: collision with root package name */
    public long f32783t;

    /* renamed from: u, reason: collision with root package name */
    public long f32784u;

    /* renamed from: v, reason: collision with root package name */
    public long f32785v;

    /* renamed from: w, reason: collision with root package name */
    public int f32786w;

    /* renamed from: x, reason: collision with root package name */
    public int f32787x;
    public long y;

    /* renamed from: z, reason: collision with root package name */
    public long f32788z;

    /* compiled from: AudioTrackPositionTracker.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(long j10);

        void b(int i10, long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public n(r.j jVar) {
        this.f32766a = jVar;
        if (g0.f27302a >= 18) {
            try {
                this.f32778n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f32767b = new long[10];
    }

    public final long a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.y;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            return Math.min(this.B, this.A + ((g0.t((elapsedRealtime * 1000) - j10, this.f32774j) * this.f32771g) / 1000000));
        }
        if (elapsedRealtime - this.f32782s >= 5) {
            AudioTrack audioTrack = this.f32768c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f32772h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f32785v = this.f32783t;
                    }
                    playbackHeadPosition += this.f32785v;
                }
                if (g0.f27302a <= 29) {
                    if (playbackHeadPosition == 0 && this.f32783t > 0 && playState == 3) {
                        if (this.f32788z == com.anythink.expressad.exoplayer.b.f7291b) {
                            this.f32788z = elapsedRealtime;
                        }
                    } else {
                        this.f32788z = com.anythink.expressad.exoplayer.b.f7291b;
                    }
                }
                if (this.f32783t > playbackHeadPosition) {
                    this.f32784u++;
                }
                this.f32783t = playbackHeadPosition;
            }
            this.f32782s = elapsedRealtime;
        }
        return this.f32783t + (this.f32784u << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r6) {
        /*
            r5 = this;
            long r0 = r5.a()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r7 = 1
            if (r6 > 0) goto L2b
            boolean r6 = r5.f32772h
            r0 = 0
            if (r6 == 0) goto L26
            android.media.AudioTrack r6 = r5.f32768c
            r6.getClass()
            int r6 = r6.getPlayState()
            r1 = 2
            if (r6 != r1) goto L26
            long r1 = r5.a()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L26
            r6 = r7
            goto L27
        L26:
            r6 = r0
        L27:
            if (r6 == 0) goto L2a
            goto L2b
        L2a:
            r7 = r0
        L2b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.n.b(long):boolean");
    }

    public final void c() {
        this.f32776l = 0L;
        this.f32787x = 0;
        this.f32786w = 0;
        this.f32777m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f32775k = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r4 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.f32768c = r3
            r2.f32769d = r6
            r2.f32770e = r7
            m4.m r0 = new m4.m
            r0.<init>(r3)
            r2.f = r0
            int r3 = r3.getSampleRate()
            r2.f32771g = r3
            r3 = 0
            if (r4 == 0) goto L29
            int r4 = d6.g0.f27302a
            r0 = 23
            r1 = 1
            if (r4 >= r0) goto L25
            r4 = 5
            if (r5 == r4) goto L23
            r4 = 6
            if (r5 != r4) goto L25
        L23:
            r4 = r1
            goto L26
        L25:
            r4 = r3
        L26:
            if (r4 == 0) goto L29
            goto L2a
        L29:
            r1 = r3
        L2a:
            r2.f32772h = r1
            boolean r4 = d6.g0.G(r5)
            r2.f32780q = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L44
            int r7 = r7 / r6
            long r4 = (long) r7
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            int r6 = r2.f32771g
            long r6 = (long) r6
            long r4 = r4 / r6
            goto L45
        L44:
            r4 = r0
        L45:
            r2.f32773i = r4
            r4 = 0
            r2.f32783t = r4
            r2.f32784u = r4
            r2.f32785v = r4
            r2.f32779p = r3
            r2.y = r0
            r2.f32788z = r0
            r2.f32781r = r4
            r2.o = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f32774j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.n.d(android.media.AudioTrack, boolean, int, int, int):void");
    }
}
