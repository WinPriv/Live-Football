package vb;

import android.os.Build;
import android.util.Log;
import com.ironsource.sdk.b.b;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f36000s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f36001t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f36002u;

    public a(b bVar, String str, String str2) {
        this.f36002u = bVar;
        this.f36000s = str;
        this.f36001t = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f36002u;
        try {
            bVar.f26029c.evaluateJavascript(this.f36000s, null);
        } catch (Throwable unused) {
            Log.e(bVar.f26031e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f36001t + "Android API level: " + Build.VERSION.SDK_INT);
        }
    }
}
