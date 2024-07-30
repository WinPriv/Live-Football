package com.anythink.expressad.advanced.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.n;
import com.anythink.expressad.advanced.d.c;
import com.anythink.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.huawei.hms.ads.ep;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ATNativeAdvancedView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f6928a = "webviewshow";

    /* renamed from: b, reason: collision with root package name */
    private static String f6929b = "ATNativeAdvancedView";

    /* renamed from: c, reason: collision with root package name */
    private ATNativeAdvancedWebview f6930c;

    /* renamed from: d, reason: collision with root package name */
    private View f6931d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6932e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6933g;

    /* renamed from: h, reason: collision with root package name */
    private c f6934h;

    /* renamed from: i, reason: collision with root package name */
    private NativeAdvancedJSBridgeImpl f6935i;

    /* renamed from: j, reason: collision with root package name */
    private Context f6936j;

    /* renamed from: com.anythink.expressad.advanced.view.ATNativeAdvancedView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                o.a(ATNativeAdvancedView.f6929b, ATNativeAdvancedView.f6928a);
                String str = "";
                try {
                    int[] iArr = new int[2];
                    ATNativeAdvancedView.this.f6930c.getLocationOnScreen(iArr);
                    o.d(ATNativeAdvancedView.f6929b, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", t.a(n.a().g(), (float) iArr[0]));
                    jSONObject.put("startY", t.a(n.a().g(), (float) iArr[1]));
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    o.b(ATNativeAdvancedView.f6929b, th.getMessage(), th);
                }
                String encodeToString = Base64.encodeToString(str.toString().getBytes(), 2);
                j.a();
                j.a((WebView) ATNativeAdvancedView.this.f6930c, ATNativeAdvancedView.f6928a, encodeToString);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public ATNativeAdvancedView(Context context) {
        this(context, null);
    }

    private void b() {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6930c;
        if (aTNativeAdvancedWebview != null && aTNativeAdvancedWebview.getParent() == null) {
            addView(this.f6930c, new ViewGroup.LayoutParams(-1, -1));
        }
        int[] iArr = new int[2];
        this.f6930c.getLocationInWindow(iArr);
        ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f6930c;
        transInfoForMraid(aTNativeAdvancedWebview2, iArr[0], iArr[1], aTNativeAdvancedWebview2.getWidth(), this.f6930c.getHeight());
        ATNativeAdvancedWebview aTNativeAdvancedWebview3 = this.f6930c;
        if (aTNativeAdvancedWebview3 != null) {
            aTNativeAdvancedWebview3.setObject(this.f6935i);
            this.f6930c.post(new AnonymousClass1());
        }
        View view = this.f6931d;
        if (view != null) {
            if (view.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t.b(getContext(), 28.0f), t.b(getContext(), 16.0f));
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.rightMargin = t.b(getContext(), 2.0f);
                layoutParams.topMargin = t.b(getContext(), 2.0f);
                addView(this.f6931d, layoutParams);
                return;
            }
            bringChildToFront(this.f6931d);
        }
    }

    private void c() {
        int[] iArr = new int[2];
        this.f6930c.getLocationInWindow(iArr);
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6930c;
        transInfoForMraid(aTNativeAdvancedWebview, iArr[0], iArr[1], aTNativeAdvancedWebview.getWidth(), this.f6930c.getHeight());
        ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f6930c;
        if (aTNativeAdvancedWebview2 != null) {
            aTNativeAdvancedWebview2.setObject(this.f6935i);
            this.f6930c.post(new AnonymousClass1());
        }
    }

    public static void transInfoForMraid(WebView webView, int i10, int i11, int i12, int i13) {
        String str;
        o.d(f6929b, "transInfoForMraid");
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
            hashMap.put(CallMraidJS.f7000a, CallMraidJS.f7009k);
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
            o.b(f6929b, "transInfoForMraid", th);
        }
    }

    public void changeCloseBtnState(int i10) {
        View view = this.f6931d;
        if (view != null) {
            if (i10 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f6933g = false;
        this.f = false;
        this.f6932e = false;
    }

    public void clearResStateAndRemoveClose() {
        clearResState();
        View view = this.f6931d;
        if (view != null && view.getParent() != null) {
            removeView(this.f6931d);
        }
    }

    public void destroy() {
        removeAllViews();
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6930c;
        if (aTNativeAdvancedWebview != null && !aTNativeAdvancedWebview.isDestroyed()) {
            this.f6930c.release();
            NativeAdvancedJsUtils.sendEventToH5(this.f6930c, "onSystemDestory", "");
        }
        if (this.f6936j != null) {
            this.f6936j = null;
        }
    }

    public NativeAdvancedJSBridgeImpl getAdvancedNativeJSBridgeImpl() {
        return this.f6935i;
    }

    public ATNativeAdvancedWebview getAdvancedNativeWebview() {
        return this.f6930c;
    }

    public View getCloseView() {
        return this.f6931d;
    }

    public boolean isEndCardReady() {
        return this.f6933g;
    }

    public boolean isH5Ready() {
        return this.f6932e;
    }

    public boolean isVideoReady() {
        return this.f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void resetLoadState() {
        this.f6933g = false;
        this.f = false;
        this.f6932e = false;
    }

    public void setAdvancedNativeJSBridgeImpl(NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl) {
        this.f6935i = nativeAdvancedJSBridgeImpl;
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6930c;
        if (aTNativeAdvancedWebview != null) {
            aTNativeAdvancedWebview.setObject(nativeAdvancedJSBridgeImpl);
        }
    }

    public void setAdvancedNativeWebview(ATNativeAdvancedWebview aTNativeAdvancedWebview) {
        this.f6930c = aTNativeAdvancedWebview;
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = this.f6935i;
        if (nativeAdvancedJSBridgeImpl != null) {
            aTNativeAdvancedWebview.setObject(nativeAdvancedJSBridgeImpl);
        }
    }

    public void setCloseView(View view) {
        this.f6931d = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setEndCardReady(boolean z10) {
        this.f6933g = z10;
    }

    public void setH5Ready(boolean z10) {
        this.f6932e = z10;
    }

    public void setVideoReady(boolean z10) {
        this.f = z10;
    }

    public void show() {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6930c;
        if (aTNativeAdvancedWebview != null && aTNativeAdvancedWebview.getParent() == null) {
            addView(this.f6930c, new ViewGroup.LayoutParams(-1, -1));
        }
        int[] iArr = new int[2];
        this.f6930c.getLocationInWindow(iArr);
        ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f6930c;
        transInfoForMraid(aTNativeAdvancedWebview2, iArr[0], iArr[1], aTNativeAdvancedWebview2.getWidth(), this.f6930c.getHeight());
        ATNativeAdvancedWebview aTNativeAdvancedWebview3 = this.f6930c;
        if (aTNativeAdvancedWebview3 != null) {
            aTNativeAdvancedWebview3.setObject(this.f6935i);
            this.f6930c.post(new AnonymousClass1());
        }
        View view = this.f6931d;
        if (view != null) {
            if (view.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t.b(getContext(), 28.0f), t.b(getContext(), 16.0f));
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.rightMargin = t.b(getContext(), 2.0f);
                layoutParams.topMargin = t.b(getContext(), 2.0f);
                addView(this.f6931d, layoutParams);
            } else {
                bringChildToFront(this.f6931d);
            }
        }
        clearResState();
    }

    public ATNativeAdvancedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATNativeAdvancedView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6936j = context;
    }
}
