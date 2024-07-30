package t6;

import android.content.Context;
import android.graphics.Color;
import com.anythink.expressad.exoplayer.k.p;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import z6.b;

/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes2.dex */
public final class a {
    public static final int f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f35508a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35509b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35510c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35511d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35512e;

    public a(Context context) {
        boolean b10 = b.b(R.attr.elevationOverlayEnabled, context, false);
        int L0 = a0.a.L0(context, R.attr.elevationOverlayColor, 0);
        int L02 = a0.a.L0(context, R.attr.elevationOverlayAccentColor, 0);
        int L03 = a0.a.L0(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f35508a = b10;
        this.f35509b = L0;
        this.f35510c = L02;
        this.f35511d = L03;
        this.f35512e = f10;
    }

    public final int a(float f10, int i10) {
        boolean z10;
        float f11;
        int i11;
        if (this.f35508a) {
            if (f0.a.c(i10, p.f9095b) == this.f35511d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f35512e > gl.Code && f10 > gl.Code) {
                    f11 = Math.min(((((float) Math.log1p(f10 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                } else {
                    f11 = 0.0f;
                }
                int alpha = Color.alpha(i10);
                int S0 = a0.a.S0(f11, f0.a.c(i10, p.f9095b), this.f35509b);
                if (f11 > gl.Code && (i11 = this.f35510c) != 0) {
                    S0 = f0.a.b(f0.a.c(i11, f), S0);
                }
                return f0.a.c(S0, alpha);
            }
        }
        return i10;
    }
}
