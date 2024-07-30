package la;

import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.activity.PPSArActivity;
import ka.c7;
import ka.n7;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSArActivity f32586s;

    public t(PPSArActivity pPSArActivity) {
        this.f32586s = pPSArActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PPSArActivity pPSArActivity = this.f32586s;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ba.y, pPSArActivity.D);
            jSONObject.put("slotid", pPSArActivity.y.p2());
            c7.l(pPSArActivity).k("apiReqConfig", jSONObject.toString(), null, null);
        } catch (Throwable th) {
            n7.h("PPSArActivity", "updateConfig error: %s", th.getClass().getSimpleName());
        }
    }
}
