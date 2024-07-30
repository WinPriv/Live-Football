package com.anythink.core.common;

import android.app.Activity;
import android.content.Context;
import com.anythink.core.api.ATMediationRequestInfo;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public String f6020a;

    /* renamed from: b, reason: collision with root package name */
    public ATMediationRequestInfo f6021b;

    /* renamed from: c, reason: collision with root package name */
    public String f6022c;

    /* renamed from: d, reason: collision with root package name */
    public int f6023d;

    /* renamed from: e, reason: collision with root package name */
    public com.anythink.core.common.b.b f6024e;
    public com.anythink.core.common.b.a f;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, Object> f6025g;

    /* renamed from: h, reason: collision with root package name */
    private Context f6026h;

    /* renamed from: i, reason: collision with root package name */
    private WeakReference<Activity> f6027i;

    private int b() {
        return this.f6023d;
    }

    public final void a(Context context) {
        this.f6026h = com.anythink.core.common.b.n.a().g();
        if (context == null || !(context instanceof Activity)) {
            return;
        }
        this.f6027i = new WeakReference<>((Activity) context);
    }

    public final Context a() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f6027i;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            return activity;
        }
        Activity F = com.anythink.core.common.b.n.a().F();
        return F != null ? F : this.f6026h;
    }
}
