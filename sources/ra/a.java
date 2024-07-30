package ra;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.o2;

/* loaded from: classes2.dex */
public final class a extends z6.f {
    public a() {
        super(2);
    }

    @Override // z6.f
    public final boolean g(Context context, AppInfo appInfo, String str) {
        return o2.g(context, str, appInfo.getIntentUri());
    }

    @Override // z6.f
    public final boolean h(Context context, String str) {
        return o2.m(context, str);
    }
}
