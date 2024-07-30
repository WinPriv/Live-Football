package com.huawei.openalliance.ad.ppskit.net.http;

import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import ka.n7;
import okhttp3.Dns;

/* loaded from: classes2.dex */
public final class i implements Dns {

    /* renamed from: s, reason: collision with root package name */
    public static final Dns f22785s = Dns.SYSTEM;

    @Override // okhttp3.Dns
    public final List<InetAddress> lookup(String str) {
        boolean z10;
        boolean z11 = true;
        n7.c("OkHttpDNS", "lookup for :%s", y1.j(str));
        ArrayList arrayList = new ArrayList();
        try {
            Class.forName("com.huawei.hms.dnsbackup.DNSBackup");
            z10 = true;
        } catch (Throwable unused) {
            n7.g("DNSUtil", "check DNSBackup available error");
            z10 = false;
        }
        if (z10) {
            arrayList = com.huawei.openalliance.ad.ppskit.utils.g.g(str);
        } else {
            try {
                Class.forName("com.huawei.hms.framework.network.restclient.dnkeeper.DNKeeperManager");
            } catch (Throwable unused2) {
                n7.g("DNSUtil", "check DNKeeperManager available error");
                z11 = false;
            }
            if (z11) {
                arrayList = com.huawei.openalliance.ad.ppskit.utils.g.c(str);
            }
        }
        if (arrayList.isEmpty()) {
            return f22785s.lookup(str);
        }
        return arrayList;
    }
}
