package ka;

import android.content.Context;

/* loaded from: classes2.dex */
public final class e0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f31111s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f31112t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Integer f31113u;

    public e0(Context context, Integer num, Integer num2) {
        this.f31111s = context;
        this.f31112t = num;
        this.f31113u = num2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        long j10;
        long j11;
        long j12;
        Context context = this.f31111s;
        d5 a10 = y4.a(context, "normal");
        d5 a11 = y4.a(context, com.anythink.expressad.video.dynview.a.a.f11377aa);
        d5 a12 = y4.a(context, "insre");
        int i12 = 0;
        if (this.f31112t != null) {
            long intValue = r4.intValue() * 1024 * 1024;
            f5 b10 = a10.b(context, false);
            if (b10 == null) {
                j10 = 0;
            } else {
                j10 = b10.f31156a;
            }
            if (j10 > 0 && j10 != intValue) {
                a10.d(context, intValue);
            }
            f5 b11 = a11.b(context, false);
            if (b11 == null) {
                j11 = 0;
            } else {
                j11 = b11.f31156a;
            }
            if (j11 > 0 && j11 != intValue) {
                a11.d(context, intValue);
            }
            f5 b12 = a12.b(context, false);
            if (b12 == null) {
                j12 = 0;
            } else {
                j12 = b12.f31156a;
            }
            if (j12 > 0 && j12 != intValue) {
                a12.d(context, intValue);
            }
        }
        Integer num = this.f31113u;
        if (num != null) {
            f5 b13 = a10.b(context, false);
            if (b13 == null) {
                i10 = 0;
            } else {
                i10 = b13.f31157b;
            }
            if (i10 > 0 && i10 != num.intValue()) {
                a10.c(num.intValue(), context);
            }
            f5 b14 = a11.b(context, false);
            if (b14 == null) {
                i11 = 0;
            } else {
                i11 = b14.f31157b;
            }
            if (i11 > 0 && i11 != num.intValue()) {
                a11.c(num.intValue(), context);
            }
            f5 b15 = a12.b(context, false);
            if (b15 != null) {
                i12 = b15.f31157b;
            }
            if (i12 > 0 && i12 != num.intValue()) {
                a12.c(num.intValue(), context);
            }
        }
    }
}
