package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.provider.a;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g0 extends y {
    public g0() {
        super(com.huawei.openalliance.ad.constant.s.f22113h);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        String str4;
        String h10 = y4.a(context, "normal").h(context, d5.f(new JSONObject(str3).optString(com.huawei.openalliance.ad.constant.ba.f22075z)));
        if (!com.huawei.openalliance.ad.ppskit.utils.x.o(context, h10)) {
            str4 = "";
        } else {
            str4 = a.b.a(context, h10);
        }
        n7.c("CmdCheckCachedVideo", "local video file path: %s, content path: %s", h10, str4);
        boolean isEmpty = TextUtils.isEmpty(str4);
        String str5 = this.f32203a;
        if (!isEmpty) {
            y.d(aVar, str5, 200, str4);
        } else {
            y.d(aVar, str5, -1, "");
        }
    }
}
