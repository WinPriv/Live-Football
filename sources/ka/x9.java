package ka;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.hquic.HQUICManager;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.ShareNetworkKit;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.net.http.d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class x9 {

    /* renamed from: g, reason: collision with root package name */
    public static x9 f32177g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f32178h = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final Context f32179a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f32180b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f32181c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f32182d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f32183e = new byte[0];
    public final com.huawei.openalliance.ad.ppskit.handlers.l f;

    /* loaded from: classes2.dex */
    public static class a implements HQUICManager.HQUICInitCallback {
    }

    public x9(Context context) {
        this.f32179a = context.getApplicationContext();
        this.f = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
    }

    public static x9 a(Context context) {
        x9 x9Var;
        synchronized (f32178h) {
            if (f32177g == null) {
                f32177g = new x9(context);
            }
            x9Var = f32177g;
        }
        return x9Var;
    }

    public final void b(int i10) {
        NetworkKit.init(this.f32179a, new w9());
    }

    public final void c(String str) {
        int C;
        synchronized (this.f32183e) {
            Log.i("QuicNetworkKit", "setUp");
            try {
                C = this.f.C(str);
                n7.e("QuicNetworkKit", "networkkit configure:" + C);
            } catch (Throwable th) {
                n7.h("QuicNetworkKit", "setUp network kit err, %s", th.getClass().getSimpleName());
            }
            if (com.huawei.openalliance.ad.ppskit.utils.k1.b() && (C == 1 || C == 2)) {
                if (!this.f32180b) {
                    if (C == 2 && com.huawei.openalliance.ad.ppskit.utils.k1.d()) {
                        this.f32181c = true;
                        HQUICManager.asyncInit(this.f32179a.getApplicationContext(), "huawei_module_quic_pro", new a());
                    }
                    n7.e("QuicNetworkKit", "init network kit");
                    if (!com.huawei.openalliance.ad.ppskit.utils.d0.m(this.f32179a)) {
                        b(C);
                    } else if (ShareNetworkKit.isInit()) {
                        this.f32180b = true;
                        e();
                    }
                } else {
                    if (C == 2) {
                        d(str);
                    } else {
                        n7.e("QuicNetworkKit", "if quic open, can not close quic until app restart.");
                    }
                    n7.e("QuicNetworkKit", "network kit has been init");
                }
                return;
            }
            this.f32180b = false;
            n7.e("QuicNetworkKit", "not support network kit");
        }
    }

    public final void d(String str) {
        boolean z10;
        String str2;
        if (!this.f32180b) {
            n7.e("QuicNetworkKit", "configureQuicHint isNetworkKitEnable:" + this.f32180b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("adxServer");
        ArrayList arrayList2 = new ArrayList();
        n7.c("QuicNetworkKit", "callPkg:%s", str);
        if (!TextUtils.isEmpty(str) && com.huawei.openalliance.ad.ppskit.utils.d0.q(this.f32179a, str)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str2 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f32179a).l(str);
            n7.c("QuicNetworkKit", "test countryCode:%s", str2);
        } else {
            Context context = this.f32179a;
            String a10 = a0.a.K(context).a();
            com.huawei.openalliance.ad.ppskit.utils.q1.m(context).R(a10);
            str2 = a10;
        }
        if (!TextUtils.isEmpty(str2)) {
            Context context2 = this.f32179a;
            if (com.huawei.openalliance.ad.ppskit.utils.h.a(context2).c()) {
                if (Cif.a(context2).d()) {
                    str2 = "CN";
                } else if (str2.equalsIgnoreCase("CN")) {
                    n7.e("QuicNetworkKit", "country code not match device region, reset to UNKNOWN.");
                    str2 = "UNKNOWN";
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String c10 = ConfigSpHandler.b(this.f32179a).c((String) it.next(), str2);
                if (!TextUtils.isEmpty(c10)) {
                    arrayList2.add(c10);
                    n7.c("QuicNetworkKit", "get quic url: %s", c10);
                }
            }
        }
        if (arrayList2.size() > 0 && !this.f32182d) {
            NetworkKit.getInstance().addQuicHint(true, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            this.f32182d = true;
            n7.e("QuicNetworkKit", "add quic success.");
        } else {
            n7.f("QuicNetworkKit", "add quic url, quicUrlList is empty or hasAddQuicHint: %s", Boolean.valueOf(this.f32182d));
        }
        e();
    }

    public final void e() {
        Context context = this.f32179a;
        com.huawei.openalliance.ad.ppskit.net.http.h hVar = new com.huawei.openalliance.ad.ppskit.net.http.h(context);
        d.b bVar = new d.b(context);
        bVar.f = 2;
        bVar.f22767i = this.f32181c;
        com.huawei.openalliance.ad.ppskit.net.http.d dVar = new com.huawei.openalliance.ad.ppskit.net.http.d(bVar);
        Log.i("NetworkKitCaller", "preCreateHttpClient.");
        try {
            hVar.f(dVar);
        } catch (Throwable th) {
            n7.h("NetworkKitCaller", "preCreateHttpClient error: %s", th.getClass().getSimpleName());
        }
    }
}
