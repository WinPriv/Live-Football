package com.anythink.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.videocommon.e.d;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* renamed from: n, reason: collision with root package name */
    protected static int f11343n = 0;
    protected static int o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f11344p = -999;

    /* renamed from: a, reason: collision with root package name */
    protected Context f11345a;

    /* renamed from: b, reason: collision with root package name */
    protected c f11346b;

    /* renamed from: c, reason: collision with root package name */
    protected String f11347c;

    /* renamed from: d, reason: collision with root package name */
    protected String f11348d;

    /* renamed from: e, reason: collision with root package name */
    protected d f11349e;
    protected LayoutInflater f;

    /* renamed from: g, reason: collision with root package name */
    protected int f11350g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f11351h;

    /* renamed from: i, reason: collision with root package name */
    protected float f11352i;

    /* renamed from: j, reason: collision with root package name */
    protected float f11353j;

    /* renamed from: k, reason: collision with root package name */
    protected Rect f11354k;

    /* renamed from: l, reason: collision with root package name */
    protected int f11355l;

    /* renamed from: m, reason: collision with root package name */
    protected int f11356m;

    public BTBaseView(Context context) {
        this(context, null);
    }

    private String b() {
        return a(0).toString();
    }

    public void a() {
    }

    public void defaultShow() {
        o.a(TAG, "defaultShow");
    }

    public int findColor(String str) {
        return i.a(this.f11345a.getApplicationContext(), str, i.f10126d);
    }

    public int findDrawable(String str) {
        return i.a(this.f11345a.getApplicationContext(), str, i.f10125c);
    }

    public int findID(String str) {
        return i.a(this.f11345a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i.a(this.f11345a.getApplicationContext(), str, "layout");
    }

    public c getCampaign() {
        return this.f11346b;
    }

    public String getInstanceId() {
        return this.f11348d;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public Rect getRect() {
        return this.f11354k;
    }

    public String getUnitId() {
        return this.f11347c;
    }

    public int getViewHeight() {
        return this.f11356m;
    }

    public int getViewWidth() {
        return this.f11355l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        if (this.f11345a.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            if (viewArr[i10] == null) {
                return false;
            }
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f11350g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f11352i = motionEvent.getRawX();
        this.f11353j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f11350g = configuration.orientation;
    }

    public void setCampaign(c cVar) {
        this.f11346b = cVar;
    }

    public void setInstanceId(String str) {
        this.f11348d = str;
    }

    public void setLayout(int i10, int i11) {
        this.f11355l = i10;
        this.f11356m = i11;
    }

    public void setLayoutCenter(int i10, int i11) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i10 != -999) {
                parentRelativeLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentRelativeLayoutParams.height = i11;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentLinearLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentLinearLayoutParams.height = i11;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentFrameLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentFrameLayoutParams.height = i11;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i11;
            parentRelativeLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentRelativeLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentRelativeLayoutParams.height = i13;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i11;
            parentLinearLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentLinearLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentLinearLayoutParams.height = i13;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i11;
            parentFrameLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentFrameLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentFrameLayoutParams.height = i13;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setRect(Rect rect) {
        this.f11354k = rect;
    }

    public void setRewardUnitSetting(d dVar) {
        this.f11349e = dVar;
    }

    public void setUnitId(String str) {
        this.f11347c = str;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11348d = "";
        this.f11350g = 1;
        this.f11351h = false;
        this.f11345a = context;
        this.f = LayoutInflater.from(context);
        init(context);
    }

    public final JSONObject a(int i10) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e10) {
            e = e10;
        }
        try {
            jSONObject.put(a.f9775cc, t.a(com.anythink.expressad.foundation.b.a.b().d(), this.f11352i));
            jSONObject.put(a.f9776cd, t.a(com.anythink.expressad.foundation.b.a.b().d(), this.f11353j));
            jSONObject.put(a.cf, i10);
            try {
                this.f11350g = getContext().getResources().getConfiguration().orientation;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            jSONObject.put(a.cg, this.f11350g);
            jSONObject.put(a.ch, t.c(getContext()));
            return jSONObject;
        } catch (JSONException e12) {
            e = e12;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            return jSONObject2;
        }
    }

    public static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f11343n);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            j.a();
            j.a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(webView, e10.getMessage());
            o.a(TAG, e10.getMessage());
        }
    }
}
