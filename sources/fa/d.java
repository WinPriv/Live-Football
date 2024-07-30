package fa;

import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.inter.HiAd;
import gb.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HiAd f28220s;

    public d(HiAd hiAd) {
        this.f28220s = hiAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HiAd hiAd = this.f28220s;
        int ad2 = hiAd.f22218b.ad();
        boolean e10 = h0.e(hiAd.f22217a);
        ex.V("HiAd", "preRequest, type: %s, isTv: %s", Integer.valueOf(ad2), Boolean.valueOf(e10));
        if (ad2 == 0 && !e10) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ba.ae, ad2);
            jSONObject.put(ba.af, e10);
            ha.i.e(hiAd.f22217a.getApplicationContext()).d(com.huawei.openalliance.ad.constant.s.f22125u, jSONObject.toString(), null, null);
        } catch (JSONException unused) {
            ex.I("HiAd", "preRequest error.");
        }
    }
}
