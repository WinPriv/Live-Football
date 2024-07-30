package ka;

import android.content.Context;

/* loaded from: classes2.dex */
public final class x1 extends y {
    public x1() {
        super("startVideoCache");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        Integer q10 = com.huawei.openalliance.ad.ppskit.utils.y1.q(str3);
        n7.e("CmdStartVideoCache", "startCache:" + q10);
        if (q10 != null) {
            d0.i(context, str, q10.intValue(), d0.f31074c, d0.f31075d);
        }
    }
}
