package com.applovin.impl.a.a;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.impl.a.a.b.a.b;
import com.applovin.impl.mediation.d.c;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.utils.l;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.huawei.hms.ads.gl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements j.a {
    private static WeakReference<MaxCreativeDebuggerActivity> f;

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicBoolean f16883l = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final p f16884a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f16885b;

    /* renamed from: e, reason: collision with root package name */
    private final b f16888e;

    /* renamed from: h, reason: collision with root package name */
    private j f16890h;

    /* renamed from: i, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.p f16891i;

    /* renamed from: j, reason: collision with root package name */
    private int f16892j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16893k;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.applovin.impl.a.a.a.a> f16886c = new ArrayList(10);

    /* renamed from: d, reason: collision with root package name */
    private final Object f16887d = new Object();

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<View> f16889g = new WeakReference<>(null);

    public a(p pVar) {
        this.f16884a = pVar;
        Context y = p.y();
        this.f16885b = y;
        this.f16888e = new b(y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        WeakReference<MaxCreativeDebuggerActivity> weakReference = f;
        if (weakReference != null && weakReference.get() != null) {
            return true;
        }
        return false;
    }

    private void i() {
        this.f16884a.w().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.a.a.a.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxCreativeDebuggerActivity) {
                    y.f("AppLovinSdk", "Started Creative Debugger");
                    if (!a.this.h() || a.f.get() != activity) {
                        MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                        WeakReference unused = a.f = new WeakReference(maxCreativeDebuggerActivity);
                        maxCreativeDebuggerActivity.a(a.this.f16888e, a.this.f16884a.w());
                    }
                    a.f16883l.set(false);
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxCreativeDebuggerActivity) {
                    y.f("AppLovinSdk", "Creative Debugger destroyed");
                    WeakReference unused = a.f = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f16889g.get() == null && !h()) {
            Activity a10 = this.f16884a.w().a();
            if (a10 == null) {
                this.f16884a.L();
                if (y.a()) {
                    this.f16884a.L().e("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View findViewById = a10.findViewById(R.id.content);
            if (findViewById instanceof FrameLayout) {
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View a11 = a(a10);
                frameLayout.addView(a11);
                AlphaAnimation alphaAnimation = new AlphaAnimation(gl.Code, 1.0f);
                alphaAnimation.setDuration(150L);
                a11.startAnimation(alphaAnimation);
                final ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
                final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.a.a.a.4
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if (a11.getParent() == null && a.this.f16889g.get() != null) {
                            frameLayout.addView(a11);
                        }
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.a.a.a.5
                    @Override // java.lang.Runnable
                    public void run() {
                        frameLayout.removeView(a11);
                        a.this.f16889g = new WeakReference(null);
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                        }
                    }
                }, TimeUnit.SECONDS.toMillis(5L));
                this.f16889g = new WeakReference<>(a11);
            }
        }
    }

    private Drawable k() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, com.anythink.expressad.video.module.a.a.R));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public void b() {
        ArrayList arrayList;
        if (!h() && f16883l.compareAndSet(false, true)) {
            synchronized (this.f16887d) {
                arrayList = new ArrayList(this.f16886c);
            }
            this.f16888e.a(arrayList, this.f16884a);
            if (!this.f16893k) {
                i();
                this.f16893k = true;
            }
            Intent intent = new Intent(this.f16885b, (Class<?>) MaxCreativeDebuggerActivity.class);
            intent.setFlags(268435456);
            y.f("AppLovinSdk", "Starting Creative Debugger...");
            this.f16885b.startActivity(intent);
            return;
        }
        y.i("AppLovinSdk", "Creative Debugger is already showing");
    }

    public boolean c() {
        return ((Boolean) this.f16884a.a(com.applovin.impl.sdk.c.b.bV)).booleanValue() && this.f16884a.C().isCreativeDebuggerEnabled();
    }

    @Override // com.applovin.impl.sdk.utils.j.a
    public void d() {
        if (this.f16892j == 0) {
            this.f16891i = com.applovin.impl.sdk.utils.p.a(TimeUnit.SECONDS.toMillis(3L), this.f16884a, new Runnable() { // from class: com.applovin.impl.a.a.a.2
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f16892j = 0;
                }
            });
        }
        int i10 = this.f16892j;
        if (i10 % 2 == 0) {
            this.f16892j = i10 + 1;
        }
    }

    @Override // com.applovin.impl.sdk.utils.j.a
    public void e() {
        int i10 = this.f16892j;
        if (i10 % 2 == 1) {
            this.f16892j = i10 + 1;
        }
        if (this.f16892j / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.a.a.a.3
                @Override // java.lang.Runnable
                public void run() {
                    a.this.j();
                }
            });
            this.f16892j = 0;
            this.f16891i.d();
        }
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof e) {
            format = ((e) obj).getAdZone().b();
        } else {
            format = obj instanceof com.applovin.impl.mediation.a.a ? ((com.applovin.impl.mediation.a.a) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    public void a() {
        if (c() && this.f16890h == null) {
            j jVar = new j(this.f16884a, this);
            this.f16890h = jVar;
            jVar.a();
        }
    }

    private Bundle d(Object obj) {
        Bundle a10 = this.f16884a.am().a(Utils.getAdServeId(obj));
        if (a10 == null) {
            return null;
        }
        for (String str : a10.keySet()) {
            Object obj2 = a10.get(str);
            a10.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, a10);
        }
        return a10;
    }

    public void a(Object obj) {
        if (c() && obj != null) {
            if (!c.a(obj) || c(obj)) {
                if (c.b(obj) && c(obj)) {
                    return;
                }
                synchronized (this.f16887d) {
                    this.f16886c.add(0, new com.applovin.impl.a.a.a.a(obj, System.currentTimeMillis()));
                    if (this.f16886c.size() > 10) {
                        this.f16886c.remove(r6.size() - 1);
                    }
                }
            }
        }
    }

    public String b(Object obj) {
        JSONObject d10;
        if (obj instanceof e) {
            return ((e) obj).getOriginalFullResponse().toString();
        }
        if (!(obj instanceof com.applovin.impl.mediation.a.a)) {
            return null;
        }
        String k10 = ((com.applovin.impl.mediation.a.a) obj).k();
        return (!c.b(obj) || (d10 = new com.applovin.impl.sdk.ad.c(k10, this.f16884a).d()) == null) ? k10 : d10.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.ImageButton, android.widget.ImageView, android.view.View] */
    private View a(Activity activity) {
        Button button;
        int dpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i10 = dpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, 8388629);
        layoutParams.setMargins(i10, i10, i10, i10);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i10, i10, i10, i10 * 2);
            button = imageButton;
        } catch (Throwable unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(k());
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.a.a.a.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.b();
            }
        });
        if (h.d()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    public void a(com.applovin.impl.a.a.a.a aVar, Context context, boolean z10) {
        Object c10 = aVar.c();
        String a10 = a(aVar);
        l lVar = new l();
        if (z10) {
            lVar.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        lVar.b(a10);
        String b10 = this.f16884a.af().b(c10);
        if (b10 != null) {
            lVar.a("\nBid Response:\n");
            lVar.a(b10);
        }
        String str = "AppLovin Ad Report";
        Intent createChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", c10 instanceof e ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", lVar.toString()).setPackage(null), "Share Ad Report");
        if (z10) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
                if (!(c10 instanceof e)) {
                    str = "MAX Ad Report";
                }
                context.startActivity(intent.putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", lVar.toString()).setPackage("com.google.android.gm"));
                return;
            } catch (ActivityNotFoundException unused) {
                context.startActivity(createChooser);
                return;
            }
        }
        context.startActivity(createChooser);
    }

    public String a(com.applovin.impl.a.a.a.a aVar) {
        String f10;
        Object c10 = aVar.c();
        l lVar = new l();
        lVar.b("Ad Info:\n");
        if (c10 instanceof e) {
            e eVar = (e) c10;
            lVar.a("Network", "APPLOVIN").a(eVar).b(eVar);
        } else if (c10 instanceof com.applovin.impl.mediation.a.a) {
            lVar.a((com.applovin.impl.mediation.a.a) c10);
        }
        lVar.a(this.f16884a);
        lVar.a("Epoch Timestamp (ms)", Long.valueOf(aVar.d()));
        if (this.f16884a.S() != null) {
            f10 = this.f16884a.Q().v();
        } else {
            f10 = this.f16884a.R().f();
        }
        lVar.a("\nDebug Info:\n").a("Platform", "fireos".equals(f10) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f16884a.a(com.applovin.impl.sdk.c.b.dT)).a("App Package Name", this.f16885b.getPackageName()).a("Device", String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f16884a.q()).a("Ad Review Version", g.a()).a(d(c10)).a("User ID", this.f16884a.o() != null ? this.f16884a.o() : "None");
        return lVar.toString();
    }
}
