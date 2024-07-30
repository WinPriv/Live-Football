package ib;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public final class e0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f29480s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f29481t;

    public e0(Context context, p pVar) {
        this.f29480s = context;
        this.f29481t = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Context context = this.f29480s;
        boolean d10 = Cif.a(context).d();
        n7.f("PrivacyUrlUtil", "config oaid statistics url, isChina: %s", Boolean.valueOf(d10));
        String I = a0.a.I(context, d10);
        z B = a0.a.B(I);
        if (d10) {
            n7.g("PrivacyUrlUtil", "should never enter here, oaid statistics not available for china rom.");
            str = "CN";
        } else {
            str = CountryCodeBean.OVERSEA;
        }
        String str2 = y1.c(context, "hiad_statisticsPath") + str;
        if (TextUtils.isEmpty(a0.a.f25t0)) {
            a0.a.f25t0 = y1.c(context, "hiad_privacyServer_host");
        }
        String h10 = com.ironsource.adapters.facebook.a.h(a0.a.f25t0, str2);
        String G = a0.a.G(context, I);
        if (TextUtils.isEmpty(G)) {
            n7.e("PrivacyUrlUtil", "configOAIDStatisticsUrl grs url return null or empty, use local defalut url.");
        } else {
            h10 = com.ironsource.adapters.facebook.a.h(G, str2);
        }
        a0.a.R(context, B, "20221229");
        a0.a.X(a0.a.J(h10, B), this.f29481t, B);
    }
}
