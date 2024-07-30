package e6;

import java.util.Arrays;

/* compiled from: FixedFrameRateEstimator.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public boolean f27767c;

    /* renamed from: e, reason: collision with root package name */
    public int f27769e;

    /* renamed from: a, reason: collision with root package name */
    public a f27765a = new a();

    /* renamed from: b, reason: collision with root package name */
    public a f27766b = new a();

    /* renamed from: d, reason: collision with root package name */
    public long f27768d = com.anythink.expressad.exoplayer.b.f7291b;

    /* compiled from: FixedFrameRateEstimator.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f27770a;

        /* renamed from: b, reason: collision with root package name */
        public long f27771b;

        /* renamed from: c, reason: collision with root package name */
        public long f27772c;

        /* renamed from: d, reason: collision with root package name */
        public long f27773d;

        /* renamed from: e, reason: collision with root package name */
        public long f27774e;
        public long f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean[] f27775g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        public int f27776h;

        public final boolean a() {
            if (this.f27773d > 15 && this.f27776h == 0) {
                return true;
            }
            return false;
        }

        public final void b(long j10) {
            long j11 = this.f27773d;
            if (j11 == 0) {
                this.f27770a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f27770a;
                this.f27771b = j12;
                this.f = j12;
                this.f27774e = 1L;
            } else {
                long j13 = j10 - this.f27772c;
                int i10 = (int) (j11 % 15);
                long abs = Math.abs(j13 - this.f27771b);
                boolean[] zArr = this.f27775g;
                if (abs <= 1000000) {
                    this.f27774e++;
                    this.f += j13;
                    if (zArr[i10]) {
                        zArr[i10] = false;
                        this.f27776h--;
                    }
                } else if (!zArr[i10]) {
                    zArr[i10] = true;
                    this.f27776h++;
                }
            }
            this.f27773d++;
            this.f27772c = j10;
        }

        public final void c() {
            this.f27773d = 0L;
            this.f27774e = 0L;
            this.f = 0L;
            this.f27776h = 0;
            Arrays.fill(this.f27775g, false);
        }
    }

    public final boolean a() {
        return this.f27765a.a();
    }
}
