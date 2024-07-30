package ab;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.activity.n;
import com.huawei.openalliance.ad.constant.ah;
import com.huawei.openalliance.ad.constant.v;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.o2;
import java.util.Map;
import ka.ii;
import ka.n7;

/* loaded from: classes2.dex */
public final class e extends ii {
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f395g;

    public e(Context context, ContentRecord contentRecord, Map<String, String> map) {
        super(context, contentRecord);
        if (map != null) {
            this.f = map.get("appId");
            this.f395g = map.get("thirdId");
        }
    }

    @Override // ka.ii
    public final boolean a() {
        ContentRecord contentRecord = this.f31308b;
        n7.e("HwMarketAction", "handle hw app market action");
        Intent intent = new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withid");
        intent.setPackage(w.W);
        intent.putExtra("appId", this.f);
        intent.putExtra("thirdId", this.f395g);
        Context context = this.f31307a;
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        int i10 = 1;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && !packageManager.queryIntentActivities(intent, com.anythink.expressad.exoplayer.b.aX).isEmpty()) {
                intent.setClipData(oa.a.f33785b);
                context.startActivity(intent);
                this.f31309c = v.Code;
                if (this.f31311e) {
                    n.K(context, contentRecord, "intentSuccess", 3, null);
                }
                return true;
            }
        } catch (ActivityNotFoundException unused) {
            n7.i("HwMarketAction", "fail to open market detail page");
        }
        if (this.f31311e) {
            if (o2.c(context, w.W)) {
                i10 = 2;
            }
            n.K(context, contentRecord, ah.D, 3, Integer.valueOf(i10));
        }
        return c();
    }
}
