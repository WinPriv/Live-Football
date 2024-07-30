package ab;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.v;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.local.AppLocalDownloadTask;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.o2;
import ka.ii;
import ka.n7;

/* loaded from: classes2.dex */
public final class i extends ii {
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public String f400g;

    public i(Context context, ContentRecord contentRecord) {
        super(context, contentRecord);
        this.f = 1;
    }

    @Override // ka.ii
    public final boolean a() {
        String str;
        n7.e("OpenMiniPageAction", "handle OpenMiniPageAction");
        ContentRecord contentRecord = this.f31308b;
        if (contentRecord != null && contentRecord.j0() != null) {
            AppInfo j02 = contentRecord.j0();
            if (j02 != null && o2.c(this.f31307a, j02.getPackageName())) {
                str = "app installed";
            } else {
                AppLocalDownloadTask t10 = sa.b.q().t(j02);
                if (t10 != null) {
                    t10.s(Integer.valueOf(this.f));
                    t10.z(contentRecord.p2());
                    t10.A(contentRecord.v0());
                    t10.E(contentRecord.h());
                    t10.w(contentRecord.j2());
                    t10.u(contentRecord.K0());
                    if (TextUtils.isEmpty(t10.D())) {
                        t10.B(contentRecord.h1());
                        t10.C(contentRecord.n1());
                    }
                    t10.H(contentRecord.Z0());
                    t10.v(contentRecord.a1());
                    t10.t(this.f400g);
                } else {
                    if (j02 == null) {
                        t10 = null;
                    } else {
                        t10 = new AppLocalDownloadTask();
                        t10.setAllowedMobileNetowrk(false);
                        t10.r(j02);
                        t10.h(j02.getDownloadUrl());
                        t10.i(j02.getSha256());
                        t10.a(j02.getFileSize());
                        t10.d();
                        AppLocalDownloadTask.q(t10, j02);
                    }
                    if (t10 != null) {
                        t10.s(Integer.valueOf(this.f));
                        t10.t(this.f400g);
                        t10.p(contentRecord);
                        t10.A(contentRecord.v0());
                        t10.z(contentRecord.p2());
                        t10.E(contentRecord.h());
                        t10.w(contentRecord.j2());
                        t10.B(contentRecord.h1());
                        t10.C(contentRecord.n1());
                        t10.u(contentRecord.K0());
                        t10.H(contentRecord.Z0());
                        t10.v(contentRecord.a1());
                    }
                }
                if (t10 == null) {
                    str = "downloadTask is null";
                } else {
                    sa.b.q().r(t10);
                    this.f31309c = v.F;
                    return true;
                }
            }
        } else {
            str = "getAppInfo is null";
        }
        n7.e("OpenMiniPageAction", str);
        return c();
    }
}
