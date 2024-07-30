package com.ironsource.sdk.c;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a extends FrameLayout implements e {

    /* renamed from: a, reason: collision with root package name */
    public c f26042a;

    /* renamed from: com.ironsource.sdk.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0335a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26043s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26044t;

        public RunnableC0335a(String str, String str2) {
            this.f26043s = str;
            this.f26044t = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.removeView(aVar.f26042a.f26050t);
            aVar.f26042a.a(this.f26043s, this.f26044t);
            aVar.f26042a = null;
        }
    }

    public a(c cVar, Context context) {
        super(context);
        com.ironsource.sdk.a aVar = cVar.f26048d;
        setLayoutParams(new FrameLayout.LayoutParams(aVar.f25981a, aVar.f25982b));
        this.f26042a = cVar;
        addView(cVar.f26050t);
    }

    @Override // com.ironsource.sdk.c.e
    public final WebView a() {
        return this.f26042a.f26050t;
    }

    @Override // com.ironsource.sdk.c.e
    public final void b(JSONObject jSONObject, String str, String str2) {
        this.f26042a.b(jSONObject, str, str2);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        Logger.i("IronSourceAdContainer", "onVisibilityChanged: " + i10);
        c cVar = this.f26042a;
        if (cVar == null) {
            return;
        }
        try {
            cVar.f26051u.a("isVisible", i10, isShown());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        Logger.i("IronSourceAdContainer", "onWindowVisibilityChanged: " + i10);
        c cVar = this.f26042a;
        if (cVar == null) {
            return;
        }
        try {
            cVar.f26051u.a("isWindowVisible", i10, isShown());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final synchronized void a(String str, String str2) {
        com.ironsource.sdk.b.b bVar;
        c cVar = this.f26042a;
        if (cVar != null && (bVar = cVar.f26051u) != null && cVar.f26050t != null) {
            if (bVar.f26027a != null && bVar.f26028b != null) {
                bVar.a("containerWasRemoved", bVar.a());
            }
            com.ironsource.environment.e.a.f24660a.a(new RunnableC0335a(str, str2));
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(String str, String str2, String str3) {
        c cVar = this.f26042a;
        if (cVar == null) {
            return;
        }
        cVar.a(str, str2, str3);
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(JSONObject jSONObject, String str, String str2) {
        this.f26042a.a(jSONObject, str, str2);
    }
}
