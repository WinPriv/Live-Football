package la;

import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;
import ka.c7;
import ka.n7;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSActivity f32584s;

    public r(PPSActivity pPSActivity) {
        this.f32584s = pPSActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PPSActivity pPSActivity = this.f32584s;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ba.y, pPSActivity.N);
            jSONObject.put("slotid", pPSActivity.f22362z.p2());
            c7.l(pPSActivity).k("apiReqConfig", jSONObject.toString(), null, null);
        } catch (Throwable th) {
            n7.h("PPSActivity", "updateConfig error: %s", th.getClass().getSimpleName());
        }
    }
}
