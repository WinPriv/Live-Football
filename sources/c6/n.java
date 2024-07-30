package c6;

import java.util.Arrays;

/* compiled from: DefaultAllocator.java */
/* loaded from: classes2.dex */
public final class n implements b {

    /* renamed from: c, reason: collision with root package name */
    public int f3388c;

    /* renamed from: d, reason: collision with root package name */
    public int f3389d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3386a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f3387b = com.anythink.expressad.exoplayer.b.aX;

    /* renamed from: e, reason: collision with root package name */
    public int f3390e = 0;
    public a[] f = new a[100];

    public final synchronized void a() {
        int i10 = this.f3388c;
        int i11 = this.f3387b;
        int i12 = d6.g0.f27302a;
        int max = Math.max(0, (((i10 + i11) - 1) / i11) - this.f3389d);
        int i13 = this.f3390e;
        if (max >= i13) {
            return;
        }
        Arrays.fill(this.f, max, i13, (Object) null);
        this.f3390e = max;
    }
}
