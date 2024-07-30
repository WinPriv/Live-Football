package com.anythink.expressad.video.signal.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.foundation.d.r;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.signal.c;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j extends c {

    /* renamed from: t, reason: collision with root package name */
    private static final String f11930t = "j";

    /* renamed from: u, reason: collision with root package name */
    private static final String f11931u = "正在下载中,请稍后...";

    /* renamed from: z, reason: collision with root package name */
    private static final String f11932z = "camp_position";
    private com.anythink.expressad.foundation.d.c A;
    private List<com.anythink.expressad.foundation.d.c> B;
    private int C;
    private String D = "";
    private String E = "";
    private boolean F = false;
    private boolean G = false;
    private boolean H = true;

    /* renamed from: v, reason: collision with root package name */
    private Activity f11933v;

    /* renamed from: w, reason: collision with root package name */
    private String f11934w;

    /* renamed from: x, reason: collision with root package name */
    private String f11935x;
    private Context y;

    public j(Activity activity, com.anythink.expressad.foundation.d.c cVar) {
        this.f11933v = activity;
        this.A = cVar;
    }

    private static JSONObject A() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", new com.anythink.expressad.foundation.h.c(com.anythink.core.common.b.n.a().g()).a());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject B() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f11913s);
            jSONObject2.put("instanceId", this.D);
            jSONObject.put("sdkSetting", jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        com.anythink.expressad.videocommon.e.d dVar = this.o;
        if (dVar != null) {
            return dVar.R();
        }
        return jSONObject;
    }

    private static JSONObject D() {
        JSONObject jSONObject = new JSONObject();
        com.anythink.expressad.videocommon.e.a b10 = com.anythink.expressad.videocommon.e.c.a().b();
        if (b10 != null) {
            return b10.k();
        }
        return jSONObject;
    }

    private static boolean E() {
        return false;
    }

    private void c(boolean z10) {
        this.H = z10;
    }

    private void e(String str) {
        List<com.anythink.expressad.foundation.d.c> list;
        if (this.A == null || (list = this.B) == null || list.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(f11932z)) {
                this.A = this.B.get(jSONObject.getInt(f11932z));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private boolean s() {
        return this.H;
    }

    private String t() {
        String str;
        JSONObject jSONObject = new JSONObject();
        com.anythink.expressad.foundation.h.c cVar = new com.anythink.expressad.foundation.h.c(com.anythink.core.common.b.n.a().g());
        try {
            jSONObject.put("unit_id", this.f11909n);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.D);
            jSONObject2.put("rootViewInstanceId", this.E);
            jSONObject2.put("isRootTemplateWebView", this.F);
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, com.anythink.expressad.out.b.f10461a + ",3.0.1");
            jSONObject2.put("playVideoMute", this.f11913s);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", cVar.a());
            JSONArray jSONArray = new JSONArray();
            List<com.anythink.expressad.foundation.d.c> list = this.B;
            if (list != null && list.size() > 0) {
                for (com.anythink.expressad.foundation.d.c cVar2 : this.B) {
                    jSONArray.put(com.anythink.expressad.foundation.d.c.a(cVar2, cVar2.at(), c(cVar2)));
                }
            } else {
                jSONArray.put(com.anythink.expressad.foundation.d.c.a(this.A));
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", C());
            String e10 = com.anythink.expressad.foundation.b.a.b().e();
            com.anythink.expressad.d.b.a();
            String a10 = com.anythink.expressad.d.b.a(e10);
            if (!TextUtils.isEmpty(a10)) {
                JSONObject jSONObject3 = new JSONObject(a10);
                a(jSONObject3);
                com.anythink.expressad.d.b.a();
                String b10 = com.anythink.expressad.d.b.b(this.f11909n);
                if (!TextUtils.isEmpty(b10)) {
                    jSONObject3.put("ivreward", new JSONObject(b10));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", D());
            if (!TextUtils.isEmpty(this.f11909n)) {
                jSONObject.put("unit_id", this.f11909n);
            }
            if (this.G) {
                str = "1";
            } else {
                str = "0";
            }
            jSONObject.put("rw_plus", str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    private com.anythink.expressad.a.a u() {
        if (this.f11911q == null) {
            this.f11911q = new com.anythink.expressad.a.a(com.anythink.core.common.b.n.a().g(), this.f11909n);
        }
        return this.f11911q;
    }

    private JSONObject v() {
        JSONObject jSONObject = new JSONObject();
        com.anythink.expressad.foundation.h.c cVar = new com.anythink.expressad.foundation.h.c(com.anythink.core.common.b.n.a().g());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f11913s);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", cVar.a());
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(com.anythink.expressad.foundation.d.c.a(this.A));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", C());
            String e10 = com.anythink.expressad.foundation.b.a.b().e();
            com.anythink.expressad.d.b.a();
            String a10 = com.anythink.expressad.d.b.a(e10);
            if (!TextUtils.isEmpty(a10)) {
                JSONObject jSONObject3 = new JSONObject(a10);
                a(jSONObject3);
                com.anythink.expressad.d.b.a();
                String b10 = com.anythink.expressad.d.b.b(this.f11909n);
                if (!TextUtils.isEmpty(b10)) {
                    jSONObject3.put("ivreward", b10);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", D());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    private static JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, com.anythink.expressad.out.b.f10461a + ",3.0.1");
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f11909n)) {
                jSONObject.put("unit_id", this.f11909n);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    private static JSONObject y() {
        JSONObject jSONObject = new JSONObject();
        try {
            String e10 = com.anythink.expressad.foundation.b.a.b().e();
            com.anythink.expressad.d.b.a();
            String a10 = com.anythink.expressad.d.b.a(e10);
            if (!TextUtils.isEmpty(a10)) {
                jSONObject.put("appSetting", new JSONObject(a10));
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.anythink.expressad.videocommon.e.d dVar = this.o;
            if (dVar != null) {
                jSONObject.put("unitSetting", dVar.R());
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        this.A = cVar;
    }

    public final void b(boolean z10) {
        this.G = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void click(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "camp_position"
            super.click(r5, r6)
            com.anythink.expressad.foundation.d.c r1 = r4.A
            if (r1 == 0) goto L3c
            int r1 = r1.k()
            r2 = 5
            if (r1 != r2) goto L3c
            com.anythink.expressad.foundation.d.c r1 = r4.A
            if (r1 == 0) goto L3c
            java.util.List<com.anythink.expressad.foundation.d.c> r1 = r4.B
            if (r1 == 0) goto L3c
            int r1 = r1.size()
            if (r1 == 0) goto L3c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L38
            r1.<init>(r6)     // Catch: org.json.JSONException -> L38
            boolean r2 = r1.has(r0)     // Catch: org.json.JSONException -> L38
            if (r2 == 0) goto L3c
            int r0 = r1.getInt(r0)     // Catch: org.json.JSONException -> L38
            java.util.List<com.anythink.expressad.foundation.d.c> r1 = r4.B     // Catch: org.json.JSONException -> L38
            java.lang.Object r0 = r1.get(r0)     // Catch: org.json.JSONException -> L38
            com.anythink.expressad.foundation.d.c r0 = (com.anythink.expressad.foundation.d.c) r0     // Catch: org.json.JSONException -> L38
            r4.A = r0     // Catch: org.json.JSONException -> L38
            goto L3c
        L38:
            r0 = move-exception
            r0.printStackTrace()
        L3c:
            r0 = 1
            if (r5 == r0) goto L70
            r1 = 3
            if (r5 == r1) goto L43
            goto L6f
        L43:
            com.anythink.expressad.foundation.d.c r5 = r4.A     // Catch: java.lang.Throwable -> Lcb
            if (r5 == 0) goto L55
            int r5 = r5.g()     // Catch: java.lang.Throwable -> Lcb
            r1 = -2
            if (r5 <= r1) goto L55
            com.anythink.expressad.foundation.d.c r5 = r4.A     // Catch: java.lang.Throwable -> Lcb
            int r5 = r5.g()     // Catch: java.lang.Throwable -> Lcb
            goto L5f
        L55:
            com.anythink.expressad.videocommon.e.d r5 = r4.o     // Catch: java.lang.Throwable -> Lcb
            if (r5 == 0) goto L5e
            int r5 = r5.p()     // Catch: java.lang.Throwable -> Lcb
            goto L5f
        L5e:
            r5 = r0
        L5f:
            r1 = -1
            if (r5 != r1) goto L6c
            com.anythink.expressad.video.signal.a.c$b r5 = new com.anythink.expressad.video.signal.a.c$b     // Catch: java.lang.Throwable -> Lcb
            com.anythink.expressad.video.signal.c$a r1 = r4.f11912r     // Catch: java.lang.Throwable -> Lcb
            r5.<init>(r4, r1)     // Catch: java.lang.Throwable -> Lcb
            r4.a(r5)     // Catch: java.lang.Throwable -> Lcb
        L6c:
            r4.click(r0, r6)     // Catch: java.lang.Throwable -> Lcb
        L6f:
            return
        L70:
            com.anythink.expressad.foundation.d.c r5 = r4.A     // Catch: java.lang.Throwable -> Lcb
            r1 = 0
            if (r5 != 0) goto L89
            java.util.List<com.anythink.expressad.foundation.d.c> r5 = r4.B     // Catch: java.lang.Throwable -> Lcb
            if (r5 == 0) goto L89
            int r5 = r5.size()     // Catch: java.lang.Throwable -> Lcb
            if (r5 <= 0) goto L89
            java.util.List<com.anythink.expressad.foundation.d.c> r5 = r4.B     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> Lcb
            com.anythink.expressad.foundation.d.c r5 = (com.anythink.expressad.foundation.d.c) r5     // Catch: java.lang.Throwable -> Lcb
            r4.A = r5     // Catch: java.lang.Throwable -> Lcb
        L89:
            com.anythink.expressad.foundation.d.c r5 = r4.A     // Catch: java.lang.Throwable -> Lcb
            if (r5 != 0) goto L8e
            return
        L8e:
            com.anythink.expressad.foundation.d.c r5 = r4.a(r6, r5)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r6 = r5.ah()     // Catch: java.lang.Throwable -> Lcb
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = com.anythink.expressad.foundation.g.a.cf     // Catch: java.lang.Throwable -> Lab
            java.lang.String r6 = r6.getQueryParameter(r2)     // Catch: java.lang.Throwable -> Lab
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lab
            if (r2 != 0) goto Lb3
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> Lab
            goto Lb4
        Lab:
            r6 = move-exception
            java.lang.String r2 = com.anythink.expressad.video.signal.a.j.f11930t     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = "INSTALL"
            com.anythink.expressad.foundation.h.o.b(r2, r3, r6)     // Catch: java.lang.Throwable -> Lcb
        Lb3:
            r6 = r1
        Lb4:
            com.anythink.expressad.video.signal.c$a r2 = r4.f11912r     // Catch: java.lang.Throwable -> Lcb
            r3 = 2
            if (r6 != r3) goto Lba
            goto Lbb
        Lba:
            r0 = r1
        Lbb:
            r2.a(r5, r0)     // Catch: java.lang.Throwable -> Lcb
            com.anythink.expressad.a.a r5 = r4.u()     // Catch: java.lang.Throwable -> Lcb
            com.anythink.expressad.video.signal.c$a r6 = r4.f11912r     // Catch: java.lang.Throwable -> Lcb
            r5.a(r6)     // Catch: java.lang.Throwable -> Lcb
            r4.u()     // Catch: java.lang.Throwable -> Lcb
            return
        Lcb:
            r5 = move-exception
            java.lang.String r6 = com.anythink.expressad.video.signal.a.j.f11930t
            java.lang.String r0 = r5.getMessage()
            com.anythink.expressad.foundation.h.o.b(r6, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.signal.a.j.click(int, java.lang.String):void");
    }

    public final void d(String str) {
        this.E = str;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final String h(int i10) {
        switch (i10) {
            case 1:
                return w().toString();
            case 2:
                return x().toString();
            case 3:
                return y().toString();
            case 4:
                return z().toString();
            case 5:
                return A().toString();
            case 6:
                return B().toString();
            default:
                return v().toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.d
    public void handlerH5Exception(int i10, String str) {
        super.handlerH5Exception(i10, str);
        try {
            this.f11912r.a(i10, str);
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.b(f11930t, th.getMessage(), th);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final String i() {
        this.f11912r.b();
        this.f11901e = true;
        if (TextUtils.isEmpty(this.f11934w)) {
            this.f11934w = t();
        }
        return this.f11934w;
    }

    public final void j(int i10) {
        this.C = i10;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void l() {
        super.l();
        c.a aVar = this.f11912r;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final String o() {
        com.anythink.expressad.foundation.h.o.a(f11930t, "getNotchArea");
        return this.f11935x;
    }

    public final void p() {
        this.F = true;
    }

    public final void q() {
        this.f11934w = "";
    }

    public final int r() {
        return this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(com.anythink.expressad.foundation.d.c r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.ah()
            r1 = 0
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = com.anythink.expressad.foundation.g.a.cf     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r0.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L1a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L22
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L1a
            goto L23
        L1a:
            r0 = move-exception
            java.lang.String r2 = com.anythink.expressad.video.signal.a.j.f11930t
            java.lang.String r3 = "INSTALL"
            com.anythink.expressad.foundation.h.o.b(r2, r3, r0)
        L22:
            r0 = r1
        L23:
            com.anythink.expressad.video.signal.c$a r2 = r4.f11912r
            r3 = 2
            if (r0 != r3) goto L29
            r1 = 1
        L29:
            r2.a(r5, r1)
            com.anythink.expressad.a.a r5 = r4.u()
            com.anythink.expressad.video.signal.c$a r0 = r4.f11912r
            r5.a(r0)
            r4.u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.signal.a.j.b(com.anythink.expressad.foundation.d.c):void");
    }

    public final void a(List<com.anythink.expressad.foundation.d.c> list) {
        this.B = list;
    }

    public final void c(String str) {
        this.D = str;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void j() {
        super.j();
        try {
            Activity activity = this.f11933v;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.b(f11930t, th.getMessage(), th);
        }
    }

    private void a(JSONObject jSONObject) {
        try {
            Context d10 = com.anythink.expressad.foundation.b.a.b().d();
            String obj = v.b(d10, "Anythink_ConfirmTitle" + this.f11909n, "").toString();
            String obj2 = v.b(d10, "Anythink_ConfirmContent" + this.f11909n, "").toString();
            String obj3 = v.b(d10, "Anythink_CancelText" + this.f11909n, "").toString();
            String obj4 = v.b(d10, "Anythink_ConfirmText" + this.f11909n, "").toString();
            if (!TextUtils.isEmpty(obj)) {
                jSONObject.put(com.anythink.expressad.d.a.b.ct, obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                jSONObject.put(com.anythink.expressad.d.a.b.cu, obj2);
            }
            if (!TextUtils.isEmpty(obj3)) {
                jSONObject.put(com.anythink.expressad.d.a.b.cv, obj3);
            }
            if (!TextUtils.isEmpty(obj4)) {
                jSONObject.put(com.anythink.expressad.d.a.b.cx, obj4);
            }
            if (TextUtils.isEmpty(obj4)) {
                return;
            }
            jSONObject.put(com.anythink.expressad.d.a.b.cw, obj4);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #0 {Exception -> 0x0037, blocks: (B:2:0x0000, B:4:0x0010, B:6:0x0019, B:7:0x0022, B:9:0x002c, B:11:0x0032), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:2:0x0000, B:4:0x0010, B:6:0x0019, B:7:0x0022, B:9:0x002c, B:11:0x0032), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(com.anythink.expressad.foundation.d.c r7) {
        /*
            com.anythink.expressad.foundation.b.a r0 = com.anythink.expressad.foundation.b.a.b()     // Catch: java.lang.Exception -> L37
            java.lang.String r0 = r0.e()     // Catch: java.lang.Exception -> L37
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L37
            r1 = 0
            if (r0 != 0) goto L21
            com.anythink.expressad.d.b.a()     // Catch: java.lang.Exception -> L37
            com.anythink.expressad.d.a r0 = com.anythink.expressad.d.b.b()     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L21
            long r3 = r0.l()     // Catch: java.lang.Exception -> L37
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            goto L22
        L21:
            r3 = r1
        L22:
            com.anythink.expressad.videocommon.e.c r0 = com.anythink.expressad.videocommon.e.c.a()     // Catch: java.lang.Exception -> L37
            com.anythink.expressad.videocommon.e.a r0 = r0.b()     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L30
            long r1 = r0.c()     // Catch: java.lang.Exception -> L37
        L30:
            if (r7 == 0) goto L37
            boolean r7 = r7.a(r1, r3)     // Catch: java.lang.Exception -> L37
            return r7
        L37:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.signal.a.j.c(com.anythink.expressad.foundation.d.c):boolean");
    }

    public j(Activity activity, com.anythink.expressad.foundation.d.c cVar, List<com.anythink.expressad.foundation.d.c> list) {
        this.f11933v = activity;
        this.A = cVar;
        this.B = list;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11935x = str;
    }

    private com.anythink.expressad.foundation.d.c a(String str, com.anythink.expressad.foundation.d.c cVar) {
        if (TextUtils.isEmpty(str)) {
            return cVar;
        }
        if (TextUtils.isEmpty(str) && cVar == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject a10 = com.anythink.expressad.foundation.d.c.a(cVar);
                com.anythink.expressad.foundation.d.c b10 = com.anythink.expressad.foundation.d.c.b(a10);
                if (b10 == null) {
                    b10 = cVar;
                }
                if (!TextUtils.isEmpty(str)) {
                    a(a10, b10);
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject(com.anythink.expressad.foundation.g.a.ce);
                    if (optJSONObject != null) {
                        String.valueOf(t.b(this.f11933v, Integer.valueOf(optJSONObject.getString(com.anythink.expressad.foundation.g.a.f9775cc)).intValue()));
                        String.valueOf(t.b(this.f11933v, Integer.valueOf(optJSONObject.getString(com.anythink.expressad.foundation.g.a.f9776cd)).intValue()));
                    }
                    b10.p(b10.ad());
                    String ah = b10.ah();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        StringBuilder sb2 = new StringBuilder();
                        while (keys.hasNext()) {
                            sb2.append(ContainerUtils.FIELD_DELIMITER);
                            String next = keys.next();
                            String optString = optJSONObject.optString(next);
                            if (com.anythink.expressad.foundation.g.a.f9775cc.equals(next) || com.anythink.expressad.foundation.g.a.f9776cd.equals(next)) {
                                optString = String.valueOf(t.b(this.f11933v, Integer.valueOf(optString).intValue()));
                            }
                            sb2.append(next);
                            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb2.append(optString);
                        }
                        b10.q(ah + ((Object) sb2));
                    }
                }
                return b10;
            } catch (JSONException e10) {
                e10.printStackTrace();
                return cVar;
            } catch (Throwable th) {
                th.printStackTrace();
                return cVar;
            }
        }
        try {
            JSONObject a11 = com.anythink.expressad.foundation.d.c.a(cVar);
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.opt(com.anythink.expressad.foundation.d.h.cv) == null) {
                jSONObject.put(com.anythink.expressad.foundation.d.h.cv, "");
            }
            try {
                if (!jSONObject.has(com.anythink.expressad.foundation.d.c.O)) {
                    a11.put(com.anythink.expressad.foundation.d.c.O, "");
                }
            } catch (Exception unused) {
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                a11.put(next2, jSONObject.getString(next2));
            }
            com.anythink.expressad.foundation.d.c b11 = com.anythink.expressad.foundation.d.c.b(a11);
            a(a11, b11);
            return b11;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return cVar;
        }
    }

    private static void a(JSONObject jSONObject, com.anythink.expressad.foundation.d.c cVar) {
        try {
            String optString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            cVar.l(optString);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void a(int i10, String str) {
        super.a(i10, str);
        if (i10 != 2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("event", "event");
            String optString2 = jSONObject.optString("template", "-1");
            String optString3 = jSONObject.optString("layout", "-1");
            String optString4 = jSONObject.optString("unit_id", this.f11909n);
            this.f11933v.getApplication();
            int a10 = com.anythink.expressad.foundation.h.k.a();
            new r(r.f9708j, optString, optString2, optString3, optString4, this.A.aZ(), a10, com.anythink.expressad.foundation.h.k.a(this.f11933v.getApplication(), a10));
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.b(f11930t, th.getMessage(), th);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void a(Activity activity) {
        this.f11933v = activity;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void a(Context context) {
        this.y = context;
    }
}
