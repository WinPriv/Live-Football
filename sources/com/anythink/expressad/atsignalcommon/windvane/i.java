package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.bridge.BannerJSPlugin;
import com.anythink.expressad.atsignalcommon.mraid.MraidJSBridge;
import com.anythink.expressad.atsignalcommon.webEnvCheck.WebGLCheckjs;
import com.anythink.expressad.splash.js.SplashJs;
import com.anythink.expressad.video.signal.communication.RewardJs;
import com.anythink.expressad.video.signal.communication.VideoBridge;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, Class> f7065a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private Context f7066b;

    /* renamed from: c, reason: collision with root package name */
    private Object f7067c;

    /* renamed from: d, reason: collision with root package name */
    private WindVaneWebView f7068d;

    public i(Context context, WindVaneWebView windVaneWebView) {
        this.f7066b = context;
        this.f7068d = windVaneWebView;
        try {
            a(BannerJSPlugin.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            a(RewardJs.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a(VideoBridge.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(MraidJSBridge.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a(SplashJs.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(WebGLCheckjs.class);
        } catch (ClassNotFoundException unused6) {
        }
    }

    private static void b(String str) {
        if (f7065a == null) {
            f7065a = new HashMap<>();
        }
        f7065a.remove(str);
    }

    public final void a(Context context) {
        this.f7066b = context;
    }

    public final void a(Object obj) {
        this.f7067c = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f7065a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!l.class.isAssignableFrom(cls)) {
                return null;
            }
            l lVar = (l) cls.newInstance();
            lVar.initialize(context, windVaneWebView);
            lVar.initialize(this.f7067c, windVaneWebView);
            return lVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static void a(Class cls) {
        if (f7065a == null) {
            f7065a = new HashMap<>();
        }
        f7065a.put(cls.getSimpleName(), cls);
    }

    public final Object a(String str) {
        if (f7065a == null) {
            f7065a = new HashMap<>();
        }
        return a(str, this.f7068d, this.f7066b);
    }

    private static void a() {
        try {
            a(BannerJSPlugin.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            a(RewardJs.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a(VideoBridge.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(MraidJSBridge.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a(SplashJs.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(WebGLCheckjs.class);
        } catch (ClassNotFoundException unused6) {
        }
    }
}
