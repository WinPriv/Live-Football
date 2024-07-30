package ka;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.activity.LandingDetailsActivity;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.o2;
import com.huawei.openalliance.ad.ppskit.views.PPSWebView;
import com.huawei.openalliance.ad.ppskit.views.linkscroll.LinkScrollWebView;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes2.dex */
public final class sc extends m3.b implements tc<ej> {
    public String A;
    public Boolean B;
    public long C;
    public Long D;
    public boolean E;

    /* renamed from: v, reason: collision with root package name */
    public final Context f31827v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f31828w;

    /* renamed from: x, reason: collision with root package name */
    public va.c f31829x;
    public final p y;

    /* renamed from: z, reason: collision with root package name */
    public final v f31830z;

    /* loaded from: classes2.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            sc.this.f31828w = z10;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Intent f31832s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ o2.a f31833t;

        public b(Intent intent, o2.a aVar) {
            this.f31832s = intent;
            this.f31833t = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            sc scVar = sc.this;
            ContentRecord contentRecord = (ContentRecord) scVar.f32660t;
            v vVar = scVar.f31830z;
            vVar.getClass();
            try {
                if (contentRecord == null) {
                    n7.g("AnalysisReport", "onLandingOpenAppDialogAccept, data is null");
                } else {
                    o f = vVar.f(contentRecord);
                    if (f != null) {
                        f.f31525a = "61";
                        Context context = vVar.f31722a;
                        new ke(context, zh.a(contentRecord.z0(), context), null).t(contentRecord.h1(), f, false, true);
                    }
                }
            } catch (Throwable th) {
                e0.i.p(th, "onLandingOpenAppDialogAcceptError:", "AnalysisReport");
            }
            com.huawei.openalliance.ad.ppskit.utils.z1.r(scVar.f31827v, this.f31832s);
            if (scVar.f31828w) {
                com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(scVar.f31827v);
                String str = this.f31833t.f22937a;
                synchronized (d10.f22591h) {
                    d10.f.b(str, true);
                    com.huawei.openalliance.ad.ppskit.utils.p2.a(new com.huawei.openalliance.ad.ppskit.handlers.n(d10), 0);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements DialogInterface.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ o2.a f31835s;

        public c(o2.a aVar) {
            this.f31835s = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            sc scVar = sc.this;
            ContentRecord contentRecord = (ContentRecord) scVar.f32660t;
            v vVar = scVar.f31830z;
            vVar.getClass();
            try {
                if (contentRecord == null) {
                    n7.g("AnalysisReport", "onLandingOpenAppDialogCancel, data is null");
                } else {
                    o f = vVar.f(contentRecord);
                    if (f != null) {
                        f.f31525a = "62";
                        Context context = vVar.f31722a;
                        new ke(context, zh.a(contentRecord.z0(), context), null).t(contentRecord.h1(), f, false, true);
                    }
                }
            } catch (Throwable th) {
                e0.i.p(th, "onLandingOpenAppDialogCancelError:", "AnalysisReport");
            }
            if (scVar.f31828w) {
                com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(scVar.f31827v);
                String str = this.f31835s.f22937a;
                synchronized (d10.f22591h) {
                    d10.f.b(str, false);
                    com.huawei.openalliance.ad.ppskit.utils.p2.a(new com.huawei.openalliance.ad.ppskit.handlers.n(d10), 0);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final WebView f31837s;

        public d(LinkScrollWebView linkScrollWebView) {
            this.f31837s = linkScrollWebView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebView webView = this.f31837s;
            if (webView != null) {
                webView.clearHistory();
            }
        }
    }

    public sc(Context context, ContentRecord contentRecord, PPSWebView pPSWebView) {
        super(3);
        this.f31828w = false;
        this.B = Boolean.FALSE;
        this.E = false;
        this.f31827v = context;
        this.f32659s = pPSWebView;
        if (contentRecord != null) {
            this.f32660t = contentRecord;
            this.A = contentRecord.h1();
            p pVar = this.y;
            if (pVar != null) {
                pVar.f31723b = contentRecord.n1();
            }
        }
        this.y = new p(context);
        this.f31830z = new v(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.openalliance.ad.ppskit.utils.o2.a p(android.content.Intent r8) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f31827v
            java.lang.String r1 = "ApkUtil"
            r2 = 0
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            if (r3 == 0) goto L7c
            r4 = 0
            java.util.List r8 = r3.queryIntentActivities(r8, r4)     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            boolean r4 = com.huawei.openalliance.ad.ppskit.utils.o2.e(r8)     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            if (r4 != 0) goto L1c
            java.lang.String r8 = "queryIntentActivities, activity not exists or not exported."
            ka.n7.g(r1, r8)     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            goto L7c
        L1c:
            boolean r4 = r8.isEmpty()     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            if (r4 != 0) goto L7c
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            r4.<init>()     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
        L2b:
            boolean r5 = r8.hasNext()     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r8.next()     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            if (r5 == 0) goto L2b
            android.content.pm.ActivityInfo r6 = r5.activityInfo     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            if (r6 == 0) goto L2b
            com.huawei.openalliance.ad.ppskit.utils.o2$a r6 = new com.huawei.openalliance.ad.ppskit.utils.o2$a     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            r6.<init>()     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            android.content.pm.ActivityInfo r5 = r5.activityInfo     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            java.lang.String r5 = r5.packageName     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            r6.f22937a = r5     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            if (r5 == 0) goto L4f
            goto L2b
        L4f:
            java.lang.String r5 = r6.f22937a     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            java.lang.String r5 = com.huawei.openalliance.ad.ppskit.utils.o2.i(r3, r5)     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            r6.f22938b = r5     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            r4.add(r6)     // Catch: java.lang.Exception -> L5b java.lang.RuntimeException -> L67 android.content.ActivityNotFoundException -> L77
            goto L2b
        L5b:
            r8 = move-exception
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            java.lang.String r3 = "queryIntentActivities Exception:"
            goto L72
        L67:
            r8 = move-exception
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            java.lang.String r3 = "queryIntentActivities RuntimeException:"
        L72:
            java.lang.String r8 = r3.concat(r8)
            goto L79
        L77:
            java.lang.String r8 = "queryIntentActivities, activity not exist"
        L79:
            ka.n7.g(r1, r8)
        L7c:
            r4 = r2
        L7d:
            if (r4 == 0) goto La4
            boolean r8 = r4.isEmpty()
            if (r8 != 0) goto La4
            int r8 = r4.size()
            r1 = 1
            if (r8 <= r1) goto L93
            boolean r8 = ka.Cif.c(r0)
            if (r8 == 0) goto L93
            goto La4
        L93:
            java.util.Iterator r8 = r4.iterator()
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r8 = r8.next()
            r2 = r8
            com.huawei.openalliance.ad.ppskit.utils.o2$a r2 = (com.huawei.openalliance.ad.ppskit.utils.o2.a) r2
        La4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.sc.p(android.content.Intent):com.huawei.openalliance.ad.ppskit.utils.o2$a");
    }

    public final void q(WebView webView) {
        String simpleName;
        String str;
        if (webView == null) {
            return;
        }
        com.huawei.openalliance.ad.ppskit.utils.f2.a(webView);
        WebSettings settings = webView.getSettings();
        com.huawei.openalliance.ad.ppskit.utils.d2.a(new rc(this, settings));
        try {
            String userAgentString = settings.getUserAgentString();
            if (userAgentString != null && userAgentString.indexOf("HuaweiPPS") < 0) {
                userAgentString = userAgentString.concat(" HuaweiPPS/3.4.65.300");
                settings.setUserAgentString(userAgentString);
            }
            n7.c(com.anythink.expressad.d.a.b.bH, "UserAgent:%s", userAgentString);
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str = "add useragent RuntimeException:";
            n7.i(com.anythink.expressad.d.a.b.bH, str.concat(simpleName));
        } catch (Exception e11) {
            simpleName = e11.getClass().getSimpleName();
            str = "add useragent Exception:";
            n7.i(com.anythink.expressad.d.a.b.bH, str.concat(simpleName));
        }
    }

    public final void r(WebView webView, o2.a aVar, Intent intent) {
        Context context = this.f31827v;
        View inflate = LayoutInflater.from(context).inflate(R.layout.hiad_adscore_open_app_dialog, (ViewGroup) null);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.hiad_open_app_nomore_remind);
        TextView textView = (TextView) inflate.findViewById(R.id.hiad_open_app_tips);
        String str = aVar.f22938b;
        if (TextUtils.isEmpty(str) || !Cif.c(context)) {
            str = context.getString(R.string.hiad_default_app_name);
            checkBox.setVisibility(8);
        }
        textView.setText(context.getString(R.string.hiad_landing_page_open_app, str));
        checkBox.setOnCheckedChangeListener(new a());
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(inflate);
        builder.setPositiveButton(R.string.hiad_dialog_allow, new b(intent, aVar));
        builder.setNeutralButton(R.string.hiad_dialog_reject, new c(aVar));
        AlertDialog create = builder.create();
        if (!(webView.getContext() instanceof Activity)) {
            create.getWindow().setType(2003);
        }
        create.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(com.huawei.openalliance.ad.ppskit.views.linkscroll.LinkScrollWebView r3, java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r4)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "https://"
            boolean r1 = r4.startsWith(r0)
            if (r1 != 0) goto L1a
            java.lang.String r1 = "http://"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L1a
            java.lang.String r4 = r0.concat(r4)
        L1a:
            if (r3 == 0) goto L52
            android.content.Context r0 = r3.getContext()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L40
            java.lang.String r1 = com.huawei.openalliance.ad.ppskit.utils.y1.u(r4)
            com.huawei.openalliance.ad.ppskit.handlers.l r0 = com.huawei.openalliance.ad.ppskit.handlers.l.d(r0)
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L40
            java.lang.String r0 = "sc"
            java.lang.String r1 = "url is blocked"
            ka.n7.e(r0, r1)
            r2.x()
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 == 0) goto L45
            java.lang.String r4 = "about:blank"
        L45:
            r3.loadUrl(r4)
            ka.sc$d r4 = new ka.sc$d
            r4.<init>(r3)
            r0 = 1000(0x3e8, double:4.94E-321)
            com.huawei.openalliance.ad.ppskit.utils.d2.b(r4, r0)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.sc.s(com.huawei.openalliance.ad.ppskit.views.linkscroll.LinkScrollWebView, java.lang.String):void");
    }

    public final boolean t(Intent intent, Set<String> set, String str) {
        boolean z10;
        Iterator<String> it = set.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            String[] split = it.next().split(com.huawei.openalliance.ad.constant.w.bE);
            if (split.length >= 2 && (split[0].equalsIgnoreCase(str) || split[0].equalsIgnoreCase("*"))) {
                z10 = true;
                intent.setPackage(split[1]);
                if ("market".equalsIgnoreCase(str)) {
                    this.B = Boolean.TRUE;
                }
                if (p(intent) != null) {
                    break;
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(android.webkit.WebView r7, android.net.Uri r8) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.sc.u(android.webkit.WebView, android.net.Uri):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent v(android.content.Intent r6) {
        /*
            r5 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            java.lang.String r6 = r0.getScheme()
            java.lang.Object r1 = r5.f32660t
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r1 = (com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord) r1
            if (r1 == 0) goto L25
            com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData r1 = r1.X1()
            if (r1 == 0) goto L25
            java.util.List r1 = r1.r()
            boolean r2 = androidx.transition.n.M(r1)
            if (r2 != 0) goto L25
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r1)
            goto L2a
        L25:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
        L2a:
            boolean r1 = androidx.transition.n.M(r2)
            if (r1 != 0) goto L37
            boolean r1 = r5.t(r0, r2, r6)
            if (r1 == 0) goto L37
            return r0
        L37:
            android.content.Context r1 = r5.f31827v
            com.huawei.openalliance.ad.ppskit.handlers.l r1 = com.huawei.openalliance.ad.ppskit.handlers.l.d(r1)
            java.lang.String r2 = r5.A
            byte[] r3 = r1.f22585a
            monitor-enter(r3)
            android.content.SharedPreferences r1 = r1.G(r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = "scheme_info"
            java.util.Set<java.lang.String> r4 = oa.c.f33788a     // Catch: java.lang.Throwable -> L7f
            java.util.Set r1 = r1.getStringSet(r2, r4)     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7f
            boolean r2 = androidx.transition.n.M(r1)
            r3 = 0
            if (r2 == 0) goto L57
            return r3
        L57:
            boolean r1 = r5.t(r0, r1, r6)
            if (r1 == 0) goto L5e
            return r0
        L5e:
            java.lang.Boolean r1 = r5.B
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L7e
            java.lang.String r1 = "market"
            boolean r6 = r1.equalsIgnoreCase(r6)
            if (r6 == 0) goto L7e
            android.content.Context r6 = r5.f31827v
            java.lang.String r1 = "com.huawei.appmarket"
            boolean r6 = com.huawei.openalliance.ad.ppskit.utils.o2.c(r6, r1)
            if (r6 == 0) goto L7e
            java.lang.String r6 = "com.huawei.appmarket"
            r0.setPackage(r6)
            return r0
        L7e:
            return r3
        L7f:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.sc.v(android.content.Intent):android.content.Intent");
    }

    public final void w() {
        va.c cVar = this.f31829x;
        if (cVar != null) {
            n7.e("WebEventReporter", "onWebloadFinish");
            ke keVar = (ke) ((f1.f) cVar).f27934c;
            androidx.transition.n.z(keVar.f31386g, keVar.f31381a, "webloadfinish").d("webloadfinish", keVar.z("webloadfinish"), true, keVar.f31382b);
            return;
        }
        if (n7.d()) {
            n7.b(com.anythink.expressad.d.a.b.bH, "onWebloadFinish");
        }
        if (this.D == null) {
            this.D = Long.valueOf(System.currentTimeMillis());
        }
        Context context = this.f31827v;
        if (context instanceof LandingDetailsActivity) {
            return;
        }
        ContentRecord contentRecord = (ContentRecord) this.f32660t;
        if (contentRecord == null) {
            n7.g("event", "onWebLoadFinish, ad data is null");
        } else {
            androidx.activity.n.P(context, "reportWebLoadFinish", androidx.activity.n.y(contentRecord));
        }
    }

    public final void x() {
        p pVar = this.y;
        ContentRecord contentRecord = (ContentRecord) this.f32660t;
        pVar.getClass();
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onLandingPageBlocked, data is null");
            } else {
                o f = pVar.f(contentRecord);
                if (f != null) {
                    f.f31525a = "34";
                    Context context = pVar.f31722a;
                    new ke(context, zh.a(contentRecord.z0(), context), null).p(contentRecord.h1(), f, false, true);
                }
            }
        } catch (Throwable th) {
            e0.i.p(th, "onLandingPageBlocked: ", "AnalysisReport");
        }
    }

    public final void y() {
        p pVar = this.y;
        ContentRecord contentRecord = (ContentRecord) this.f32660t;
        pVar.getClass();
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onLandingUrlOverride, data is null");
            } else {
                o f = pVar.f(contentRecord);
                if (f != null) {
                    f.f31525a = "60";
                    Context context = pVar.f31722a;
                    new ke(context, zh.a(contentRecord.z0(), context), null).p(contentRecord.h1(), f, false, true);
                }
            }
        } catch (Throwable th) {
            e0.i.p(th, "onLandingUrlOverrideError:", "AnalysisReport");
        }
    }

    public sc(Context context, ej ejVar) {
        super(3);
        this.f31828w = false;
        this.B = Boolean.FALSE;
        this.E = false;
        this.f31827v = context;
        this.f32659s = ejVar;
        this.y = new p(context);
        this.f31830z = new v(context);
    }
}
