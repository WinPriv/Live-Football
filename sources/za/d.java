package za;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.activity.n;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import com.huawei.openalliance.ad.ppskit.handlers.s;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import com.huawei.openalliance.ad.ppskit.utils.h;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.x;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import e0.i;
import java.io.File;
import ka.b5;
import ka.d5;
import ka.f5;
import ka.h5;
import ka.n7;

/* loaded from: classes2.dex */
public final class d {

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f37356s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SourceParam f37357t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f37358u;

        public a(Context context, SourceParam sourceParam, String str) {
            this.f37356s = context;
            this.f37357t = sourceParam;
            this.f37358u = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            s.n(this.f37356s).o(d.a(this.f37357t), this.f37358u);
        }
    }

    public static ContentResource a(SourceParam sourceParam) {
        String b10;
        Integer q10;
        int intValue;
        if (n7.d()) {
            n7.c("SourceFetcherUtil", "generateContentResource: %s", sourceParam.r());
        }
        try {
            ContentRecord w10 = sourceParam.w();
            if (w10 != null && !TextUtils.isEmpty(w10.h())) {
                ContentResource contentResource = new ContentResource(w10);
                if (sourceParam.D()) {
                    b10 = b(sourceParam.r()) + x.z(sourceParam.r());
                } else {
                    b10 = b(sourceParam.r());
                }
                contentResource.A(b10);
                Integer q11 = y1.q(w10.v1());
                if (q11 == null) {
                    q11 = Integer.valueOf(n.v(w10.z0()));
                }
                contentResource.D(q11.intValue());
                contentResource.F(w10.d2());
                String m02 = w10.m0();
                Integer J = sourceParam.J();
                n7.c("SourceFetcherUtil", "content down method: %s, download source: %s", m02, J);
                if (J != null) {
                    intValue = J.intValue();
                } else {
                    if (!y1.h(m02) && (q10 = y1.q(m02)) != null) {
                        intValue = q10.intValue();
                    }
                    contentResource.J(sourceParam.y());
                    contentResource.L(0);
                    contentResource.M(sourceParam.C());
                    contentResource.z(System.currentTimeMillis());
                    return contentResource;
                }
                contentResource.N(intValue);
                contentResource.J(sourceParam.y());
                contentResource.L(0);
                contentResource.M(sourceParam.C());
                contentResource.z(System.currentTimeMillis());
                return contentResource;
            }
            return null;
        } catch (Throwable th) {
            i.p(th, "generateContentResource ", "SourceFetcherUtil");
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String Q = androidx.transition.n.Q(str);
        if (TextUtils.isEmpty(Q)) {
            return String.valueOf(str.hashCode());
        }
        return Q;
    }

    public static void c(Context context, String str, d5 d5Var, SourceParam sourceParam, String str2) {
        h5 h5Var;
        if (d5Var != null && sourceParam != null) {
            d5Var.m(context, str);
            ContentRecord w10 = sourceParam.w();
            if (w10 != null) {
                p2.a(new a(context, sourceParam, str2), 10);
                Integer q10 = y1.q(w10.v1());
                if (q10 == null) {
                    q10 = Integer.valueOf(n.v(w10.z0()));
                }
                int intValue = q10.intValue();
                f5 b10 = d5Var.b(context, true);
                if (b10 == null) {
                    n7.g(d5Var.f31090d, "fileDiskCache is null");
                    return;
                }
                String k10 = d5.k(str);
                if (!TextUtils.isEmpty(k10) && new File(b10.f31158c, k10).exists() && (h5Var = b10.f31159d) != null) {
                    p2.a(new b5((h) h5Var, k10, intValue), 10);
                    return;
                }
                return;
            }
            n7.e("SourceFetcherUtil", "updateOnCacheUri, contentRecord is null");
        }
    }
}
