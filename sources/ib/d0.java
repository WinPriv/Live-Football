package ib;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.stats.CodePackage;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public final class d0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f29475s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f29476t;

    public d0(Context context, p pVar) {
        this.f29475s = context;
        this.f29476t = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f29475s;
        boolean d10 = Cif.a(context).d();
        n7.f("PrivacyUrlUtil", "config aboutOaid url, isChina: %s", Boolean.valueOf(d10));
        String I = a0.a.I(context, d10);
        z B = a0.a.B(I);
        String str = y1.c(context, "hiad_oaidPath") + CodePackage.COMMON;
        String h10 = com.ironsource.adapters.facebook.a.h(a0.a.i0(context, I), str);
        String q02 = a0.a.q0(context, I);
        if (TextUtils.isEmpty(q02)) {
            n7.e("PrivacyUrlUtil", "configAboutOaidUrl grs url return null or empty, use local defalut url.");
        } else {
            h10 = com.ironsource.adapters.facebook.a.h(q02, str);
        }
        a0.a.R(context, B, "20201031");
        a0.a.X(a0.a.j0(h10, B), this.f29476t, B);
    }
}
