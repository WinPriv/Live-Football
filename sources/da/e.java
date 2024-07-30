package da;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.utils.SafeIntent;
import j7.r;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {
    public static final byte[] f = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public static e f27531g;

    /* renamed from: a, reason: collision with root package name */
    public a f27532a;

    /* renamed from: b, reason: collision with root package name */
    public c f27533b;

    /* renamed from: c, reason: collision with root package name */
    public ca.b f27534c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f27535d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f27536e = new ConcurrentHashMap();

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ex.V("AgReserveDownloadManager", "reserve broadcast.");
            try {
                SafeIntent safeIntent = new SafeIntent(intent);
                String action = safeIntent.getAction();
                if (!"com.huawei.appgallery.reserveappstatus".equals(action)) {
                    ex.I("AgReserveDownloadManager", "inValid para %s.", action);
                } else {
                    e.this.c(safeIntent);
                }
            } catch (IllegalStateException e10) {
                ex.I("AgReserveDownloadManager", "reserve onReceive IllegalStateException: %s", e10.getClass().getSimpleName());
            } catch (Exception e11) {
                ex.I("AgReserveDownloadManager", "reserve onReceive Exception: %s", e11.getClass().getSimpleName());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements RemoteCallResultCallback<String> {
        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public final void onRemoteCallResult(String str, CallResult<String> callResult) {
            ex.V("AgReserveDownloadManager", "reserve app %s.", Integer.valueOf(callResult.getCode()));
        }
    }

    /* loaded from: classes2.dex */
    public class c extends BroadcastReceiver {
        public c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[Catch: Exception -> 0x006b, IllegalStateException -> 0x007e, TryCatch #2 {IllegalStateException -> 0x007e, Exception -> 0x006b, blocks: (B:3:0x000e, B:7:0x0022, B:9:0x0032, B:12:0x0039, B:14:0x0041, B:17:0x004e, B:19:0x0057, B:21:0x005d, B:24:0x0061), top: B:2:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[Catch: Exception -> 0x006b, IllegalStateException -> 0x007e, TryCatch #2 {IllegalStateException -> 0x007e, Exception -> 0x006b, blocks: (B:3:0x000e, B:7:0x0022, B:9:0x0032, B:12:0x0039, B:14:0x0041, B:17:0x004e, B:19:0x0057, B:21:0x005d, B:24:0x0061), top: B:2:0x000e }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onReceive(android.content.Context r7, android.content.Intent r8) {
            /*
                r6 = this;
                java.lang.String r0 = "AgReserveDownloadManager"
                java.lang.String r1 = "silent reserve broadcast."
                com.huawei.hms.ads.ex.V(r0, r1)
                da.e r1 = da.e.this
                r1.getClass()
                r2 = 1
                r3 = 0
                com.huawei.openalliance.ad.utils.SafeIntent r4 = new com.huawei.openalliance.ad.utils.SafeIntent     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                r4.<init>(r8)     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                java.lang.String r8 = r4.getAction()     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                java.lang.String r5 = "com.huawei.hms.pps.action.APP_RESERVE_STATUS_CHANGED"
                boolean r5 = r5.equals(r8)     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                if (r5 == 0) goto L61
                if (r7 != 0) goto L22
                goto L61
            L22:
                java.lang.String r8 = "callerpackage"
                java.lang.String r8 = r4.getStringExtra(r8)     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                java.lang.String r7 = r7.getPackageName()     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                if (r5 != 0) goto L3e
                boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                if (r5 == 0) goto L39
                goto L3e
            L39:
                boolean r5 = android.text.TextUtils.equals(r8, r7)     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                goto L3f
            L3e:
                r5 = r3
            L3f:
                if (r5 != 0) goto L4e
                java.lang.String r1 = "caller does not match, caller %s, currentPackage %s."
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                r4[r3] = r8     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                r4[r2] = r7     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                com.huawei.hms.ads.ex.V(r0, r1, r4)     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                goto L90
            L4e:
                java.lang.String r7 = "reserveappstatus"
                r8 = -1
                int r7 = r4.getIntExtra(r7, r8)     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                if (r7 != 0) goto L5d
                java.lang.String r7 = "silent reserve failed no need to notify"
                com.huawei.hms.ads.ex.V(r0, r7)     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                goto L90
            L5d:
                r1.c(r4)     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                goto L90
            L61:
                java.lang.String r7 = "reserve onReceive inValid para %s."
                java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                r1[r3] = r8     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                com.huawei.hms.ads.ex.I(r0, r7, r1)     // Catch: java.lang.Exception -> L6b java.lang.IllegalStateException -> L7e
                goto L90
            L6b:
                r7 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r2]
                java.lang.Class r7 = r7.getClass()
                java.lang.String r7 = r7.getSimpleName()
                r8[r3] = r7
                java.lang.String r7 = "silent reserve onReceive Exception: %s"
                com.huawei.hms.ads.ex.I(r0, r7, r8)
                goto L90
            L7e:
                r7 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r2]
                java.lang.Class r7 = r7.getClass()
                java.lang.String r7 = r7.getSimpleName()
                r8[r3] = r7
                java.lang.String r7 = "silent reserve onReceive IllegalStateException: %s"
                com.huawei.hms.ads.ex.I(r0, r7, r8)
            L90:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: da.e.c.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    public e(Context context) {
        String str;
        this.f27535d = context.getApplicationContext();
        try {
            d();
        } catch (IllegalStateException unused) {
            str = "registerReceiver IllegalStateException";
            ex.I("AgReserveDownloadManager", str);
        } catch (Exception unused2) {
            str = "registerReceiver Exception";
            ex.I("AgReserveDownloadManager", str);
        }
    }

    public static e a(Context context) {
        e eVar;
        synchronized (f) {
            if (f27531g == null) {
                f27531g = new e(context);
            }
            eVar = f27531g;
        }
        return eVar;
    }

    public final void b(AppDownloadTask appDownloadTask) {
        Context context = this.f27535d;
        b bVar = new b();
        JSONObject jSONObject = new JSONObject();
        try {
            r.h(appDownloadTask, jSONObject);
            ha.i.e(context).d("reserveDownloadApp", jSONObject.toString(), bVar, String.class);
        } catch (JSONException unused) {
            r.i(bVar, "reserveDownloadApp JSONException", "reserveDownloadApp");
        }
    }

    public final void c(SafeIntent safeIntent) {
        WeakHashMap weakHashMap;
        String stringExtra = safeIntent.getStringExtra("reserveapp");
        int intExtra = safeIntent.getIntExtra("reserveappstatus", -1);
        ex.V("AgReserveDownloadManager", "reserve status: %s", Integer.valueOf(intExtra));
        if (intExtra == 2) {
            intExtra = 1;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            ex.V("AgReserveDownloadManager", "pkg is null");
            return;
        }
        synchronized (this) {
            weakHashMap = (WeakHashMap) this.f27536e.get(stringExtra);
        }
        if (weakHashMap != null && weakHashMap.size() > 0) {
            for (ca.c cVar : weakHashMap.keySet()) {
                if (cVar != null) {
                    cVar.Code(stringExtra, intExtra);
                }
            }
        }
        ca.b bVar = this.f27534c;
        if (bVar != null) {
            bVar.Code(stringExtra, intExtra);
        }
    }

    public final void d() {
        this.f27532a = new a();
        IntentFilter intentFilter = new IntentFilter("com.huawei.appgallery.reserveappstatus");
        a aVar = this.f27532a;
        Context context = this.f27535d;
        context.registerReceiver(aVar, intentFilter, "com.huawei.appmarket.RECV_THIRD_COMMON_MSG", null);
        this.f27533b = new c();
        context.registerReceiver(this.f27533b, new IntentFilter("com.huawei.hms.pps.action.APP_RESERVE_STATUS_CHANGED"), "com.huawei.permission.app.DOWNLOAD", null);
    }
}
