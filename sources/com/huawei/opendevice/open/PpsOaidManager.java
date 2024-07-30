package com.huawei.opendevice.open;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import com.huawei.openalliance.ad.ppskit.utils.e0;
import ib.v;
import ib.y;
import ka.Cif;
import ka.n7;
import y6.m;

@OuterVisible
/* loaded from: classes2.dex */
public final class PpsOaidManager extends m {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f24217d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static PpsOaidManager f24218e;

    public PpsOaidManager(Context context) {
        super(context);
    }

    @OuterVisible
    public static PpsOaidManager getInstance(Context context) {
        PpsOaidManager ppsOaidManager;
        synchronized (f24217d) {
            if (f24218e == null) {
                f24218e = new PpsOaidManager(context);
            }
            ppsOaidManager = f24218e;
        }
        return ppsOaidManager;
    }

    @Override // com.huawei.opendevice.open.IOaidManager
    public final String getOpenAnonymousID(String str) {
        String c10;
        synchronized (this.f36805b) {
            try {
                c10 = ((y) this.f36804a).c();
                v.b((Context) this.f36806c, (y) this.f36804a, Boolean.FALSE, false);
            } catch (Throwable th) {
                n7.g("PpsOaidManager", "getOpenAnonymousID ".concat(th.getClass().getSimpleName()));
                return "";
            }
        }
        return c10;
    }

    @Override // com.huawei.opendevice.open.IOaidManager
    public final boolean isLimitTracking(String str) {
        boolean a10;
        synchronized (this.f36805b) {
            try {
                a10 = ((y) this.f36804a).a();
                v.b((Context) this.f36806c, (y) this.f36804a, Boolean.FALSE, false);
            } catch (Throwable th) {
                n7.g("PpsOaidManager", "isLimitTracking ".concat(th.getClass().getSimpleName()));
                return true;
            }
        }
        return a10;
    }

    @OuterVisible
    public boolean isLimitTrackingForShow() {
        boolean z10;
        synchronized (this.f36805b) {
            try {
                y yVar = (y) this.f36804a;
                Context context = yVar.f29530b;
                if (Cif.c(context) && !e0.a(context)) {
                    z10 = yVar.d().getBoolean("oaid_track_limit", false);
                    v.b((Context) this.f36806c, (y) this.f36804a, Boolean.FALSE, false);
                }
                z10 = true;
                v.b((Context) this.f36806c, (y) this.f36804a, Boolean.FALSE, false);
            } catch (Throwable th) {
                n7.g("PpsOaidManager", "isLimitTrackingForShow ".concat(th.getClass().getSimpleName()));
                return false;
            }
        }
        return z10;
    }

    @Override // com.huawei.opendevice.open.IOaidManager
    public final String resetAnonymousId(Boolean bool) {
        String b10;
        synchronized (this.f36805b) {
            try {
                b10 = ((y) this.f36804a).b();
                v.b((Context) this.f36806c, (y) this.f36804a, bool, true);
            } catch (Throwable th) {
                n7.g("PpsOaidManager", "resetAnonymousId ".concat(th.getClass().getSimpleName()));
                return "";
            }
        }
        return b10;
    }
}
