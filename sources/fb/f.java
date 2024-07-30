package fb;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jh;
import com.huawei.openalliance.ad.constant.ah;
import com.huawei.openalliance.ad.constant.v;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import gb.b0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f extends m {

    /* renamed from: e, reason: collision with root package name */
    public final String f28341e;
    public final String f;

    public f(Context context, AdContentData adContentData, Map<String, String> map) {
        super(context, adContentData);
        this.f28341e = map.get("appId");
        this.f = map.get("thirdId");
    }

    @Override // fb.m
    public final boolean a() {
        AdContentData adContentData = this.f28347b;
        ex.V("HwMarketAction", "handle hw app market action");
        Intent intent = new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withid");
        intent.setPackage(w.W);
        intent.putExtra("appId", this.f28341e);
        intent.putExtra("thirdId", this.f);
        Context context = this.f28346a;
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        int i10 = 1;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && !packageManager.queryIntentActivities(intent, com.anythink.expressad.exoplayer.b.aX).isEmpty()) {
                intent.setClipData(w.cH);
                context.startActivity(intent);
                this.f28348c = v.Code;
                jh.Code(context, adContentData, "intentSuccess", (Integer) 3, (Integer) null);
                return true;
            }
        } catch (ActivityNotFoundException unused) {
            ex.Z("HwMarketAction", "fail to open market detail page");
        }
        if (b0.b(context, w.W)) {
            i10 = 2;
        }
        jh.Code(context, adContentData, ah.D, (Integer) 3, Integer.valueOf(i10));
        return d();
    }
}
