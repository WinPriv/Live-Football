package ka;

import android.content.Context;
import android.content.Intent;
import com.huawei.openalliance.ad.ppskit.activity.InnerPPSArActivity;

/* loaded from: classes2.dex */
public final class s0 extends y {
    public s0() {
        super("openArDetailPageNew");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        n7.e("CmdOpenArDetailPageNew", "CmdOpenArDetailPage call from " + str);
        try {
            n7.f("CmdOpenArDetailPageNew", "content: %s", com.huawei.openalliance.ad.ppskit.utils.y1.j(str3));
            Intent intent = new Intent(context, (Class<?>) InnerPPSArActivity.class);
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.y, str);
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.ag, true);
            if (com.huawei.openalliance.ad.ppskit.utils.d0.m(context)) {
                intent.addFlags(268468224);
            } else {
                intent.addFlags(268435456);
            }
            intent.putExtra("contentRecord", str3);
            intent.setClipData(oa.a.f33785b);
            context.startActivity(intent);
        } catch (Throwable th) {
            n7.e("CmdOpenArDetailPageNew", "CmdOpenArDetailPage occurs: ".concat(th.getClass().getSimpleName()));
        }
    }
}
