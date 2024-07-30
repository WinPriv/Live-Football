package fb;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jf;
import com.huawei.hms.ads.jh;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.constant.v;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import gb.b0;
import gb.p;
import gb.q;
import gb.x;

/* loaded from: classes2.dex */
public final class c extends m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Context context, AdContentData adContentData, int i10) {
        super(context, adContentData);
        this.f28340e = i10;
    }

    @Override // fb.m
    public final boolean a() {
        ApkInfo F;
        int i10 = this.f28340e;
        boolean z10 = false;
        Context context = this.f28346a;
        AdContentData adContentData = this.f28347b;
        switch (i10) {
            case 0:
                ex.V("AppEnterAction", "handle app enter action");
                MetaData K = adContentData.K();
                if (K != null && (F = K.F()) != null) {
                    z10 = b0.h(context, F.r());
                }
                if (z10) {
                    this.f28348c = "app";
                    jh.Code(context, adContentData, (Integer) 1);
                    return true;
                }
                return d();
            case 1:
                try {
                    ex.V("HarmonyServiceAction", "handle harmony service action");
                    AppInfo c12 = adContentData.c1();
                    if (c12 != null && !TextUtils.isEmpty(c12.q()) && !TextUtils.isEmpty(c12.m0())) {
                        if (Boolean.parseBoolean((String) q.a(new x(12, context, adContentData), null))) {
                            this.f28348c = v.I;
                            return true;
                        }
                    } else {
                        ex.V("HarmonyServiceAction", "parameters occur error");
                    }
                } catch (Throwable th) {
                    ex.I("HarmonyServiceAction", "handle uri exception: %s", th.getClass().getSimpleName());
                }
                return d();
            default:
                if (adContentData != null && (jf.Code(adContentData.a1()) || a0.a.v(context))) {
                    ex.V("OuterWebAction", "handle outer browser action");
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    String h10 = adContentData.h();
                    if (!p.f(h10)) {
                        intent.setData(Uri.parse(h10));
                        if (!(context instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                        try {
                            if (jf.V(adContentData.a1())) {
                                ex.Code("OuterWebAction", "handleUri, use default browser");
                                String e10 = e();
                                if (!TextUtils.isEmpty(e10)) {
                                    intent.setPackage(e10);
                                } else {
                                    ex.I("OuterWebAction", "can not find default browser");
                                }
                            }
                            PackageManager packageManager = context.getPackageManager();
                            if (packageManager != null && !packageManager.queryIntentActivities(intent, com.anythink.expressad.exoplayer.b.aX).isEmpty()) {
                                intent.setClipData(w.cH);
                                context.startActivity(intent);
                                this.f28348c = v.B;
                                return true;
                            }
                        } catch (ActivityNotFoundException unused) {
                            ex.Z("OuterWebAction", "fail to open uri");
                        } catch (Throwable th2) {
                            ex.Z("OuterWebAction", "handle uri exception: %s", th2.getClass().getSimpleName());
                        }
                    }
                }
                return d();
        }
    }

    public final String e() {
        Context context = this.f28346a;
        for (String str : ec.Code(context).l()) {
            if (b0.b(context, str)) {
                return str;
            }
        }
        return "";
    }
}
