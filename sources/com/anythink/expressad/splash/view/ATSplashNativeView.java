package com.anythink.expressad.splash.view;

import a3.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.k.l;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.shake.MBShakeView;
import com.anythink.expressad.widget.FeedBackButton;

/* loaded from: classes.dex */
public class ATSplashNativeView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11089a = "MBSplashNativeView";
    private int A;
    private int B;
    private float C;
    private float D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private String J;
    private String K;
    private ATSplashView L;
    private c M;
    private MBShakeView N;
    private String O;
    private String P;
    private String Q;
    private com.anythink.expressad.shake.b R;

    /* renamed from: b, reason: collision with root package name */
    private MBNoRecycledCrashImageView f11090b;

    /* renamed from: c, reason: collision with root package name */
    private MBNoRecycledCrashImageView f11091c;

    /* renamed from: d, reason: collision with root package name */
    private RelativeLayout f11092d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f11093e;
    private FeedBackButton f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f11094g;

    /* renamed from: h, reason: collision with root package name */
    private RelativeLayout f11095h;

    /* renamed from: i, reason: collision with root package name */
    private MBNoRecycledCrashImageView f11096i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f11097j;

    /* renamed from: k, reason: collision with root package name */
    private MBNoRecycledCrashImageView f11098k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f11099l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f11100m;

    /* renamed from: n, reason: collision with root package name */
    private RelativeLayout f11101n;
    private TextView o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f11102p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f11103q;

    /* renamed from: r, reason: collision with root package name */
    private MBSplashClickView f11104r;

    /* renamed from: s, reason: collision with root package name */
    private int f11105s;

    /* renamed from: t, reason: collision with root package name */
    private int f11106t;

    /* renamed from: u, reason: collision with root package name */
    private int f11107u;

    /* renamed from: v, reason: collision with root package name */
    private int f11108v;

    /* renamed from: w, reason: collision with root package name */
    private int f11109w;

    /* renamed from: x, reason: collision with root package name */
    private int f11110x;
    private int y;

    /* renamed from: z, reason: collision with root package name */
    private int f11111z;

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements com.anythink.expressad.foundation.g.d.c {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    if (bitmap.getWidth() >= bitmap.getHeight()) {
                        if (ATSplashNativeView.this.A == 1) {
                            ATSplashNativeView.this.f11095h.setVisibility(0);
                            try {
                                Bitmap a10 = n.a(bitmap, t.b(com.anythink.core.common.b.n.a().g(), 10.0f));
                                if (a10 != null && !a10.isRecycled()) {
                                    ATSplashNativeView.this.f11098k.setScaleType(ImageView.ScaleType.FIT_XY);
                                    ATSplashNativeView.this.f11098k.setImageBitmap(a10);
                                }
                            } catch (Throwable th) {
                                try {
                                    o.d(ATSplashNativeView.f11089a, th.getMessage());
                                    ATSplashNativeView.this.f11098k.setImageBitmap(bitmap);
                                } catch (Throwable th2) {
                                    o.d(ATSplashNativeView.f11089a, th2.getMessage());
                                }
                            }
                            ATSplashNativeView.this.f11097j.setText(ATSplashNativeView.this.M.bb());
                            ATSplashNativeView.h(ATSplashNativeView.this);
                            try {
                                try {
                                    Bitmap b10 = n.b(bitmap);
                                    if (b10 != null && !b10.isRecycled()) {
                                        ATSplashNativeView.this.f11091c.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        ATSplashNativeView.this.f11091c.setImageBitmap(b10);
                                    }
                                } catch (Throwable th3) {
                                    o.d(ATSplashNativeView.f11089a, th3.getMessage());
                                }
                            } catch (Throwable unused) {
                                ATSplashNativeView.this.f11091c.setImageBitmap(bitmap);
                            }
                        } else {
                            ATSplashNativeView.this.f11095h.setVisibility(4);
                            ATSplashNativeView.this.f11091c.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            ATSplashNativeView.this.f11091c.setImageBitmap(bitmap);
                        }
                    } else {
                        ATSplashNativeView.a(ATSplashNativeView.this);
                        ATSplashNativeView.this.f11095h.setVisibility(4);
                        ATSplashNativeView.this.f11091c.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        ATSplashNativeView.this.f11091c.setImageBitmap(bitmap);
                    }
                    try {
                        Bitmap b11 = n.b(bitmap);
                        if (b11 == null || b11.isRecycled()) {
                            return;
                        }
                        ATSplashNativeView.this.f11090b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        ATSplashNativeView.this.f11090b.setImageBitmap(b11);
                    } catch (Throwable unused2) {
                        ATSplashNativeView.this.f11091c.setImageBitmap(bitmap);
                    }
                } catch (Throwable th4) {
                    o.d(ATSplashNativeView.f11089a, th4.getMessage());
                }
            }
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass10 implements View.OnClickListener {
        public AnonymousClass10() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (ATSplashNativeView.this.G) {
                if (ATSplashNativeView.this.L.getSplashJSBridgeImpl() != null && ATSplashNativeView.this.L.getSplashJSBridgeImpl().getSplashBridgeListener() != null) {
                    ATSplashNativeView.this.L.getSplashJSBridgeImpl().getSplashBridgeListener().c();
                }
                ATSplashNativeView.this.f11094g.setVisibility(4);
                ATSplashNativeView.this.f11094g.setEnabled(false);
            }
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass11 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass11() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            ATSplashNativeView.this.I = true;
            ATSplashNativeView.b(ATSplashNativeView.this, false);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            ATSplashNativeView.this.I = false;
            ATSplashNativeView.b(ATSplashNativeView.this, true);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            ATSplashNativeView.this.I = false;
            ATSplashNativeView.b(ATSplashNativeView.this, true);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ATSplashNativeView.a(ATSplashNativeView.this, 0);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 extends com.anythink.expressad.shake.b {
        public AnonymousClass3(int i10, int i11) {
            super(i10, i11);
        }

        @Override // com.anythink.expressad.shake.b
        public final void a() {
            if (ATSplashNativeView.this.I || ATSplashNativeView.this.H) {
                return;
            }
            ATSplashNativeView.a(ATSplashNativeView.this, 4);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public AnonymousClass6() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ATSplashNativeView.a(ATSplashNativeView.this, 1);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ATSplashNativeView.a(ATSplashNativeView.this, 0);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass8 implements View.OnClickListener {
        public AnonymousClass8() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (ATSplashNativeView.this.M.aG() != null) {
                String c10 = ATSplashNativeView.this.M.aG().c();
                if (!TextUtils.isEmpty(c10)) {
                    l.b(ATSplashNativeView.this.getContext(), c10);
                }
            }
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public AnonymousClass9() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.anythink.expressad.foundation.d.a aG = ATSplashNativeView.this.M.aG();
            if (aG != null) {
                l.b(com.anythink.core.common.b.n.a().g(), aG.a());
            }
        }
    }

    public ATSplashNativeView(Context context) {
        super(context);
        this.H = false;
        this.I = false;
    }

    public static /* synthetic */ boolean a(ATSplashNativeView aTSplashNativeView) {
        aTSplashNativeView.F = true;
        return true;
    }

    private void h() {
        if (this.f11107u == 1) {
            setOnClickListener(new AnonymousClass6());
        } else {
            this.f11104r.setOnClickListener(new AnonymousClass7());
        }
        this.f11102p.setOnClickListener(new AnonymousClass8());
        this.f11103q.setOnClickListener(new AnonymousClass9());
        this.f11094g.setOnClickListener(new AnonymousClass10());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f11110x == 1 && this.N != null && this.R != null) {
                com.anythink.expressad.shake.a.a().a(this.R);
            }
        } catch (Throwable th) {
            o.d(f11089a, th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.C = motionEvent.getRawX();
        this.D = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void release() {
        try {
            if (this.R != null) {
                com.anythink.expressad.shake.a.a().b(this.R);
                this.R = null;
            }
            com.anythink.expressad.foundation.f.b.a().c(this.J);
            detachAllViewsFromParent();
        } catch (Exception e10) {
            o.d(f11089a, e10.getMessage());
        }
    }

    public void setIsPause(boolean z10) {
        this.H = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        this.f11092d.setPadding(i10, i12, i11, i13);
    }

    public void updateCountDown(int i10) {
        String str;
        if (this.f11094g != null) {
            this.f11106t = i10;
            if (this.G) {
                str = this.P + " " + i10 + this.O;
            } else {
                str = i10 + this.O + " " + this.Q;
            }
            this.f11094g.setText(str);
        }
    }

    private void b() {
        try {
            this.E = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.f11379ac);
        } catch (Throwable th) {
            o.d(f11089a, th.getMessage());
        }
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            this.M.l(this.J);
            com.anythink.expressad.foundation.f.b.a().a(this.J, new AnonymousClass11());
            com.anythink.expressad.foundation.f.b.a().a(this.J, this.f);
            com.anythink.expressad.foundation.f.b.a().a(this.J, this.M);
        } else {
            FeedBackButton feedBackButton = this.f;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(this.M.be())) {
            k.f().a(this.M.be(), new AnonymousClass1());
        } else {
            this.f11091c.setVisibility(4);
        }
        e();
        if (this.M.aG() != null && this.f11109w == 0) {
            com.anythink.expressad.foundation.d.a aG = this.M.aG();
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j("应用名称：");
            j10.append(aG.b());
            j10.append("\n版本：");
            j10.append(aG.e());
            j10.append("\n开发者：");
            j10.append(aG.f());
            j10.append("\n更新时间：");
            j10.append(aG.d());
            this.o.setText(j10);
        } else {
            this.f11101n.setVisibility(8);
        }
        if (this.f11108v == 1) {
            this.f11104r.setVisibility(8);
        } else if (this.f11110x == 1) {
            this.f11104r.setVisibility(8);
        } else {
            this.f11104r.initView(this.M.cU);
        }
        if (this.f11107u == 1) {
            setOnClickListener(new AnonymousClass6());
        } else {
            this.f11104r.setOnClickListener(new AnonymousClass7());
        }
        this.f11102p.setOnClickListener(new AnonymousClass8());
        this.f11103q.setOnClickListener(new AnonymousClass9());
        this.f11094g.setOnClickListener(new AnonymousClass10());
        if (this.f11110x == 1) {
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.N = mBShakeView;
            mBShakeView.initView(this.M.cU);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.N.setLayoutParams(layoutParams);
            addView(this.N);
            this.f11104r.setVisibility(4);
            this.f11104r.setEnabled(false);
            this.N.setOnClickListener(new AnonymousClass2());
            this.R = new AnonymousClass3(this.y, this.f11111z * 1000);
        }
        updateCountDown(this.f11105s);
    }

    private void c() {
        if (!TextUtils.isEmpty(this.M.be())) {
            k.f().a(this.M.be(), new AnonymousClass1());
        } else {
            this.f11091c.setVisibility(4);
        }
    }

    private void d() {
        if (!TextUtils.isEmpty(this.M.bd())) {
            k.f().a(this.M.bd(), new AnonymousClass4());
        } else {
            this.f11096i.setVisibility(4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e() {
        /*
            r7 = this;
            com.anythink.expressad.foundation.b.a r0 = com.anythink.expressad.foundation.b.a.b()
            r0.e()
            com.anythink.expressad.d.b.a()
            com.anythink.expressad.d.a r0 = com.anythink.expressad.d.b.b()
            r1 = 8
            if (r0 == 0) goto L2c
            java.lang.String r0 = r0.J()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L21
            android.widget.ImageView r2 = r7.f11093e
            r2.setVisibility(r1)
        L21:
            android.widget.ImageView r1 = r7.f11093e
            com.anythink.expressad.splash.view.ATSplashNativeView$5 r2 = new com.anythink.expressad.splash.view.ATSplashNativeView$5
            r2.<init>()
            r1.setOnClickListener(r2)
            goto L31
        L2c:
            android.widget.ImageView r0 = r7.f11093e
            r0.setVisibility(r1)
        L31:
            android.content.Context r0 = r7.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "anythink_splash_m_circle"
            java.lang.String r2 = "drawable"
            int r0 = com.anythink.expressad.foundation.h.i.a(r0, r1, r2)
            r1 = 0
            android.content.res.Resources r2 = r7.getResources()     // Catch: java.lang.Throwable -> L63
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)     // Catch: java.lang.Throwable -> L63
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L61
            r3 = 1092616192(0x41200000, float:10.0)
            int r2 = com.anythink.expressad.foundation.h.t.b(r2, r3)     // Catch: java.lang.Throwable -> L61
            android.content.Context r4 = r7.getContext()     // Catch: java.lang.Throwable -> L61
            int r3 = com.anythink.expressad.foundation.h.t.b(r4, r3)     // Catch: java.lang.Throwable -> L61
            r4 = 0
            r0.setBounds(r4, r4, r2, r3)     // Catch: java.lang.Throwable -> L61
            goto L6e
        L61:
            r2 = move-exception
            goto L65
        L63:
            r2 = move-exception
            r0 = r1
        L65:
            java.lang.String r3 = "MBSplashNativeView"
            java.lang.String r2 = r2.getMessage()
            com.anythink.expressad.foundation.h.o.d(r3, r2)
        L6e:
            int r2 = r7.A
            r3 = 1
            r4 = 4
            java.lang.String r5 = "AD"
            java.lang.String r6 = "广告"
            if (r2 != r3) goto L98
            boolean r2 = r7.F
            if (r2 == 0) goto L98
            int r2 = r7.B
            if (r2 == 0) goto L87
            if (r0 == 0) goto L87
            android.widget.TextView r2 = r7.f11100m
            r2.setCompoundDrawables(r0, r1, r1, r1)
        L87:
            android.widget.TextView r0 = r7.f11100m
            boolean r1 = r7.E
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            r5 = r6
        L8f:
            r0.setText(r5)
            android.widget.TextView r0 = r7.f11099l
            r0.setVisibility(r4)
            return
        L98:
            int r2 = r7.B
            if (r2 == 0) goto La3
            if (r0 == 0) goto La3
            android.widget.TextView r2 = r7.f11099l
            r2.setCompoundDrawables(r0, r1, r1, r1)
        La3:
            android.widget.TextView r0 = r7.f11099l
            boolean r1 = r7.E
            if (r1 == 0) goto Laa
            goto Lab
        Laa:
            r5 = r6
        Lab:
            r0.setText(r5)
            android.widget.TextView r0 = r7.f11100m
            r0.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.splash.view.ATSplashNativeView.e():void");
    }

    private void f() {
        if (this.M.aG() != null && this.f11109w == 0) {
            com.anythink.expressad.foundation.d.a aG = this.M.aG();
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j("应用名称：");
            j10.append(aG.b());
            j10.append("\n版本：");
            j10.append(aG.e());
            j10.append("\n开发者：");
            j10.append(aG.f());
            j10.append("\n更新时间：");
            j10.append(aG.d());
            this.o.setText(j10);
            return;
        }
        this.f11101n.setVisibility(8);
    }

    private void g() {
        if (this.f11108v == 1) {
            this.f11104r.setVisibility(8);
        } else if (this.f11110x == 1) {
            this.f11104r.setVisibility(8);
        } else {
            this.f11104r.initView(this.M.cU);
        }
    }

    private void i() {
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            this.M.l(this.J);
            com.anythink.expressad.foundation.f.b.a().a(this.J, new AnonymousClass11());
            com.anythink.expressad.foundation.f.b.a().a(this.J, this.f);
            com.anythink.expressad.foundation.f.b.a().a(this.J, this.M);
            return;
        }
        FeedBackButton feedBackButton = this.f;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    private void j() {
        if (this.f11110x == 1) {
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.N = mBShakeView;
            mBShakeView.initView(this.M.cU);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.N.setLayoutParams(layoutParams);
            addView(this.N);
            this.f11104r.setVisibility(4);
            this.f11104r.setEnabled(false);
            this.N.setOnClickListener(new AnonymousClass2());
            this.R = new AnonymousClass3(this.y, this.f11111z * 1000);
        }
    }

    private void a() {
        int a10;
        try {
            if (this.A == 1) {
                a10 = i.a(getContext().getApplicationContext(), "anythink_splash_portrait", "layout");
            } else {
                a10 = i.a(getContext().getApplicationContext(), "anythink_splash_landscape", "layout");
            }
            View inflate = LayoutInflater.from(getContext()).inflate(a10, (ViewGroup) null);
            addView(inflate);
            this.f11090b = (MBNoRecycledCrashImageView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_iv_image_bg", "id"));
            this.f11091c = (MBNoRecycledCrashImageView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_iv_image", "id"));
            this.f11092d = (RelativeLayout) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_topcontroller", "id"));
            this.f11093e = (ImageView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_iv_link", "id"));
            this.f = (FeedBackButton) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_feedback", "id"));
            this.f11094g = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_skip", "id"));
            this.f11095h = (RelativeLayout) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_landscape_foreground", "id"));
            this.f11096i = (MBNoRecycledCrashImageView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_iv_icon", "id"));
            this.f11097j = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_title", "id"));
            this.f11098k = (MBNoRecycledCrashImageView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_iv_foregroundimage", "id"));
            this.f11099l = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_adrect", "id"));
            this.f11101n = (RelativeLayout) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_layout_appinfo", "id"));
            this.o = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_appinfo", "id"));
            this.f11102p = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_privacy", "id"));
            this.f11103q = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_permission", "id"));
            this.f11104r = (MBSplashClickView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_click", "id"));
            this.f11100m = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_adcircle", "id"));
            int a11 = i.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip", i.f10128g);
            int a12 = i.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_not", i.f10128g);
            int a13 = i.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_s", i.f10128g);
            this.P = getContext().getResources().getString(a11);
            this.Q = getContext().getResources().getString(a12);
            this.O = getContext().getResources().getString(a13);
        } catch (Throwable th) {
            o.d(f11089a, th.getMessage());
        }
    }

    public ATSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATSplashNativeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.H = false;
        this.I = false;
    }

    public static /* synthetic */ void h(ATSplashNativeView aTSplashNativeView) {
        if (!TextUtils.isEmpty(aTSplashNativeView.M.bd())) {
            k.f().a(aTSplashNativeView.M.bd(), new AnonymousClass4());
        } else {
            aTSplashNativeView.f11096i.setVisibility(4);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements com.anythink.expressad.foundation.g.d.c {
        public AnonymousClass4() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            Bitmap a10;
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    try {
                        if (ATSplashNativeView.this.f11096i == null || (a10 = n.a(bitmap, t.b(com.anythink.core.common.b.n.a().g(), 40.0f))) == null || a10.isRecycled()) {
                            return;
                        }
                        ATSplashNativeView.this.f11096i.setImageBitmap(a10);
                    } catch (Throwable th) {
                        o.d(ATSplashNativeView.f11089a, th.getMessage());
                        ATSplashNativeView.this.f11096i.setImageBitmap(bitmap);
                    }
                } catch (Throwable th2) {
                    o.d(ATSplashNativeView.f11089a, th2.getMessage());
                }
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            ATSplashNativeView.this.f11096i.setVisibility(4);
        }
    }

    public ATSplashNativeView(Context context, ATSplashView aTSplashView, com.anythink.expressad.splash.a.b bVar) {
        super(context);
        int a10;
        this.H = false;
        this.I = false;
        if (bVar != null) {
            this.J = bVar.b();
            this.K = bVar.a();
            this.M = bVar.c();
            this.L = aTSplashView;
            this.f11105s = bVar.e();
            this.f11108v = bVar.f();
            this.f11107u = bVar.g();
            this.f11109w = bVar.h();
            this.f11110x = bVar.i();
            this.y = bVar.j();
            this.f11111z = bVar.k();
            this.A = bVar.l();
            this.G = bVar.d();
            this.B = bVar.m();
            try {
                if (this.A == 1) {
                    a10 = i.a(getContext().getApplicationContext(), "anythink_splash_portrait", "layout");
                } else {
                    a10 = i.a(getContext().getApplicationContext(), "anythink_splash_landscape", "layout");
                }
                View inflate = LayoutInflater.from(getContext()).inflate(a10, (ViewGroup) null);
                addView(inflate);
                this.f11090b = (MBNoRecycledCrashImageView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_iv_image_bg", "id"));
                this.f11091c = (MBNoRecycledCrashImageView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_iv_image", "id"));
                this.f11092d = (RelativeLayout) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_topcontroller", "id"));
                this.f11093e = (ImageView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_iv_link", "id"));
                this.f = (FeedBackButton) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_feedback", "id"));
                this.f11094g = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_skip", "id"));
                this.f11095h = (RelativeLayout) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_landscape_foreground", "id"));
                this.f11096i = (MBNoRecycledCrashImageView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_iv_icon", "id"));
                this.f11097j = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_title", "id"));
                this.f11098k = (MBNoRecycledCrashImageView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_iv_foregroundimage", "id"));
                this.f11099l = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_adrect", "id"));
                this.f11101n = (RelativeLayout) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_layout_appinfo", "id"));
                this.o = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_appinfo", "id"));
                this.f11102p = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_privacy", "id"));
                this.f11103q = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_permission", "id"));
                this.f11104r = (MBSplashClickView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_click", "id"));
                this.f11100m = (TextView) inflate.findViewById(i.a(getContext().getApplicationContext(), "anythink_splash_tv_adcircle", "id"));
                int a11 = i.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip", i.f10128g);
                int a12 = i.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_not", i.f10128g);
                int a13 = i.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_s", i.f10128g);
                this.P = getContext().getResources().getString(a11);
                this.Q = getContext().getResources().getString(a12);
                this.O = getContext().getResources().getString(a13);
            } catch (Throwable th) {
                o.d(f11089a, th.getMessage());
            }
            try {
                this.E = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.f11379ac);
            } catch (Throwable th2) {
                o.d(f11089a, th2.getMessage());
            }
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                this.M.l(this.J);
                com.anythink.expressad.foundation.f.b.a().a(this.J, new AnonymousClass11());
                com.anythink.expressad.foundation.f.b.a().a(this.J, this.f);
                com.anythink.expressad.foundation.f.b.a().a(this.J, this.M);
            } else {
                FeedBackButton feedBackButton = this.f;
                if (feedBackButton != null) {
                    feedBackButton.setVisibility(8);
                }
            }
            if (!TextUtils.isEmpty(this.M.be())) {
                k.f().a(this.M.be(), new AnonymousClass1());
            } else {
                this.f11091c.setVisibility(4);
            }
            e();
            if (this.M.aG() != null && this.f11109w == 0) {
                com.anythink.expressad.foundation.d.a aG = this.M.aG();
                StringBuilder j10 = com.ironsource.adapters.facebook.a.j("应用名称：");
                j10.append(aG.b());
                j10.append("\n版本：");
                j10.append(aG.e());
                j10.append("\n开发者：");
                j10.append(aG.f());
                j10.append("\n更新时间：");
                j10.append(aG.d());
                this.o.setText(j10);
            } else {
                this.f11101n.setVisibility(8);
            }
            if (this.f11108v == 1) {
                this.f11104r.setVisibility(8);
            } else if (this.f11110x == 1) {
                this.f11104r.setVisibility(8);
            } else {
                this.f11104r.initView(this.M.cU);
            }
            if (this.f11107u == 1) {
                setOnClickListener(new AnonymousClass6());
            } else {
                this.f11104r.setOnClickListener(new AnonymousClass7());
            }
            this.f11102p.setOnClickListener(new AnonymousClass8());
            this.f11103q.setOnClickListener(new AnonymousClass9());
            this.f11094g.setOnClickListener(new AnonymousClass10());
            if (this.f11110x == 1) {
                MBShakeView mBShakeView = new MBShakeView(getContext());
                this.N = mBShakeView;
                mBShakeView.initView(this.M.cU);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(13);
                this.N.setLayoutParams(layoutParams);
                addView(this.N);
                this.f11104r.setVisibility(4);
                this.f11104r.setEnabled(false);
                this.N.setOnClickListener(new AnonymousClass2());
                this.R = new AnonymousClass3(this.y, this.f11111z * 1000);
            }
            updateCountDown(this.f11105s);
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    private void a(int i10) {
        if (this.L.getSplashJSBridgeImpl() == null || this.L.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        try {
            this.L.getSplashJSBridgeImpl().getSplashBridgeListener().a(com.anythink.expressad.splash.a.a.a.a(com.anythink.expressad.splash.a.a.a.a(i10, this.C, this.D), this.M));
        } catch (Throwable th) {
            o.d(f11089a, th.getMessage());
            this.L.getSplashJSBridgeImpl().getSplashBridgeListener().a(this.M);
        }
    }

    private void a(boolean z10) {
        if (this.L.getSplashJSBridgeImpl() == null || this.L.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        this.L.getSplashJSBridgeImpl().getSplashBridgeListener().a(z10 ? 2 : 1, this.f11106t);
    }

    public static /* synthetic */ void a(ATSplashNativeView aTSplashNativeView, int i10) {
        if (aTSplashNativeView.L.getSplashJSBridgeImpl() == null || aTSplashNativeView.L.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        try {
            aTSplashNativeView.L.getSplashJSBridgeImpl().getSplashBridgeListener().a(com.anythink.expressad.splash.a.a.a.a(com.anythink.expressad.splash.a.a.a.a(i10, aTSplashNativeView.C, aTSplashNativeView.D), aTSplashNativeView.M));
        } catch (Throwable th) {
            o.d(f11089a, th.getMessage());
            aTSplashNativeView.L.getSplashJSBridgeImpl().getSplashBridgeListener().a(aTSplashNativeView.M);
        }
    }

    public static /* synthetic */ void b(ATSplashNativeView aTSplashNativeView, boolean z10) {
        if (aTSplashNativeView.L.getSplashJSBridgeImpl() == null || aTSplashNativeView.L.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        aTSplashNativeView.L.getSplashJSBridgeImpl().getSplashBridgeListener().a(z10 ? 2 : 1, aTSplashNativeView.f11106t);
    }
}
