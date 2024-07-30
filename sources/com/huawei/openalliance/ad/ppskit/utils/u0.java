package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.huawei.openalliance.ad.ppskit.views.PPSLabelView;
import ka.n7;

/* loaded from: classes2.dex */
public final class u0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f23027s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f23028t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f23029u = "normal";

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n1 f23030v;

    public u0(Context context, PPSLabelView.a aVar, String str) {
        this.f23027s = str;
        this.f23028t = context;
        this.f23030v = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            boolean d10 = n7.d();
            String str = this.f23027s;
            if (d10) {
                n7.c("ImageUtil", "load image, filePath:%s", y1.j(str));
            }
            Drawable q10 = v0.q(str);
            if (q10 == null) {
                q10 = (Drawable) v0.d(this.f23028t, str, this.f23029u).first;
            }
            n1 n1Var = this.f23030v;
            if (n1Var != null) {
                if (q10 == null) {
                    n1Var.a();
                } else {
                    n1Var.a("", q10);
                }
            }
        } catch (Throwable unused) {
            n7.i("ImageUtil", "loadImage from filePath error");
        }
    }
}
