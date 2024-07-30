package fb;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jf;
import com.huawei.hms.ads.jo;
import com.huawei.openalliance.ad.constant.v;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import gb.p;

/* loaded from: classes2.dex */
public final class k extends m {
    public k(Context context, AdContentData adContentData) {
        super(context, adContentData);
    }

    @Override // fb.m
    public final boolean a() {
        AdContentData adContentData = this.f28347b;
        if (adContentData != null) {
            boolean Code = jf.Code(adContentData.a1());
            Context context = this.f28346a;
            if (Code || a0.a.v(context)) {
                ex.Code("OuterWebCCTAction", "handleUri by cct, pkgName is : %s", context.getPackageName());
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                String h10 = adContentData.h();
                if (!p.f(h10)) {
                    Uri parse = Uri.parse(h10);
                    intent.setData(parse);
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    try {
                        jo.Code().Code(context, parse, true);
                        this.f28348c = v.B;
                        return true;
                    } catch (ActivityNotFoundException unused) {
                        ex.Z("OuterWebCCTAction", "fail to open uri by cct");
                    } catch (Throwable th) {
                        ex.Z("OuterWebCCTAction", "handle uri exception: %s", th.getClass().getSimpleName());
                    }
                }
                return d();
            }
        }
        return d();
    }
}
