package fa;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.ads.ce;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.uiengine.IGlobalUtil;
import com.huawei.hms.ads.uiengine.IPPSUiEngineCallback;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.constant.bw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.media.IMultiMediaPlayingManager;
import gb.b0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h extends IGlobalUtil.b {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f28235c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static h f28236d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28237a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f28238b;

    /* loaded from: classes2.dex */
    public class a implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28239a;

        public a(String str) {
            this.f28239a = str;
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            return (String) ha.c.c(h.this.f28238b).b(String.class, com.huawei.openalliance.ad.constant.s.f22128x, this.f28239a, false).getData();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28241a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28242b;

        public b(String str, int i10) {
            this.f28241a = str;
            this.f28242b = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String call() {
            /*
                r8 = this;
                fa.h r0 = fa.h.this
                android.content.Context r1 = r0.f28238b
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L9
                goto L22
            L9:
                java.lang.Integer r1 = gb.r0.o(r1)
                if (r1 == 0) goto L1b
                int r1 = r1.intValue()
                r4 = 30462300(0x1d0d15c, float:7.670755E-38)
                if (r1 >= r4) goto L19
                goto L1b
            L19:
                r1 = r2
                goto L23
            L1b:
                java.lang.String r1 = "HiAdTools"
                java.lang.String r4 = "hms version is too low to support query by type."
                com.huawei.hms.ads.ex.V(r1, r4)
            L22:
                r1 = r3
            L23:
                android.content.Context r0 = r0.f28238b
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                java.lang.String r5 = r8.f28241a
                java.lang.String r6 = "queryContentPath"
                if (r1 == 0) goto L60
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                java.lang.String r7 = "url"
                r1.put(r7, r5)     // Catch: java.lang.Throwable -> L3f
                java.lang.String r5 = "apiVer"
                int r7 = r8.f28242b     // Catch: java.lang.Throwable -> L3f
                r1.put(r5, r7)     // Catch: java.lang.Throwable -> L3f
                goto L53
            L3f:
                r5 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Class r5 = r5.getClass()
                java.lang.String r5 = r5.getSimpleName()
                r2[r3] = r5
                java.lang.String r5 = "GlobalUtil"
                java.lang.String r7 = "make param err: %s"
                com.huawei.hms.ads.ex.V(r5, r7, r2)
            L53:
                ha.c r0 = ha.c.c(r0)
                java.lang.String r1 = r1.toString()
                com.huawei.openalliance.ad.ipc.CallResult r0 = r0.b(r4, r6, r1, r3)
                goto L68
            L60:
                ha.c r0 = ha.c.c(r0)
                com.huawei.openalliance.ad.ipc.CallResult r0 = r0.b(r4, r6, r5, r3)
            L68:
                java.lang.Object r0 = r0.getData()
                java.lang.String r0 = (java.lang.String) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fa.h.b.call():java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements RemoteCallResultCallback<String> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f28244a;

        /* renamed from: b, reason: collision with root package name */
        public final IPPSUiEngineCallback f28245b;

        /* renamed from: c, reason: collision with root package name */
        public final String f28246c;

        public c(Context context, IPPSUiEngineCallback iPPSUiEngineCallback, String str) {
            this.f28244a = context;
            this.f28245b = iPPSUiEngineCallback;
            this.f28246c = str;
        }

        public final String a() {
            String str = this.f28246c;
            Context context = this.f28244a;
            if (!b0.d(ha.i.e(context).f())) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("url", str);
                        CallResult b10 = ha.c.c(context).b(String.class, com.huawei.openalliance.ad.constant.s.f22129z, jSONObject.toString(), true);
                        if (200 == b10.getCode()) {
                            ex.V("GlobalUtil", "getFilePathFromKit success");
                            String optString = new JSONObject((String) b10.getData()).optString("filePath");
                            ex.V("GlobalUtil", "filepath from kit : %s", optString);
                            return optString;
                        }
                    } catch (Throwable th) {
                        ex.I("GlobalUtil", "getFilePathFromKit err: %s", th.getClass().getSimpleName());
                    }
                } catch (Throwable th2) {
                    ex.V("GlobalUtil", "get path err: %s", th2.getClass().getSimpleName());
                }
            }
            return null;
        }

        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public final void onRemoteCallResult(String str, CallResult<String> callResult) {
            try {
                boolean f = gb.p.f(callResult.getData());
                IPPSUiEngineCallback iPPSUiEngineCallback = this.f28245b;
                if (!f && callResult.getData().startsWith(bw.CONTENT.toString())) {
                    String data = callResult.getData();
                    Bundle bundle = new Bundle();
                    bundle.putString("filePath", data);
                    iPPSUiEngineCallback.onCallResult(bj.d.V, bundle);
                    return;
                }
                String a10 = a();
                if (!TextUtils.isEmpty(a10)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("filePath", a10);
                    iPPSUiEngineCallback.onCallResult(bj.d.V, bundle2);
                    return;
                }
                iPPSUiEngineCallback.onCallResult(bj.d.V, null);
            } catch (Throwable th) {
                ex.V("GlobalUtil", "getFilePath err: %s", th.getClass().getSimpleName());
            }
        }
    }

    public h(Context context) {
        this.f28238b = context;
    }

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public final void getFilePath(String str, IPPSUiEngineCallback iPPSUiEngineCallback) {
        Context context = this.f28238b;
        ha.i.e(context).d(com.huawei.openalliance.ad.constant.s.f22128x, str, new c(context, iPPSUiEngineCallback, str), String.class);
    }

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public final String getFilePathDirect(String str) {
        String str2;
        try {
            str2 = (String) gb.q.a(new a(str), null);
            ex.Code("GlobalUtil", "filePath = %s", str2);
        } catch (Throwable th) {
            ex.V("GlobalUtil", "getFilePath err: %s", th.getClass().getSimpleName());
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public final String getFilePathDirectByCacheType(String str, int i10) {
        String str2;
        try {
            str2 = (String) gb.q.a(new b(str, i10), null);
            ex.Code("GlobalUtil", "filePath = %s", str2);
        } catch (Throwable th) {
            ex.V("GlobalUtil", "getFilePath err: %s", th.getClass().getSimpleName());
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public final com.huawei.hms.ads.uiengine.b getMultiMediaPlayingManager() {
        ia.c cVar;
        Context context = this.f28238b;
        ce Code = ce.Code(context);
        HiAd c10 = HiAd.c(context);
        IMultiMediaPlayingManager iMultiMediaPlayingManager = c10.f22220d;
        if (iMultiMediaPlayingManager == null) {
            Context context2 = c10.f22217a;
            synchronized (ia.c.f29445h) {
                if (ia.c.f29444g == null) {
                    ia.c.f29444g = new ia.c(context2);
                }
                cVar = ia.c.f29444g;
            }
            iMultiMediaPlayingManager = cVar;
        }
        Code.Code(iMultiMediaPlayingManager);
        return ce.Code(context);
    }

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public final void registerActivityStartCallBack(IPPSUiEngineCallback iPPSUiEngineCallback) {
        ex.V("GlobalUtil", "registerActivityStartCallBack");
        if (iPPSUiEngineCallback != null) {
            this.f28237a.add(iPPSUiEngineCallback);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.IGlobalUtil
    public final void unregisterActivityStartCallBack(IPPSUiEngineCallback iPPSUiEngineCallback) {
        ex.V("GlobalUtil", "unregisterActivityStartCallBack");
        if (iPPSUiEngineCallback != null) {
            this.f28237a.remove(iPPSUiEngineCallback);
        }
    }
}
