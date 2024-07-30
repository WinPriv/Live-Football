package k4;

/* compiled from: DefaultLivePlaybackSpeedControl.java */
/* loaded from: classes2.dex */
public final class h implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f30472a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30473b;

    /* renamed from: c, reason: collision with root package name */
    public final float f30474c;

    /* renamed from: d, reason: collision with root package name */
    public long f30475d = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: e, reason: collision with root package name */
    public long f30476e = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: g, reason: collision with root package name */
    public long f30477g = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: h, reason: collision with root package name */
    public long f30478h = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: k, reason: collision with root package name */
    public float f30481k = 0.97f;

    /* renamed from: j, reason: collision with root package name */
    public float f30480j = 1.03f;

    /* renamed from: l, reason: collision with root package name */
    public float f30482l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public long f30483m = com.anythink.expressad.exoplayer.b.f7291b;
    public long f = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: i, reason: collision with root package name */
    public long f30479i = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: n, reason: collision with root package name */
    public long f30484n = com.anythink.expressad.exoplayer.b.f7291b;
    public long o = com.anythink.expressad.exoplayer.b.f7291b;

    public h(long j10, long j11, float f) {
        this.f30472a = j10;
        this.f30473b = j11;
        this.f30474c = f;
    }

    public final void a() {
        long j10 = this.f30475d;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            long j11 = this.f30476e;
            if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
                j10 = j11;
            }
            long j12 = this.f30477g;
            if (j12 != com.anythink.expressad.exoplayer.b.f7291b && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f30478h;
            if (j13 != com.anythink.expressad.exoplayer.b.f7291b && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f == j10) {
            return;
        }
        this.f = j10;
        this.f30479i = j10;
        this.f30484n = com.anythink.expressad.exoplayer.b.f7291b;
        this.o = com.anythink.expressad.exoplayer.b.f7291b;
        this.f30483m = com.anythink.expressad.exoplayer.b.f7291b;
    }
}
