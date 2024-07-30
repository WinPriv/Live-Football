package com.anythink.expressad.splash.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.u;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.splash.js.SplashJSBridgeImpl;
import com.anythink.expressad.splash.js.SplashJsUtils;
import com.huawei.hms.ads.ep;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ATSplashView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f11154a = "webviewshow";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f11155b = "updateCountdown";

    /* renamed from: c, reason: collision with root package name */
    private static String f11156c = "ATSplashView";

    /* renamed from: d, reason: collision with root package name */
    private int f11157d;

    /* renamed from: e, reason: collision with root package name */
    private ATSplashWebview f11158e;
    private ViewGroup f;

    /* renamed from: g, reason: collision with root package name */
    private View f11159g;

    /* renamed from: h, reason: collision with root package name */
    private View f11160h;

    /* renamed from: i, reason: collision with root package name */
    private int f11161i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11162j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11163k;

    /* renamed from: l, reason: collision with root package name */
    private ViewGroup f11164l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f11165m;

    /* renamed from: n, reason: collision with root package name */
    private View f11166n;
    private boolean o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11167p;

    /* renamed from: q, reason: collision with root package name */
    private RelativeLayout.LayoutParams f11168q;

    /* renamed from: r, reason: collision with root package name */
    private SplashJSBridgeImpl f11169r;

    public ATSplashView(Context context) {
        this(context, null);
    }

    private void b() {
        setBackgroundColor(0);
        this.f11157d = getResources().getConfiguration().orientation;
    }

    private void c() {
        View view;
        View view2;
        View view3;
        if (this.f11160h == null) {
            if (this.o && (view3 = this.f11166n) != null) {
                if (view3.getParent() != null) {
                    u.a(this.f11166n);
                }
                addView(this.f11166n, new ViewGroup.LayoutParams(-1, -1));
            } else {
                ATSplashWebview aTSplashWebview = this.f11158e;
                if (aTSplashWebview != null && aTSplashWebview.getParent() == null) {
                    addView(this.f11158e, new ViewGroup.LayoutParams(-1, -1));
                }
                d();
            }
        } else {
            if (this.f == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f11157d == 2) {
                this.f11161i = t.f(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f.getId());
                if (this.o && (view2 = this.f11166n) != null) {
                    if (view2.getParent() != null) {
                        u.a(this.f11166n);
                    }
                    addView(this.f11166n, layoutParams);
                } else {
                    ATSplashWebview aTSplashWebview2 = this.f11158e;
                    if (aTSplashWebview2 != null && aTSplashWebview2.getParent() == null) {
                        addView(this.f11158e, layoutParams);
                    }
                    d();
                }
                ViewGroup viewGroup = this.f;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i10 = this.f11168q.width;
                    int i11 = this.f11161i;
                    if (i10 > i11 / 4) {
                        i10 = i11 / 4;
                    }
                    this.f.addView(this.f11160h, i10, -1);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f, layoutParams2);
                }
            } else {
                this.f11161i = t.e(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f.getId());
                if (this.o && (view = this.f11166n) != null) {
                    if (view.getParent() != null) {
                        u.a(this.f11166n);
                    }
                    addView(this.f11166n, layoutParams3);
                } else {
                    ATSplashWebview aTSplashWebview3 = this.f11158e;
                    if (aTSplashWebview3 != null && aTSplashWebview3.getParent() == null) {
                        addView(this.f11158e, layoutParams3);
                    }
                    d();
                }
                ViewGroup viewGroup2 = this.f;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i12 = this.f11168q.height;
                    int i13 = this.f11161i;
                    if (i12 > i13 / 4) {
                        i12 = i13 / 4;
                    }
                    this.f.addView(this.f11160h, -1, i12);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i12);
                    layoutParams4.addRule(12);
                    addView(this.f, layoutParams4);
                }
            }
        }
        View view4 = this.f11159g;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(t.b(getContext(), 100.0f), t.b(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = t.b(getContext(), 10.0f);
                layoutParams5.topMargin = t.b(getContext(), 10.0f);
                addView(this.f11159g, layoutParams5);
                return;
            }
            bringChildToFront(this.f11159g);
        }
    }

    private void d() {
        ATSplashWebview aTSplashWebview = this.f11158e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(this.f11169r);
            this.f11158e.post(new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        o.a(ATSplashView.f11156c, ATSplashView.f11154a);
                        String str = "";
                        try {
                            int[] iArr = new int[2];
                            ATSplashView.this.f11158e.getLocationOnScreen(iArr);
                            o.d(ATSplashView.f11156c, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", t.a(n.a().g(), (float) iArr[0]));
                            jSONObject.put("startY", t.a(n.a().g(), (float) iArr[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            o.b(ATSplashView.f11156c, th.getMessage(), th);
                        }
                        int[] iArr2 = new int[2];
                        ATSplashView.this.f11158e.getLocationInWindow(iArr2);
                        ATSplashView.transInfoForMraid(ATSplashView.this.f11158e, iArr2[0], iArr2[1], ATSplashView.this.f11158e.getWidth(), ATSplashView.this.f11158e.getHeight());
                        String encodeToString = Base64.encodeToString(str.toString().getBytes(), 2);
                        j.a();
                        j.a((WebView) ATSplashView.this.f11158e, ATSplashView.f11154a, encodeToString);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            });
        }
    }

    public static void transInfoForMraid(WebView webView, int i10, int i11, int i12, int i13) {
        String str;
        o.d(f11156c, "transInfoForMraid");
        try {
            int i14 = n.a().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i14 == 2) {
                str = "landscape";
            } else if (i14 == 1) {
                str = "portrait";
            } else {
                str = "undefined";
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", ep.Code);
            float e10 = k.e(n.a().g());
            float f = k.f(n.a().g());
            HashMap g6 = k.g(n.a().g());
            int intValue = ((Integer) g6.get(ContentRecord.WIDTH)).intValue();
            int intValue2 = ((Integer) g6.get(ContentRecord.HEIGHT)).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(CallMraidJS.f7000a, "Interstitial");
            hashMap.put("state", CallMraidJS.f);
            hashMap.put(CallMraidJS.f7002c, ep.Code);
            hashMap.put(CallMraidJS.f7003d, jSONObject);
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            CallMraidJS.getInstance().fireSetDefaultPosition(webView, f10, f11, f12, f13);
            CallMraidJS.getInstance().fireSetCurrentPosition(webView, f10, f11, f12, f13);
            CallMraidJS.getInstance().fireSetScreenSize(webView, e10, f);
            CallMraidJS.getInstance().fireSetMaxSize(webView, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(webView, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(webView);
        } catch (Throwable th) {
            o.b(f11156c, "transInfoForMraid", th);
        }
    }

    public void changeCloseBtnState(int i10) {
        View view = this.f11159g;
        if (view != null) {
            if (i10 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f11165m = false;
        this.f11163k = false;
        this.f11162j = false;
    }

    public void destroy() {
        ATSplashWebview aTSplashWebview = this.f11158e;
        if (aTSplashWebview != null && !aTSplashWebview.isDestroyed()) {
            this.f11158e.release();
            SplashJsUtils.sendEventToH5(this.f11158e, "onSystemDestory", "");
        }
    }

    public View getCloseView() {
        return this.f11159g;
    }

    public ViewGroup getDevContainer() {
        return this.f11164l;
    }

    public View getIconVg() {
        return this.f11160h;
    }

    public SplashJSBridgeImpl getSplashJSBridgeImpl() {
        return this.f11169r;
    }

    public ATSplashWebview getSplashWebview() {
        return this.f11158e;
    }

    public boolean isAttach() {
        return this.f11167p;
    }

    public boolean isDynamicView() {
        return this.o;
    }

    public boolean isH5Ready() {
        return this.f11162j;
    }

    public boolean isImageReady() {
        return this.f11165m;
    }

    public boolean isVideoReady() {
        return this.f11163k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11167p = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onPause() {
        View view = this.f11166n;
        if (view != null && (view instanceof ATSplashNativeView)) {
            ((ATSplashNativeView) view).setIsPause(true);
        }
    }

    public void onResume() {
        View view = this.f11166n;
        if (view != null && (view instanceof ATSplashNativeView)) {
            ((ATSplashNativeView) view).setIsPause(false);
        }
    }

    public void resetLoadState() {
        this.f11163k = false;
        this.f11162j = false;
    }

    public void setCloseView(View view) {
        this.f11159g = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f11164l = viewGroup;
    }

    public void setDynamicView(boolean z10) {
        this.o = z10;
    }

    public void setH5Ready(boolean z10) {
        this.f11162j = z10;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f11160h = view;
        this.f11168q = layoutParams;
    }

    public void setImageReady(boolean z10) {
        this.f11165m = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        View view = this.f11166n;
        if (view != null && (view instanceof ATSplashNativeView)) {
            ((ATSplashNativeView) view).setNotchPadding(i10, i11, i12, i13);
        }
    }

    public void setSplashJSBridgeImpl(SplashJSBridgeImpl splashJSBridgeImpl) {
        this.f11169r = splashJSBridgeImpl;
        ATSplashWebview aTSplashWebview = this.f11158e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(splashJSBridgeImpl);
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.f11166n = view;
        }
    }

    public void setSplashWebview(ATSplashWebview aTSplashWebview) {
        this.f11158e = aTSplashWebview;
        SplashJSBridgeImpl splashJSBridgeImpl = this.f11169r;
        if (splashJSBridgeImpl != null) {
            aTSplashWebview.setObject(splashJSBridgeImpl);
        }
    }

    public void setVideoReady(boolean z10) {
        this.f11163k = z10;
    }

    public void show() {
        View view;
        View view2;
        View view3;
        ViewGroup viewGroup;
        if (this.f11169r != null && (viewGroup = this.f11164l) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f11169r.updateContext(this.f11164l.getContext());
        }
        if (this.f11160h == null) {
            if (this.o && (view3 = this.f11166n) != null) {
                if (view3.getParent() != null) {
                    u.a(this.f11166n);
                }
                addView(this.f11166n, new ViewGroup.LayoutParams(-1, -1));
            } else {
                ATSplashWebview aTSplashWebview = this.f11158e;
                if (aTSplashWebview != null && aTSplashWebview.getParent() == null) {
                    addView(this.f11158e, new ViewGroup.LayoutParams(-1, -1));
                }
                d();
            }
        } else {
            if (this.f == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f11157d == 2) {
                this.f11161i = t.f(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f.getId());
                if (this.o && (view2 = this.f11166n) != null) {
                    if (view2.getParent() != null) {
                        u.a(this.f11166n);
                    }
                    addView(this.f11166n, layoutParams);
                } else {
                    ATSplashWebview aTSplashWebview2 = this.f11158e;
                    if (aTSplashWebview2 != null && aTSplashWebview2.getParent() == null) {
                        addView(this.f11158e, layoutParams);
                    }
                    d();
                }
                ViewGroup viewGroup2 = this.f;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i10 = this.f11168q.width;
                    int i11 = this.f11161i;
                    if (i10 > i11 / 4) {
                        i10 = i11 / 4;
                    }
                    this.f.addView(this.f11160h, i10, -1);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f, layoutParams2);
                }
            } else {
                this.f11161i = t.e(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f.getId());
                if (this.o && (view = this.f11166n) != null) {
                    if (view.getParent() != null) {
                        u.a(this.f11166n);
                    }
                    addView(this.f11166n, layoutParams3);
                } else {
                    ATSplashWebview aTSplashWebview3 = this.f11158e;
                    if (aTSplashWebview3 != null && aTSplashWebview3.getParent() == null) {
                        addView(this.f11158e, layoutParams3);
                    }
                    d();
                }
                ViewGroup viewGroup3 = this.f;
                if (viewGroup3 != null && viewGroup3.getParent() == null) {
                    int i12 = this.f11168q.height;
                    int i13 = this.f11161i;
                    if (i12 > i13 / 4) {
                        i12 = i13 / 4;
                    }
                    this.f.addView(this.f11160h, -1, i12);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i12);
                    layoutParams4.addRule(12);
                    addView(this.f, layoutParams4);
                }
            }
        }
        View view4 = this.f11159g;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(t.b(getContext(), 100.0f), t.b(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = t.b(getContext(), 10.0f);
                layoutParams5.topMargin = t.b(getContext(), 10.0f);
                addView(this.f11159g, layoutParams5);
            } else {
                bringChildToFront(this.f11159g);
            }
        }
        clearResState();
    }

    public void updateCountdown(int i10) {
        View view;
        if (this.f11158e != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("countdown", i10);
                String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                j.a();
                j.a((WebView) this.f11158e, f11155b, encodeToString);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            if (this.o && (view = this.f11166n) != null && (view instanceof ATSplashNativeView)) {
                ((ATSplashNativeView) view).updateCountDown(i10);
            }
        }
    }

    public ATSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b();
    }
}
