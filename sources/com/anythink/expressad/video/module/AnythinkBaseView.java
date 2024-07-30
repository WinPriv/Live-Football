package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.module.a.a;
import com.anythink.expressad.video.module.a.a.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AnythinkBaseView extends RelativeLayout {
    public static final String TAG = "AnythinkBaseView";

    /* renamed from: n, reason: collision with root package name */
    private static final int f11684n = -999;

    /* renamed from: a, reason: collision with root package name */
    protected Context f11685a;

    /* renamed from: b, reason: collision with root package name */
    protected c f11686b;

    /* renamed from: c, reason: collision with root package name */
    protected LayoutInflater f11687c;

    /* renamed from: d, reason: collision with root package name */
    protected int f11688d;

    /* renamed from: e, reason: collision with root package name */
    protected a f11689e;
    protected boolean f;

    /* renamed from: g, reason: collision with root package name */
    protected float f11690g;

    /* renamed from: h, reason: collision with root package name */
    protected float f11691h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f11692i;

    /* renamed from: j, reason: collision with root package name */
    protected int f11693j;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f11694k;

    /* renamed from: l, reason: collision with root package name */
    protected int f11695l;

    /* renamed from: m, reason: collision with root package name */
    protected int f11696m;

    public AnythinkBaseView(Context context) {
        this(context, null);
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
            jSONObject.put(com.anythink.expressad.foundation.g.a.f9775cc, t.a(n.a().g(), this.f11690g));
            jSONObject.put(com.anythink.expressad.foundation.g.a.f9776cd, t.a(n.a().g(), this.f11691h));
            jSONObject.put(com.anythink.expressad.foundation.g.a.cf, i10);
            try {
                this.f11688d = getContext().getResources().getConfiguration().orientation;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            jSONObject.put(com.anythink.expressad.foundation.g.a.cg, this.f11688d);
            jSONObject.put(com.anythink.expressad.foundation.g.a.ch, t.c(getContext()));
            return jSONObject;
        } catch (JSONException e12) {
            e = e12;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            return jSONObject2;
        }
    }

    public final String d() {
        return a(0).toString();
    }

    public void defaultShow() {
        o.a(TAG, "defaultShow");
    }

    public int filterFindViewId(boolean z10, String str) {
        if (z10) {
            return findDyID(str);
        }
        return findID(str);
    }

    public int findColor(String str) {
        return i.a(this.f11685a.getApplicationContext(), str, i.f10126d);
    }

    public int findDrawable(String str) {
        return i.a(this.f11685a.getApplicationContext(), str, i.f10125c);
    }

    public int findDyID(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
    }

    public int findID(String str) {
        return i.a(this.f11685a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i.a(this.f11685a.getApplicationContext(), str, "layout");
    }

    public c getCampaign() {
        return this.f11686b;
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

    public abstract void init(Context context);

    public boolean isLandscape() {
        if (this.f11685a.getResources().getConfiguration().orientation == 2) {
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
        this.f11688d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f11690g = motionEvent.getRawX();
        this.f11691h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f11688d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setCampaign(c cVar) {
        this.f11686b = cVar;
    }

    public void setLayoutCenter(int i10, int i11) {
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
        }
    }

    public void setLayoutParam(int i10, int i11, int i12, int i13) {
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

    public void setNotifyListener(a aVar) {
        this.f11689e = aVar;
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

    public AnythinkBaseView(Context context, AttributeSet attributeSet, boolean z10, int i10, boolean z11, int i11, int i12) {
        super(context, attributeSet);
        this.f11688d = 1;
        this.f11689e = new f();
        this.f = false;
        this.f11695l = 1;
        this.f11696m = 0;
        this.f11685a = context;
        this.f11687c = LayoutInflater.from(context);
        this.f11692i = z10;
        this.f11693j = i10;
        this.f11694k = z11;
        this.f11695l = i11;
        this.f11696m = i12;
        init(context);
    }

    public AnythinkBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11688d = 1;
        this.f11689e = new f();
        this.f = false;
        this.f11695l = 1;
        this.f11696m = 0;
        this.f11685a = context;
        this.f11687c = LayoutInflater.from(context);
        init(context);
    }

    public void c() {
    }
}
