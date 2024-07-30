package com.anythink.expressad.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.c.g;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.out.j;
import com.anythink.expressad.video.bt.module.b.h;
import com.anythink.expressad.video.dynview.f.d;
import com.anythink.expressad.video.signal.a.c;
import com.anythink.expressad.video.signal.b;
import com.anythink.expressad.video.signal.container.AbstractJSContainer;
import com.anythink.expressad.videocommon.a;
import com.huawei.hms.ads.jsb.constant.Constant;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkBTContainer extends AbstractJSContainer implements b {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11271d = "AnythinkBTContainer";
    private Context A;
    private TextView B;
    private boolean C;
    private boolean D;
    private String E;
    private boolean F;
    private List<c> G;
    private List<com.anythink.expressad.videocommon.b.c> H;
    private com.anythink.expressad.video.bt.module.a.a I;
    private h J;
    private h K;
    private com.anythink.expressad.video.bt.module.a.b L;
    private String M;
    private String N;
    private boolean O;
    private int P;
    private boolean Q;
    private int R;
    private String S;
    private d T;

    /* renamed from: a, reason: collision with root package name */
    c f11272a;

    /* renamed from: e, reason: collision with root package name */
    private int f11273e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private FrameLayout f11274g;

    /* renamed from: h, reason: collision with root package name */
    private AnythinkBTLayout f11275h;

    /* renamed from: i, reason: collision with root package name */
    private WindVaneWebView f11276i;

    /* renamed from: j, reason: collision with root package name */
    private LayoutInflater f11277j;

    /* loaded from: classes.dex */
    public class a extends c.a {
        private a() {
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.p.c
        public final void a(com.anythink.expressad.foundation.d.c cVar, String str) {
            super.a(cVar, str);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void b() {
            super.b();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void c() {
            super.c();
        }

        public /* synthetic */ a(AnythinkBTContainer anythinkBTContainer, byte b10) {
            this();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.p.c
        public final void a(j jVar, String str) {
            super.a(jVar, str);
            if (jVar == null || !(jVar instanceof com.anythink.expressad.foundation.d.c)) {
                return;
            }
            try {
                com.anythink.expressad.foundation.d.c cVar = (com.anythink.expressad.foundation.d.c) jVar;
                String optString = new JSONObject(AnythinkBTContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                if (cVar.Q() == 3 && cVar.C() == 2 && optString.equals(g.c.f5034a) && ((AbstractJSContainer) AnythinkBTContainer.this).f12255l != null) {
                    if (!AnythinkBTContainer.this.D) {
                        ((AbstractJSContainer) AnythinkBTContainer.this).f12255l.finish();
                    } else {
                        AnythinkBTContainer.this.onAdClose();
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.p.c
        public final void b(j jVar, String str) {
            super.b(jVar, str);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(com.anythink.expressad.foundation.d.c cVar, boolean z10) {
            super.a(cVar, z10);
            AnythinkBTContainer.this.K.a(cVar);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(int i10, String str) {
            super.a(i10, str);
        }
    }

    public AnythinkBTContainer(Context context) {
        super(context);
        this.f11273e = 0;
        this.f = 1;
        this.C = false;
        this.D = true;
        this.F = false;
        this.P = 1;
        init(context);
    }

    private static void d() {
    }

    private static boolean e() {
        return true;
    }

    private static int f() {
        return 1;
    }

    public void appendSubView(AnythinkBTContainer anythinkBTContainer, ATTempContainer aTTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context g6 = n.a().g();
                int optInt = jSONObject.optInt("left", com.anythink.expressad.video.bt.a.c.f11213a);
                int optInt2 = jSONObject.optInt(Constant.MAP_KEY_TOP, com.anythink.expressad.video.bt.a.c.f11213a);
                int optInt3 = jSONObject.optInt("right", com.anythink.expressad.video.bt.a.c.f11213a);
                int optInt4 = jSONObject.optInt("bottom", com.anythink.expressad.video.bt.a.c.f11213a);
                if (optInt != -999 && g6 != null) {
                    layoutParams.leftMargin = t.b(g6, optInt);
                }
                if (optInt2 != -999 && g6 != null) {
                    layoutParams.topMargin = t.b(g6, optInt2);
                }
                if (optInt3 != -999 && g6 != null) {
                    layoutParams.rightMargin = t.b(g6, optInt3);
                }
                if (optInt4 != -999 && g6 != null) {
                    layoutParams.bottomMargin = t.b(g6, optInt4);
                }
                int optInt5 = jSONObject.optInt(ContentRecord.WIDTH);
                int optInt6 = jSONObject.optInt(ContentRecord.HEIGHT);
                if (optInt5 > 0) {
                    layoutParams.width = optInt5;
                }
                if (optInt6 > 0) {
                    layoutParams.height = optInt6;
                }
            }
            anythinkBTContainer.addView(aTTempContainer, layoutParams);
            aTTempContainer.setActivity(this.f12255l);
            aTTempContainer.setMute(this.f12261s);
            aTTempContainer.setBidCampaign(this.C);
            aTTempContainer.setIV(this.f12262t);
            aTTempContainer.setBigOffer(this.D);
            aTTempContainer.setIVRewardEnable(this.f12264v, this.f12265w, this.f12266x);
            aTTempContainer.setShowRewardListener(this.K);
            aTTempContainer.setCampaignDownLoadTask(d(aTTempContainer.getCampaign()));
            aTTempContainer.setAnythinkTempCallback(c());
            aTTempContainer.setH5Cbp(getJSCommon().e());
            aTTempContainer.setWebViewFront(getJSCommon().f());
            aTTempContainer.init(this.A);
            aTTempContainer.onCreate();
        } catch (Throwable th) {
            o.a(f11271d, th.getMessage());
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f11276i != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.f11273e);
                jSONObject2.put("id", this.E);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) this.f11276i, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.anythink.expressad.video.bt.a.c.a();
                com.anythink.expressad.video.bt.a.c.a((WebView) this.f11276i, "broadcast", this.E);
            }
        }
    }

    public int findID(String str) {
        return i.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return i.a(getContext(), str, "layout");
    }

    public void init(Context context) {
        this.A = context;
        this.f11277j = LayoutInflater.from(context);
    }

    public boolean isNativeKilledCallback(com.anythink.expressad.foundation.d.c cVar) {
        if (getJSCommon().e() != 1 && cVar != null) {
            if (cVar.n() == 1) {
                com.anythink.expressad.videocommon.e.d dVar = this.o;
                if (dVar != null) {
                    if (dVar.M() == 1) {
                        cVar.m(1);
                        return true;
                    }
                    cVar.m(0);
                    return false;
                }
            } else {
                if (cVar.A()) {
                    cVar.m(0);
                    return false;
                }
                int a10 = this.o.a();
                cVar.m(a10);
                if (a10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onAdClose() {
        Activity activity = this.f12255l;
        if (activity != null) {
            activity.finish();
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> b10 = com.anythink.expressad.video.bt.a.c.a().b(this.f12256m, this.N);
            if (b10 != null && b10.size() > 0) {
                for (View view : b10.values()) {
                    if (view instanceof ATTempContainer) {
                        ((ATTempContainer) view).onBackPressed();
                    } else if (view instanceof AnythinkBTWebView) {
                        ((AnythinkBTWebView) view).onBackPressed();
                    } else if (view instanceof AnythinkBTLayout) {
                        ((AnythinkBTLayout) view).onBackPressed();
                    }
                }
            }
        } catch (Throwable th) {
            o.a(f11271d, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> b10 = com.anythink.expressad.video.bt.a.c.a().b(this.f12256m, this.N);
            if (b10 != null && b10.size() > 0) {
                for (View view : b10.values()) {
                    if (view instanceof ATTempContainer) {
                        ((ATTempContainer) view).onConfigurationChanged(configuration);
                    } else if (view instanceof AnythinkBTWebView) {
                        ((AnythinkBTWebView) view).onConfigurationChanged(configuration);
                    } else if (view instanceof AnythinkBTLayout) {
                        ((AnythinkBTLayout) view).onConfigurationChanged(configuration);
                    }
                }
            }
        } catch (Throwable th) {
            o.a(f11271d, th.getMessage());
        }
    }

    public void onCreate() {
        String str;
        WindVaneWebView windVaneWebView;
        com.anythink.expressad.foundation.d.c cVar;
        try {
            int findLayout = findLayout("anythink_bt_container");
            if (findLayout < 0) {
                a("anythink_bt_container layout null");
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.f11277j.inflate(findLayout, this);
            this.f11274g = frameLayout;
            if (frameLayout == null) {
                a("ViewIds null");
                return;
            }
            this.N = "";
            List<com.anythink.expressad.foundation.d.c> list = this.G;
            byte b10 = 0;
            if (list == null || list.size() <= 0) {
                str = "";
            } else {
                com.anythink.expressad.foundation.d.c cVar2 = this.G.get(0);
                str = cVar2.ar();
                this.N = cVar2.Z();
            }
            a.C0140a a10 = com.anythink.expressad.videocommon.a.a(this.f12256m + "_" + this.N + "_" + str);
            RelativeLayout.LayoutParams layoutParams = null;
            if (a10 != null) {
                this.E = a10.b();
                o.a(f11271d, "get BT wraper.getTag = " + this.E);
                a10.a("");
                windVaneWebView = a10.a();
            } else {
                windVaneWebView = null;
            }
            this.f11276i = windVaneWebView;
            com.anythink.expressad.videocommon.a.b(this.f12256m + "_" + this.N + "_" + str);
            WindVaneWebView windVaneWebView2 = this.f11276i;
            if (windVaneWebView2 != null) {
                com.anythink.expressad.video.signal.factory.b bVar = new com.anythink.expressad.video.signal.factory.b(this.f12255l, this, windVaneWebView2);
                registerJsFactory(bVar);
                this.f11276i.setApiManagerJSFactory(bVar);
                if (this.f11276i.getParent() != null) {
                    a("preload template webview is null or load error");
                    return;
                }
                if (this.f11276i.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                    bVar.a((com.anythink.expressad.video.signal.a.j) this.f11276i.getObject());
                    if (this.f11276i != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(com.anythink.expressad.foundation.g.a.ch, t.c(getContext()));
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", this.f12259q.a());
                            jSONObject2.put("amount", this.f12259q.b());
                            jSONObject2.put("id", this.f12260r);
                            jSONObject.put("userId", this.f12258p);
                            jSONObject.put("reward", jSONObject2);
                            jSONObject.put("playVideoMute", this.f12261s);
                            jSONObject.put(g.a.f5311h, this.S);
                        } catch (JSONException e10) {
                            o.a(f11271d, e10.getMessage());
                        } catch (Exception e11) {
                            o.a(f11271d, e11.getMessage());
                        }
                        this.K = new com.anythink.expressad.video.bt.module.b.d(c(), "");
                        getJSNotifyProxy().a(jSONObject.toString());
                        getJSCommon().h();
                        getJSCommon().a(new a(this, b10));
                    }
                    ((com.anythink.expressad.video.signal.a.c) getJSCommon()).f11912r.b();
                }
                this.f11276i.setBackgroundColor(0);
                LinkedHashMap<String, View> b11 = com.anythink.expressad.video.bt.a.c.a().b(this.f12256m, this.N);
                if (b11 != null && b11.containsKey(this.E)) {
                    View view = b11.get(this.E);
                    if (view instanceof AnythinkBTLayout) {
                        AnythinkBTLayout anythinkBTLayout = (AnythinkBTLayout) view;
                        this.f11275h = anythinkBTLayout;
                        anythinkBTLayout.addView(this.f11276i, 0, new FrameLayout.LayoutParams(-1, -1));
                        com.anythink.expressad.foundation.f.b.a().a(this.f12256m + "_1", new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.1
                            @Override // com.anythink.expressad.foundation.f.a
                            public final void a() {
                                String str2;
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    if (n.a().g() != null) {
                                        jSONObject3.put("status", 1);
                                    }
                                    str2 = jSONObject3.toString();
                                } catch (Throwable th) {
                                    o.b(AnythinkBTContainer.f11271d, th.getMessage(), th);
                                    str2 = "";
                                }
                                String encodeToString = Base64.encodeToString(str2.getBytes(), 2);
                                com.anythink.expressad.atsignalcommon.windvane.j.a();
                                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.f11276i, AbsFeedBackForH5.f7027a, encodeToString);
                            }

                            @Override // com.anythink.expressad.foundation.f.a
                            public final void b() {
                                String str2;
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    if (n.a().g() != null) {
                                        jSONObject3.put("status", 2);
                                    }
                                    str2 = jSONObject3.toString();
                                } catch (Throwable th) {
                                    o.b(AnythinkBTContainer.f11271d, th.getMessage(), th);
                                    str2 = "";
                                }
                                String encodeToString = Base64.encodeToString(str2.getBytes(), 2);
                                com.anythink.expressad.atsignalcommon.windvane.j.a();
                                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.f11276i, AbsFeedBackForH5.f7027a, encodeToString);
                            }

                            @Override // com.anythink.expressad.foundation.f.a
                            public final void c() {
                                String str2;
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    if (n.a().g() != null) {
                                        jSONObject3.put("status", 2);
                                    }
                                    str2 = jSONObject3.toString();
                                } catch (Throwable th) {
                                    o.b(AnythinkBTContainer.f11271d, th.getMessage(), th);
                                    str2 = "";
                                }
                                String encodeToString = Base64.encodeToString(str2.getBytes(), 2);
                                com.anythink.expressad.atsignalcommon.windvane.j.a();
                                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.f11276i, AbsFeedBackForH5.f7027a, encodeToString);
                            }
                        });
                        com.anythink.expressad.foundation.f.b.a().c(this.f12256m + "_2");
                        View b12 = com.anythink.expressad.foundation.f.b.a().b(this.f12256m + "_1");
                        if (com.anythink.expressad.foundation.f.b.a().b() && b12 != null) {
                            try {
                                layoutParams = (RelativeLayout.LayoutParams) b12.getLayoutParams();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                            if (layoutParams == null) {
                                layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f9756a, com.anythink.expressad.foundation.f.b.f9757b);
                            }
                            layoutParams.topMargin = t.b(n.a().g(), 10.0f);
                            layoutParams.leftMargin = t.b(n.a().g(), 10.0f);
                            b12.setLayoutParams(layoutParams);
                            ViewGroup viewGroup = (ViewGroup) b12.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(b12);
                            }
                            this.f11275h.addView(b12);
                        }
                        this.f11275h.setTag(this.E);
                        b11.put(this.E, this.f11275h);
                        Iterator<View> it = b11.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof AnythinkBTRootLayout) {
                                AnythinkBTRootLayout anythinkBTRootLayout = (AnythinkBTRootLayout) next;
                                this.M = anythinkBTRootLayout.getInstanceId();
                                this.f11274g.addView(anythinkBTRootLayout, new FrameLayout.LayoutParams(-1, -1));
                                break;
                            }
                        }
                        b11.remove(this.M);
                        b11.put(this.M, this);
                    }
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.f12256m, this.f12261s);
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.E, this.N);
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.M, this.N);
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.f12256m + "_" + this.N, this.f12255l);
                    List<com.anythink.expressad.foundation.d.c> list2 = this.G;
                    if (list2 != null && list2.size() > 0) {
                        a(this.o, this.G.get(0));
                        return;
                    }
                    return;
                }
                a("big template webviewLayout is null");
                return;
            }
            List<com.anythink.expressad.foundation.d.c> list3 = this.G;
            if (list3 != null && list3.size() > 0 && (cVar = this.G.get(0)) != null && cVar.j()) {
                Context context = this.A;
                if (this.T == null) {
                    a("ChoiceOneCallback is null");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(com.anythink.expressad.video.dynview.a.a.D, this.T);
                com.anythink.expressad.video.dynview.b.a();
                com.anythink.expressad.video.dynview.b.a(context, this.G, new AnonymousClass2(), hashMap);
                return;
            }
            a("big template webview is null");
        } catch (Throwable th) {
            a("onCreate exception ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.F) {
            return;
        }
        this.F = true;
        super.onDestroy();
        com.anythink.expressad.video.bt.a.c.a();
        com.anythink.expressad.video.bt.a.c.d(this.f12256m + "_" + this.N);
        try {
            WindVaneWebView windVaneWebView = this.f11276i;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f11276i.clearWebView();
                this.f11276i.release();
            }
            if (this.L != null) {
                this.L = null;
            }
            if (this.I != null) {
                this.I = null;
            }
            if (this.A != null) {
                this.A = null;
            }
            List<com.anythink.expressad.foundation.d.c> list = this.G;
            if (list != null && list.size() > 0) {
                for (com.anythink.expressad.foundation.d.c cVar : this.G) {
                    if (cVar != null && cVar.M() != null) {
                        com.anythink.expressad.videocommon.a.b(this.f12256m + "_" + cVar.Z() + "_" + cVar.M().e());
                    }
                }
            }
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.f(this.E);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.g(this.f12256m);
            com.anythink.expressad.video.bt.a.c.a().b(this.f12256m, this.N).remove(this.E);
            com.anythink.expressad.video.bt.a.c.a().b(this.f12256m, this.N).remove(this.M);
            com.anythink.expressad.video.bt.a.c.a().b(this.f12256m, this.N).clear();
        } catch (Throwable th) {
            o.a(f11271d, th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onPause() {
        com.anythink.expressad.foundation.d.c cVar;
        super.onPause();
        List<com.anythink.expressad.foundation.d.c> list = this.G;
        if (list != null && list.size() > 0 && (cVar = this.G.get(0)) != null && cVar.j()) {
            com.anythink.expressad.video.dynview.b.a.a();
        }
        try {
            LinkedHashMap<String, View> b10 = com.anythink.expressad.video.bt.a.c.a().b(this.f12256m, this.N);
            if (b10 != null && b10.size() > 0) {
                for (View view : b10.values()) {
                    if (view instanceof AnythinkBTVideoView) {
                        ((AnythinkBTVideoView) view).onPause();
                    }
                }
            }
        } catch (Throwable th) {
            o.a(f11271d, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onResume() {
        com.anythink.expressad.foundation.d.c cVar;
        com.anythink.expressad.video.dynview.e.a aVar;
        super.onResume();
        List<com.anythink.expressad.foundation.d.c> list = this.G;
        if (list != null && list.size() > 0 && (cVar = this.G.get(0)) != null && cVar.j() && (aVar = com.anythink.expressad.video.dynview.b.a.a().f11411a) != null) {
            aVar.a();
        }
        if (com.anythink.expressad.foundation.f.b.f9758c) {
            return;
        }
        try {
            LinkedHashMap<String, View> b10 = com.anythink.expressad.video.bt.a.c.a().b(this.f12256m, this.N);
            if (b10 != null && b10.size() > 0) {
                for (View view : b10.values()) {
                    if (view instanceof AnythinkBTVideoView) {
                        ((AnythinkBTVideoView) view).onResume();
                    }
                }
            }
        } catch (Throwable th) {
            o.a(f11271d, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onStop() {
        com.anythink.expressad.foundation.d.c cVar;
        com.anythink.expressad.video.dynview.e.a aVar;
        super.onStop();
        List<com.anythink.expressad.foundation.d.c> list = this.G;
        if (list != null && list.size() > 0 && (cVar = this.G.get(0)) != null && cVar.j() && (aVar = com.anythink.expressad.video.dynview.b.a.a().f11411a) != null) {
            aVar.c();
        }
        try {
            LinkedHashMap<String, View> b10 = com.anythink.expressad.video.bt.a.c.a().b(this.f12256m, this.N);
            if (b10 != null && b10.size() > 0) {
                for (View view : b10.values()) {
                    if (view instanceof AnythinkBTVideoView) {
                        ((AnythinkBTVideoView) view).onStop();
                    }
                }
            }
        } catch (Throwable th) {
            o.a(f11271d, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.b
    public void reactDeveloper(Object obj, String str) {
        int i10;
        if (this.I != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("type");
                int optInt2 = jSONObject.optInt("hit");
                String optString = jSONObject.optString("unitId", getUnitId());
                jSONObject.optString(com.anythink.expressad.a.y, getPlacementId());
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                com.anythink.expressad.foundation.d.c cVar = this.G.get(0);
                boolean z10 = true;
                if (optInt == 1) {
                    boolean optBoolean = optJSONObject.optBoolean("expired");
                    if (cVar != null) {
                        if (optBoolean) {
                            cVar.e(1);
                        } else {
                            cVar.e(0);
                        }
                    }
                    this.O = isNativeKilledCallback(cVar);
                }
                switch (optInt) {
                    case 1:
                        this.I.a();
                        break;
                    case 2:
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("error");
                        String str2 = "";
                        if (optJSONObject2 != null) {
                            str2 = optJSONObject2.optString("msg");
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str2 = optJSONObject.optString("error");
                        }
                        if (!this.O && optInt2 != this.P) {
                            this.I.a(str2);
                            break;
                        }
                        break;
                    case 3:
                        this.I.b();
                        break;
                    case 4:
                        this.I.c();
                        break;
                    case 5:
                        com.anythink.expressad.video.bt.module.a.a aVar = this.I;
                        com.anythink.expressad.foundation.d.c cVar2 = this.f11272a;
                        if (cVar2 != null) {
                            cVar = cVar2;
                        }
                        aVar.a(cVar);
                        break;
                    case 6:
                        if (optJSONObject.optInt("convert") != 1) {
                            z10 = false;
                        }
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("reward");
                        com.anythink.expressad.foundation.d.c b10 = com.anythink.expressad.foundation.d.c.b(optJSONObject.optJSONObject("campaign"));
                        com.anythink.expressad.videocommon.c.c a10 = com.anythink.expressad.videocommon.c.c.a(optJSONObject3);
                        if (a10 == null) {
                            a10 = this.f12259q;
                        }
                        String optString2 = optJSONObject.optString(g.a.f5311h);
                        if (!TextUtils.isEmpty(optString2)) {
                            this.S = optString2;
                        }
                        if (!this.O && optInt2 != this.P) {
                            if (this.f12262t && ((i10 = this.f12264v) == com.anythink.expressad.foundation.g.a.cr || i10 == com.anythink.expressad.foundation.g.a.cs)) {
                                this.I.a(this.Q, this.R);
                            }
                            if (!z10) {
                                a10.a(0);
                            }
                            this.I.a(z10, a10);
                            o.a(f11271d, "sendToServerRewardInfo");
                            if (!this.f12262t && z10) {
                                if (b10 != null) {
                                    com.anythink.expressad.video.module.b.a.a(b10, a10, optString, this.f12258p, this.S);
                                    break;
                                } else {
                                    com.anythink.expressad.video.module.b.a.a(cVar, a10, optString, this.f12258p, this.S);
                                    break;
                                }
                            }
                        }
                        break;
                }
                a(obj);
                return;
            } catch (JSONException e10) {
                AbstractJSContainer.a(obj, e10.getMessage());
                o.a(f11271d, e10.getMessage());
                return;
            }
        }
        AbstractJSContainer.a(obj, "listener is null");
    }

    public void setBTContainerCallback(com.anythink.expressad.video.bt.module.a.a aVar) {
        this.I = aVar;
    }

    public void setCampaignDownLoadTasks(List<com.anythink.expressad.videocommon.b.c> list) {
        this.H = list;
    }

    public void setCampaigns(List<com.anythink.expressad.foundation.d.c> list) {
        this.G = list;
    }

    public void setChoiceOneCallback(d dVar) {
        this.T = dVar;
    }

    public void setDeveloperExtraData(String str) {
        this.S = str;
    }

    public void setJSFactory(com.anythink.expressad.video.signal.factory.b bVar) {
        this.f12267z = bVar;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13, int i14) {
        TextView textView;
        try {
            String a10 = com.anythink.expressad.foundation.h.h.a(i10, i11, i12, i13, i14);
            o.d(f11271d, a10);
            WindVaneWebView windVaneWebView = this.f11276i;
            if (windVaneWebView != null && (windVaneWebView.getObject() instanceof com.anythink.expressad.video.signal.a.j) && !TextUtils.isEmpty(a10)) {
                ((com.anythink.expressad.video.signal.a.j) this.f11276i.getObject()).b(a10);
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) this.f11276i, "oncutoutfetched", Base64.encodeToString(a10.getBytes(), 0));
            }
            List<com.anythink.expressad.foundation.d.c> list = this.G;
            if (list != null && list.size() > 0) {
                try {
                    if (this.G.get(0).j() && (textView = this.B) != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                        layoutParams.setMargins(i11, i13, i12, i14);
                        this.B.setLayoutParams(layoutParams);
                    }
                } catch (Exception e10) {
                    o.d(f11271d, e10.getMessage());
                }
            }
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(i10, i11, i12, i13, i14);
            LinkedHashMap<String, View> b10 = com.anythink.expressad.video.bt.a.c.a().b(this.f12256m, this.N);
            if (b10 != null && b10.size() > 0) {
                for (View view : b10.values()) {
                    if (view instanceof AnythinkBTVideoView) {
                        ((AnythinkBTVideoView) view).setNotchPadding(i11, i12, i13, i14);
                    }
                    if (view instanceof ATTempContainer) {
                        ((ATTempContainer) view).setNotchPadding(i10, i11, i12, i13, i14);
                    }
                    if ((view instanceof WindVaneWebView) && !TextUtils.isEmpty(a10)) {
                        com.anythink.expressad.atsignalcommon.windvane.j.a().a(view, "oncutoutfetched", Base64.encodeToString(a10.getBytes(), 0));
                    }
                }
            }
        } catch (Throwable th) {
            o.a(f11271d, th.getMessage());
        }
    }

    public void setShowRewardVideoListener(h hVar) {
        this.J = hVar;
    }

    private WindVaneWebView b(String str) {
        a.C0140a a10 = com.anythink.expressad.videocommon.a.a(str);
        if (a10 == null) {
            return null;
        }
        this.E = a10.b();
        o.a(f11271d, "get BT wraper.getTag = " + this.E);
        a10.a("");
        return a10.a();
    }

    private com.anythink.expressad.video.bt.module.a.b c() {
        if (this.L == null) {
            this.L = new com.anythink.expressad.video.bt.module.a.b() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.3
                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a() {
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void b(String str) {
                    if (AnythinkBTContainer.this.f11276i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("convert", true);
                            jSONObject2.put(com.anythink.expressad.a.y, ((AbstractJSContainer) AnythinkBTContainer.this).f12257n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f12256m);
                            jSONObject.put("data", jSONObject2);
                            o.a(AnythinkBTContainer.f11271d, " BT Call H5 onVideoComplete " + jSONObject.toString());
                        } catch (JSONException e10) {
                            o.a(AnythinkBTContainer.f11271d, e10.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.f11276i, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void c(String str) {
                    if (AnythinkBTContainer.this.f11276i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.y, ((AbstractJSContainer) AnythinkBTContainer.this).f12257n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f12256m);
                            jSONObject.put("data", jSONObject2);
                            o.a(AnythinkBTContainer.f11271d, " BT Call H5 onEndcardShow " + jSONObject.toString());
                        } catch (JSONException e10) {
                            o.a(AnythinkBTContainer.f11271d, e10.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.f11276i, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str) {
                    if (AnythinkBTContainer.this.f11276i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.y, ((AbstractJSContainer) AnythinkBTContainer.this).f12257n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f12256m);
                            jSONObject.put("data", jSONObject2);
                            o.a(AnythinkBTContainer.f11271d, " BT Call H5 onAdShow " + jSONObject.toString());
                        } catch (JSONException e10) {
                            o.a(AnythinkBTContainer.f11271d, e10.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.f11276i, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, boolean z10, com.anythink.expressad.videocommon.c.c cVar) {
                    if (AnythinkBTContainer.this.f11276i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            if (cVar != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("name", cVar.a());
                                jSONObject3.put("amount", cVar.b());
                                jSONObject2.put("reward", jSONObject3);
                            }
                            jSONObject2.put("isComplete", z10);
                            jSONObject2.put("convert", z10 ? 1 : 2);
                            jSONObject.put("data", jSONObject2);
                            o.a(AnythinkBTContainer.f11271d, " BT Call H5 onAdClose " + jSONObject.toString());
                        } catch (JSONException e10) {
                            o.a(AnythinkBTContainer.f11271d, e10.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.f11276i, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.f11276i, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(boolean z10, int i10) {
                    AnythinkBTContainer.this.Q = z10;
                    AnythinkBTContainer.this.R = i10;
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, String str2) {
                    if (AnythinkBTContainer.this.f11276i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.y, ((AbstractJSContainer) AnythinkBTContainer.this).f12257n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f12256m);
                            jSONObject2.put("error", str2);
                            jSONObject.put("data", jSONObject2);
                            o.a(AnythinkBTContainer.f11271d, " BT Call H5 onShowFail " + jSONObject.toString());
                        } catch (JSONException e10) {
                            o.a(AnythinkBTContainer.f11271d, e10.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.f11276i, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, com.anythink.expressad.foundation.d.c cVar) {
                    AnythinkBTContainer anythinkBTContainer = AnythinkBTContainer.this;
                    anythinkBTContainer.f11272a = cVar;
                    if (anythinkBTContainer.f11276i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.y, ((AbstractJSContainer) AnythinkBTContainer.this).f12257n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f12256m);
                            jSONObject.put("data", jSONObject2);
                            o.a(AnythinkBTContainer.f11271d, " BT Call H5 onVideoAdClicked " + jSONObject.toString());
                        } catch (JSONException e10) {
                            o.a(AnythinkBTContainer.f11271d, e10.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.f11276i, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            };
        }
        return this.L;
    }

    private boolean g() {
        try {
            com.anythink.expressad.videocommon.e.d dVar = this.o;
            if (dVar == null) {
                return false;
            }
            double L = dVar.L();
            if (L == 1.0d) {
                return false;
            }
            return new Random().nextDouble() > L;
        } catch (Throwable th) {
            o.b(f11271d, "", th);
            return false;
        }
    }

    private com.anythink.expressad.videocommon.b.c d(com.anythink.expressad.foundation.d.c cVar) {
        List<com.anythink.expressad.videocommon.b.c> list = this.H;
        if (list == null || cVar == null) {
            return null;
        }
        for (com.anythink.expressad.videocommon.b.c cVar2 : list) {
            if (cVar2.n().aZ().equals(cVar.aZ())) {
                o.a(f11271d, "tempContainer task initSuccess");
                return cVar2;
            }
        }
        return null;
    }

    private void a(Context context) {
        if (this.T == null) {
            a("ChoiceOneCallback is null");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.expressad.video.dynview.a.a.D, this.T);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(context, this.G, new AnonymousClass2(), hashMap);
    }

    public AnythinkBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11273e = 0;
        this.f = 1;
        this.C = false;
        this.D = true;
        this.F = false;
        this.P = 1;
        init(context);
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public final void a(String str) {
        h hVar = this.J;
        if (hVar != null) {
            hVar.a(str);
        }
        super.a(str);
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            try {
                List<String> e10 = cVar.e();
                if (e10 == null || e10.size() <= 0) {
                    return;
                }
                Iterator<String> it = e10.iterator();
                while (it.hasNext()) {
                    com.anythink.expressad.a.a.a(n.a().g(), cVar, this.f12256m, it.next(), true);
                }
            } catch (Throwable th) {
                o.d(f11271d, th.getMessage());
            }
        }
    }

    private boolean a(boolean z10) {
        com.anythink.expressad.videocommon.e.d dVar;
        try {
            dVar = this.o;
        } catch (Throwable th) {
            o.b(f11271d, "", th);
        }
        if (dVar == null) {
            return false;
        }
        int K = dVar.K();
        if (K == 1) {
            return z10;
        }
        if (K == 2) {
            return z10 && g();
        }
        if (K != 3) {
            return false;
        }
        return g();
    }

    /* renamed from: com.anythink.expressad.video.bt.module.AnythinkBTContainer$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements com.anythink.expressad.video.dynview.f.h {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            com.anythink.expressad.foundation.d.c cVar;
            String sb2;
            if (AnythinkBTContainer.this.f11274g != null && aVar.a() != null) {
                AnythinkBTContainer.this.f11274g.removeAllViews();
                AnythinkBTContainer.this.f11274g.addView(aVar.a());
                AnythinkBTContainer anythinkBTContainer = AnythinkBTContainer.this;
                anythinkBTContainer.B = (TextView) anythinkBTContainer.findViewById(anythinkBTContainer.findID("anythink_choice_one_countdown_tv"));
                if (AnythinkBTContainer.this.I != null) {
                    AnythinkBTContainer.this.I.a();
                }
                if (AnythinkBTContainer.this.G == null || AnythinkBTContainer.this.G.size() <= 0 || (cVar = (com.anythink.expressad.foundation.d.c) AnythinkBTContainer.this.G.get(0)) == null) {
                    return;
                }
                String ai = cVar.ai();
                com.anythink.expressad.videocommon.e.d a10 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), ((AbstractJSContainer) AnythinkBTContainer.this).f12256m);
                int M = a10 != null ? a10.M() : 1;
                if (cVar.n() == 1) {
                    StringBuilder l10 = com.ironsource.adapters.facebook.a.l(ai, "&to=1&cbt=");
                    l10.append(cVar.az());
                    l10.append("&tmorl=");
                    l10.append(M);
                    sb2 = l10.toString();
                } else {
                    StringBuilder l11 = com.ironsource.adapters.facebook.a.l(ai, "&to=0&cbt=");
                    l11.append(cVar.az());
                    l11.append("&tmorl=");
                    l11.append(M);
                    sb2 = l11.toString();
                }
                com.anythink.expressad.a.a.a(n.a().g(), cVar, ((AbstractJSContainer) AnythinkBTContainer.this).f12256m, sb2, false, true, com.anythink.expressad.a.a.a.f6606j);
                f.f9819h.put(cVar.ai(), Long.valueOf(System.currentTimeMillis()));
                AnythinkBTContainer.this.a(cVar);
                return;
            }
            AnythinkBTContainer.this.a("nativeview is null");
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.c.b bVar) {
            String str;
            if (bVar != null) {
                str = "errorCode:" + bVar.a() + "Msg:" + bVar.b();
            } else {
                str = "";
            }
            AnythinkBTContainer.this.a("nativeview is null".concat(String.valueOf(str)));
        }
    }

    @Override // com.anythink.expressad.video.signal.d
    public void click(int i10, String str) {
    }

    @Override // com.anythink.expressad.video.signal.d
    public void handlerH5Exception(int i10, String str) {
    }
}
