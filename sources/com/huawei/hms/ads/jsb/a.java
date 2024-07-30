package com.huawei.hms.ads.jsb;

import android.content.Context;
import android.text.TextUtils;
import androidx.transition.n;
import ca.c;
import com.huawei.hms.ads.cl;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.listeners.IAppDownloadManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class a {
    private static final String Code = "JsbHelper";
    private static final byte[] V = new byte[0];
    private static a Z;
    private Context B;
    private Map<String, c> I = new ConcurrentHashMap();

    /* renamed from: com.huawei.hms.ads.jsb.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0275a {
        private static IAppDownloadManager Code = (IAppDownloadManager) n.l();

        private C0275a() {
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements c {
        private AppInfo Code;
        private AppDownloadTask V;

        public b(AppInfo appInfo) {
            this.Code = appInfo;
            if (appInfo != null) {
                com.huawei.openalliance.ad.download.app.a.t().q(appInfo, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Code() {
            com.huawei.openalliance.ad.download.app.a.t().w(this.Code, this);
        }

        @Override // ca.c
        public void V(AppDownloadTask appDownloadTask) {
        }

        @Override // ca.c
        public void V(String str) {
        }

        @Override // ca.c
        public void Code(AppDownloadTask appDownloadTask) {
        }

        @Override // ca.c
        public void Code(String str) {
            if (this.V != null || this.Code == null) {
                return;
            }
            this.V = com.huawei.openalliance.ad.download.app.a.t().p(this.Code);
        }

        @Override // ca.b
        public void Code(String str, int i10) {
        }

        @Override // ca.c
        public void I(String str) {
        }
    }

    private a(Context context) {
        this.B = context.getApplicationContext();
    }

    public static a Code(Context context) {
        return V(context);
    }

    private static a V(Context context) {
        a aVar;
        synchronized (V) {
            if (Z == null) {
                Z = new a(context);
            }
            aVar = Z;
        }
        return aVar;
    }

    public IAppDownloadManager Code() {
        return C0275a.Code;
    }

    public void Code(JsbConfig jsbConfig) {
        synchronized (V) {
            if (jsbConfig != null) {
                HiAd.getInstance(this.B).enableUserInfo(jsbConfig.Code());
                HiAd.getInstance(this.B).initLog(jsbConfig.Z(), 3);
                if (cl.V(this.B)) {
                    HiAd.getInstance(this.B).initGrs(jsbConfig.V());
                } else {
                    HiAd.getInstance(this.B).initGrs(jsbConfig.V(), jsbConfig.I());
                }
            }
        }
    }

    public synchronized void Code(String str) {
        if (!TextUtils.isEmpty(str) && this.I.get(str) != null) {
            ((b) this.I.get(str)).Code();
            this.I.remove(str);
        }
    }

    public synchronized void Code(String str, AppInfo appInfo) {
        if (appInfo != null) {
            if (!TextUtils.isEmpty(str) && this.I.get(str) == null) {
                this.I.put(str, new b(appInfo));
            }
        }
    }
}
