package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.msgnotify.PersistentMessageCenter;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p0 extends y {
    public p0() {
        super(com.huawei.openalliance.ad.constant.s.f22112g);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        JSONObject jSONObject = new JSONObject(str3);
        PersistentMessageCenter.getInstance().notifyMessage(jSONObject.getString(com.huawei.openalliance.ad.constant.ba.f22069s), jSONObject.getString(com.huawei.openalliance.ad.constant.ba.f22070t), androidx.transition.n.m(str3));
    }
}
