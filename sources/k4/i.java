package k4;

/* compiled from: DefaultLoadControl.java */
/* loaded from: classes2.dex */
public final class i implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final c6.n f30487a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30488b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30489c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30490d;

    /* renamed from: e, reason: collision with root package name */
    public final long f30491e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final long f30492g;

    /* renamed from: h, reason: collision with root package name */
    public int f30493h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30494i;

    public i() {
        c6.n nVar = new c6.n();
        i(2500, 0, "bufferForPlaybackMs", "0");
        i(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i(com.anythink.expressad.exoplayer.d.f7614b, 2500, "minBufferMs", "bufferForPlaybackMs");
        i(com.anythink.expressad.exoplayer.d.f7614b, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(com.anythink.expressad.exoplayer.d.f7614b, com.anythink.expressad.exoplayer.d.f7614b, "maxBufferMs", "minBufferMs");
        i(0, 0, "backBufferDurationMs", "0");
        this.f30487a = nVar;
        long j10 = com.anythink.expressad.exoplayer.d.f7614b;
        this.f30488b = d6.g0.J(j10);
        this.f30489c = d6.g0.J(j10);
        this.f30490d = d6.g0.J(2500);
        this.f30491e = d6.g0.J(5000);
        this.f = -1;
        this.f30493h = com.anythink.expressad.exoplayer.b.aY;
        this.f30492g = d6.g0.J(0);
    }

    public static void i(int i10, int i11, String str, String str2) {
        boolean z10;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.b(z10, str + " cannot be less than " + str2);
    }

    @Override // k4.m0
    public final boolean a() {
        return false;
    }

    @Override // k4.m0
    public final long b() {
        return this.f30492g;
    }

    @Override // k4.m0
    public final boolean c(long j10, float f) {
        int i10;
        boolean z10;
        c6.n nVar = this.f30487a;
        synchronized (nVar) {
            i10 = nVar.f3389d * nVar.f3387b;
        }
        boolean z11 = true;
        if (i10 >= this.f30493h) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = this.f30489c;
        long j12 = this.f30488b;
        if (f > 1.0f) {
            j12 = Math.min(d6.g0.t(j12, f), j11);
        }
        if (j10 < Math.max(j12, 500000L)) {
            if (z10) {
                z11 = false;
            }
            this.f30494i = z11;
            if (!z11 && j10 < 500000) {
                d6.p.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j11 || z10) {
            this.f30494i = false;
        }
        return this.f30494i;
    }

    @Override // k4.m0
    public final void d() {
        j(true);
    }

    @Override // k4.m0
    public final boolean e(long j10, float f, boolean z10, long j11) {
        long j12;
        int i10;
        long x10 = d6.g0.x(j10, f);
        if (z10) {
            j12 = this.f30491e;
        } else {
            j12 = this.f30490d;
        }
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
            j12 = Math.min(j11 / 2, j12);
        }
        if (j12 > 0 && x10 < j12) {
            c6.n nVar = this.f30487a;
            synchronized (nVar) {
                i10 = nVar.f3389d * nVar.f3387b;
            }
            if (i10 < this.f30493h) {
                return false;
            }
        }
        return true;
    }

    @Override // k4.m0
    public final c6.n f() {
        return this.f30487a;
    }

    @Override // k4.m0
    public final void g() {
        j(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0017. Please report as an issue. */
    @Override // k4.m0
    public final void h(i1[] i1VarArr, b6.f[] fVarArr) {
        int i10 = this.f;
        boolean z10 = false;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int length = i1VarArr.length;
                int i13 = com.anythink.expressad.exoplayer.b.aY;
                if (i11 < length) {
                    if (fVarArr[i11] != null) {
                        switch (i1VarArr[i11].x()) {
                            case -2:
                                i13 = 0;
                                i12 += i13;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i13 = 144310272;
                                i12 += i13;
                                break;
                            case 1:
                                i12 += i13;
                                break;
                            case 2:
                                i13 = 131072000;
                                i12 += i13;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i13 = 131072;
                                i12 += i13;
                                break;
                        }
                    }
                    i11++;
                } else {
                    i10 = Math.max(com.anythink.expressad.exoplayer.b.aY, i12);
                }
            }
        }
        this.f30493h = i10;
        c6.n nVar = this.f30487a;
        synchronized (nVar) {
            if (i10 < nVar.f3388c) {
                z10 = true;
            }
            nVar.f3388c = i10;
            if (z10) {
                nVar.a();
            }
        }
    }

    public final void j(boolean z10) {
        boolean z11;
        int i10 = this.f;
        if (i10 == -1) {
            i10 = com.anythink.expressad.exoplayer.b.aY;
        }
        this.f30493h = i10;
        this.f30494i = false;
        if (z10) {
            c6.n nVar = this.f30487a;
            synchronized (nVar) {
                if (nVar.f3386a) {
                    synchronized (nVar) {
                        if (nVar.f3388c > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        nVar.f3388c = 0;
                        if (z11) {
                            nVar.a();
                        }
                    }
                }
            }
        }
    }

    @Override // k4.m0
    public final void onPrepared() {
        j(false);
    }
}
