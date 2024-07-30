package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Content;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;

/* loaded from: classes2.dex */
public final class pf extends rf {
    public pf(Context context) {
        super(context);
    }

    @Override // ka.tf
    public final int b() {
        return 2;
    }

    @Override // ka.rf
    public final String c() {
        return "AppPromoteAdFilter";
    }

    @Override // ka.rf
    public final boolean d(Content content) {
        String x10;
        MetaData n02 = content.n0();
        if (n02 == null) {
            n7.g("AppPromoteAdFilter", "metaData is null");
            return false;
        }
        String g02 = n02.g0();
        ApkInfo k02 = n02.k0();
        if (k02 == null) {
            x10 = null;
        } else {
            x10 = k02.x();
        }
        if (com.huawei.openalliance.ad.ppskit.utils.o2.a(this.f31768a, g02, x10) != null) {
            return false;
        }
        return true;
    }
}
