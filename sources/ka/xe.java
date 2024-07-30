package ka;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class xe {

    /* renamed from: a, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.l f32192a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f32193a;

        /* renamed from: b, reason: collision with root package name */
        public String f32194b;
    }

    public xe(Context context) {
        this.f32192a = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
    }

    public final String a(String str) {
        String string;
        StringBuffer stringBuffer = new StringBuffer();
        com.huawei.openalliance.ad.ppskit.handlers.l lVar = this.f32192a;
        synchronized (lVar.f22585a) {
            string = lVar.G(str).getString("r_d", null);
        }
        if (TextUtils.isEmpty(string)) {
            HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
            string = UUID.randomUUID().toString().replaceAll("-", "");
            com.huawei.openalliance.ad.ppskit.handlers.l lVar2 = this.f32192a;
            synchronized (lVar2.f22585a) {
                lVar2.G(str).edit().putString("r_d", string).commit();
            }
        }
        stringBuffer.append(string);
        stringBuffer.append("_");
        byte[] bArr = new byte[7];
        com.huawei.openalliance.ad.ppskit.utils.u1.j().nextBytes(bArr);
        stringBuffer.append(androidx.transition.n.w(bArr));
        stringBuffer.append("_1");
        return stringBuffer.toString();
    }
}
