package com.anythink.expressad.mbbanner.a.a;

import a3.l;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.a.i;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.s;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.openalliance.ad.constant.av;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends CommonBannerJSBridgeImp {

    /* renamed from: b, reason: collision with root package name */
    private static final String f10292b = "BannerJSBridgeImpl";

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<Context> f10293c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.c> f10294d;

    /* renamed from: e, reason: collision with root package name */
    private String f10295e;
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private int f10296g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.a f10297h;

    /* renamed from: i, reason: collision with root package name */
    private b f10298i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10299j = false;

    public c(Context context, String str, String str2) {
        this.f10295e = str;
        this.f = str2;
        this.f10293c = new WeakReference<>(context);
    }

    public final void a(com.anythink.expressad.mbbanner.a.c.a aVar) {
        if (aVar != null) {
            this.f10297h = aVar;
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void click(Object obj, String str) {
        com.anythink.expressad.foundation.d.c cVar;
        o.d(f10292b, "click");
        try {
            List<com.anythink.expressad.foundation.d.c> list = this.f10294d;
            if (list == null) {
                return;
            }
            if (list != null && list.size() > 0) {
                cVar = this.f10294d.get(0);
            } else {
                cVar = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject a10 = com.anythink.expressad.foundation.d.c.a(cVar);
                    JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a10.put(next, jSONObject.getString(next));
                    }
                    com.anythink.expressad.foundation.d.c b10 = com.anythink.expressad.foundation.d.c.b(a10);
                    String optString = a10.optString("unitId");
                    if (!TextUtils.isEmpty(optString)) {
                        b10.l(optString);
                    }
                    cVar = b10;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                com.anythink.expressad.mbbanner.a.c.a aVar = this.f10297h;
                if (aVar != null) {
                    aVar.a(cVar);
                }
            }
        } catch (Throwable th) {
            o.b(f10292b, "click", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void close() {
        o.d(f10292b, "close");
        try {
            com.anythink.expressad.mbbanner.a.c.a aVar = this.f10297h;
            if (aVar != null) {
                aVar.b();
            }
        } catch (Throwable th) {
            o.b(f10292b, "close", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void expand(String str, boolean z10) {
        Context context;
        try {
            String str2 = "";
            if (getMraidCampaign() != null) {
                if (TextUtils.isEmpty(getMraidCampaign().q())) {
                    str2 = getMraidCampaign().p();
                } else {
                    str2 = "file:////" + getMraidCampaign().q();
                }
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z10);
            WeakReference<Context> weakReference = this.f10293c;
            if (weakReference != null && (context = weakReference.get()) != null) {
                b bVar = this.f10298i;
                if (bVar != null && bVar.isShowing()) {
                    return;
                }
                b bVar2 = new b(context, bundle, this.f10297h);
                this.f10298i = bVar2;
                bVar2.a(this.f, this.f10294d);
                this.f10298i.show();
            }
            com.anythink.expressad.mbbanner.a.c.a aVar = this.f10297h;
            if (aVar != null) {
                aVar.a(true);
            }
        } catch (Throwable th) {
            o.b(f10292b, "expand", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void getFileInfo(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is empty");
            return;
        }
        try {
            a(obj, new JSONObject(str));
        } catch (Throwable th) {
            o.a(f10292b, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final com.anythink.expressad.foundation.d.c getMraidCampaign() {
        List<com.anythink.expressad.foundation.d.c> list = this.f10294d;
        if (list != null && list.size() > 0) {
            return this.f10294d.get(0);
        }
        return null;
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void init(Object obj, String str) {
        o.d(f10292b, "BANNER INIT INVOKE");
        try {
            JSONObject jSONObject = new JSONObject();
            com.anythink.expressad.foundation.h.c cVar = new com.anythink.expressad.foundation.h.c(n.a().g());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f10296g);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", cVar.a());
            jSONObject.put("campaignList", com.anythink.expressad.foundation.d.c.b(this.f10294d));
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.d.c c10 = com.anythink.expressad.d.b.c(com.anythink.expressad.foundation.b.a.b().e(), this.f);
            if (c10 == null) {
                c10 = com.anythink.expressad.d.c.c(this.f);
            }
            if (!TextUtils.isEmpty(this.f10295e)) {
                c10.e(this.f10295e);
            }
            jSONObject.put("unitSetting", c10.s());
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.d.b.a(com.anythink.expressad.foundation.b.a.b().e());
            jSONObject.put("appSetting", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            o.b(f10292b, "init", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void open(String str) {
        o.d(f10292b, av.ai);
        try {
            o.d(f10292b, str);
            if (this.f10294d.size() > 1) {
                n.a().g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.anythink.expressad.mbbanner.a.c.a aVar = this.f10297h;
            if (aVar != null) {
                aVar.a(true, str);
            }
        } catch (Throwable th) {
            o.b(f10292b, av.ai, th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                j.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
                com.anythink.expressad.mbbanner.a.c.a aVar = this.f10297h;
                if (aVar != null) {
                    aVar.b(optInt);
                }
            } catch (Throwable th) {
                o.b(f10292b, "readyStatus", th);
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void sendImpressions(Object obj, String str) {
        l.C(str, "sendImpressions:", f10292b);
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String string = jSONArray.getString(i10);
                    for (com.anythink.expressad.foundation.d.c cVar : this.f10294d) {
                        if (cVar.aZ().equals(string)) {
                            f.a(this.f, cVar, f.f9817e);
                            arrayList.add(string);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            o.b(f10292b, "sendImpressions", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void toggleCloseBtn(Object obj, String str) {
        o.d(f10292b, "toggleCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                com.anythink.expressad.mbbanner.a.c.a aVar = this.f10297h;
                if (aVar != null) {
                    aVar.a(optInt);
                }
            }
        } catch (Throwable th) {
            o.b(f10292b, "toggleCloseBtn", th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void triggerCloseBtn(Object obj, String str) {
        o.d(f10292b, "triggerCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                new JSONObject(str).optString("state");
                com.anythink.expressad.mbbanner.a.c.a aVar = this.f10297h;
                if (aVar != null) {
                    aVar.a();
                }
                j.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
            }
        } catch (Throwable th) {
            o.b(f10292b, "triggerCloseBtn", th);
            j.a().a(obj, CommonJSBridgeImpUtils.codeToJsonString(-1));
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void unload() {
        close();
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void useCustomClose(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        try {
            com.anythink.expressad.mbbanner.a.c.a aVar = this.f10297h;
            if (aVar != null) {
                aVar.a(i10);
            }
        } catch (Throwable th) {
            o.b(f10292b, "useCustomClose", th);
        }
    }

    public final void a(List<com.anythink.expressad.foundation.d.c> list) {
        this.f10294d = list;
    }

    public final void a(int i10) {
        this.f10296g = i10;
    }

    public final void a() {
        if (this.f10297h != null) {
            this.f10297h = null;
        }
        if (this.f10298i != null) {
            this.f10298i = null;
        }
    }

    private static void a(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        boolean z10;
        String str4;
        File file;
        String str5 = CrashHianalyticsData.MESSAGE;
        String str6 = "code";
        JSONObject jSONObject2 = new JSONObject();
        int i10 = 1;
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(CrashHianalyticsData.MESSAGE, "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i11 = 0;
                while (i11 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                    String optString = jSONObject3.optString("ref", "");
                    int i12 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    JSONArray jSONArray3 = jSONArray;
                    if (i12 == i10 && !TextUtils.isEmpty(optString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        com.anythink.expressad.videocommon.b.a.a();
                        i b10 = com.anythink.expressad.videocommon.b.a.b(optString);
                        if (b10 != null) {
                            o.a(f10292b, "VideoBean not null");
                            jSONObject5.put("type", 1);
                            str2 = str5;
                            str3 = str6;
                            try {
                                jSONObject5.put("videoDataLength", b10.d());
                                String b11 = b10.b();
                                if (TextUtils.isEmpty(b11)) {
                                    o.a(f10292b, "VideoPath null");
                                    jSONObject5.put("path", "");
                                    jSONObject5.put("path4Web", "");
                                } else {
                                    o.a(f10292b, "VideoPath not null");
                                    jSONObject5.put("path", b11);
                                    jSONObject5.put("path4Web", b11);
                                }
                                if (b10.c() == 100) {
                                    jSONObject5.put("downloaded", 1);
                                    z10 = false;
                                } else {
                                    z10 = false;
                                    jSONObject5.put("downloaded", 0);
                                }
                                jSONObject4.put(optString, jSONObject5);
                                jSONArray2.put(jSONObject4);
                            } catch (Throwable th) {
                                th = th;
                                str5 = str2;
                                str = str3;
                            }
                        } else {
                            str2 = str5;
                            str3 = str6;
                            z10 = false;
                            o.a(f10292b, "VideoBean null");
                        }
                        i11++;
                        jSONArray = jSONArray3;
                        str5 = str2;
                        str6 = str3;
                        i10 = 1;
                    } else {
                        str2 = str5;
                        str3 = str6;
                        z10 = false;
                        if (i12 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 2);
                            jSONObject6.put("path", com.anythink.expressad.videocommon.b.i.a().a(optString) == null ? "" : com.anythink.expressad.videocommon.b.i.a().c(optString));
                            jSONObject4.put(optString, jSONObject6);
                            jSONArray2.put(jSONObject4);
                        } else if (i12 == 3 && !TextUtils.isEmpty(optString)) {
                            try {
                                file = new File(optString);
                            } catch (Throwable th2) {
                                if (com.anythink.expressad.a.f6552a) {
                                    th2.printStackTrace();
                                }
                            }
                            if (file.exists() && file.isFile() && file.canRead()) {
                                o.a(f10292b, "getFileInfo Mraid file ".concat(String.valueOf(optString)));
                                str4 = "file:////".concat(String.valueOf(optString));
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("type", 3);
                                jSONObject7.put("path", str4);
                                jSONObject4.put(optString, jSONObject7);
                                jSONArray2.put(jSONObject4);
                            }
                            str4 = "";
                            JSONObject jSONObject72 = new JSONObject();
                            jSONObject72.put("type", 3);
                            jSONObject72.put("path", str4);
                            jSONObject4.put(optString, jSONObject72);
                            jSONArray2.put(jSONObject4);
                        } else if (i12 == 4 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("type", 4);
                            jSONObject8.put("path", s.a(optString) == null ? "" : s.a(optString));
                            jSONObject4.put(optString, jSONObject8);
                            jSONArray2.put(jSONObject4);
                        }
                        i11++;
                        jSONArray = jSONArray3;
                        str5 = str2;
                        str6 = str3;
                        i10 = 1;
                    }
                }
                str2 = str5;
                str3 = str6;
                jSONObject2.put("resource", jSONArray2);
                j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            str = "code";
            try {
                jSONObject2.put(str, 1);
                str5 = CrashHianalyticsData.MESSAGE;
                try {
                    try {
                        jSONObject2.put(str5, "resource is null");
                        j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        return;
                    } catch (JSONException e10) {
                        e = e10;
                        o.a(f10292b, e.getMessage());
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (JSONException e11) {
                e = e11;
                str5 = CrashHianalyticsData.MESSAGE;
            } catch (Throwable th4) {
                th = th4;
                str5 = CrashHianalyticsData.MESSAGE;
            }
        } catch (Throwable th5) {
            th = th5;
            str = str6;
        }
        try {
            jSONObject2.put(str, 1);
            jSONObject2.put(str5, th.getLocalizedMessage());
            j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e12) {
            o.a(f10292b, e12.getMessage());
        }
    }
}
