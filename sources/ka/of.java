package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Content;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;

/* loaded from: classes2.dex */
public final class of extends rf {
    public of(Context context) {
        super(context);
    }

    @Override // ka.tf
    public final int b() {
        return 1;
    }

    @Override // ka.rf
    public final String c() {
        return "AppInstallAdFilter";
    }

    @Override // ka.rf
    public final boolean d(Content content) {
        String str;
        MetaData n02 = content.n0();
        if (n02 == null) {
            str = "metaData is null";
        } else {
            ApkInfo k02 = n02.k0();
            if (k02 == null) {
                str = "apkInfo is null";
            } else {
                return com.huawei.openalliance.ad.ppskit.utils.o2.c(this.f31768a, k02.x());
            }
        }
        n7.g("AppInstallAdFilter", str);
        return false;
    }
}
