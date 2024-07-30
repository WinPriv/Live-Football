package com.anythink.expressad.splash.view;

import a3.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.splash.d.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ATSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final String f11124c = "ATSplashPopView";

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f11125d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    View.OnClickListener f11126a;

    /* renamed from: b, reason: collision with root package name */
    View.OnClickListener f11127b;

    /* renamed from: e, reason: collision with root package name */
    private String f11128e;
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private int f11129g;

    /* renamed from: h, reason: collision with root package name */
    private c f11130h;

    /* renamed from: i, reason: collision with root package name */
    private d f11131i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f11132j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f11133k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f11134l;

    /* renamed from: m, reason: collision with root package name */
    private ImageView f11135m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f11136n;
    private TextView o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f11137p;

    /* renamed from: q, reason: collision with root package name */
    private int f11138q;

    /* renamed from: r, reason: collision with root package name */
    private Handler f11139r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f11140s;

    /* renamed from: t, reason: collision with root package name */
    private com.anythink.expressad.a.a f11141t;

    /* renamed from: u, reason: collision with root package name */
    private Runnable f11142u;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f11150a;

        /* renamed from: b, reason: collision with root package name */
        private String f11151b;

        /* renamed from: c, reason: collision with root package name */
        private int f11152c;

        /* renamed from: d, reason: collision with root package name */
        private c f11153d;

        public a(String str, String str2, int i10, c cVar) {
            this.f11150a = str;
            this.f11151b = str2;
            this.f11152c = i10;
            this.f11153d = cVar;
        }

        public final String a() {
            return this.f11150a;
        }

        public final String b() {
            return this.f11151b;
        }

        public final int c() {
            return this.f11152c;
        }

        public final c d() {
            return this.f11153d;
        }

        private void a(String str) {
            this.f11150a = str;
        }

        private void b(String str) {
            this.f11151b = str;
        }

        private void a(int i10) {
            this.f11152c = i10;
        }

        private void a(c cVar) {
            this.f11153d = cVar;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public ATSplashPopView(Context context, a aVar, d dVar) {
        super(context);
        this.f11129g = 1;
        this.f11138q = -1;
        this.f11139r = new Handler();
        this.f11140s = false;
        this.f11142u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f11137p != null) {
                    if (ATSplashPopView.this.f11138q == 0) {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f11139r.removeCallbacks(ATSplashPopView.this.f11142u);
                        if (ATSplashPopView.this.f11131i != null) {
                            ATSplashPopView.this.f11131i.b();
                            return;
                        }
                        return;
                    }
                    ATSplashPopView.j(ATSplashPopView.this);
                    ATSplashPopView.this.f11137p.setText(String.valueOf(ATSplashPopView.this.f11138q));
                    ATSplashPopView.this.f11139r.postDelayed(ATSplashPopView.this.f11142u, 1000L);
                }
            }
        };
        this.f11126a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f11131i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f11130h);
                }
            }
        };
        this.f11127b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f11138q <= 0 && ATSplashPopView.this.f11131i != null) {
                    ATSplashPopView.this.f11131i.b();
                }
            }
        };
        if (aVar != null) {
            this.f = aVar.b();
            this.f11128e = aVar.a();
            this.f11129g = aVar.c();
            this.f11130h = aVar.d();
            this.f11131i = dVar;
            a();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    private void a(String str) {
        k.f().a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.2
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    com.anythink.core.common.k.b.a(n.a().g(), bitmap);
                } catch (Throwable th) {
                    o.d(ATSplashPopView.f11124c, th.getMessage());
                }
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
                o.d(ATSplashPopView.f11124c, str2);
            }
        });
    }

    private void b(String str) {
        k.f().a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.3
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    ATSplashPopView.this.f11133k.setImageBitmap(com.anythink.expressad.foundation.h.n.a(bitmap, 16));
                } catch (Throwable th) {
                    o.d(ATSplashPopView.f11124c, th.getMessage());
                }
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
                o.d(ATSplashPopView.f11124c, str2);
            }
        });
    }

    public static /* synthetic */ int e(ATSplashPopView aTSplashPopView) {
        aTSplashPopView.f11138q = -1;
        return -1;
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f11125d;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    public static /* synthetic */ int j(ATSplashPopView aTSplashPopView) {
        int i10 = aTSplashPopView.f11138q;
        aTSplashPopView.f11138q = i10 - 1;
        return i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11131i != null) {
            getWidth();
            getHeight();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.f11140s = true;
        if (this.f11137p != null) {
            this.f11139r.removeCallbacks(this.f11142u);
        }
    }

    public void reStartCountDown() {
        if (this.f11140s) {
            this.f11140s = false;
            int i10 = this.f11138q;
            if (i10 != -1 && i10 != 0) {
                TextView textView = this.f11137p;
                if (textView != null) {
                    textView.setText(String.valueOf(i10));
                    this.f11139r.postDelayed(this.f11142u, 1000L);
                    return;
                }
                return;
            }
            g();
        }
    }

    public void release() {
        try {
            this.f11139r.removeCallbacks(this.f11142u);
            this.f11142u = null;
            detachAllViewsFromParent();
            this.f11130h = null;
            this.f11131i = null;
        } catch (Exception e10) {
            o.d(f11124c, e10.getMessage());
        }
    }

    public void setPopViewType(a aVar, d dVar) {
        if (aVar != null) {
            this.f = aVar.b();
            this.f11128e = aVar.a();
            this.f11129g = aVar.c();
            this.f11130h = aVar.d();
            this.f11131i = dVar;
            a();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    public void startCountDown() {
        this.f11139r.removeCallbacks(this.f11142u);
        c cVar = this.f11130h;
        if (cVar != null && this.f11129g == 1) {
            int u2 = cVar.u();
            if (u2 > 0) {
                this.f11138q = u2;
                TextView textView = this.f11137p;
                if (textView != null) {
                    textView.setText(String.valueOf(u2));
                    this.f11139r.postDelayed(this.f11142u, 1000L);
                    return;
                }
                return;
            }
            g();
        }
    }

    private void c() {
        int b10 = t.b(getContext(), 4.0f);
        this.f11132j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t.b(getContext(), 28.0f), t.b(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f11132j.setId(generateViewId());
        this.f11132j.setLayoutParams(layoutParams);
        this.f11132j.setPadding(b10, b10, b10, b10);
        this.f11132j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.f11130h.bd(), false);
        TextView textView = new TextView(getContext());
        this.f11136n = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f11132j.getId());
        layoutParams2.addRule(6, this.f11132j.getId());
        layoutParams2.addRule(8, this.f11132j.getId());
        layoutParams2.leftMargin = t.b(getContext(), 4.0f);
        layoutParams2.rightMargin = t.b(getContext(), 40.0f);
        this.f11136n.setLayoutParams(layoutParams2);
        this.f11136n.setGravity(16);
        this.f11136n.setTextSize(10.0f);
        this.f11136n.setSelected(true);
        this.f11136n.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f11136n.setMarqueeRepeatLimit(-1);
        this.f11136n.setSingleLine(true);
        this.f11136n.setTextColor(-16777216);
        this.f11136n.setText(this.f11130h.bb());
        setBackgroundResource(getResources().getIdentifier("anythink_shape_corners_bg", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
        addView(this.f11132j);
        addView(this.f11136n);
        f();
        setOnClickListener(this.f11126a);
    }

    private void d() {
        int b10 = t.b(getContext(), 4.0f);
        this.f11132j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t.b(getContext(), 50.0f), t.b(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f11132j.setId(generateViewId());
        this.f11132j.setLayoutParams(layoutParams);
        this.f11132j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f11132j.setPadding(b10, b10, b10, b10);
        a(this.f11130h.bd(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f11132j.getId());
        layoutParams2.addRule(6, this.f11132j.getId());
        layoutParams2.addRule(8, this.f11132j.getId());
        layoutParams2.leftMargin = t.b(getContext(), 8.0f);
        layoutParams2.rightMargin = t.b(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f11136n = textView;
        textView.setId(generateViewId());
        this.f11136n.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f11136n.setGravity(16);
        this.f11136n.setTextSize(12.0f);
        this.f11136n.setSelected(true);
        this.f11136n.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f11136n.setMarqueeRepeatLimit(-1);
        this.f11136n.setSingleLine(true);
        this.f11136n.setTextColor(-16777216);
        this.f11136n.setText(this.f11130h.bb());
        TextView textView2 = new TextView(getContext());
        this.o = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f11136n.getId());
        layoutParams3.addRule(3, this.f11136n.getId());
        layoutParams3.topMargin = t.b(getContext(), 4.0f);
        layoutParams3.rightMargin = t.b(getContext(), 36.0f);
        this.o.setGravity(16);
        this.o.setLayoutParams(layoutParams3);
        this.o.setTextSize(8.0f);
        this.o.setTextColor(-10066330);
        this.o.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.o.setMarqueeRepeatLimit(-1);
        this.o.setSelected(true);
        this.o.setSingleLine(true);
        this.o.setText(this.f11130h.bc());
        relativeLayout.addView(this.f11136n);
        relativeLayout.addView(this.o);
        setBackgroundResource(getResources().getIdentifier("anythink_shape_corners_bg", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
        addView(this.f11132j);
        addView(relativeLayout);
        f();
        setOnClickListener(this.f11126a);
    }

    private void e() {
        this.f11134l = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, t.b(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f11134l.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f11134l.setId(generateViewId());
        this.f11134l.setLayoutParams(layoutParams);
        a(this.f11130h.be());
        this.f11133k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, t.b(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f11133k.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f11133k.setId(generateViewId());
        this.f11133k.setLayoutParams(layoutParams2);
        b(this.f11130h.be());
        this.f11132j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(t.b(getContext(), 50.0f), t.b(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f11134l.getId());
        layoutParams3.topMargin = 20;
        this.f11132j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f11132j.setId(generateViewId());
        this.f11132j.setLayoutParams(layoutParams3);
        a(this.f11130h.bd(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f11132j.getId());
        layoutParams4.addRule(6, this.f11132j.getId());
        layoutParams4.addRule(8, this.f11132j.getId());
        layoutParams4.leftMargin = t.b(getContext(), 8.0f);
        layoutParams4.rightMargin = t.b(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f11136n = textView;
        textView.setId(generateViewId());
        this.f11136n.setGravity(16);
        this.f11136n.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f11136n.setTextSize(12.0f);
        this.f11136n.setTextColor(-16777216);
        this.f11136n.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f11136n.setMarqueeRepeatLimit(-1);
        this.f11136n.setSelected(true);
        this.f11136n.setSingleLine(true);
        this.f11136n.setText(this.f11130h.bb());
        TextView textView2 = new TextView(getContext());
        this.o = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f11136n.getId());
        layoutParams5.addRule(3, this.f11136n.getId());
        layoutParams5.topMargin = t.b(getContext(), 4.0f);
        layoutParams5.rightMargin = t.b(getContext(), 36.0f);
        this.o.setGravity(16);
        this.o.setLayoutParams(layoutParams5);
        this.o.setTextSize(8.0f);
        this.o.setTextColor(-10066330);
        this.o.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.o.setMarqueeRepeatLimit(-1);
        this.o.setSelected(true);
        this.o.setSingleLine(true);
        this.o.setText(this.f11130h.bc());
        relativeLayout.addView(this.f11136n);
        relativeLayout.addView(this.o);
        addView(this.f11134l);
        addView(this.f11133k);
        addView(this.f11132j);
        addView(relativeLayout);
        f();
        setOnClickListener(this.f11126a);
    }

    private void f() {
        String str;
        int identifier;
        this.f11135m = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t.b(getContext(), 32.0f), t.b(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f11132j.getId());
        this.f11135m.setLayoutParams(layoutParams);
        try {
            str = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th) {
            o.d(f11124c, th.getMessage());
            str = "ZH";
        }
        if (!str.toUpperCase().equals("CN") && !str.toUpperCase().equals("ZH")) {
            identifier = getResources().getIdentifier("anythink_splash_ad_en", i.f10125c, com.anythink.expressad.foundation.b.a.b().a());
        } else {
            identifier = getResources().getIdentifier("anythink_splash_ad", i.f10125c, com.anythink.expressad.foundation.b.a.b().a());
        }
        this.f11135m.setBackgroundResource(identifier);
        addView(this.f11135m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.f11137p;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = t.b(getContext(), 16.0f);
            layoutParams.height = t.b(getContext(), 16.0f);
            this.f11137p.setLayoutParams(layoutParams);
            this.f11137p.setText("");
            this.f11137p.setBackgroundResource(getResources().getIdentifier("anythink_splash_popview_close", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
        }
    }

    private void a(String str, final boolean z10) {
        k.f().a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.1
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                Bitmap a10;
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    if (z10) {
                        a10 = com.anythink.expressad.foundation.h.n.a(bitmap);
                    } else {
                        a10 = com.anythink.expressad.foundation.h.n.a(bitmap, 16);
                    }
                    ImageView imageView = ATSplashPopView.this.f11132j;
                    if (a10 != null) {
                        bitmap = a10;
                    }
                    imageView.setImageBitmap(bitmap);
                } catch (Throwable th) {
                    o.d(ATSplashPopView.f11124c, th.getMessage());
                }
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
                o.d(ATSplashPopView.f11124c, str2);
            }
        });
    }

    private void b() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t.b(getContext(), 80.0f), t.b(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = t.b(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("anythink_splash_popview_default", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
        this.f11132j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(t.b(getContext(), 60.0f), t.b(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = t.b(getContext(), 7.0f);
        layoutParams2.leftMargin = t.b(getContext(), 10.0f);
        this.f11132j.setId(generateViewId());
        this.f11132j.setLayoutParams(layoutParams2);
        this.f11132j.setScaleType(ImageView.ScaleType.FIT_CENTER);
        c cVar = this.f11130h;
        if (cVar != null && !TextUtils.isEmpty(cVar.bd())) {
            a(this.f11130h.bd(), true);
        }
        this.f11137p = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = t.b(getContext(), 62.0f);
        layoutParams3.bottomMargin = t.b(getContext(), 70.0f);
        this.f11137p.setId(generateViewId());
        this.f11137p.setTextSize(10.0f);
        this.f11137p.setTextColor(-1);
        this.f11137p.setGravity(17);
        this.f11137p.setMinWidth(t.b(getContext(), 16.0f));
        this.f11137p.setMaxHeight(t.b(getContext(), 16.0f));
        this.f11137p.setLayoutParams(layoutParams3);
        this.f11137p.setBackgroundResource(getResources().getIdentifier("anythink_cm_circle_50black", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
        addView(imageView);
        addView(this.f11137p);
        addView(this.f11132j);
        c cVar2 = this.f11130h;
        if (cVar2 != null && cVar2.u() <= 0) {
            g();
        }
        setOnClickListener(this.f11126a);
        this.f11137p.setOnClickListener(this.f11127b);
    }

    private void a() {
        if (this.f11130h == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i10 = this.f11129g;
        if (i10 == 1) {
            b();
            return;
        }
        if (i10 == 2) {
            c();
        } else if (i10 == 3) {
            d();
        } else {
            if (i10 != 4) {
                return;
            }
            e();
        }
    }

    public ATSplashPopView(Context context) {
        super(context);
        this.f11129g = 1;
        this.f11138q = -1;
        this.f11139r = new Handler();
        this.f11140s = false;
        this.f11142u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f11137p != null) {
                    if (ATSplashPopView.this.f11138q == 0) {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f11139r.removeCallbacks(ATSplashPopView.this.f11142u);
                        if (ATSplashPopView.this.f11131i != null) {
                            ATSplashPopView.this.f11131i.b();
                            return;
                        }
                        return;
                    }
                    ATSplashPopView.j(ATSplashPopView.this);
                    ATSplashPopView.this.f11137p.setText(String.valueOf(ATSplashPopView.this.f11138q));
                    ATSplashPopView.this.f11139r.postDelayed(ATSplashPopView.this.f11142u, 1000L);
                }
            }
        };
        this.f11126a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f11131i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f11130h);
                }
            }
        };
        this.f11127b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f11138q <= 0 && ATSplashPopView.this.f11131i != null) {
                    ATSplashPopView.this.f11131i.b();
                }
            }
        };
        this.f11129g = 1;
        o.b(f11124c, "Please call setPopViewType() to init.");
    }

    private void a(c cVar) {
        d dVar = this.f11131i;
        if (dVar != null) {
            dVar.a(cVar);
            this.f11131i.b();
        }
    }

    public static /* synthetic */ void a(ATSplashPopView aTSplashPopView, c cVar) {
        d dVar = aTSplashPopView.f11131i;
        if (dVar != null) {
            dVar.a(cVar);
            aTSplashPopView.f11131i.b();
        }
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11129g = 1;
        this.f11138q = -1;
        this.f11139r = new Handler();
        this.f11140s = false;
        this.f11142u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f11137p != null) {
                    if (ATSplashPopView.this.f11138q == 0) {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f11139r.removeCallbacks(ATSplashPopView.this.f11142u);
                        if (ATSplashPopView.this.f11131i != null) {
                            ATSplashPopView.this.f11131i.b();
                            return;
                        }
                        return;
                    }
                    ATSplashPopView.j(ATSplashPopView.this);
                    ATSplashPopView.this.f11137p.setText(String.valueOf(ATSplashPopView.this.f11138q));
                    ATSplashPopView.this.f11139r.postDelayed(ATSplashPopView.this.f11142u, 1000L);
                }
            }
        };
        this.f11126a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f11131i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f11130h);
                }
            }
        };
        this.f11127b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f11138q <= 0 && ATSplashPopView.this.f11131i != null) {
                    ATSplashPopView.this.f11131i.b();
                }
            }
        };
        this.f11129g = 1;
        o.b(f11124c, "Please call setPopViewType() to init.");
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11129g = 1;
        this.f11138q = -1;
        this.f11139r = new Handler();
        this.f11140s = false;
        this.f11142u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f11137p != null) {
                    if (ATSplashPopView.this.f11138q == 0) {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f11139r.removeCallbacks(ATSplashPopView.this.f11142u);
                        if (ATSplashPopView.this.f11131i != null) {
                            ATSplashPopView.this.f11131i.b();
                            return;
                        }
                        return;
                    }
                    ATSplashPopView.j(ATSplashPopView.this);
                    ATSplashPopView.this.f11137p.setText(String.valueOf(ATSplashPopView.this.f11138q));
                    ATSplashPopView.this.f11139r.postDelayed(ATSplashPopView.this.f11142u, 1000L);
                }
            }
        };
        this.f11126a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f11131i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f11130h);
                }
            }
        };
        this.f11127b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f11138q <= 0 && ATSplashPopView.this.f11131i != null) {
                    ATSplashPopView.this.f11131i.b();
                }
            }
        };
        this.f11129g = 1;
        o.b(f11124c, "Please call setPopViewType() to init.");
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f11129g = 1;
        this.f11138q = -1;
        this.f11139r = new Handler();
        this.f11140s = false;
        this.f11142u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f11137p != null) {
                    if (ATSplashPopView.this.f11138q == 0) {
                        ATSplashPopView.e(ATSplashPopView.this);
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.f11139r.removeCallbacks(ATSplashPopView.this.f11142u);
                        if (ATSplashPopView.this.f11131i != null) {
                            ATSplashPopView.this.f11131i.b();
                            return;
                        }
                        return;
                    }
                    ATSplashPopView.j(ATSplashPopView.this);
                    ATSplashPopView.this.f11137p.setText(String.valueOf(ATSplashPopView.this.f11138q));
                    ATSplashPopView.this.f11139r.postDelayed(ATSplashPopView.this.f11142u, 1000L);
                }
            }
        };
        this.f11126a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f11131i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.f11130h);
                }
            }
        };
        this.f11127b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f11138q <= 0 && ATSplashPopView.this.f11131i != null) {
                    ATSplashPopView.this.f11131i.b();
                }
            }
        };
        this.f11129g = 1;
        o.b(f11124c, "Please call setPopViewType() to init.");
    }

    private void b(c cVar) {
        d dVar = this.f11131i;
        if (dVar != null) {
            dVar.a(cVar);
            this.f11131i.b();
        }
    }
}
