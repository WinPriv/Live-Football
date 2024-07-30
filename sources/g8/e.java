package g8;

import d8.j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: RequestLimiter.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long f28536d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f28537e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final j f28538a;

    /* renamed from: b, reason: collision with root package name */
    public long f28539b;

    /* renamed from: c, reason: collision with root package name */
    public int f28540c;

    public e() {
        if (l3.d.f32366s == null) {
            Pattern pattern = j.f27510c;
            l3.d.f32366s = new l3.d();
        }
        l3.d dVar = l3.d.f32366s;
        if (j.f27511d == null) {
            j.f27511d = new j(dVar);
        }
        this.f28538a = j.f27511d;
    }

    public final synchronized void a(int i10) {
        boolean z10;
        long min;
        boolean z11 = false;
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            synchronized (this) {
                this.f28540c = 0;
            }
            return;
        }
        this.f28540c++;
        synchronized (this) {
            if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                z11 = true;
            }
            if (!z11) {
                min = f28536d;
            } else {
                double pow = Math.pow(2.0d, this.f28540c);
                this.f28538a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f28537e);
            }
            this.f28538a.f27512a.getClass();
            this.f28539b = System.currentTimeMillis() + min;
        }
        return;
    }
}
