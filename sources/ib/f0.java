package ib;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public final class f0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f29483s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f29484t;

    public f0(Context context, p pVar) {
        this.f29483s = context;
        this.f29484t = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder j10;
        String str;
        Context context = this.f29483s;
        boolean d10 = Cif.a(context).d();
        n7.f("PrivacyUrlUtil", "config whyThisAdStatement url, isChina: %s", Boolean.valueOf(d10));
        String I = a0.a.I(context, d10);
        z B = a0.a.B(I);
        String c10 = y1.c(context, "haid_third_ad_info");
        if (d10) {
            j10 = com.ironsource.adapters.facebook.a.j(c10);
            str = "country=CN";
        } else {
            j10 = com.ironsource.adapters.facebook.a.j(c10);
            str = "country=OVERSEA";
        }
        j10.append(str);
        String sb2 = j10.toString();
        String h10 = com.ironsource.adapters.facebook.a.h(a0.a.i0(context, I), sb2);
        String q02 = a0.a.q0(context, I);
        if (TextUtils.isEmpty(q02)) {
            n7.e("PrivacyUrlUtil", "configWhyThisAdStatementUrl grs url return null or empty, use local defalut url.");
        } else {
            h10 = com.ironsource.adapters.facebook.a.h(q02, sb2);
        }
        a0.a.R(context, B, "20221229");
        a0.a.X(a0.a.J(h10, B), this.f29484t, B);
    }
}
