package com.onesignal;

import android.webkit.ValueCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebViewManager.java */
/* loaded from: classes2.dex */
public final class h5 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e5 f26853s;

    /* compiled from: WebViewManager.java */
    /* loaded from: classes2.dex */
    public class a implements ValueCallback<String> {
        public a() {
        }

        @Override // android.webkit.ValueCallback
        public final void onReceiveValue(String str) {
            String str2 = str;
            h5 h5Var = h5.this;
            try {
                e5 e5Var = h5Var.f26853s;
                h5Var.f26853s.i(Integer.valueOf(e5.e(e5Var, e5Var.f26808d, new JSONObject(str2))));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    public h5(e5 e5Var) {
        this.f26853s = e5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5 e5Var = this.f26853s;
        e5.d(e5Var, e5Var.f26808d);
        if (e5Var.f.f27001d) {
            e5Var.getClass();
            OSUtils.s(new g5(e5Var));
        }
        e5Var.f26806b.evaluateJavascript("getPageMetaData()", new a());
    }
}
