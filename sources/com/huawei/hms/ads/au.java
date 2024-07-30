package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.ax;
import com.huawei.hms.ads.jsb.inner.data.AppDownloadInfo;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class au extends as {
    private static final String Z = "JsbOnAgReserveStatusChange";

    /* loaded from: classes2.dex */
    public static class a implements ca.b {
        private static final byte[] Code = new byte[0];
        private static a V;
        private String I;
        private Map<String, RemoteCallResultCallback<String>> Z = Collections.synchronizedMap(new ax.c(5));

        private a(Context context) {
            ex.V("jsb", "ReserveStatusListener init");
            da.e.a(context).f27534c = this;
        }

        public static a Code(Context context) {
            a aVar;
            synchronized (Code) {
                if (V == null) {
                    V = new a(context);
                }
                aVar = V;
            }
            return aVar;
        }

        public void Code(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            this.Z.put(str2, remoteCallResultCallback);
            this.I = str;
        }

        @Override // ca.b
        public void Code(String str, int i10) {
            Map<String, RemoteCallResultCallback<String>> map = this.Z;
            if (map == null || map.size() <= 0) {
                return;
            }
            Iterator<RemoteCallResultCallback<String>> it = this.Z.values().iterator();
            while (it.hasNext()) {
                ag.Code(it.next(), this.I, 1000, gb.b.p(new AppDownloadInfo(str, i10)), false);
            }
        }
    }

    public au() {
        super(aj.f);
    }

    @Override // com.huawei.hms.ads.ag, com.huawei.hms.ads.ad
    public void execute(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        a.Code(context).Code(remoteCallResultCallback, this.Code, this.I);
    }
}
