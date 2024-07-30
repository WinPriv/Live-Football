package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Content;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;

/* loaded from: classes2.dex */
public final class qf extends rf {
    public qf(Context context) {
        super(context);
    }

    @Override // ka.tf
    public final int b() {
        return 4;
    }

    @Override // ka.rf
    public final String c() {
        return "AppPropagandaFilter";
    }

    @Override // ka.rf
    public final boolean d(Content content) {
        String str;
        MetaData n02 = content.n0();
        if (n02 == null) {
            str = "isNeedDiscard metaData is null";
        } else {
            ApkInfo k02 = n02.k0();
            if (k02 == null) {
                str = "isNeedDiscard apkInfo is null";
            } else {
                String x10 = k02.x();
                Context context = this.f31768a;
                if (!com.huawei.openalliance.ad.ppskit.utils.o2.c(context, x10) || com.huawei.openalliance.ad.ppskit.utils.o2.a(context, n02.g0(), k02.x()) != null) {
                    return false;
                }
                n7.g("AppPropagandaFilter", "isNeedDiscard intent check fail");
                return true;
            }
        }
        n7.g("AppPropagandaFilter", str);
        return false;
    }
}
