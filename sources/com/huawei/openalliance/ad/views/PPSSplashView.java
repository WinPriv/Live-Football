package com.huawei.openalliance.ad.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.hardware.SensorManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.ads.cj;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.dq;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fo;
import com.huawei.hms.ads.fp;
import com.huawei.hms.ads.fs;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.id;
import com.huawei.hms.ads.ip;
import com.huawei.hms.ads.jb;
import com.huawei.hms.ads.jf;
import com.huawei.hms.ads.ka;
import com.huawei.hms.ads.kc;
import com.huawei.hms.ads.km;
import com.huawei.hms.ads.ko;
import com.huawei.hms.ads.reward.RewardVerifyConfig;
import com.huawei.hms.ads.splash.R;
import com.huawei.hms.ads.splash.SplashView;
import com.huawei.openalliance.ad.beans.metadata.InteractCfg;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import fa.g;
import gb.h0;
import gb.m;
import gb.r0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PPSSplashView extends RelativeLayout implements ka, km {
    private PPSSplashSwipeView A;
    protected ec B;
    protected long C;
    SloganView Code;
    private View D;
    private PPSSplashTwistView E;
    private AdSlotParam F;
    private PPSSplashSwipeClickView G;
    private PPSSplashTwistClickView H;
    PPSSkipButton I;
    private e J;
    private AdContentData K;
    private int L;
    RelativeLayout V;

    /* renamed from: a, reason: collision with root package name */
    private PPSWLSView f23965a;

    /* renamed from: b, reason: collision with root package name */
    private PPSSplashAdSourceView f23966b;

    /* renamed from: c, reason: collision with root package name */
    private fs f23967c;

    /* renamed from: d, reason: collision with root package name */
    private jb f23968d;

    /* renamed from: e, reason: collision with root package name */
    private ga.b f23969e;
    private ga.a f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23970g;

    /* renamed from: h, reason: collision with root package name */
    private int f23971h;

    /* renamed from: i, reason: collision with root package name */
    private Bitmap f23972i;

    /* renamed from: j, reason: collision with root package name */
    private View f23973j;

    /* renamed from: k, reason: collision with root package name */
    private kc f23974k;

    /* renamed from: l, reason: collision with root package name */
    private int f23975l;

    /* renamed from: m, reason: collision with root package name */
    private String f23976m;

    /* renamed from: n, reason: collision with root package name */
    private int f23977n;
    private int o;

    /* renamed from: p, reason: collision with root package name */
    private int f23978p;

    /* renamed from: q, reason: collision with root package name */
    private int f23979q;

    /* renamed from: r, reason: collision with root package name */
    private int f23980r;

    /* renamed from: s, reason: collision with root package name */
    private int f23981s;

    /* renamed from: t, reason: collision with root package name */
    private View f23982t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f23983u;

    /* renamed from: v, reason: collision with root package name */
    private int f23984v;

    /* renamed from: w, reason: collision with root package name */
    private final String f23985w;

    /* renamed from: x, reason: collision with root package name */
    private int f23986x;
    private RewardVerifyConfig y;

    /* renamed from: z, reason: collision with root package name */
    private PPSSplashProView f23987z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSSplashView.this.S();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSSplashView.this.D();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSSplashView pPSSplashView = PPSSplashView.this;
            if (pPSSplashView.I != null) {
                ex.Code("PPSSplashView", "skip btn show");
                pPSSplashView.I.setVisibility(0);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements View.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<PPSSplashView> f23991s;

        /* renamed from: t, reason: collision with root package name */
        public final AdContentData f23992t;

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ PPSSplashView f23993s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ int[] f23994t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ int[] f23995u;

            public a(PPSSplashView pPSSplashView, int[] iArr, int[] iArr2) {
                this.f23993s = pPSSplashView;
                this.f23994t = iArr;
                this.f23995u = iArr2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f23993s.Code(d.this.f23992t, this.f23994t, this.f23995u);
            }
        }

        public d(PPSSplashView pPSSplashView, AdContentData adContentData) {
            this.f23991s = new WeakReference<>(pPSSplashView);
            this.f23992t = adContentData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10;
            PPSSplashView pPSSplashView = this.f23991s.get();
            if (pPSSplashView != null) {
                int[] choiceViewLoc = pPSSplashView.f23965a.getChoiceViewLoc();
                int[] choiceViewSize = pPSSplashView.f23965a.getChoiceViewSize();
                boolean z11 = true;
                if (choiceViewLoc != null && choiceViewLoc.length == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (choiceViewSize == null || choiceViewSize.length != 2) {
                        z11 = false;
                    }
                    if (z11) {
                        gb.w.b(new a(pPSSplashView, choiceViewLoc, choiceViewSize));
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements g.b {
        public e() {
        }

        @Override // fa.g.b
        public final void Code() {
            ex.V("PPSSplashView", "onStart");
            PPSSplashView.this.d();
        }
    }

    public PPSSplashView(Context context) {
        super(context);
        this.L = 8;
        this.f23970g = false;
        this.f23975l = 0;
        this.f23977n = 0;
        this.o = 1;
        this.f23978p = 0;
        this.f23979q = 0;
        this.f23980r = 0;
        this.f23981s = 0;
        this.f23983u = true;
        this.f23984v = 0;
        this.f23985w = "skip_btn_delay_id_" + hashCode();
        Code(context);
    }

    private void B() {
        String concat;
        int j10;
        int i10;
        int i11;
        int i12;
        View view;
        try {
            if (this.f23973j == null) {
                View inflate = ((ViewStub) findViewById(R.id.hiad_logo_stub)).inflate();
                this.f23973j = inflate;
                inflate.setId(R.id.hiad_full_logo_region);
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f23973j.getLayoutParams();
            if (1 == this.F.v()) {
                L();
                if (this.f23978p > 0) {
                    ex.Code("PPSSplashView", "left: %s, top: %s, right: %s", Integer.valueOf(layoutParams.leftMargin), Integer.valueOf(layoutParams.topMargin), Integer.valueOf(layoutParams.rightMargin));
                    layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin + this.f23978p, layoutParams.rightMargin, layoutParams.bottomMargin);
                    view = this.f23973j;
                }
                D();
                S();
            }
            ex.V("PPSSplashView", "showFullModeLogo, orientation: %s, leftNotchHeight: %s", Integer.valueOf(this.F.v()), Integer.valueOf(this.f23979q));
            ex.Code("PPSSplashView", "left:%s, top:%s, right:%s, leftNotchHeight:%s", Integer.valueOf(layoutParams.leftMargin), Integer.valueOf(layoutParams.topMargin), Integer.valueOf(layoutParams.rightMargin), Integer.valueOf(this.f23979q));
            if (!cl.V(getContext()) || this.f23979q <= 0) {
                if (!cl.V(getContext()) || (cl.V(getContext()) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 && !h0.a(getContext()))) {
                    if (layoutParams.isMarginRelative()) {
                        layoutParams.setMarginStart(gb.u.j(getContext()));
                    } else {
                        j10 = gb.u.j(getContext());
                        i10 = layoutParams.topMargin;
                        i11 = layoutParams.rightMargin;
                        i12 = layoutParams.bottomMargin;
                        layoutParams.setMargins(j10, i10, i11, i12);
                    }
                }
                layoutParams.topMargin += r0.i(getContext(), 12.0f);
                view = this.f23973j;
            } else if (layoutParams.isMarginRelative()) {
                layoutParams.setMarginStart(layoutParams.leftMargin + this.f23979q);
                layoutParams.topMargin += r0.i(getContext(), 12.0f);
                view = this.f23973j;
            } else {
                j10 = layoutParams.leftMargin + this.f23979q;
                i10 = layoutParams.topMargin;
                i11 = layoutParams.rightMargin;
                i12 = layoutParams.bottomMargin;
                layoutParams.setMargins(j10, i10, i11, i12);
                layoutParams.topMargin += r0.i(getContext(), 12.0f);
                view = this.f23973j;
            }
            view.setLayoutParams(layoutParams);
            D();
            S();
        } catch (Resources.NotFoundException unused) {
            concat = "showFullModeLogo res not found";
            ex.I("PPSSplashView", concat);
        } catch (Exception e10) {
            concat = "showFullModeLogo ".concat(e10.getClass().getSimpleName());
            ex.I("PPSSplashView", concat);
        }
    }

    private void C() {
        if (this.f23973j == null) {
            return;
        }
        gb.w.b(new a());
    }

    private PPSSkipButton Code(String str, int i10, String str2, boolean z10, float f, int i11) {
        int i12;
        boolean z11;
        PPSSkipButton pPSSkipButton;
        int v3 = this.F.v();
        int p10 = this.F.p();
        L();
        if (1 == v3) {
            pPSSkipButton = new PPSSkipButton(getContext(), str, v3, p10, i10, str2, z10, this.f23978p, f, i11, false);
        } else {
            ex.V("PPSSplashView", "createSkipAdButton, orientation: %s, leftNotchHeight: %s, rightNotchHeight: %s", Integer.valueOf(v3), Integer.valueOf(this.f23979q), Integer.valueOf(this.f23980r));
            int i13 = this.f23979q;
            if (i13 > 0) {
                z11 = true;
                i12 = i13;
            } else {
                i12 = this.f23980r;
                z11 = false;
            }
            pPSSkipButton = new PPSSkipButton(getContext(), str, v3, p10, i10, str2, z10, i12, f, i11, z11);
        }
        pPSSkipButton.setAdMediator(this.f23967c);
        return pPSSkipButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        View view = this.f23973j;
        if (view == null) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.hiad_full_mode_logo);
        int i10 = this.f23971h;
        if (i10 > 0) {
            imageView.setImageResource(i10);
        } else {
            Bitmap bitmap = this.f23972i;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else {
                imageView.setVisibility(8);
                return;
            }
        }
        imageView.setVisibility(0);
    }

    private void F() {
        if (this.f23973j == null) {
            return;
        }
        gb.w.b(new b());
    }

    private int I(AdContentData adContentData) {
        return (adContentData.G0() == null || adContentData.G0().q() == null) ? this.B.w() : adContentData.G0().q().intValue();
    }

    private void L() {
        if (this.f23978p <= 0 && !cl.Code(getContext().getApplicationContext()).Code(getContext().getApplicationContext())) {
            this.f23978p = r0.q(getContext().getApplicationContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        View view = this.f23973j;
        if (view == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.hiad_media_name);
        int i10 = this.f23975l;
        if (i10 > 0) {
            textView.setText(i10);
        } else {
            String str = this.f23976m;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                return;
            }
        }
        textView.setVisibility(0);
    }

    private String Z(InteractCfg interactCfg) {
        if (interactCfg != null) {
            return interactCfg.L();
        }
        return null;
    }

    private void a() {
        if (this.I != null) {
            ex.Code("PPSSplashView", "%d delay, skip btn show", Integer.valueOf(this.f23984v));
            int i10 = this.f23984v;
            if (i10 > 0) {
                gb.w.c(new c(), this.f23985w, i10);
            } else {
                ex.Code("PPSSplashView", "skip btn show");
                this.I.setVisibility(0);
            }
        }
    }

    private boolean b() {
        Object th;
        boolean z10;
        Boolean bool;
        Boolean bool2;
        if (!this.B.f()) {
            return true;
        }
        Context applicationContext = getContext().getApplicationContext();
        gb.m b10 = gb.m.b(applicationContext);
        try {
            synchronized (b10.f28595b) {
                b10.g();
                m.b bVar = b10.f28596c;
                bool = null;
                if (bVar == null) {
                    bool2 = null;
                } else {
                    bool2 = bVar.f28604x;
                }
            }
            if (bool2 != null) {
                synchronized (b10.f28595b) {
                    b10.g();
                    m.b bVar2 = b10.f28596c;
                    if (bVar2 != null) {
                        bool = bVar2.f28604x;
                    }
                }
                z10 = bool.booleanValue();
            } else {
                if (((SensorManager) applicationContext.getSystemService("sensor")).getDefaultSensor(1) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                try {
                    Boolean valueOf = Boolean.valueOf(z10);
                    synchronized (b10.f28595b) {
                        b10.g();
                        m.b bVar3 = b10.f28596c;
                        if (bVar3 != null) {
                            bVar3.f28604x = valueOf;
                            b10.c(bVar3);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ex.I("DeviceUtil", "getHasAccAndRotate err: %s", th.getClass().getSimpleName());
                    return !z10;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = true;
        }
        return !z10;
    }

    private void c() {
        int y = this.B.y();
        if (y > 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f23987z.getLayoutParams();
            int i10 = r0.i(getContext(), y);
            this.f23987z.setPadding(i10, i10, i10, i10);
            if (layoutParams.isMarginRelative()) {
                layoutParams.setMarginStart(layoutParams.leftMargin - i10);
                layoutParams.setMarginEnd(layoutParams.rightMargin - i10);
            } else {
                layoutParams.setMargins(layoutParams.leftMargin - i10, layoutParams.topMargin, layoutParams.rightMargin - i10, layoutParams.bottomMargin);
            }
            this.f23987z.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f23970g && this.F != null) {
            ex.V("PPSSplashView", " exsplash start, dismiss");
            Z();
        }
    }

    private void setSkipBtnDelayTime(AdContentData adContentData) {
        if (adContentData != null && adContentData.y0() > 0) {
            this.f23984v = adContentData.y0();
        }
    }

    @Override // com.huawei.hms.ads.ka
    public kc V(int i10) {
        if (i10 == 2) {
            return new PPSImageView(getContext());
        }
        if (i10 != 9) {
            return null;
        }
        Context context = getContext();
        int v3 = this.F.v();
        int i11 = this.f23980r;
        if (i11 <= 0) {
            i11 = 0;
        }
        return new PPSVideoView(context, v3, i11, this.F.p());
    }

    public void destroyView() {
        kc kcVar = this.f23974k;
        if (kcVar != null) {
            kcVar.destroyView();
        }
        try {
            PPSSplashProView pPSSplashProView = this.f23987z;
            if (pPSSplashProView != null) {
                pPSSplashProView.b();
            }
            PPSSplashSwipeView pPSSplashSwipeView = this.A;
            if (pPSSplashSwipeView != null) {
                pPSSplashSwipeView.b();
            }
            PPSSplashSwipeClickView pPSSplashSwipeClickView = this.G;
            if (pPSSplashSwipeClickView != null) {
                pPSSplashSwipeClickView.b();
            }
            fa.g.a(getContext().getApplicationContext()).c(this.J);
            fa.g.a(getContext().getApplicationContext()).getClass();
            RelativeLayout relativeLayout = this.V;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable th) {
            ex.V("PPSSplashView", "destroy err: %s", th.getClass().getSimpleName());
        }
        this.f23970g = false;
    }

    public ga.b getAdListener() {
        return this.f23969e;
    }

    public fs getAdMediator() {
        return this.f23967c;
    }

    @Override // com.huawei.hms.ads.ka
    public AdSlotParam getAdSlotParam() {
        return this.F;
    }

    @Override // com.huawei.hms.ads.ka
    public int getAdType() {
        return 1;
    }

    @Override // com.huawei.hms.ads.ka
    public int getAudioFocusType() {
        return this.o;
    }

    public View getLogo() {
        return this.D;
    }

    public Bitmap getLogoBitmap() {
        return this.f23972i;
    }

    public int getLogoResId() {
        return this.f23971h;
    }

    public int getMediaNameResId() {
        return this.f23975l;
    }

    public String getMediaNameString() {
        return this.f23976m;
    }

    public View getSloganView() {
        return this.f23982t;
    }

    public jb getSplashPresenter() {
        return this.f23968d;
    }

    public String getUniqueId() {
        fs fsVar = this.f23967c;
        if (fsVar != null) {
            return fsVar.k();
        }
        return null;
    }

    public boolean isLoaded() {
        fs fsVar = this.f23967c;
        if (fsVar == null || fsVar.V() != com.huawei.openalliance.ad.constant.b.LOADED) {
            return false;
        }
        return true;
    }

    public boolean isLoading() {
        fs fsVar = this.f23967c;
        if (fsVar == null) {
            return this.f23970g;
        }
        if (fsVar.V() == com.huawei.openalliance.ad.constant.b.LOADING) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        r2 = r7.getDisplayCutout();
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
        /*
            r6 = this;
            java.lang.String r0 = "PPSSplashView"
            java.lang.String r1 = "onApplyWindowInsets"
            com.huawei.hms.ads.ex.V(r0, r1)
            int r1 = gb.u.f28631a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            r3 = 0
            if (r1 < r2) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = r3
        L13:
            if (r2 == 0) goto L65
            if (r7 == 0) goto L65
            android.view.DisplayCutout r2 = b0.t.m(r7)
            if (r2 == 0) goto L65
            java.util.List r4 = androidx.appcompat.widget.r.p(r2)
            boolean r5 = androidx.transition.n.h(r4)
            if (r5 != 0) goto L33
            java.lang.Object r3 = r4.get(r3)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            int r3 = r3.height()
            r6.f23978p = r3
        L33:
            int r3 = androidx.appcompat.widget.r.c(r2)
            r6.f23979q = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "notchHeight left:"
            r3.<init>(r4)
            int r4 = r6.f23979q
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.huawei.hms.ads.ex.V(r0, r3)
            int r2 = androidx.appcompat.widget.r.C(r2)
            r6.f23980r = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "notchHeight right:"
            r2.<init>(r3)
            int r3 = r6.f23980r
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.huawei.hms.ads.ex.V(r0, r2)
        L65:
            int r2 = r6.f23978p
            if (r2 > 0) goto L93
            r2 = 26
            if (r1 < r2) goto L93
            android.content.Context r1 = r6.getContext()
            com.huawei.hms.ads.cw r1 = com.huawei.hms.ads.cl.Code(r1)
            android.content.Context r2 = r6.getContext()
            boolean r1 = r1.Code(r2)
            if (r1 == 0) goto L93
            int r1 = r6.f23978p
            android.content.Context r2 = r6.getContext()
            com.huawei.hms.ads.cw r2 = com.huawei.hms.ads.cl.Code(r2)
            int r2 = r2.Code(r6)
            int r1 = java.lang.Math.max(r1, r2)
            r6.f23978p = r1
        L93:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "notchHeight:"
            r1.<init>(r2)
            int r2 = r6.f23978p
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.ads.ex.V(r0, r1)
            android.view.WindowInsets r7 = super.onApplyWindowInsets(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.PPSSplashView.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ex.V("PPSSplashView", "onAttachedToWindow");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gb.w.d(this.f23985w);
        PPSSplashProView pPSSplashProView = this.f23987z;
        if (pPSSplashProView != null) {
            pPSSplashProView.b();
        }
        PPSSplashSwipeView pPSSplashSwipeView = this.A;
        if (pPSSplashSwipeView != null) {
            pPSSplashSwipeView.b();
        }
        PPSSplashSwipeClickView pPSSplashSwipeClickView = this.G;
        if (pPSSplashSwipeClickView != null) {
            pPSSplashSwipeClickView.b();
        }
    }

    public void pauseView() {
        kc kcVar = this.f23974k;
        if (kcVar != null) {
            kcVar.pauseView();
        }
        PPSSplashProView pPSSplashProView = this.f23987z;
        if (pPSSplashProView != null) {
            pPSSplashProView.b();
        }
        PPSSplashSwipeView pPSSplashSwipeView = this.A;
        if (pPSSplashSwipeView != null) {
            pPSSplashSwipeView.b();
        }
        PPSSplashSwipeClickView pPSSplashSwipeClickView = this.G;
        if (pPSSplashSwipeClickView != null) {
            pPSSplashSwipeClickView.b();
        }
    }

    public void resumeView() {
        kc kcVar = this.f23974k;
        if (kcVar != null) {
            kcVar.resumeView();
        }
    }

    public void setAdActionListener(ga.a aVar) {
        fs fsVar = this.f23967c;
        if (fsVar != null) {
            fsVar.Code((ga.a) null);
        }
    }

    public void setAdListener(ga.b bVar) {
        this.f23969e = bVar;
        this.f23968d.Code(bVar);
        fs fsVar = this.f23967c;
        if (fsVar != null) {
            fsVar.Code(bVar);
        }
    }

    public void setAdSlotParam(AdSlotParam adSlotParam) {
        int k10;
        int a10;
        if (!r0.c(getContext())) {
            return;
        }
        Context context = getContext();
        if (adSlotParam.v() == 0) {
            k10 = gb.z.a(context);
        } else {
            k10 = gb.z.k(context);
        }
        Context context2 = getContext();
        if (adSlotParam.v() == 0) {
            a10 = gb.z.k(context2);
        } else {
            a10 = gb.z.a(context2);
        }
        adSlotParam.A(k10);
        adSlotParam.b(a10);
        adSlotParam.r(this.f23986x);
        adSlotParam.t(Integer.valueOf(this.f23981s));
        adSlotParam.i(cj.Code(adSlotParam.a()));
        int i10 = 0;
        adSlotParam.B(0);
        if (!HiAd.c(getContext()).isNewProcess() || !gb.z.g(getContext())) {
            i10 = 1;
        }
        adSlotParam.c(Integer.valueOf(i10));
        this.F = adSlotParam;
        fa.j a11 = fa.j.a(getContext());
        if (a11 instanceof fa.j) {
            a11.getClass();
            adSlotParam.F();
            a11.getClass();
        }
    }

    public void setAudioFocusType(int i10) {
        this.o = i10;
        kc kcVar = this.f23974k;
        if (kcVar != null) {
            kcVar.setAudioFocusType(i10);
        }
    }

    public void setLinkedSupportMode(int i10) {
        this.f23981s = i10;
    }

    public void setLogo(View view) {
        setLogo(view, 8);
    }

    public void setLogoBitmap(Bitmap bitmap) {
        this.f23972i = bitmap;
        this.f23971h = 0;
        F();
    }

    public void setLogoResId(int i10) {
        this.f23971h = i10;
        this.f23972i = null;
        F();
    }

    public void setMediaNameResId(int i10) {
        this.f23975l = i10;
        this.f23976m = null;
        C();
    }

    public void setMediaNameString(String str) {
        this.f23976m = str;
        this.f23975l = 0;
        C();
    }

    public void setRewardVerifyConfig(RewardVerifyConfig rewardVerifyConfig) {
        this.y = rewardVerifyConfig;
    }

    public void setSloganResId(int i10) {
        if (!r0.c(getContext())) {
            return;
        }
        if (I(getContext())) {
            ex.I("PPSSplashView", "setSloganResId - activity finished, not add view");
            return;
        }
        if (this.F == null && !(this instanceof SplashView)) {
            throw new dq("Must invoke SplashAdView's setAdSlotParam method before invoke setSloganResId method");
        }
        if (this.Code == null) {
            SloganView sloganView = new SloganView(getContext(), i10);
            this.Code = sloganView;
            int i11 = this.f23977n;
            if (i11 > 0) {
                sloganView.setWideSloganResId(i11);
            }
            this.V.addView(this.Code, new RelativeLayout.LayoutParams(-1, -1));
            this.Code.setVisibility(8);
        }
    }

    public void setSloganView(View view) {
        if (view != null) {
            this.f23982t = view;
            view.setVisibility(8);
        }
    }

    public void setWideSloganResId(int i10) {
        SloganView sloganView = this.Code;
        if (sloganView != null) {
            sloganView.setWideSloganResId(i10);
        } else {
            this.f23977n = i10;
        }
    }

    public PPSSplashView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = 8;
        this.f23970g = false;
        this.f23975l = 0;
        this.f23977n = 0;
        this.o = 1;
        this.f23978p = 0;
        this.f23979q = 0;
        this.f23980r = 0;
        this.f23981s = 0;
        this.f23983u = true;
        this.f23984v = 0;
        this.f23985w = "skip_btn_delay_id_" + hashCode();
        Code(context);
    }

    private String V(InteractCfg interactCfg) {
        if (interactCfg != null) {
            return interactCfg.r();
        }
        return null;
    }

    private void Z() {
        List<String> f = this.F.f();
        this.f23968d.Code(!androidx.transition.n.h(f) ? f.get(0) : null, 1);
        this.f23968d.S();
        fa.g.a(getContext().getApplicationContext()).getClass();
    }

    @Override // com.huawei.hms.ads.ka
    public Integer Code(AdContentData adContentData) {
        int C = jf.C(adContentData.a1());
        HashMap hashMap = null;
        if (C == 0) {
            return null;
        }
        int I = I(adContentData);
        ex.V("PPSSplashView", "initial mode: %s", Integer.valueOf(I));
        if (I == 0) {
            return Integer.valueOf(I);
        }
        String ah = ec.Code(getContext()).ah();
        Class[] clsArr = gb.b.f28547a;
        if (!TextUtils.isEmpty(ah)) {
            String trim = ah.trim();
            HashMap hashMap2 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(trim);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap2.put(next, jSONObject.get(next).toString().trim());
                }
                hashMap = hashMap2;
            } catch (JSONException unused) {
            }
        }
        if (hashMap != null) {
            if ((2 == I || 3 == I) && Code(gb.p.h((String) hashMap.get(com.huawei.openalliance.ad.constant.w.co)))) {
                I = 4;
            }
            if ((1 == I || 4 == I) && Code(gb.p.h((String) hashMap.get(com.huawei.openalliance.ad.constant.w.f22151cn)))) {
                return 0;
            }
        }
        if (1 != this.F.v() || 2 != C) {
            return 0;
        }
        if (!Z(I) || !b()) {
            return Integer.valueOf(I);
        }
        ex.V("PPSSplashView", "can't use twist, enable : %s", Boolean.valueOf(this.B.f()));
        return 0;
    }

    public void setLogo(View view, int i10) {
        this.D = view;
        view.setVisibility(i10);
        this.L = i10;
    }

    public PPSSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.L = 8;
        this.f23970g = false;
        this.f23975l = 0;
        this.f23977n = 0;
        this.o = 1;
        this.f23978p = 0;
        this.f23979q = 0;
        this.f23980r = 0;
        this.f23981s = 0;
        this.f23983u = true;
        this.f23984v = 0;
        this.f23985w = "skip_btn_delay_id_" + hashCode();
        Code(context);
    }

    private String I(InteractCfg interactCfg) {
        if (interactCfg != null) {
            return interactCfg.D();
        }
        return null;
    }

    private String V(InteractCfg interactCfg, String str) {
        return !TextUtils.isEmpty(str) ? str : (interactCfg == null || interactCfg.a() == null) ? this.B.E() : interactCfg.a();
    }

    private boolean Z(int i10) {
        return 2 == i10 || 3 == i10;
    }

    private String Code(InteractCfg interactCfg) {
        if (interactCfg != null) {
            return interactCfg.v();
        }
        return null;
    }

    @Override // com.huawei.hms.ads.ka
    public void I(int i10) {
        PPSSkipButton pPSSkipButton = this.I;
        if (pPSSkipButton != null) {
            pPSSkipButton.b(i10);
        }
    }

    @Override // com.huawei.hms.ads.ka
    public void V() {
        SloganView sloganView = this.Code;
        if (sloganView != null) {
            sloganView.setVisibility(8);
        }
        View view = this.f23982t;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private String Code(InteractCfg interactCfg, String str) {
        return !TextUtils.isEmpty(str) ? str : (interactCfg == null || interactCfg.a() == null) ? this.B.z() : interactCfg.a();
    }

    private static boolean I(Context context) {
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        return activity.isFinishing() || activity.isDestroyed();
    }

    private String Code(String str) {
        String a10 = gb.y.a(getContext(), this.K, 0);
        return !TextUtils.isEmpty(a10) ? a10 : !TextUtils.isEmpty(this.B.x()) ? this.B.x() : str;
    }

    private void V(Context context) {
        View.inflate(context, R.layout.hiad_view_splash_ad, this);
        this.V = (RelativeLayout) findViewById(R.id.rl_splash_container);
        this.f23965a = (PPSWLSView) findViewById(R.id.splash_wls_view);
        this.f23966b = (PPSSplashAdSourceView) findViewById(R.id.splash_ad_source_view);
        this.f23983u = cl.Code(context).V();
        this.f23987z = (PPSSplashProView) findViewById(R.id.hiad_splash_pro_view);
        this.A = (PPSSplashSwipeView) findViewById(R.id.hiad_splash_swipe_view);
        this.E = (PPSSplashTwistView) findViewById(R.id.hiad_splash_twist_view);
        this.H = (PPSSplashTwistClickView) findViewById(R.id.hiad_splash_twist_click_view);
        this.G = (PPSSplashSwipeClickView) findViewById(R.id.hiad_splash_swipe_click_view);
    }

    private void V(AdContentData adContentData) {
        int i10;
        boolean z10;
        PPSSplashAdSourceView pPSSplashAdSourceView;
        boolean z11;
        int i11;
        boolean z12;
        PPSWLSView pPSWLSView;
        boolean z13;
        if (adContentData != null) {
            int v3 = this.F.v();
            Integer Code = Code(adContentData);
            InteractCfg G0 = adContentData.G0();
            Integer k10 = G0 == null ? null : G0.k();
            L();
            if (!this.f23983u) {
                this.f23965a.setAdMediator(this.f23967c);
                PPSWLSView pPSWLSView2 = this.f23965a;
                pPSWLSView2.f24024x = Code;
                pPSWLSView2.y = k10;
                pPSWLSView2.setVisibility(0);
                if (1 == v3) {
                    pPSWLSView = this.f23965a;
                    z13 = adContentData.b() == 1;
                    i11 = this.f23978p;
                    z12 = false;
                } else {
                    ex.V("PPSSplashView", "showAdLabel, orientation: %s, leftNotchHeight: %s, rightNotchHeight: %s", Integer.valueOf(v3), Integer.valueOf(this.f23979q), Integer.valueOf(this.f23980r));
                    int i12 = this.f23979q;
                    if (i12 > 0) {
                        i11 = i12;
                        z12 = true;
                    } else {
                        i11 = this.f23980r;
                        z12 = false;
                    }
                    pPSWLSView = this.f23965a;
                    z13 = adContentData.b() == 1;
                }
                pPSWLSView.a(adContentData, z13, i11, v3, z12);
                if (androidx.transition.n.h(adContentData.i0())) {
                    return;
                }
                this.f23965a.setChoiceViewOnClickListener(new d(this, adContentData));
                return;
            }
            this.f23966b.setAdMediator(this.f23967c);
            PPSSplashAdSourceView pPSSplashAdSourceView2 = this.f23966b;
            pPSSplashAdSourceView2.f23945v = Code;
            pPSSplashAdSourceView2.f23946w = k10;
            pPSSplashAdSourceView2.setVisibility(0);
            if (1 == v3) {
                pPSSplashAdSourceView = this.f23966b;
                z11 = adContentData.b() == 1;
                i10 = this.f23978p;
                z10 = false;
            } else {
                ex.V("PPSSplashView", "showAdLabel, orientation: %s, leftNotchHeight: %s, rightNotchHeight: %s", Integer.valueOf(v3), Integer.valueOf(this.f23979q), Integer.valueOf(this.f23980r));
                int i13 = this.f23979q;
                if (i13 > 0) {
                    i10 = i13;
                    z10 = true;
                } else {
                    i10 = this.f23980r;
                    z10 = false;
                }
                pPSSplashAdSourceView = this.f23966b;
                z11 = adContentData.b() == 1;
            }
            pPSSplashAdSourceView.a(adContentData, z11, i10, v3, z10);
        }
    }

    public void Code(int i10) {
        fo Code = fp.Code(i10, this);
        this.f23967c = Code;
        Code.Code(this.f23969e);
        this.f23967c.Code((ga.a) null);
        this.f23967c.Code(this.f23981s);
        this.f23967c.V(this.C);
        this.f23967c.Code(this.y);
        this.f23967c.l();
    }

    @Override // com.huawei.hms.ads.ka
    public void Code(int i10, int i11, String str, boolean z10, Integer num) {
        if (this.f23987z == null) {
            return;
        }
        ex.V("PPSSplashView", "set splashpro mode: %d", Integer.valueOf(i10));
        ex.V("PPSSplashView", "interactCfg = %s", num);
        if (num == null) {
            this.f23987z.setVisibility(8);
        } else if (num.intValue() == 0) {
            Code(i11, str, z10);
        } else {
            Code(z10, num.intValue());
        }
        this.f23987z.setMode(i10);
    }

    private void Code(int i10, String str, boolean z10) {
        ex.V("PPSSplashView", "showClickButton");
        c();
        this.f23987z.setVisibility(4);
        this.f23987z.setDesc(Code(str));
        this.f23987z.setOrientation(this.F.v());
        PPSSplashProView pPSSplashProView = this.f23987z;
        pPSSplashProView.f23957x = z10;
        if (pPSSplashProView.f23953t != null && i10 == 0) {
            RoundLinearLayout roundLinearLayout = pPSSplashProView.f23958z;
            if (roundLinearLayout != null) {
                roundLinearLayout.setBackground(pPSSplashProView.getResources().getDrawable(R.drawable.hiad_splash_pro_bg_scan));
                pPSSplashProView.f23958z.setAlpha(gl.Code);
            }
            pPSSplashProView.f23953t.addOnLayoutChangeListener(new j(pPSSplashProView));
        }
        ex.V("PPSSplashProView", "showLogo:" + pPSSplashProView.f23957x + ",orientation:" + pPSSplashProView.y);
        if (!pPSSplashProView.f23957x && pPSSplashProView.y == 1) {
            ViewGroup.LayoutParams layoutParams = pPSSplashProView.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = gb.u.j(pPSSplashProView.getContext()) + layoutParams2.bottomMargin;
                pPSSplashProView.setLayoutParams(layoutParams2);
            }
        }
        if (i10 != 0) {
            this.f23987z.setVisibility(0);
        }
    }

    private void V(AdContentData adContentData, int i10) {
        float f;
        boolean z10;
        int i11;
        String str;
        String str2;
        if (I(getContext())) {
            ex.I("PPSSplashView", "addSkipAdButton - activity finished, not add view");
            return;
        }
        if (adContentData != null) {
            boolean z11 = adContentData.b() == 1;
            String k10 = adContentData.k();
            String S0 = adContentData.S0();
            f = adContentData.o0();
            i11 = adContentData.p0();
            z10 = z11;
            str = k10;
            str2 = S0;
        } else {
            f = gl.Code;
            z10 = false;
            i11 = 0;
            str = null;
            str2 = null;
        }
        PPSSkipButton Code = Code(str, i10, str2, z10, f, i11);
        this.I = Code;
        Code.setId(R.id.hiad_btn_skip);
        addView(this.I);
        this.I.setVisibility(4);
    }

    @Override // com.huawei.hms.ads.ka
    public void Code(int i10, boolean z10) {
        View view = this.D;
        if (view == null) {
            return;
        }
        if (1 == i10) {
            view.setVisibility(0);
            return;
        }
        view.setVisibility(8);
        if (z10) {
            B();
        }
    }

    private void Code(Context context) {
        V(context);
        this.f23968d = new ip(context, this);
        this.B = ec.Code(context);
        this.f23986x = h0.c(context.getApplicationContext());
        this.J = new e();
        fa.g a10 = fa.g.a(context.getApplicationContext());
        e eVar = this.J;
        if (eVar != null) {
            a10.f28232b.add(new WeakReference<>(eVar));
        } else {
            a10.getClass();
        }
    }

    @Override // com.huawei.hms.ads.ka
    public void Code(View view) {
        ex.V("PPSSplashView", "showTemplateView");
        if (I(getContext())) {
            ex.I("PPSSplashView", "showAdView - activity finished, not add view");
        } else {
            this.V.addView(view, new RelativeLayout.LayoutParams(-1, -1));
            view.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.hms.ads.ka
    public void Code(kc kcVar, Integer num) {
        if (I(getContext())) {
            ex.I("PPSSplashView", "showAdView - activity finished, not add view");
            return;
        }
        if (kcVar == 0 || !(kcVar instanceof View)) {
            return;
        }
        View view = (View) kcVar;
        this.f23974k = kcVar;
        ViewParent parent = view.getParent();
        if (parent == this.V) {
            view.setVisibility(0);
            return;
        }
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(view);
        } else if (parent != null) {
            return;
        }
        this.V.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        view.setVisibility(0);
        kcVar.setAudioFocusType(this.o);
        ex.V("PPSSplashView", "set splashpro view to adview");
        if (num != null && num.intValue() == 4) {
            kcVar.Code(this.G.getClickAreaView(), num);
        } else if (num == null || num.intValue() != 3) {
            kcVar.Code(this.f23987z, num);
        } else {
            kcVar.Code(this.H.getClickAreaView(), num);
        }
    }

    @Override // com.huawei.hms.ads.ka
    public void Code(ko koVar) {
        View view = this.D;
        if (view != null) {
            view.setVisibility(this.L);
        }
        View view2 = this.f23982t;
        if (view2 != null) {
            view2.setVisibility(0);
            new id(this.B, koVar).V();
            return;
        }
        SloganView sloganView = this.Code;
        if (sloganView == null) {
            ex.V("PPSSplashView", "create default slogan");
            setSloganResId(R.drawable.hiad_default_slogan);
            sloganView = this.Code;
            if (sloganView == null) {
                return;
            }
        }
        sloganView.setSloganShowListener(koVar);
        this.Code.a();
    }

    @Override // com.huawei.hms.ads.ka
    public void Code(AdContentData adContentData, int i10) {
        this.K = adContentData;
        setSkipBtnDelayTime(adContentData);
        if (this.I == null) {
            V(adContentData, i10);
        }
        PPSSkipButton pPSSkipButton = this.I;
        if (pPSSkipButton != null) {
            kc kcVar = this.f23974k;
            if (kcVar != null) {
                pPSSkipButton.setShowLeftTime(kcVar.C());
            }
            if (adContentData != null && adContentData.K() != null && adContentData.O0() == 9) {
                this.I.b((int) ((((float) adContentData.K().U()) * 1.0f) / 1000.0f));
            }
            a();
        }
        V(adContentData);
    }

    @Override // com.huawei.hms.ads.gk
    public View getOpenMeasureView() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(AdContentData adContentData, int[] iArr, int[] iArr2) {
        if (iArr != null && iArr.length == 2) {
            if (!(iArr2 != null && iArr2.length == 2) || adContentData == null) {
                return;
            }
            if (ex.Code()) {
                ex.Code("PPSSplashView", "addComplianceDialog, loc: %s, %s", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                ex.Code("PPSSplashView", "addComplianceDialog, size: %s, %s", Integer.valueOf(iArr2[0]), Integer.valueOf(iArr2[1]));
            }
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            PPSAdvertiserInfoDialog pPSAdvertiserInfoDialog = new PPSAdvertiserInfoDialog(getContext(), iArr, iArr2);
            addView(pPSAdvertiserInfoDialog, layoutParams);
            pPSAdvertiserInfoDialog.setScreenWidth(getMeasuredWidth());
            pPSAdvertiserInfoDialog.setScreenHeight(getMeasuredHeight());
            pPSAdvertiserInfoDialog.setAdContent(adContentData);
        }
    }

    private void Code(boolean z10, int i10) {
        PPSSplashSwipeClickView pPSSplashSwipeClickView;
        View view;
        ex.V("PPSSplashView", "showNewStyle, cfg= %s", Integer.valueOf(i10));
        String a10 = gb.y.a(getContext(), this.K, i10);
        AdContentData adContentData = this.K;
        InteractCfg G0 = adContentData != null ? adContentData.G0() : null;
        if (1 == i10) {
            PPSSplashSwipeView pPSSplashSwipeView = this.A;
            if (pPSSplashSwipeView == null) {
                return;
            }
            pPSSplashSwipeView.setVisibility(4);
            this.A.a(Code(G0), Code(G0, a10));
            this.A.setOrientation(this.F.v());
            this.A.setShowLogo(z10);
            view = this.A;
        } else if (2 == i10) {
            PPSSplashTwistView pPSSplashTwistView = this.E;
            if (pPSSplashTwistView == null) {
                return;
            }
            pPSSplashTwistView.setVisibility(4);
            this.E.a(V(G0), V(G0, a10));
            this.E.setOrientation(this.F.v());
            this.E.setShowLogo(z10);
            view = this.E;
        } else if (3 == i10) {
            PPSSplashTwistClickView pPSSplashTwistClickView = this.H;
            if (pPSSplashTwistClickView == null) {
                return;
            }
            pPSSplashTwistClickView.setVisibility(4);
            this.H.a(Z(G0), V(G0, a10));
            this.H.setOrientation(this.F.v());
            this.H.setShowLogo(z10);
            view = this.H;
        } else {
            if (4 != i10 || (pPSSplashSwipeClickView = this.G) == null) {
                return;
            }
            pPSSplashSwipeClickView.setVisibility(4);
            this.G.a(I(G0), Code(G0, a10));
            this.G.setOrientation(this.F.v());
            this.G.setShowLogo(z10);
            view = this.G;
        }
        view.setVisibility(0);
    }

    private boolean Code(Long l10) {
        if (l10 == null) {
            return false;
        }
        long ag = ec.Code(getContext()).ag();
        if (ag == -1) {
            return true;
        }
        return System.currentTimeMillis() < l10.longValue() + (ag * 86400000);
    }
}
