package ib;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.activity.SafeIntent;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ka.lh;
import ka.n7;

/* loaded from: classes2.dex */
public final class k extends y6.m {
    public static final byte[] f = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public static volatile k f29496g;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.activity.n f29497d;

    /* renamed from: e, reason: collision with root package name */
    public final m f29498e;

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                SafeIntent safeIntent = new SafeIntent(intent);
                String action = safeIntent.getAction();
                String dataString = safeIntent.getDataString();
                if (TextUtils.isEmpty(dataString)) {
                    n7.g("ATCOaidManager", "unInstallReceiver dataString is empty, " + action);
                    return;
                }
                String substring = dataString.substring(8);
                if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    boolean booleanExtra = safeIntent.getBooleanExtra("android.intent.extra.REPLACING", false);
                    n7.f("ATCOaidManager", "isReplacing %s", Boolean.valueOf(booleanExtra));
                    if (!booleanExtra) {
                        k kVar = k.this;
                        kVar.getClass();
                        if (!TextUtils.isEmpty(substring)) {
                            p2.d(new l(kVar, substring));
                        }
                    }
                }
            } catch (Throwable th) {
                n7.j("ATCOaidManager", "unInstallReceiver exception, %s", th.getClass().getSimpleName());
            }
        }
    }

    public k(Context context) {
        super(context);
        lh lhVar;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_REMOVED");
        a aVar = new a();
        this.f29497d = new androidx.activity.n();
        boolean a10 = ((y) this.f36804a).a();
        this.f29498e = new m((Context) this.f36806c, a10);
        synchronized (lh.f31426b) {
            if (lh.f31427c == null) {
                lh.f31427c = new lh();
            }
            lhVar = lh.f31427c;
        }
        lhVar.f31428a.put(aVar, intentFilter);
        if (a10) {
            p2.a(new w(context), 19);
        }
    }

    public static k j(Context context) {
        if (f29496g == null) {
            synchronized (f) {
                if (f29496g == null) {
                    f29496g = new k(context);
                }
            }
        }
        return f29496g;
    }

    @Override // y6.m
    public final String b() {
        String str;
        synchronized (this.f36805b) {
            try {
                SharedPreferences d10 = this.f29498e.d();
                if (!d10.contains("app_track")) {
                    d10.edit().putBoolean("app_track", false).apply();
                }
                Map<String, ?> all = d10.getAll();
                HashMap hashMap = new HashMap();
                if (!a0.a.e0(all)) {
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        if (entry != null && !TextUtils.isEmpty(entry.getKey()) && (entry.getValue() instanceof Boolean)) {
                            String key = entry.getKey();
                            Boolean bool = (Boolean) entry.getValue();
                            if (this.f29497d.b0((Context) this.f36806c, key)) {
                                this.f29498e.a(key);
                            } else {
                                hashMap.put(key, bool);
                            }
                        }
                    }
                }
                str = "";
                if (!a0.a.e0(hashMap)) {
                    str = y0.q(null, hashMap);
                }
                v.c((Context) this.f36806c, (y) this.f36804a, m(), Boolean.FALSE, false, false, false);
            } catch (Throwable th) {
                n7.h("ATCOaidManager", "getAppTrackSwitches ex: %s", th.getClass().getSimpleName());
                return "";
            }
        }
        return str;
    }

    @Override // com.huawei.opendevice.open.IOaidManager
    public final String getOpenAnonymousID(String str) {
        String e10;
        synchronized (this.f36805b) {
            try {
                y yVar = (y) this.f36804a;
                if (isLimitTracking(str)) {
                    yVar.getClass();
                    e10 = "00000000-0000-0000-0000-000000000000";
                } else {
                    e10 = yVar.e();
                }
            } catch (Throwable th) {
                n7.h("ATCOaidManager", "getOpenAnonymousID %s", th.getClass().getSimpleName());
                return "";
            }
        }
        return e10;
    }

    @Override // com.huawei.opendevice.open.IOaidManager
    public final boolean isLimitTracking(String str) {
        boolean l10;
        synchronized (this.f36805b) {
            try {
                l10 = l(str);
                n7.c("ATCOaidManager", "check %s track limit: %s", str, Boolean.valueOf(l10));
                v.c((Context) this.f36806c, (y) this.f36804a, m(), Boolean.FALSE, false, false, false);
            } catch (Throwable th) {
                n7.g("ATCOaidManager", "isLimitTracking ".concat(th.getClass().getSimpleName()));
                return true;
            }
        }
        return l10;
    }

    public final void k(List<String> list) {
        synchronized (this.f36805b) {
            try {
                m mVar = this.f29498e;
                mVar.getClass();
                if (!androidx.transition.n.M(list)) {
                    SharedPreferences.Editor edit = mVar.d().edit();
                    for (String str : list) {
                        if (!TextUtils.equals("app_track", str) && !TextUtils.isEmpty(str)) {
                            edit.remove(str);
                        }
                    }
                    edit.apply();
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.k.l(java.lang.String):boolean");
    }

    public final String m() {
        boolean z10;
        if (!com.huawei.openalliance.ad.ppskit.utils.e0.a((Context) this.f36806c) && !this.f29498e.c()) {
            z10 = false;
        } else {
            z10 = true;
        }
        y yVar = (y) this.f36804a;
        if (z10) {
            yVar.getClass();
            return "00000000-0000-0000-0000-000000000000";
        }
        return yVar.e();
    }

    @Override // com.huawei.opendevice.open.IOaidManager
    public final String resetAnonymousId(Boolean bool) {
        String b10;
        synchronized (this.f36805b) {
            try {
                n7.b("ATCOaidManager", "resetAnonymousId");
                b10 = ((y) this.f36804a).b();
                v.c((Context) this.f36806c, (y) this.f36804a, m(), Boolean.TRUE, true, true, false);
            } catch (Throwable th) {
                n7.g("ATCOaidManager", "resetAnonymousId ".concat(th.getClass().getSimpleName()));
                return "";
            }
        }
        return b10;
    }
}
