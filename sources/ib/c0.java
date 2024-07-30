package ib;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public final class c0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f29472s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f29473t;

    public c0(Context context, p pVar) {
        this.f29472s = context;
        this.f29473t = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        Context context = this.f29472s;
        boolean d10 = Cif.a(context).d();
        n7.f("PrivacyUrlUtil", "config ad info url, isChina: %s.", Boolean.valueOf(d10));
        String I = a0.a.I(context, d10);
        z B = a0.a.B(I);
        String i02 = a0.a.i0(context, I);
        if (d10) {
            str = I;
        } else if (!com.huawei.openalliance.ad.ppskit.utils.e.a(I, null, 1, com.huawei.openalliance.ad.ppskit.utils.e.f22835b) && !com.huawei.openalliance.ad.ppskit.utils.e.a(I, null, 2, com.huawei.openalliance.ad.ppskit.utils.e.f22836c) && !com.huawei.openalliance.ad.ppskit.utils.e.a(I, null, 3, com.huawei.openalliance.ad.ppskit.utils.e.f22837d)) {
            str = "NOSERVICE";
        } else {
            str = CountryCodeBean.OVERSEA;
        }
        String str3 = y1.c(context, "hiad_adInfoPath") + str;
        String h10 = com.ironsource.adapters.facebook.a.h(i02, str3);
        String q02 = a0.a.q0(context, I);
        if (TextUtils.isEmpty(q02)) {
            n7.e("PrivacyUrlUtil", "configAdInfoUrl grs url return null or empty, use local defalut url.");
        } else {
            h10 = com.ironsource.adapters.facebook.a.h(q02, str3);
        }
        if (d10) {
            str2 = "20221030";
        } else {
            str2 = "20221216";
        }
        a0.a.R(context, B, str2);
        a0.a.X(a0.a.j0(h10, B), this.f29473t, B);
    }
}
