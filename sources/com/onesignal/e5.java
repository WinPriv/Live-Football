package com.onesignal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.onesignal.a;
import java.io.UnsupportedEncodingException;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebViewManager.java */
@TargetApi(19)
/* loaded from: classes2.dex */
public final class e5 extends a.b {

    /* renamed from: k, reason: collision with root package name */
    public static final int f26803k = b3.b(24);

    /* renamed from: l, reason: collision with root package name */
    public static e5 f26804l = null;

    /* renamed from: b, reason: collision with root package name */
    public OSWebView f26806b;

    /* renamed from: c, reason: collision with root package name */
    public w f26807c;

    /* renamed from: d, reason: collision with root package name */
    public Activity f26808d;

    /* renamed from: e, reason: collision with root package name */
    public final b1 f26809e;
    public final r0 f;

    /* renamed from: a, reason: collision with root package name */
    public final a f26805a = new a();

    /* renamed from: g, reason: collision with root package name */
    public String f26810g = null;

    /* renamed from: h, reason: collision with root package name */
    public Integer f26811h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26812i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26813j = false;

    /* compiled from: WebViewManager.java */
    /* loaded from: classes2.dex */
    public class a {
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes2.dex */
    public class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f26814a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b1 f26815b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0 f26816c;

        public b(Activity activity, r0 r0Var, b1 b1Var) {
            this.f26814a = activity;
            this.f26815b = b1Var;
            this.f26816c = r0Var;
        }

        @Override // com.onesignal.e5.e
        public final void onComplete() {
            e5.f26804l = null;
            e5.g(this.f26814a, this.f26816c, this.f26815b);
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b1 f26817s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ r0 f26818t;

        public c(b1 b1Var, r0 r0Var) {
            this.f26817s = b1Var;
            this.f26818t = r0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e5.h(this.f26817s, this.f26818t);
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes2.dex */
    public class d {
        public d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0195  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(org.json.JSONObject r19) throws org.json.JSONException {
            /*
                Method dump skipped, instructions count: 681
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.e5.d.a(org.json.JSONObject):void");
        }

        public final void b(JSONObject jSONObject) throws JSONException {
            String K;
            v0 n10 = e3.n();
            b1 b1Var = e5.this.f26809e;
            n10.getClass();
            String optString = jSONObject.optString("pageId", null);
            jSONObject.optString("pageIndex", null);
            if (!b1Var.f26676k && (K = n10.K(b1Var)) != null) {
                StringBuilder sb2 = new StringBuilder();
                String str = b1Var.f26667a;
                String p10 = a3.l.p(sb2, str, optString);
                Set<String> set = n10.f27116j;
                if (set.contains(p10)) {
                    ((c3) n10.f27108a).r(s.f.b("Already sent page impression for id: ", optString));
                    return;
                }
                set.add(p10);
                q1 q1Var = n10.f27112e;
                String str2 = e3.f26752d;
                String s10 = e3.s();
                new OSUtils();
                int b10 = OSUtils.b();
                z0 z0Var = new z0(n10, p10);
                q1Var.getClass();
                try {
                    v3.b("in_app_messages/" + str + "/pageImpression", new k1(str2, s10, K, b10, optString), new l1(q1Var, set, z0Var));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    ((c3) q1Var.f26985b).d("Unable to execute in-app message impression HTTP request due to invalid JSON");
                }
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:2|3)|(8:7|8|(8:10|11|12|13|14|59|19|(2:21|(2:23|24)(1:26))(1:27))|35|12|13|14|59)|37|8|(0)|35|12|13|14|59) */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(org.json.JSONObject r5) {
            /*
                r4 = this;
                java.lang.String r0 = "displayLocation"
                r1 = 4
                boolean r2 = r5.has(r0)     // Catch: org.json.JSONException -> L24
                if (r2 == 0) goto L28
                java.lang.Object r2 = r5.get(r0)     // Catch: org.json.JSONException -> L24
                java.lang.String r3 = ""
                boolean r2 = r2.equals(r3)     // Catch: org.json.JSONException -> L24
                if (r2 != 0) goto L28
                java.lang.String r2 = "FULL_SCREEN"
                java.lang.String r0 = r5.optString(r0, r2)     // Catch: org.json.JSONException -> L24
                java.lang.String r0 = r0.toUpperCase()     // Catch: org.json.JSONException -> L24
                int r0 = a3.k.F(r0)     // Catch: org.json.JSONException -> L24
                goto L29
            L24:
                r0 = move-exception
                r0.printStackTrace()
            L28:
                r0 = r1
            L29:
                com.onesignal.e5 r2 = com.onesignal.e5.this
                if (r0 != r1) goto L2e
                goto L3b
            L2e:
                android.app.Activity r1 = r2.f26808d     // Catch: org.json.JSONException -> L3b
                java.lang.String r3 = "pageMetaData"
                org.json.JSONObject r3 = r5.getJSONObject(r3)     // Catch: org.json.JSONException -> L3b
                int r1 = com.onesignal.e5.e(r2, r1, r3)     // Catch: org.json.JSONException -> L3b
                goto L3c
            L3b:
                r1 = -1
            L3c:
                java.lang.String r3 = "dragToDismissDisabled"
                boolean r5 = r5.getBoolean(r3)     // Catch: org.json.JSONException -> L43
                goto L44
            L43:
                r5 = 0
            L44:
                com.onesignal.r0 r3 = r2.f
                r3.f27002e = r0
                r3.f27003g = r1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                r2.f26811h = r0
                com.onesignal.w r0 = new com.onesignal.w
                com.onesignal.OSWebView r1 = r2.f26806b
                r0.<init>(r1, r3, r5)
                com.onesignal.e5$a r5 = r2.f26805a
                monitor-enter(r5)
                r2.f26807c = r0     // Catch: java.lang.Throwable -> L86
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L86
                com.onesignal.j5 r5 = new com.onesignal.j5
                r5.<init>(r2)
                r0.f27174t = r5
                com.onesignal.a r5 = com.onesignal.c.f26699t
                if (r5 == 0) goto L85
                java.lang.String r0 = "com.onesignal.e5"
                java.lang.StringBuilder r0 = com.ironsource.adapters.facebook.a.j(r0)
                com.onesignal.b1 r1 = r2.f26809e
                java.lang.String r1 = r1.f26667a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.util.concurrent.ConcurrentHashMap r1 = com.onesignal.a.f26632d
                r1.put(r0, r2)
                android.app.Activity r5 = r5.f26635b
                if (r5 == 0) goto L85
                r2.a(r5)
            L85:
                return
            L86:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L86
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.e5.d.c(org.json.JSONObject):void");
        }

        @JavascriptInterface
        public void postMessage(String str) {
            char c10;
            try {
                e3.b(6, "OSJavaScriptInterface:postMessage: " + str, null);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("type");
                switch (string.hashCode()) {
                    case -1484226720:
                        if (string.equals("page_change")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -934437708:
                        if (string.equals("resize")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 42998156:
                        if (string.equals("rendering_complete")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1851145598:
                        if (string.equals("action_taken")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 3) {
                            b(jSONObject);
                            return;
                        }
                        return;
                    } else {
                        if (!e5.this.f26807c.f27168m) {
                            a(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                c(jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes2.dex */
    public interface e {
        void onComplete();
    }

    public e5(Activity activity, r0 r0Var, b1 b1Var) {
        this.f26809e = b1Var;
        this.f26808d = activity;
        this.f = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.onesignal.e5 r4, android.app.Activity r5, java.lang.String r6, boolean r7) {
        /*
            r4.getClass()
            int r0 = com.onesignal.e3.f
            r1 = 0
            if (r0 == 0) goto L67
            int r0 = 6 - r0
            r2 = 0
            r3 = 1
            if (r0 < r3) goto L1a
            int r0 = com.onesignal.e3.f26757g
            if (r0 == 0) goto L19
            int r0 = 6 - r0
            if (r0 >= r3) goto L17
            goto L1a
        L17:
            r0 = r2
            goto L1b
        L19:
            throw r1
        L1a:
            r0 = r3
        L1b:
            if (r0 == 0) goto L20
            android.webkit.WebView.setWebContentsDebuggingEnabled(r3)
        L20:
            com.onesignal.OSWebView r0 = new com.onesignal.OSWebView
            r0.<init>(r5)
            r4.f26806b = r0
            r1 = 2
            r0.setOverScrollMode(r1)
            com.onesignal.OSWebView r0 = r4.f26806b
            r0.setVerticalScrollBarEnabled(r2)
            com.onesignal.OSWebView r0 = r4.f26806b
            r0.setHorizontalScrollBarEnabled(r2)
            com.onesignal.OSWebView r0 = r4.f26806b
            android.webkit.WebSettings r0 = r0.getSettings()
            r0.setJavaScriptEnabled(r3)
            com.onesignal.OSWebView r0 = r4.f26806b
            com.onesignal.e5$d r1 = new com.onesignal.e5$d
            r1.<init>()
            java.lang.String r3 = "OSAndroid"
            r0.addJavascriptInterface(r1, r3)
            if (r7 == 0) goto L5e
            com.onesignal.OSWebView r7 = r4.f26806b
            r0 = 3074(0xc02, float:4.308E-42)
            r7.setSystemUiVisibility(r0)
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r7 < r0) goto L5e
            com.onesignal.OSWebView r7 = r4.f26806b
            r7.setFitsSystemWindows(r2)
        L5e:
            com.onesignal.i5 r7 = new com.onesignal.i5
            r7.<init>(r4, r5, r6)
            com.onesignal.b3.a(r5, r7)
            return
        L67:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.e5.c(com.onesignal.e5, android.app.Activity, java.lang.String, boolean):void");
    }

    public static void d(e5 e5Var, Activity activity) {
        int width;
        int i10;
        OSWebView oSWebView = e5Var.f26806b;
        r0 r0Var = e5Var.f;
        boolean z10 = r0Var.f27001d;
        int i11 = f26803k;
        if (z10) {
            width = activity.getWindow().getDecorView().getWidth();
        } else {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            width = rect.width() - (i11 * 2);
        }
        if (r0Var.f27001d) {
            i10 = 0;
        } else {
            i10 = i11 * 2;
        }
        oSWebView.layout(0, 0, width, b3.d(activity) - i10);
    }

    public static int e(e5 e5Var, Activity activity, JSONObject jSONObject) {
        int i10;
        e5Var.getClass();
        try {
            int b10 = b3.b(jSONObject.getJSONObject("rect").getInt(ContentRecord.HEIGHT));
            e3.b(6, "getPageHeightData:pxHeight: " + b10, null);
            if (e5Var.f.f27001d) {
                i10 = 0;
            } else {
                i10 = f26803k * 2;
            }
            int d10 = b3.d(activity) - i10;
            if (b10 > d10) {
                e3.b(6, "getPageHeightData:pxHeight is over screen max: " + d10, null);
                return d10;
            }
            return b10;
        } catch (JSONException e10) {
            e3.b(3, "pageRectToViewHeight could not get page height", e10);
            return -1;
        }
    }

    public static void g(Activity activity, r0 r0Var, b1 b1Var) {
        if (r0Var.f27001d) {
            String str = r0Var.f26998a;
            int[] c10 = b3.c(activity);
            r0Var.f26998a = com.ironsource.adapters.facebook.a.h(str, String.format("\n\n<script>\n    setSafeAreaInsets(%s);\n</script>", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", Integer.valueOf(c10[0]), Integer.valueOf(c10[1]), Integer.valueOf(c10[2]), Integer.valueOf(c10[3]))));
        }
        try {
            String encodeToString = Base64.encodeToString(r0Var.f26998a.getBytes("UTF-8"), 2);
            e5 e5Var = new e5(activity, r0Var, b1Var);
            f26804l = e5Var;
            OSUtils.s(new f5(e5Var, activity, encodeToString, r0Var));
        } catch (UnsupportedEncodingException e10) {
            e3.b(3, "Catch on initInAppMessage: ", e10);
            e10.printStackTrace();
        }
    }

    public static void h(b1 b1Var, r0 r0Var) {
        Activity i10 = e3.i();
        e3.b(6, "in app message showMessageContent on currentActivity: " + i10, null);
        if (i10 != null) {
            e5 e5Var = f26804l;
            if (e5Var != null && b1Var.f26676k) {
                e5Var.f(new b(i10, r0Var, b1Var));
                return;
            } else {
                g(i10, r0Var, b1Var);
                return;
            }
        }
        Looper.prepare();
        new Handler().postDelayed(new c(b1Var, r0Var), 200L);
    }

    @Override // com.onesignal.a.b
    public final void a(Activity activity) {
        String str = this.f26810g;
        this.f26808d = activity;
        this.f26810g = activity.getLocalClassName();
        e3.b(6, a3.k.m(new StringBuilder("In app message activity available currentActivityName: "), this.f26810g, " lastActivityName: ", str), null);
        if (str == null) {
            i(null);
            return;
        }
        if (!str.equals(this.f26810g)) {
            if (!this.f26813j) {
                w wVar = this.f26807c;
                if (wVar != null) {
                    wVar.g();
                }
                i(this.f26811h);
                return;
            }
            return;
        }
        w wVar2 = this.f26807c;
        if (wVar2 != null) {
            if (wVar2.f27170p == 4 && !this.f.f27001d) {
                i(null);
            } else {
                e3.b(6, "In app message new activity, calculate height and show ", null);
                b3.a(this.f26808d, new h5(this));
            }
        }
    }

    @Override // com.onesignal.a.b
    public final void b(Activity activity) {
        e3.b(6, "In app message activity stopped, cleaning views, currentActivityName: " + this.f26810g + "\nactivity: " + this.f26808d + "\nmessageView: " + this.f26807c, null);
        if (this.f26807c != null && activity.getLocalClassName().equals(this.f26810g)) {
            this.f26807c.g();
        }
    }

    public final void f(b bVar) {
        if (this.f26807c != null && !this.f26812i) {
            if (this.f26809e != null) {
                ((c3) e3.n().f27108a).r("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
            }
            this.f26807c.e(new k5(this, bVar));
            this.f26812i = true;
            return;
        }
        if (bVar != null) {
            bVar.onComplete();
        }
    }

    public final void i(Integer num) {
        synchronized (this.f26805a) {
            if (this.f26807c == null) {
                e3.b(4, "No messageView found to update a with a new height.", null);
                return;
            }
            e3.b(6, "In app message, showing first one with height: " + num, null);
            w wVar = this.f26807c;
            OSWebView oSWebView = this.f26806b;
            wVar.f27171q = oSWebView;
            oSWebView.setBackgroundColor(0);
            if (num != null) {
                this.f26811h = num;
                w wVar2 = this.f26807c;
                int intValue = num.intValue();
                wVar2.f27161e = intValue;
                OSUtils.s(new s(wVar2, intValue));
            }
            this.f26807c.d(this.f26808d);
            w wVar3 = this.f26807c;
            if (wVar3.f27167l) {
                wVar3.f27167l = false;
                wVar3.f(null);
            }
        }
    }
}
