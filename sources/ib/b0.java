package ib;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public final class b0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f29468s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f29469t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f29470u;

    public b0(Context context, p pVar, boolean z10) {
        this.f29468s = context;
        this.f29469t = z10;
        this.f29470u = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Context context = this.f29468s;
        boolean d10 = Cif.a(context).d();
        boolean z10 = this.f29469t;
        n7.f("PrivacyUrlUtil", "config privacy statement url, isChina: %s, isInHms: %s.", Boolean.valueOf(d10), Boolean.valueOf(z10));
        String I = a0.a.I(context, d10);
        z B = a0.a.B(I);
        String str2 = "20230720";
        if (d10 && !z10) {
            B.f29531a = "privacyThirdCN";
            str = "hiad_privacyThirdPath";
        } else if (d10) {
            str = "hiad_privacyPath";
        } else {
            str = "hiad_privacyOverseaPath";
            str2 = "20221229";
        }
        String str3 = y1.c(context, str) + I;
        if (TextUtils.isEmpty(a0.a.f25t0)) {
            a0.a.f25t0 = y1.c(context, "hiad_privacyServer_host");
        }
        String h10 = com.ironsource.adapters.facebook.a.h(a0.a.f25t0, str3);
        String G = a0.a.G(context, I);
        if (TextUtils.isEmpty(G)) {
            n7.e("PrivacyUrlUtil", "grs url return null or empty, use local defalut url.");
        } else {
            h10 = com.ironsource.adapters.facebook.a.h(G, str3);
        }
        a0.a.R(context, B, str2);
        a0.a.X(a0.a.J(h10, B), this.f29470u, B);
    }
}
