package ka;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.msgnotify.PersistentMessageCenter;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o0 extends y {

    /* loaded from: classes2.dex */
    public class a implements xa.a {

        /* renamed from: s, reason: collision with root package name */
        public final com.huawei.android.hms.ppskit.a f31579s;

        /* renamed from: t, reason: collision with root package name */
        public final String f31580t;

        /* renamed from: u, reason: collision with root package name */
        public final String f31581u;

        public a(String str, String str2, com.huawei.android.hms.ppskit.a aVar) {
            this.f31579s = aVar;
            this.f31580t = str;
            this.f31581u = str2;
        }

        @Override // xa.a
        public final void n(String str, Intent intent) {
            String v3 = androidx.transition.n.v(this.f31580t, str, intent);
            if (!TextUtils.isEmpty(v3)) {
                y.d(this.f31579s, this.f31581u, 200, v3);
            }
        }
    }

    public o0() {
        super(com.huawei.openalliance.ad.constant.s.f);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        JSONObject jSONObject = new JSONObject(str3);
        String string = jSONObject.getString(com.huawei.openalliance.ad.constant.ba.f22070t);
        String string2 = jSONObject.getString(com.huawei.openalliance.ad.constant.ba.f22072v);
        if (TextUtils.equals(string2, com.huawei.openalliance.ad.constant.w.aE)) {
            PersistentMessageCenter.getInstance().a(str, string, new a(str, this.f32203a, aVar));
        } else if (TextUtils.equals(string2, com.huawei.openalliance.ad.constant.w.aF)) {
            PersistentMessageCenter.getInstance().unregisterAll(str, string);
        }
    }
}
