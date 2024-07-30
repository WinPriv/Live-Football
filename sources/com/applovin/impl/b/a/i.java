package com.applovin.impl.b.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.b.a.d;
import com.applovin.impl.b.a.f;
import com.applovin.impl.b.b.e;
import com.applovin.impl.sdk.AppLovinCFErrorImpl;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinCFService;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final p f17288a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17289b;

    /* renamed from: c, reason: collision with root package name */
    private List<d> f17290c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17291d;

    /* renamed from: e, reason: collision with root package name */
    private AppLovinCFService.OnCFCompletionCallback f17292e;
    private d f;

    /* renamed from: g, reason: collision with root package name */
    private Dialog f17293g;

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.utils.a f17294h = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.b.a.i.1
        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Bundle bundle;
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || i.this.f == null) {
                return;
            }
            if (i.this.f17293g != null) {
                if (i.this.f17293g instanceof com.applovin.impl.b.b.e) {
                    bundle = ((com.applovin.impl.b.b.e) i.this.f17293g).a();
                } else {
                    bundle = null;
                }
                i.this.f17293g.dismiss();
                i.this.f17293g = null;
            } else {
                bundle = null;
            }
            d dVar = i.this.f;
            i.this.f = null;
            i.this.a(dVar, bundle, activity);
        }
    };

    public i(p pVar) {
        this.f17288a = pVar;
        this.f17289b = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.fW)).intValue();
    }

    private d c() {
        for (d dVar : this.f17290c) {
            if (dVar.c()) {
                return dVar;
            }
        }
        return null;
    }

    public void b(boolean z10) {
        com.applovin.impl.b.a.a(z10, p.y());
    }

    public void b() {
        this.f17288a.L();
        if (y.a()) {
            this.f17288a.L().b("AppLovinSdk", "Reinitializing SDK and ending consent flow");
        }
        this.f17290c = null;
        this.f17288a.w().b(this.f17294h);
        AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback = this.f17292e;
        if (onCFCompletionCallback != null) {
            onCFCompletionCallback.onFlowCompleted(null);
            this.f17292e = null;
        }
    }

    public void a(List<d> list, boolean z10, Activity activity, AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback) {
        if (this.f17290c != null) {
            this.f17288a.L();
            if (y.a()) {
                this.f17288a.L().b("AppLovinSdk", "Unable to start states: " + list);
            }
            this.f17288a.L();
            if (y.a()) {
                this.f17288a.L().b("AppLovinSdk", "Consent flow already in progress for states: " + this.f17290c);
            }
            onCFCompletionCallback.onFlowCompleted(new AppLovinCFErrorImpl(-200, "Consent flow is already in progress."));
            return;
        }
        this.f17290c = list;
        this.f17291d = z10;
        this.f17292e = onCFCompletionCallback;
        this.f17288a.G().trackEvent("cf_start");
        p.a(activity).a(this.f17294h);
        a(c(), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(d dVar, Activity activity) {
        a(a(dVar.d()), activity);
    }

    public boolean a() {
        return this.f17290c != null;
    }

    public void a(boolean z10) {
        com.applovin.impl.b.a.b(z10, p.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, Activity activity) {
        a(dVar, (Bundle) null, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final d dVar, final Bundle bundle, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.b.a.i.2
            @Override // java.lang.Runnable
            public void run() {
                SpannableString spannableString;
                i.this.f17288a.L();
                if (y.a()) {
                    i.this.f17288a.L().b("AppLovinSdk", "Transitioning to state: " + dVar);
                }
                if (dVar.b() == d.a.ALERT) {
                    if (com.applovin.impl.sdk.utils.b.a(activity)) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.b.a.i.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                i iVar = i.this;
                                iVar.a(dVar, iVar.f17288a.x());
                            }
                        }, TimeUnit.SECONDS.toMillis(1L));
                        return;
                    }
                    e eVar = (e) dVar;
                    i.this.f = eVar;
                    if ("1".equals(dVar.a())) {
                        i.this.f17288a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) com.applovin.impl.sdk.c.d.f18751t, (com.applovin.impl.sdk.c.d<Boolean>) Boolean.TRUE);
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                    builder.setCancelable(false);
                    for (final f fVar : eVar.g()) {
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.i.2.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i10) {
                                i.this.f = null;
                                i.this.f17293g = null;
                                d a10 = i.this.a(fVar.c());
                                if (a10 == null) {
                                    i.this.f17288a.L();
                                    if (y.a()) {
                                        i.this.f17288a.L().e("AppLovinSdk", "Consent flow failed to get destination state for TOS/PP alert. Finishing flow...");
                                    }
                                    i.this.b();
                                    return;
                                }
                                if ("12".equals(a10.a())) {
                                    i.this.f17288a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) com.applovin.impl.sdk.c.d.f18751t, (com.applovin.impl.sdk.c.d<Boolean>) Boolean.FALSE);
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                i.this.a(a10, activity);
                                if (a10.b() != d.a.ALERT) {
                                    dialogInterface.dismiss();
                                }
                            }
                        };
                        if (fVar.b() == f.a.POSITIVE) {
                            builder.setPositiveButton(fVar.a(), onClickListener);
                        } else if (fVar.b() == f.a.NEGATIVE) {
                            builder.setNegativeButton(fVar.a(), onClickListener);
                        } else {
                            builder.setNeutralButton(fVar.a(), onClickListener);
                        }
                    }
                    String e10 = eVar.e();
                    if (StringUtils.isValidString(e10)) {
                        spannableString = new SpannableString(e10);
                        String a10 = p.a(R.string.applovin_terms_of_service_text);
                        String a11 = p.a(R.string.applovin_privacy_policy_text);
                        if (StringUtils.containsAtLeastOneSubstring(e10, Arrays.asList(a10, a11))) {
                            final Uri d10 = i.this.f17288a.ae().d();
                            if (d10 != null) {
                                StringUtils.addLinks(spannableString, Pattern.compile(a10), new ClickableSpan() { // from class: com.applovin.impl.b.a.i.2.3
                                    @Override // android.text.style.ClickableSpan
                                    public void onClick(View view) {
                                        Uri uri = d10;
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        Utils.showWebViewActivity(uri, activity, i.this.f17288a);
                                    }
                                }, true);
                            }
                            final Uri c10 = i.this.f17288a.ae().c();
                            StringUtils.addLinks(spannableString, Pattern.compile(a11), new ClickableSpan() { // from class: com.applovin.impl.b.a.i.2.4
                                @Override // android.text.style.ClickableSpan
                                public void onClick(View view) {
                                    Uri uri = c10;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    Utils.showWebViewActivity(uri, activity, i.this.f17288a);
                                }
                            }, true);
                        }
                    } else {
                        spannableString = null;
                    }
                    final AlertDialog create = builder.setTitle(spannableString).setMessage(eVar.f()).create();
                    create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.b.a.i.2.5
                        @Override // android.content.DialogInterface.OnShowListener
                        public void onShow(DialogInterface dialogInterface) {
                            TextView textView = (TextView) create.findViewById(create.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
                            textView.setLinkTextColor(textView.getCurrentTextColor());
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                            textView.setMaxLines(i.this.f17289b);
                        }
                    });
                    i.this.f17293g = create;
                    create.show();
                    return;
                }
                if (dVar.b() == d.a.GDPR_ALERT) {
                    if (com.applovin.impl.sdk.utils.b.a(activity)) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.b.a.i.2.6
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                i iVar = i.this;
                                iVar.a(dVar, iVar.f17288a.x());
                            }
                        }, TimeUnit.SECONDS.toMillis(1L));
                        return;
                    }
                    if ("2".equals(dVar.a()) && !i.this.f17291d) {
                        i.this.f17288a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) com.applovin.impl.sdk.c.d.f18751t, (com.applovin.impl.sdk.c.d<Boolean>) Boolean.TRUE);
                    }
                    com.applovin.impl.b.b.e eVar2 = new com.applovin.impl.b.b.e(activity, bundle, (h) dVar, i.this.f17288a, new e.a() { // from class: com.applovin.impl.b.a.i.2.7
                        @Override // com.applovin.impl.b.b.e.a
                        public void a(boolean z10, boolean z11) {
                            i.this.f17288a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) com.applovin.impl.sdk.c.d.f18753v, (com.applovin.impl.sdk.c.d<Boolean>) Boolean.valueOf(z10));
                            i.this.f17288a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) com.applovin.impl.sdk.c.d.f18754w, (com.applovin.impl.sdk.c.d<Boolean>) Boolean.valueOf(z11));
                            i.this.f17288a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) com.applovin.impl.sdk.c.d.f18755x, (com.applovin.impl.sdk.c.d<Boolean>) Boolean.TRUE);
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            d a12 = i.this.a(dVar.d());
                            if (a12 == null) {
                                i.this.f17288a.L();
                                if (y.a()) {
                                    i.this.f17288a.L().e("AppLovinSdk", "Consent flow failed to get destination state for GDPR alert. Finishing flow...");
                                }
                                i.this.b();
                                return;
                            }
                            boolean z12 = true;
                            if ("13".equals(a12.a())) {
                                i.this.f17288a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<Boolean>>) com.applovin.impl.sdk.c.d.f18751t, (com.applovin.impl.sdk.c.d<Boolean>) Boolean.FALSE);
                                Map<String, String> map = CollectionUtils.map(3);
                                map.put("paa", String.valueOf(z10));
                                map.put("apa", String.valueOf(z11));
                                map.put("ppa", String.valueOf(true));
                                ((g) a12).a(map);
                            }
                            i iVar = i.this;
                            if (!z10 || !z11) {
                                z12 = false;
                            }
                            iVar.a(z12);
                            i.this.b(false);
                            i.this.f = null;
                            i.this.f17293g = null;
                            AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                            i.this.a(a12, activity);
                        }
                    });
                    i.this.f = dVar;
                    i.this.f17293g = eVar2;
                    eVar2.show();
                    return;
                }
                if (dVar.b() == d.a.EVENT) {
                    g gVar = (g) dVar;
                    String e11 = gVar.e();
                    Map<String, String> f = gVar.f();
                    if (f == null) {
                        f = CollectionUtils.map(1);
                    }
                    f.put("flow_type", "unified");
                    i.this.f17288a.G().trackEvent(e11, f);
                    i.this.b(gVar, activity);
                    return;
                }
                if (dVar.b() == d.a.TERMS_OF_SERVICE) {
                    Utils.showWebViewActivity(i.this.f17288a.ae().d(), activity, i.this.f17288a);
                    return;
                }
                if (dVar.b() == d.a.PRIVACY_POLICY) {
                    Utils.showWebViewActivity(i.this.f17288a.ae().c(), activity, i.this.f17288a);
                    return;
                }
                if (dVar.b() == d.a.HAS_USER_CONSENT) {
                    i.this.a(true);
                    i.this.b(dVar, activity);
                } else {
                    if (dVar.b() == d.a.REINIT) {
                        i.this.b();
                        return;
                    }
                    i.this.f17288a.L();
                    if (y.a()) {
                        i.this.f17288a.L().e("AppLovinSdk", "No destination consent flow state found!");
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d a(String str) {
        List<d> list = this.f17290c;
        if (list == null) {
            return null;
        }
        for (d dVar : list) {
            if (str.equalsIgnoreCase(dVar.a())) {
                return dVar;
            }
        }
        return null;
    }
}
