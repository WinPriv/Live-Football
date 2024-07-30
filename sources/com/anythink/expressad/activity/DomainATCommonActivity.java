package com.anythink.expressad.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.anythink.expressad.foundation.b.a;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.webview.BrowserView;

/* loaded from: classes.dex */
public class DomainATCommonActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    private static final String f6749b = "ATCommonActivity";

    /* renamed from: c, reason: collision with root package name */
    private c f6751c;

    /* renamed from: d, reason: collision with root package name */
    private BrowserView f6752d;

    /* renamed from: a, reason: collision with root package name */
    String f6750a = "";

    /* renamed from: e, reason: collision with root package name */
    private BrowserView.a f6753e = new BrowserView.a() { // from class: com.anythink.expressad.activity.DomainATCommonActivity.1
        @Override // com.anythink.expressad.foundation.webview.BrowserView.a
        public final void a() {
            DomainATCommonActivity.this.finish();
        }

        @Override // com.anythink.expressad.foundation.webview.BrowserView.a
        public final boolean a(WebView webView, String str) {
            o.d(DomainATCommonActivity.f6749b, "shouldOverrideUrlLoading  ".concat(String.valueOf(str)));
            if (s.a.a(str) && s.a.a(DomainATCommonActivity.this, str, null)) {
                DomainATCommonActivity.this.finish();
            }
            return DomainATCommonActivity.this.a(webView, str);
        }

        @Override // com.anythink.expressad.foundation.webview.BrowserView.a
        public final void b() {
        }
    };

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            o.d(f6749b, th.getMessage());
        }
        if (a.b().d() == null) {
            a.b().a(getApplicationContext());
        }
        String stringExtra = getIntent().getStringExtra("url");
        this.f6750a = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f6751c = (c) getIntent().getSerializableExtra("mvcommon");
            BrowserView browserView = new BrowserView(this, this.f6751c);
            this.f6752d = browserView;
            browserView.setListener(this.f6753e);
            this.f6752d.loadUrl(this.f6750a);
            BrowserView browserView2 = this.f6752d;
            if (browserView2 != null) {
                setContentView(browserView2);
                return;
            }
            return;
        }
        Toast.makeText(this, "Error: no data", 0).show();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BrowserView browserView = this.f6752d;
        if (browserView != null) {
            browserView.destroy();
        }
    }

    private void a() {
        String stringExtra = getIntent().getStringExtra("url");
        this.f6750a = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f6751c = (c) getIntent().getSerializableExtra("mvcommon");
            BrowserView browserView = new BrowserView(this, this.f6751c);
            this.f6752d = browserView;
            browserView.setListener(this.f6753e);
            this.f6752d.loadUrl(this.f6750a);
            BrowserView browserView2 = this.f6752d;
            if (browserView2 != null) {
                setContentView(browserView2);
                return;
            }
            return;
        }
        Toast.makeText(this, "Error: no data", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        r9.loadUrl(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: all -> 0x009e, TryCatch #2 {all -> 0x009e, blocks: (B:28:0x0072, B:30:0x007e, B:32:0x008c, B:37:0x009a), top: B:27:0x0072, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "http"
            java.lang.String r1 = "ATCommonActivity"
            r2 = 0
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto Lc
            return r2
        Lc:
            android.net.Uri r3 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = r3.getScheme()     // Catch: java.lang.Throwable -> La7
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = "https"
            r6 = 1
            if (r4 != 0) goto L2a
            java.lang.String r4 = r3.getScheme()     // Catch: java.lang.Throwable -> La7
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r4 = r2
            goto L2b
        L2a:
            r4 = r6
        L2b:
            if (r4 == 0) goto L2e
            return r2
        L2e:
            java.lang.String r3 = r3.getScheme()     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = "intent"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto La6
            android.content.Intent r3 = android.content.Intent.parseUri(r10, r6)     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = r3.getPackage()     // Catch: java.lang.Throwable -> L6a
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L6a
            if (r7 != 0) goto L72
            android.content.pm.PackageManager r7 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L6a
            android.content.Intent r4 = r7.getLaunchIntentForPackage(r4)     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L72
            java.lang.String r4 = "android.intent.category.BROWSABLE"
            r3.addCategory(r4)     // Catch: java.lang.Throwable -> L6a
            r4 = 0
            r3.setComponent(r4)     // Catch: java.lang.Throwable -> L6a
            r3.setSelector(r4)     // Catch: java.lang.Throwable -> L6a
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r3.setFlags(r4)     // Catch: java.lang.Throwable -> L6a
            r8.startActivityForResult(r3, r2)     // Catch: java.lang.Throwable -> L6a
            r8.finish()     // Catch: java.lang.Throwable -> L6a
            return r6
        L6a:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> La7
            com.anythink.expressad.foundation.h.o.d(r1, r4)     // Catch: java.lang.Throwable -> La7
        L72:
            java.lang.String r4 = "browser_fallback_url"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch: java.lang.Throwable -> L9e
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L9e
            if (r4 != 0) goto La6
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = r10.getScheme()     // Catch: java.lang.Throwable -> L9e
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L9e
            if (r0 != 0) goto L98
            java.lang.String r10 = r10.getScheme()     // Catch: java.lang.Throwable -> L9e
            boolean r10 = r10.equals(r5)     // Catch: java.lang.Throwable -> L9e
            if (r10 == 0) goto L97
            goto L98
        L97:
            r6 = r2
        L98:
            if (r6 == 0) goto La6
            r9.loadUrl(r3)     // Catch: java.lang.Throwable -> L9e
            return r2
        L9e:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> La7
            com.anythink.expressad.foundation.h.o.d(r1, r9)     // Catch: java.lang.Throwable -> La7
        La6:
            return r2
        La7:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.anythink.expressad.foundation.h.o.d(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.activity.DomainATCommonActivity.a(android.webkit.WebView, java.lang.String):boolean");
    }
}
