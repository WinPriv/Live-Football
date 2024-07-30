package com.huawei.hms.ads;

import ca.a;
import com.huawei.hms.ads.jsb.inner.data.AppDownloadInfo;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class ax extends as {
    private static final String Z = "JsbOnDownloadChange";

    /* loaded from: classes2.dex */
    public static class a implements AppDownloadListener {
        private String Code;
        private String I;
        private String V;
        private String Z;
        private Map<String, RemoteCallResultCallback<String>> B = Collections.synchronizedMap(new c(5));
        private Map<String, RemoteCallResultCallback<String>> C = Collections.synchronizedMap(new c(5));
        private Map<String, RemoteCallResultCallback<String>> S = Collections.synchronizedMap(new c(5));
        private Map<String, RemoteCallResultCallback<String>> F = Collections.synchronizedMap(new c(5));

        public a() {
            ex.Code("jsb", "DownloadListener init");
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void Code(com.huawei.openalliance.ad.inter.data.AppInfo appInfo) {
            if (ex.Code()) {
                ex.Code(ax.Z, "onAppOpen with appInfo");
            }
            Map<String, RemoteCallResultCallback<String>> map = this.S;
            if (map == null || map.size() <= 0) {
                return;
            }
            for (RemoteCallResultCallback<String> remoteCallResultCallback : this.S.values()) {
                if (remoteCallResultCallback != null) {
                    ag.Code(remoteCallResultCallback, this.I, 1000, gb.b.p(new AppDownloadInfo(appInfo, da.n.INSTALLED)), false);
                }
            }
        }

        public void I(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            this.S.put(str2, remoteCallResultCallback);
            this.I = str;
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void V(com.huawei.openalliance.ad.inter.data.AppInfo appInfo) {
            if (a0.a.r(this.F)) {
                return;
            }
            for (RemoteCallResultCallback<String> remoteCallResultCallback : this.F.values()) {
                if (remoteCallResultCallback != null) {
                    ag.Code(remoteCallResultCallback, this.Z, 1000, gb.b.p(new AppDownloadInfo(appInfo, da.n.DOWNLOAD)), false);
                }
            }
        }

        public void Z(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            this.F.put(str2, remoteCallResultCallback);
            this.Z = str;
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void Code(com.huawei.openalliance.ad.inter.data.AppInfo appInfo, int i10) {
            AppDownloadTask p10 = com.huawei.openalliance.ad.download.app.a.t().p(appInfo);
            if (p10 != null) {
                Code(ch.Code(p10), appInfo);
            }
            Map<String, RemoteCallResultCallback<String>> map = this.C;
            if (map == null || map.size() <= 0) {
                return;
            }
            Iterator<RemoteCallResultCallback<String>> it = this.C.values().iterator();
            while (it.hasNext()) {
                ag.Code(it.next(), this.V, 1000, gb.b.p(new AppDownloadInfo(appInfo, i10)), false);
            }
        }

        public void V(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            this.C.put(str2, remoteCallResultCallback);
            this.V = str;
        }

        public void Code(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            this.B.put(str2, remoteCallResultCallback);
            this.Code = str;
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void Code(da.n nVar, com.huawei.openalliance.ad.inter.data.AppInfo appInfo) {
            Map<String, RemoteCallResultCallback<String>> map = this.B;
            if (map == null || map.size() <= 0) {
                return;
            }
            for (Map.Entry<String, RemoteCallResultCallback<String>> entry : this.B.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    RemoteCallResultCallback<String> value = entry.getValue();
                    if (value != null) {
                        ag.Code(value, this.Code, 1000, gb.b.p(new AppDownloadInfo(appInfo, nVar)), false);
                    }
                    if (nVar == da.n.DOWNLOADFAILED) {
                        AppDownloadTask p10 = com.huawei.openalliance.ad.download.app.a.t().p(appInfo);
                        Map<String, RemoteCallResultCallback<String>> map2 = this.C;
                        if (map2 != null && map2.size() > 0 && this.C.get(key) != null) {
                            ag.Code(this.C.get(key), this.V, 1000, gb.b.p(new AppDownloadInfo(appInfo, p10 != null ? p10.k() : 0)), false);
                        }
                    }
                }
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void Code(String str) {
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        private static a Code = new a();

        static {
            ex.Code(ax.Z, "register global Jsb app download Listener.");
            ca.a aVar = a.C0042a.f3471a;
            a aVar2 = Code;
            ConcurrentHashMap concurrentHashMap = aVar.f3470a;
            if (aVar2 == null) {
                concurrentHashMap.remove("jsb_listener_key");
            } else {
                concurrentHashMap.put("jsb_listener_key", aVar2);
            }
        }

        private b() {
        }
    }

    /* loaded from: classes2.dex */
    public static class c<K, V> extends LinkedHashMap<K, V> {
        private static final long Code = 8139502072983476335L;
        private final int V;

        public c(int i10) {
            this.V = i10;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            if (size() > this.V) {
                return true;
            }
            return false;
        }
    }

    public ax(String str) {
        super(str);
    }

    public a V() {
        return b.Code;
    }
}
