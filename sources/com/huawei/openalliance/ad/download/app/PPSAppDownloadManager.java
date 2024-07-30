package com.huawei.openalliance.ad.download.app;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.hms.ads.ch;
import com.huawei.hms.ads.dm;
import com.huawei.hms.ads.ep;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jg;
import com.huawei.hms.ads.jh;
import com.huawei.hms.ads.reward.RewardVerifyConfig;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.download.app.a;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.d;
import com.huawei.openalliance.ad.inter.data.j;
import com.huawei.openalliance.ad.inter.data.o;
import com.huawei.openalliance.ad.inter.listeners.IAppDownloadManager;
import da.b;
import da.c;
import da.h;
import da.n;
import fb.g;
import gb.b0;
import gb.c0;
import ha.i;
import j7.r;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

@AllApi
/* loaded from: classes2.dex */
public class PPSAppDownloadManager implements IAppDownloadManager {
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22192g;

    /* renamed from: a, reason: collision with root package name */
    public final dm f22187a = new dm();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f22188b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f22190d = 2;

    /* renamed from: e, reason: collision with root package name */
    public Integer f22191e = 6;

    /* renamed from: c, reason: collision with root package name */
    public final com.huawei.openalliance.ad.download.app.a f22189c = com.huawei.openalliance.ad.download.app.a.t();

    /* loaded from: classes2.dex */
    public class a implements a.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppInfo f22193a;

        public a(Context context, AppInfo appInfo) {
            this.f22193a = appInfo;
        }

        @Override // com.huawei.openalliance.ad.download.app.a.c
        public final void Code() {
            Integer num = PPSAppDownloadManager.this.f22191e;
            if (num != null && num.intValue() == 14) {
                AppInfo appInfo = this.f22193a;
                if (appInfo == null) {
                    ex.V("PPSAppDownloadManager", "appInfo is empty.");
                } else {
                    c0.c(new c(appInfo));
                }
            }
        }
    }

    @AllApi
    public PPSAppDownloadManager() {
    }

    public static void h(AppInfo appInfo) {
        if (appInfo == null) {
            ex.V("PPSAppDownloadManager", "appInfo is empty.");
        } else {
            c0.c(new da.a(appInfo));
            c0.c(new b(appInfo));
        }
    }

    public static void n(d dVar, AppDownloadTask appDownloadTask) {
        AdContentData m10 = dVar.m();
        if (m10 != null) {
            appDownloadTask.C(m10.u());
        }
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.IAppDownloadManager
    public final void Code(Integer num) {
        this.f22191e = num;
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.IAppDownloadManager
    public final void a() {
        this.f22192g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0158, code lost:
    
        if (r1.equals("6") != false) goto L64;
     */
    @Override // com.huawei.openalliance.ad.inter.listeners.IAppDownloadManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(android.content.Context r17, com.huawei.openalliance.ad.inter.data.d r18) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.download.app.PPSAppDownloadManager.b(android.content.Context, com.huawei.openalliance.ad.inter.data.d):int");
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.IAppDownloadManager
    public final int c(d dVar) {
        String str;
        if (dVar == null) {
            str = "ad is empty";
        } else if (!o(dVar)) {
            str = "ad is not native ad";
        } else {
            AppDownloadTask p10 = this.f22189c.p(dVar.w());
            if (p10 == null) {
                str = "task is not exist.";
            } else {
                return p10.k();
            }
        }
        ex.V("PPSAppDownloadManager", str);
        return 0;
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.IAppDownloadManager
    public final int d(Context context, d dVar) {
        String str;
        if (j(context, dVar)) {
            ex.V("PPSAppDownloadManager", "open landing page action");
            return -4;
        }
        Integer l10 = l(context, dVar);
        if (l10 != null) {
            return l10.intValue();
        }
        if (!this.f22187a.Code(context, dVar, true)) {
            ex.V("PPSAppDownloadManager", "resumeDownload has not permission, please add white list");
            return -2;
        }
        if (p(context, dVar)) {
            str = "app is installed, open it.";
        } else if (q(context, dVar)) {
            str = "do app click action.";
        } else {
            AppInfo w10 = dVar.w();
            com.huawei.openalliance.ad.download.app.a aVar = this.f22189c;
            AppDownloadTask p10 = aVar.p(w10);
            if (p10 != null) {
                n(dVar, p10);
                i(dVar, p10);
                h hVar = new h(p10);
                Context context2 = aVar.f22196v;
                JSONObject jSONObject = new JSONObject();
                try {
                    r.h(p10, jSONObject);
                    i.e(context2).d("startDownloadApp", jSONObject.toString(), hVar, String.class);
                } catch (JSONException unused) {
                    r.i(hVar, "startDownload JSONException", "startDownloadApp");
                }
                return 0;
            }
            ex.V("PPSAppDownloadManager", "app download info is empty, must first invoke startDownload method");
            return -1;
        }
        ex.V("PPSAppDownloadManager", str);
        return 0;
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.IAppDownloadManager
    public final void e(Context context, d dVar) {
        String str;
        if (l(context, dVar) != null) {
            str = "ad is invalid ad when cancel";
        } else if (!this.f22187a.Code(context, dVar, false)) {
            str = "cancelDownload has not permission, please add white list";
        } else {
            AppInfo w10 = dVar.w();
            com.huawei.openalliance.ad.download.app.a aVar = this.f22189c;
            AppDownloadTask p10 = aVar.p(w10);
            if (p10 != null) {
                n(dVar, p10);
                i(dVar, p10);
                aVar.r(w10, new a(context, w10));
                return;
            }
            return;
        }
        ex.V("PPSAppDownloadManager", str);
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.IAppDownloadManager
    public final int f(Context context, d dVar) {
        if (j(context, dVar)) {
            ex.V("PPSAppDownloadManager", "open landing page action");
            return -4;
        }
        if (l(context, dVar) != null) {
            ex.V("PPSAppDownloadManager", "ad is invalid ad when pause");
            return -1;
        }
        if (!this.f22187a.Code(context, dVar, false)) {
            ex.V("PPSAppDownloadManager", "pauseDownload has not permission, please add white list");
            return -2;
        }
        AppInfo w10 = dVar.w();
        com.huawei.openalliance.ad.download.app.a aVar = this.f22189c;
        AppDownloadTask p10 = aVar.p(w10);
        if (p10 != null) {
            n(dVar, p10);
            i(dVar, p10);
            aVar.v(p10);
            return 1;
        }
        return 1;
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.IAppDownloadManager
    public final n g(Context context, d dVar) {
        n nVar = n.DOWNLOAD;
        if (dVar == null) {
            return nVar;
        }
        if (!o(dVar)) {
            ex.V("PPSAppDownloadManager", "this ad is not a native ad");
            return nVar;
        }
        AppInfo w10 = dVar.w();
        if (b0.b(context, w10.q())) {
            ex.V("PPSAppDownloadManager", "app installed");
            return n.INSTALLED;
        }
        AppDownloadTask p10 = this.f22189c.p(w10);
        if (p10 == null) {
            return nVar;
        }
        p10.t(dVar.L());
        return ch.Code(p10);
    }

    public final void i(d dVar, AppDownloadTask appDownloadTask) {
        RewardVerifyConfig J = dVar.J();
        if (J != null) {
            appDownloadTask.E(J.getData());
            appDownloadTask.z(J.getUserId());
            AdContentData K = appDownloadTask.K();
            if (K != null) {
                K.V0(J.getData());
                K.X0(J.getUserId());
            }
        }
        if (dVar.m() != null) {
            AdContentData m10 = dVar.m();
            if (!TextUtils.isEmpty(m10.D())) {
                appDownloadTask.G(m10.D());
            }
            if (!TextUtils.isEmpty(m10.e0())) {
                appDownloadTask.H(m10.e0());
            }
            if (m10.f0() >= 0) {
                appDownloadTask.s(m10.f0());
            }
        }
        appDownloadTask.t(dVar.L());
        appDownloadTask.x(this.f22191e);
        appDownloadTask.F(this.f22191e);
        appDownloadTask.B(Integer.valueOf(this.f22190d));
    }

    public final boolean j(Context context, d dVar) {
        AppInfo w10;
        HashMap hashMap;
        if (this.f22191e.intValue() != 14 || context == null || dVar == null || (w10 = dVar.w()) == null || !"21".equals(w10.Q())) {
            return false;
        }
        if (dVar instanceof j) {
            hashMap = ((j) dVar).X();
        } else {
            hashMap = null;
        }
        return new g(context, dVar.m(), true, hashMap).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r9.k() > 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(com.huawei.openalliance.ad.inter.data.AppInfo r9) {
        /*
            r8 = this;
            java.lang.String r0 = "PPSAppDownloadManager"
            r1 = 0
            if (r9 != 0) goto Lb
            java.lang.String r9 = " download app info is empty"
        L7:
            com.huawei.hms.ads.ex.V(r0, r9)
            return r1
        Lb:
            java.lang.String r2 = r9.q()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L18
            java.lang.String r9 = "app packageName is empty"
            goto L7
        L18:
            boolean r2 = r9.j0()
            r3 = 1
            if (r2 != 0) goto L51
            boolean r2 = com.huawei.hms.ads.ch.Code(r9)
            if (r2 != 0) goto L51
            java.lang.String r2 = r9.G()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L4e
            boolean r2 = r9.C()
            if (r2 == 0) goto L41
            java.lang.String r2 = r9.p()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L41
            r2 = r3
            goto L42
        L41:
            r2 = r1
        L42:
            if (r2 != 0) goto L4e
            long r4 = r9.k()
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L51
        L4e:
            java.lang.String r9 = " download app info is invalid"
            goto L7
        L51:
            com.huawei.openalliance.ad.download.app.a r9 = r8.f22189c
            if (r9 != 0) goto L58
            java.lang.String r9 = " download manager is not init"
            goto L7
        L58:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.download.app.PPSAppDownloadManager.k(com.huawei.openalliance.ad.inter.data.AppInfo):boolean");
    }

    public final Integer l(Context context, d dVar) {
        Integer num;
        if (context != null && dVar != null) {
            num = null;
        } else {
            num = -1;
        }
        if (num != null) {
            return num;
        }
        if (o(dVar)) {
            return null;
        }
        return -1;
    }

    public final void m(Context context, d dVar) {
        String str;
        if (dVar != null) {
            if (dVar instanceof o) {
                str = ((o) dVar).f22300s.u();
            } else {
                str = null;
            }
            if (str != null && str.equals(this.f)) {
                return;
            }
            this.f = str;
            jg.a aVar = new jg.a();
            aVar.V(Long.valueOf(System.currentTimeMillis())).Code(Long.valueOf(dVar.s())).Code(Integer.valueOf(dVar.t())).V((Integer) 6).Code(a0.a.k(context));
            jh.Code(context, dVar.m(), aVar.Code());
        }
    }

    public final boolean o(d dVar) {
        boolean z10;
        if (!(dVar instanceof j) && !(dVar instanceof o)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || !k(dVar.w())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.content.Context r11, com.huawei.openalliance.ad.inter.data.d r12) {
        /*
            r10 = this;
            r1 = 0
            java.lang.String r2 = "PPSAppDownloadManager"
            if (r12 == 0) goto Led
            com.huawei.openalliance.ad.inter.data.AppInfo r3 = r12.w()
            if (r3 != 0) goto Ld
            goto Led
        Ld:
            com.huawei.openalliance.ad.inter.data.AppInfo r3 = r12.w()
            java.lang.String r4 = r3.q()
            boolean r4 = gb.b0.b(r11, r4)
            if (r4 != 0) goto L25
            boolean r4 = gb.b0.f()
            if (r4 == 0) goto L25
            java.lang.String r0 = "app not installed, need download"
            goto Lef
        L25:
            java.lang.String r4 = r3.q()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            r6 = 0
            if (r5 != 0) goto L4b
            java.util.HashMap r5 = r10.f22188b
            boolean r7 = r5.containsKey(r4)
            if (r7 != 0) goto L39
            goto L4b
        L39:
            java.lang.Object r7 = r5.get(r4)
            if (r7 != 0) goto L40
            goto L4b
        L40:
            java.lang.Object r4 = r5.get(r4)
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r4 = r4.first
            java.lang.String r4 = (java.lang.String) r4
            goto L4c
        L4b:
            r4 = r6
        L4c:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L55
            r3.V(r4)
        L55:
            java.lang.String r4 = r3.q()
            java.lang.String r5 = r3.D()
            boolean r4 = gb.b0.c(r11, r4, r5)
            r5 = 14
            r7 = 1
            if (r4 != 0) goto Lbb
            java.lang.String r4 = "handleClick, openAppIntent failed"
            com.huawei.hms.ads.ex.V(r2, r4)
            com.huawei.openalliance.ad.inter.data.AdContentData r4 = r12.m()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r8 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "intentFail"
            com.huawei.hms.ads.jh.Code(r11, r4, r9, r6, r8)
            java.lang.String r4 = r3.q()
            boolean r4 = gb.b0.h(r11, r4)
            if (r4 == 0) goto Lb8
            h(r3)
            com.huawei.openalliance.ad.inter.data.AdContentData r2 = r12.m()
            r3 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.huawei.hms.ads.jh.Code(r11, r2, r3)
            java.lang.Integer r2 = r10.f22191e
            int r2 = r2.intValue()
            if (r2 != r5) goto L9f
            r1 = r7
        L9f:
            if (r1 != 0) goto Lb7
            r10.m(r11, r12)
            com.huawei.openalliance.ad.inter.data.AdContentData r1 = r12.m()
            java.lang.String r6 = a0.a.k(r11)
            if (r1 == 0) goto Lb7
            r2 = 0
            r3 = 0
            java.lang.String r4 = "app"
            r5 = 6
            r0 = r11
            com.huawei.hms.ads.jh.Code(r0, r1, r2, r3, r4, r5, r6)
        Lb7:
            return r7
        Lb8:
            java.lang.String r0 = "handleClick, openAppMainPage failed"
            goto Lef
        Lbb:
            h(r3)
            com.huawei.openalliance.ad.inter.data.AdContentData r2 = r12.m()
            java.lang.String r3 = "intentSuccess"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            com.huawei.hms.ads.jh.Code(r11, r2, r3, r4, r6)
            java.lang.Integer r2 = r10.f22191e
            int r2 = r2.intValue()
            if (r2 != r5) goto Ld4
            r1 = r7
        Ld4:
            if (r1 != 0) goto Lec
            r10.m(r11, r12)
            com.huawei.openalliance.ad.inter.data.AdContentData r1 = r12.m()
            java.lang.String r6 = a0.a.k(r11)
            if (r1 == 0) goto Lec
            r2 = 0
            r3 = 0
            java.lang.String r4 = "app"
            r5 = 6
            r0 = r11
            com.huawei.hms.ads.jh.Code(r0, r1, r2, r3, r4, r5, r6)
        Lec:
            return r7
        Led:
            java.lang.String r0 = "param is empty"
        Lef:
            com.huawei.hms.ads.ex.V(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.download.app.PPSAppDownloadManager.p(android.content.Context, com.huawei.openalliance.ad.inter.data.d):boolean");
    }

    public final boolean q(Context context, d dVar) {
        AppInfo w10;
        String a10;
        String str;
        String str2;
        boolean z10 = dVar instanceof o;
        if (this.f22192g && z10 && (w10 = dVar.w()) != null && !androidx.transition.n.h(w10.n0())) {
            AdContentData m10 = dVar.m();
            AdContentData m11 = dVar.m();
            HashMap hashMap = new HashMap();
            if (m11 != null) {
                MetaData K = m11.K();
                String str3 = "";
                if (K == null) {
                    a10 = "";
                } else {
                    a10 = K.a();
                }
                hashMap.put("appId", a10);
                if (K != null) {
                    str3 = K.L();
                }
                hashMap.put("thirdId", str3);
                if (m11.Y0() != null) {
                    VideoInfo Y0 = m11.Y0();
                    if (Y0 != null) {
                        if (!TextUtils.equals(Y0.k(), "y")) {
                            TextUtils.equals(Y0.k(), "a");
                        }
                        str = Y0.p();
                        if (Y0.A() != null) {
                            Y0.A().intValue();
                        }
                        if (Y0.C() != null) {
                            Y0.C().intValue();
                        }
                        TextUtils.equals(Y0.k(), "a");
                        "y".equalsIgnoreCase(Y0.F());
                        Float E = Y0.E();
                        if (E != null) {
                            E.floatValue();
                        }
                    } else {
                        str = "n";
                    }
                    hashMap.put(ba.f22064m, m11.u());
                    ex.V("PPSAppDownloadManager", "buildLinkedAdConfig, set progress from native view 0");
                    hashMap.put(ba.f22065n, String.valueOf(m11.x()));
                    if (m11.v()) {
                        str2 = ep.Code;
                    } else {
                        str2 = ep.V;
                    }
                    hashMap.put(ba.f22067q, str2);
                    hashMap.put(ba.f22066p, str);
                    hashMap.put(ba.o, String.valueOf(0));
                }
            }
            if (r.b(context, m10, hashMap, w10.n0()).a()) {
                m(context, dVar);
                AdContentData m12 = dVar.m();
                String k10 = a0.a.k(context);
                if (m12 != null) {
                    jh.Code(context, m12, 0, 0, "app", 6, k10);
                    return true;
                }
                return true;
            }
        }
        return false;
    }
}
