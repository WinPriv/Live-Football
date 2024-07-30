package com.anythink.expressad.video.module;

import a3.k;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.l;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.f.a;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.shake.MBShakeView;
import com.anythink.expressad.video.dynview.f.h;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView;
import com.anythink.expressad.video.module.a.a.j;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.videocommon.view.RoundImageView;
import com.anythink.expressad.videocommon.view.StarLevelView;
import com.anythink.expressad.widget.FeedBackButton;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkNativeEndCardView extends AnythinkBaseView implements f {

    /* renamed from: n, reason: collision with root package name */
    private static final String f11764n = "anythink_reward_endcard_native_hor";
    private static final String o = "anythink_reward_endcard_native_land";

    /* renamed from: p, reason: collision with root package name */
    private static final String f11765p = "anythink_reward_endcard_native_half_portrait";

    /* renamed from: q, reason: collision with root package name */
    private static final String f11766q = "anythink_reward_endcard_native_half_landscape";
    private ImageView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private LinearLayout E;
    private FeedBackButton F;
    private Runnable G;
    private RelativeLayout H;
    private b I;
    private boolean J;
    private boolean K;
    private int L;
    private boolean M;
    private boolean N;
    private boolean O;
    private AlphaAnimation P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private View V;
    private TextView W;

    /* renamed from: aa, reason: collision with root package name */
    private boolean f11767aa;

    /* renamed from: ab, reason: collision with root package name */
    private String f11768ab;

    /* renamed from: ac, reason: collision with root package name */
    private d f11769ac;

    /* renamed from: ad, reason: collision with root package name */
    private MBShakeView f11770ad;
    private com.anythink.expressad.shake.b ae;
    private AnythinkBaitClickView af;
    private int ag;

    /* renamed from: r, reason: collision with root package name */
    private ViewGroup f11771r;

    /* renamed from: s, reason: collision with root package name */
    private ViewGroup f11772s;

    /* renamed from: t, reason: collision with root package name */
    private RelativeLayout f11773t;

    /* renamed from: u, reason: collision with root package name */
    private RelativeLayout f11774u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f11775v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f11776w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f11777x;
    private ImageView y;

    /* renamed from: z, reason: collision with root package name */
    private ImageView f11778z;

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass10 implements c {
        public AnonymousClass10() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                if (AnythinkNativeEndCardView.this.f11776w != null) {
                    AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                    if (anythinkNativeEndCardView.f11692i) {
                        anythinkNativeEndCardView.f11776w.setBackgroundDrawable(null);
                    }
                    AnythinkNativeEndCardView.this.f11776w.setImageBitmap(bitmap);
                }
                Bitmap blurBitmap = AnythinkNativeEndCardView.this.blurBitmap(bitmap);
                if (blurBitmap == null || blurBitmap.isRecycled() || AnythinkNativeEndCardView.this.f11775v == null) {
                    return;
                }
                AnythinkNativeEndCardView anythinkNativeEndCardView2 = AnythinkNativeEndCardView.this;
                if (anythinkNativeEndCardView2.f11692i) {
                    anythinkNativeEndCardView2.f11775v.setBackgroundDrawable(null);
                }
                AnythinkNativeEndCardView.this.f11775v.setImageBitmap(blurBitmap);
            } catch (Throwable unused) {
                if (AnythinkNativeEndCardView.this.f11775v != null) {
                    AnythinkNativeEndCardView.this.f11775v.setVisibility(4);
                }
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass11 implements c {
        public AnonymousClass11() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled() || bitmap.isRecycled()) {
                return;
            }
            try {
                int b10 = t.b(AnythinkNativeEndCardView.this.f11685a, 12.0f);
                AnythinkNativeEndCardView.this.y.getLayoutParams().height = b10;
                AnythinkNativeEndCardView.this.y.getLayoutParams().width = (int) (b10 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                AnythinkNativeEndCardView.this.y.setImageBitmap(bitmap);
                AnythinkNativeEndCardView.this.y.setBackgroundColor(1426063360);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$12, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass12 implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11782a;

        public AnonymousClass12(String str) {
            this.f11782a = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            l.b(AnythinkNativeEndCardView.this.f11685a, this.f11782a);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements a {
        public AnonymousClass4() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            AnythinkNativeEndCardView.this.O = true;
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            AnythinkNativeEndCardView.this.O = false;
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            AnythinkNativeEndCardView.this.O = false;
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 extends com.anythink.expressad.shake.b {
        public AnonymousClass6(int i10, int i11) {
            super(i10, i11);
        }

        @Override // com.anythink.expressad.shake.b
        public final void a() {
            if (AnythinkNativeEndCardView.this.O || !AnythinkNativeEndCardView.this.N) {
                return;
            }
            AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 4);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass8 implements Runnable {
        public AnonymousClass8() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 2);
        }
    }

    public AnythinkNativeEndCardView(Context context) {
        super(context);
        this.J = false;
        this.K = false;
        this.L = 0;
        this.M = false;
        this.N = false;
        this.O = false;
        this.U = false;
        this.ag = 1;
    }

    public static /* synthetic */ boolean a(AnythinkNativeEndCardView anythinkNativeEndCardView) {
        anythinkNativeEndCardView.K = true;
        return true;
    }

    public static /* synthetic */ void o(AnythinkNativeEndCardView anythinkNativeEndCardView) {
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            anythinkNativeEndCardView.f11686b.l(anythinkNativeEndCardView.f11768ab);
            com.anythink.expressad.foundation.f.b.a().a(a3.l.p(new StringBuilder(), anythinkNativeEndCardView.f11768ab, "_2"), new AnonymousClass4());
            com.anythink.expressad.foundation.f.b.a().a(a3.l.p(new StringBuilder(), anythinkNativeEndCardView.f11768ab, "_2"), anythinkNativeEndCardView.f11686b);
            com.anythink.expressad.foundation.f.b.a().c(anythinkNativeEndCardView.f11768ab + "_1");
            com.anythink.expressad.foundation.f.b.a().a(a3.l.p(new StringBuilder(), anythinkNativeEndCardView.f11768ab, "_2"), anythinkNativeEndCardView.F);
            if (anythinkNativeEndCardView.F != null) {
                com.anythink.expressad.foundation.f.b.a().a(a3.l.p(new StringBuilder(), anythinkNativeEndCardView.f11768ab, "_2"), anythinkNativeEndCardView.F);
                return;
            }
            return;
        }
        FeedBackButton feedBackButton = anythinkNativeEndCardView.F;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    @TargetApi(17)
    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(this.f11685a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean canBackPress() {
        View view = this.V;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void clearMoreOfferBitmap() {
        d dVar;
        ArrayList<com.anythink.expressad.foundation.d.c> arrayList;
        com.anythink.expressad.foundation.d.c cVar = this.f11686b;
        if (cVar != null && cVar.j() && (dVar = this.f11769ac) != null && (arrayList = dVar.J) != null && arrayList.size() > 0) {
            Iterator<com.anythink.expressad.foundation.d.c> it = this.f11769ac.J.iterator();
            while (it.hasNext()) {
                com.anythink.expressad.foundation.d.c next = it.next();
                if (!TextUtils.isEmpty(next.bd())) {
                    k.f().c(next.bd());
                }
            }
        }
    }

    public boolean isDyXmlSuccess() {
        return this.U;
    }

    public void notifyShowListener() {
        this.f11689e.a(110, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int parseInt;
        int parseInt2;
        int i10;
        super.onAttachedToWindow();
        if (this.G == null) {
            this.G = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this);
                    if (AnythinkNativeEndCardView.this.V != null) {
                        AnythinkNativeEndCardView.this.V.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.G;
        if (runnable != null) {
            postDelayed(runnable, this.L * 1000);
            if (!this.N) {
                this.N = true;
            }
            try {
                com.anythink.expressad.foundation.d.c cVar = this.f11686b;
                if (cVar != null && cVar.j()) {
                    String I = this.f11686b.I();
                    if (TextUtils.isEmpty(I)) {
                        I = this.f11686b.P();
                    }
                    String a10 = x.a(I, "alac");
                    if (!TextUtils.isEmpty(a10) && a10.equals("1")) {
                        postDelayed(new AnonymousClass8(), 1000L);
                    }
                }
            } catch (Throwable th) {
                o.d(AnythinkBaseView.TAG, th.getMessage());
            }
        }
        try {
            com.anythink.expressad.foundation.d.c cVar2 = this.f11686b;
            if (cVar2 != null && cVar2.j()) {
                String I2 = this.f11686b.I();
                if (TextUtils.isEmpty(I2)) {
                    I2 = this.f11686b.P();
                }
                String a11 = x.a(I2, "bait_click");
                try {
                    i10 = Integer.parseInt(a11);
                } catch (Throwable th2) {
                    o.d(AnythinkBaseView.TAG, th2.getMessage());
                    i10 = 1;
                }
                if (!TextUtils.isEmpty(a11) && i10 != 0 && this.af == null) {
                    AnythinkBaitClickView anythinkBaitClickView = new AnythinkBaitClickView(getContext());
                    this.af = anythinkBaitClickView;
                    anythinkBaitClickView.init(1342177280, i10);
                    this.af.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    RelativeLayout relativeLayout = this.f11774u;
                    if (relativeLayout != null) {
                        relativeLayout.addView(this.af);
                        this.af.startAnimation();
                        this.af.setOnClickListener(new AnonymousClass7());
                    }
                }
            }
        } catch (Throwable th3) {
            o.d(AnythinkBaseView.TAG, th3.getMessage());
        }
        try {
            com.anythink.expressad.foundation.d.c cVar3 = this.f11686b;
            if (cVar3 == null || !cVar3.j()) {
                return;
            }
            String I3 = this.f11686b.I();
            if (TextUtils.isEmpty(I3)) {
                I3 = this.f11686b.P();
            }
            String a12 = x.a(I3, "shake_show");
            String a13 = x.a(I3, "shake_strength");
            String a14 = x.a(I3, "shake_time");
            if (TextUtils.isEmpty(a12) || !a12.equals("1") || this.f11770ad != null) {
                return;
            }
            AnythinkBaitClickView anythinkBaitClickView2 = this.af;
            if (anythinkBaitClickView2 != null) {
                anythinkBaitClickView2.setVisibility(8);
            }
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.f11770ad = mBShakeView;
            mBShakeView.initView(this.f11686b.cU, true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (!isLandscape()) {
                layoutParams.addRule(2, findID("anythink_iv_logo"));
                layoutParams.addRule(14);
                this.f11770ad.setPadding(0, 0, 0, t.b(getContext(), 20.0f));
            } else {
                layoutParams.addRule(13);
            }
            this.f11770ad.setLayoutParams(layoutParams);
            RelativeLayout relativeLayout2 = this.f11773t;
            if (relativeLayout2 == null || !relativeLayout2.isShown()) {
                return;
            }
            if (this.W != null) {
                this.f11773t.addView(this.f11770ad);
            }
            this.W.setVisibility(4);
            this.f11770ad.setOnClickListener(new AnonymousClass5());
            int i11 = 10;
            if (!TextUtils.isEmpty(a13) && (parseInt2 = Integer.parseInt(a13)) >= 0) {
                i11 = parseInt2;
            }
            int i12 = 5000;
            if (!TextUtils.isEmpty(a14) && (parseInt = Integer.parseInt(a14)) > 0) {
                i12 = parseInt * 1000;
            }
            this.ae = new AnonymousClass6(i11, i12);
            com.anythink.expressad.shake.a.a().a(this.ae);
        } catch (Throwable th4) {
            o.d(AnythinkBaseView.TAG, th4.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.G;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (this.ae != null) {
            com.anythink.expressad.shake.a.a().b(this.ae);
            this.ae = null;
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        com.anythink.expressad.foundation.d.c cVar = this.f11686b;
        if (cVar != null && cVar.j()) {
            return;
        }
        RelativeLayout relativeLayout = this.H;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
        this.f11688d = configuration.orientation;
        o.d(AnythinkBaseView.TAG, " native onSelfConfigurationChanged:" + this.f11688d);
        if (this.f11688d == 2) {
            removeView(this.f11771r);
            a(this.f11772s);
        } else {
            removeView(this.f11772s);
            a(this.f11771r);
        }
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        String aE;
        this.I = bVar;
        try {
            if (this.f11686b != null && this.f) {
                com.anythink.expressad.foundation.g.d.b.a(this.f11685a.getApplicationContext()).a(this.f11686b.be(), new AnonymousClass10());
                com.anythink.expressad.foundation.g.d.b.a(this.f11685a.getApplicationContext()).a(this.f11686b.bd(), new j(this.f11777x, t.b(n.a().g(), 8.0f)));
                this.B.setText(this.f11686b.bb());
                TextView textView = this.W;
                if (textView != null) {
                    textView.setText(this.f11686b.cU);
                }
                TextView textView2 = this.C;
                if (textView2 != null) {
                    textView2.setText(this.f11686b.bc());
                }
                TextView textView3 = this.D;
                if (textView3 != null) {
                    textView3.setText(this.f11686b.aY() + ")");
                }
                this.E.removeAllViews();
                double aX = this.f11686b.aX();
                if (aX <= 0.0d) {
                    aX = 5.0d;
                }
                LinearLayout linearLayout = this.E;
                if (linearLayout instanceof StarLevelView) {
                    ((StarLevelView) linearLayout).initScore(aX);
                }
                LinearLayout linearLayout2 = this.E;
                if (linearLayout2 instanceof AnyThinkLevelLayoutView) {
                    ((AnyThinkLevelLayoutView) linearLayout2).setRatingAndUser(aX, this.f11686b.aY());
                }
                if (!TextUtils.isEmpty(this.f11686b.I()) && this.f11686b.I().contains("alecfc=1")) {
                    this.J = true;
                }
                if (TextUtils.isEmpty(this.f11686b.aE())) {
                    aE = com.anythink.expressad.a.f6554ab;
                } else {
                    aE = this.f11686b.aE();
                }
                com.anythink.expressad.foundation.g.d.b.a(this.f11685a.getApplicationContext()).a(aE, new AnonymousClass11());
                com.anythink.expressad.foundation.b.a.b().e();
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.d.a b10 = com.anythink.expressad.d.b.b();
                if (b10 != null) {
                    String J = b10.J();
                    if (TextUtils.isEmpty(J)) {
                        this.f11778z.setVisibility(8);
                    }
                    this.f11778z.setOnClickListener(new AnonymousClass12(J));
                } else {
                    this.f11778z.setVisibility(8);
                }
                if (!this.K) {
                    this.V.setVisibility(8);
                }
            }
        } catch (Throwable th) {
            o.a(AnythinkBaseView.TAG, th.getMessage());
        }
    }

    public void release() {
        try {
            removeAllViews();
            AlphaAnimation alphaAnimation = this.P;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.ae = null;
            this.G = null;
        } catch (Exception e10) {
            o.d(AnythinkBaseView.TAG, e10.getMessage());
        }
    }

    public void setCloseBtnDelay(int i10) {
        this.L = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r6.f11767aa != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        r1 = com.anythink.expressad.video.module.AnythinkNativeEndCardView.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        if (r6.f11767aa != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setLayout() {
        /*
            r6 = this;
            boolean r0 = r6.f11692i
            if (r0 == 0) goto L21
            com.anythink.expressad.video.dynview.j.c r0 = new com.anythink.expressad.video.dynview.j.c
            r0.<init>()
            android.content.Context r0 = r6.getContext()
            com.anythink.expressad.foundation.d.c r1 = r6.f11686b
            int r2 = r6.f11693j
            com.anythink.expressad.video.dynview.c r0 = com.anythink.expressad.video.dynview.j.c.a(r0, r1, r2)
            com.anythink.expressad.video.dynview.b.a()
            com.anythink.expressad.video.module.AnythinkNativeEndCardView$9 r1 = new com.anythink.expressad.video.module.AnythinkNativeEndCardView$9
            r1.<init>()
            com.anythink.expressad.video.dynview.b.a(r0, r1)
            return
        L21:
            int r0 = r6.ag
            java.lang.String r1 = "anythink_reward_endcard_native_half_landscape"
            java.lang.String r2 = "anythink_reward_endcard_native_land"
            java.lang.String r3 = "anythink_reward_endcard_native_half_portrait"
            java.lang.String r4 = "anythink_reward_endcard_native_hor"
            if (r0 != 0) goto L3e
            boolean r0 = r6.f11767aa
            if (r0 == 0) goto L32
            goto L33
        L32:
            r3 = r4
        L33:
            boolean r0 = r6.isLandscape()
            if (r0 == 0) goto L54
            boolean r0 = r6.f11767aa
            if (r0 == 0) goto L52
            goto L53
        L3e:
            r5 = 1
            if (r0 != r5) goto L48
            boolean r5 = r6.f11767aa
            if (r5 == 0) goto L46
            goto L4a
        L46:
            r3 = r4
            goto L4a
        L48:
            java.lang.String r3 = ""
        L4a:
            r4 = 2
            if (r0 != r4) goto L54
            boolean r0 = r6.f11767aa
            if (r0 == 0) goto L52
            goto L53
        L52:
            r1 = r2
        L53:
            r3 = r1
        L54:
            int r0 = r6.findLayout(r3)
            if (r0 <= 0) goto L8d
            boolean r1 = r6.isLandscape()
            r2 = 0
            if (r1 == 0) goto L75
            android.view.LayoutInflater r1 = r6.f11687c
            android.view.View r0 = r1.inflate(r0, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.f11772s = r0
            r6.addView(r0)
            android.view.ViewGroup r0 = r6.f11772s
            boolean r0 = r6.b(r0)
            goto L88
        L75:
            android.view.LayoutInflater r1 = r6.f11687c
            android.view.View r0 = r1.inflate(r0, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.f11771r = r0
            r6.addView(r0)
            android.view.ViewGroup r0 = r6.f11771r
            boolean r0 = r6.b(r0)
        L88:
            r6.f = r0
            r6.e()
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.AnythinkNativeEndCardView.setLayout():void");
    }

    public void setMoreOfferCampaignUnit(d dVar) {
        ArrayList<com.anythink.expressad.foundation.d.c> arrayList;
        MBShakeView mBShakeView;
        com.anythink.expressad.foundation.d.c cVar = this.f11686b;
        if (cVar != null && cVar.j()) {
            this.f11769ac = dVar;
            if (dVar != null && (arrayList = dVar.J) != null && arrayList.size() > 5 && (mBShakeView = this.f11770ad) != null) {
                mBShakeView.setPadding(0, 0, 0, t.b(getContext(), 5.0f));
            }
        }
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        o.d(AnythinkBaseView.TAG, "NOTCH NativeEndCard " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        this.Q = i10;
        this.R = i11;
        this.S = i12;
        this.T = i13;
        h();
    }

    public void setOnPause() {
        this.N = false;
    }

    public void setOnResume() {
        this.N = true;
    }

    public void setUnitId(String str) {
        this.f11768ab = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c();
        if (!this.f) {
            this.f11689e.a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(gl.Code, 100.0f);
        this.P = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    private void f() {
        com.anythink.expressad.foundation.g.d.b.a(this.f11685a.getApplicationContext()).a(this.f11686b.be(), new AnonymousClass10());
        com.anythink.expressad.foundation.g.d.b.a(this.f11685a.getApplicationContext()).a(this.f11686b.bd(), new j(this.f11777x, a3.l.f(8.0f)));
        this.B.setText(this.f11686b.bb());
        TextView textView = this.W;
        if (textView != null) {
            textView.setText(this.f11686b.cU);
        }
        TextView textView2 = this.C;
        if (textView2 != null) {
            textView2.setText(this.f11686b.bc());
        }
        TextView textView3 = this.D;
        if (textView3 != null) {
            textView3.setText(this.f11686b.aY() + ")");
        }
        this.E.removeAllViews();
        double aX = this.f11686b.aX();
        if (aX <= 0.0d) {
            aX = 5.0d;
        }
        LinearLayout linearLayout = this.E;
        if (linearLayout instanceof StarLevelView) {
            ((StarLevelView) linearLayout).initScore(aX);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 instanceof AnyThinkLevelLayoutView) {
            ((AnyThinkLevelLayoutView) linearLayout2).setRatingAndUser(aX, this.f11686b.aY());
        }
        if (!TextUtils.isEmpty(this.f11686b.I()) && this.f11686b.I().contains("alecfc=1")) {
            this.J = true;
        }
        com.anythink.expressad.foundation.g.d.b.a(this.f11685a.getApplicationContext()).a(TextUtils.isEmpty(this.f11686b.aE()) ? com.anythink.expressad.a.f6554ab : this.f11686b.aE(), new AnonymousClass11());
        com.anythink.expressad.foundation.b.a.b().e();
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.d.a b10 = com.anythink.expressad.d.b.b();
        if (b10 != null) {
            String J = b10.J();
            if (TextUtils.isEmpty(J)) {
                this.f11778z.setVisibility(8);
            }
            this.f11778z.setOnClickListener(new AnonymousClass12(J));
        } else {
            this.f11778z.setVisibility(8);
        }
        if (this.K) {
            return;
        }
        this.V.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r1 = com.anythink.expressad.video.module.AnythinkNativeEndCardView.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if (r6.f11767aa != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r6.f11767aa != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int g() {
        /*
            r6 = this;
            int r0 = r6.ag
            java.lang.String r1 = "anythink_reward_endcard_native_half_landscape"
            java.lang.String r2 = "anythink_reward_endcard_native_land"
            java.lang.String r3 = "anythink_reward_endcard_native_half_portrait"
            java.lang.String r4 = "anythink_reward_endcard_native_hor"
            if (r0 != 0) goto L1d
            boolean r0 = r6.f11767aa
            if (r0 == 0) goto L11
            goto L12
        L11:
            r3 = r4
        L12:
            boolean r0 = r6.isLandscape()
            if (r0 == 0) goto L33
            boolean r0 = r6.f11767aa
            if (r0 == 0) goto L31
            goto L32
        L1d:
            r5 = 1
            if (r0 != r5) goto L27
            boolean r5 = r6.f11767aa
            if (r5 == 0) goto L25
            goto L29
        L25:
            r3 = r4
            goto L29
        L27:
            java.lang.String r3 = ""
        L29:
            r4 = 2
            if (r0 != r4) goto L33
            boolean r0 = r6.f11767aa
            if (r0 == 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            r3 = r1
        L33:
            int r0 = r6.findLayout(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.AnythinkNativeEndCardView.g():int");
    }

    private void h() {
        RelativeLayout relativeLayout;
        if (!this.f || (relativeLayout = this.H) == null) {
            return;
        }
        relativeLayout.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.3
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.foundation.d.c cVar = AnythinkNativeEndCardView.this.f11686b;
                if (cVar != null && !cVar.j() && AnythinkNativeEndCardView.this.f11686b.f() != 2) {
                    AnythinkNativeEndCardView.this.H.setPadding(AnythinkNativeEndCardView.this.Q, AnythinkNativeEndCardView.this.S, AnythinkNativeEndCardView.this.R, AnythinkNativeEndCardView.this.T);
                    AnythinkNativeEndCardView.this.H.startAnimation(AnythinkNativeEndCardView.this.P);
                }
                AnythinkNativeEndCardView.this.H.setVisibility(0);
                if (AnythinkNativeEndCardView.this.V.getVisibility() != 0 && AnythinkNativeEndCardView.this.K) {
                    AnythinkNativeEndCardView.this.V.setVisibility(0);
                }
                AnythinkNativeEndCardView.o(AnythinkNativeEndCardView.this);
            }
        }, 200L);
    }

    private void i() {
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            this.f11686b.l(this.f11768ab);
            com.anythink.expressad.foundation.f.b.a().a(a3.l.p(new StringBuilder(), this.f11768ab, "_2"), new AnonymousClass4());
            com.anythink.expressad.foundation.f.b.a().a(a3.l.p(new StringBuilder(), this.f11768ab, "_2"), this.f11686b);
            com.anythink.expressad.foundation.f.b.a().c(this.f11768ab + "_1");
            com.anythink.expressad.foundation.f.b.a().a(a3.l.p(new StringBuilder(), this.f11768ab, "_2"), this.F);
            if (this.F != null) {
                com.anythink.expressad.foundation.f.b.a().a(a3.l.p(new StringBuilder(), this.f11768ab, "_2"), this.F);
                return;
            }
            return;
        }
        FeedBackButton feedBackButton = this.F;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    private void j() {
        int parseInt;
        int parseInt2;
        try {
            com.anythink.expressad.foundation.d.c cVar = this.f11686b;
            if (cVar == null || !cVar.j()) {
                return;
            }
            String I = this.f11686b.I();
            if (TextUtils.isEmpty(I)) {
                I = this.f11686b.P();
            }
            String a10 = x.a(I, "shake_show");
            String a11 = x.a(I, "shake_strength");
            String a12 = x.a(I, "shake_time");
            if (!TextUtils.isEmpty(a10) && a10.equals("1") && this.f11770ad == null) {
                AnythinkBaitClickView anythinkBaitClickView = this.af;
                if (anythinkBaitClickView != null) {
                    anythinkBaitClickView.setVisibility(8);
                }
                MBShakeView mBShakeView = new MBShakeView(getContext());
                this.f11770ad = mBShakeView;
                mBShakeView.initView(this.f11686b.cU, true);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                if (!isLandscape()) {
                    layoutParams.addRule(2, findID("anythink_iv_logo"));
                    layoutParams.addRule(14);
                    this.f11770ad.setPadding(0, 0, 0, t.b(getContext(), 20.0f));
                } else {
                    layoutParams.addRule(13);
                }
                this.f11770ad.setLayoutParams(layoutParams);
                RelativeLayout relativeLayout = this.f11773t;
                if (relativeLayout != null && relativeLayout.isShown()) {
                    if (this.W != null) {
                        this.f11773t.addView(this.f11770ad);
                    }
                    this.W.setVisibility(4);
                    this.f11770ad.setOnClickListener(new AnonymousClass5());
                    int i10 = 10;
                    if (!TextUtils.isEmpty(a11) && (parseInt2 = Integer.parseInt(a11)) >= 0) {
                        i10 = parseInt2;
                    }
                    int i11 = 5000;
                    if (!TextUtils.isEmpty(a12) && (parseInt = Integer.parseInt(a12)) > 0) {
                        i11 = parseInt * 1000;
                    }
                    this.ae = new AnonymousClass6(i10, i11);
                    com.anythink.expressad.shake.a.a().a(this.ae);
                }
            }
        } catch (Throwable th) {
            o.d(AnythinkBaseView.TAG, th.getMessage());
        }
    }

    private void k() {
        int i10;
        try {
            com.anythink.expressad.foundation.d.c cVar = this.f11686b;
            if (cVar == null || !cVar.j()) {
                return;
            }
            String I = this.f11686b.I();
            if (TextUtils.isEmpty(I)) {
                I = this.f11686b.P();
            }
            String a10 = x.a(I, "bait_click");
            try {
                i10 = Integer.parseInt(a10);
            } catch (Throwable th) {
                o.d(AnythinkBaseView.TAG, th.getMessage());
                i10 = 1;
            }
            if (TextUtils.isEmpty(a10) || i10 == 0 || this.af != null) {
                return;
            }
            AnythinkBaitClickView anythinkBaitClickView = new AnythinkBaitClickView(getContext());
            this.af = anythinkBaitClickView;
            anythinkBaitClickView.init(1342177280, i10);
            this.af.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            RelativeLayout relativeLayout = this.f11774u;
            if (relativeLayout != null) {
                relativeLayout.addView(this.af);
                this.af.startAnimation();
                this.af.setOnClickListener(new AnonymousClass7());
            }
        } catch (Throwable th2) {
            o.d(AnythinkBaseView.TAG, th2.getMessage());
        }
    }

    private void l() {
        try {
            com.anythink.expressad.foundation.d.c cVar = this.f11686b;
            if (cVar == null || !cVar.j()) {
                return;
            }
            String I = this.f11686b.I();
            if (TextUtils.isEmpty(I)) {
                I = this.f11686b.P();
            }
            String a10 = x.a(I, "alac");
            if (TextUtils.isEmpty(a10) || !a10.equals("1")) {
                return;
            }
            postDelayed(new AnonymousClass8(), 1000L);
        } catch (Throwable th) {
            o.d(AnythinkBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        if (this.f) {
            this.f11773t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.13
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkNativeEndCardView.this.J) {
                        AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 1);
                    }
                }
            });
            this.V.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkNativeEndCardView.this.f11689e.a(104, "");
                }
            });
            TextView textView = this.W;
            if (textView != null) {
                textView.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.15
                    @Override // com.anythink.expressad.widget.a
                    public final void a(View view) {
                        AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                    }
                });
            }
            this.f11777x.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.16
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                }
            });
            this.f11776w.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.2
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkNativeEndCardView.a(AnythinkNativeEndCardView.this, 0);
                }
            });
        }
    }

    private boolean b(int i10) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f11687c.inflate(i10, (ViewGroup) null);
            this.f11772s = viewGroup;
            addView(viewGroup);
            return b(this.f11772s);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f11687c.inflate(i10, (ViewGroup) null);
        this.f11771r = viewGroup2;
        addView(viewGroup2);
        return b(this.f11771r);
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass9 implements h {
        public AnonymousClass9() {
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            AnythinkNativeEndCardView.this.addView(aVar.a());
            AnythinkNativeEndCardView.this.U = aVar.c();
            AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
            anythinkNativeEndCardView.f = anythinkNativeEndCardView.b(aVar.a());
            AnythinkNativeEndCardView.this.e();
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.c.b bVar) {
            o.d(AnythinkBaseView.TAG, "errorMsg:" + bVar.b());
        }
    }

    private void a() {
        new com.anythink.expressad.video.dynview.j.c();
        com.anythink.expressad.video.dynview.c a10 = com.anythink.expressad.video.dynview.j.c.a(getContext(), this.f11686b, this.f11693j);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(a10, new AnonymousClass9());
    }

    private void a(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.I);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            b(view);
            c();
        }
        h();
    }

    private void c(int i10) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e10) {
            e = e10;
        }
        try {
            jSONObject.put(com.anythink.expressad.foundation.g.a.ce, a(i10));
            if (this.f11686b.k() == 5) {
                jSONObject.put("camp_position", 0);
            }
        } catch (JSONException e11) {
            e = e11;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            jSONObject = jSONObject2;
            this.f11689e.a(105, jSONObject);
        }
        this.f11689e.a(105, jSONObject);
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = false;
        this.K = false;
        this.L = 0;
        this.M = false;
        this.N = false;
        this.O = false;
        this.U = false;
        this.ag = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view) {
        try {
            this.f11773t = (RelativeLayout) view.findViewById(filterFindViewId(this.U, "anythink_native_ec_layout"));
            this.f11774u = (RelativeLayout) view.findViewById(filterFindViewId(this.U, "anythink_native_ec_layer_layout"));
            this.f11776w = (ImageView) view.findViewById(filterFindViewId(this.U, "anythink_iv_adbanner"));
            this.f11777x = (ImageView) view.findViewById(filterFindViewId(this.U, "anythink_iv_icon"));
            this.y = (ImageView) view.findViewById(filterFindViewId(this.U, "anythink_iv_flag"));
            this.f11778z = (ImageView) view.findViewById(filterFindViewId(this.U, "anythink_iv_link"));
            this.B = (TextView) view.findViewById(filterFindViewId(this.U, "anythink_tv_apptitle"));
            this.E = (LinearLayout) view.findViewById(filterFindViewId(this.U, "anythink_sv_starlevel"));
            this.V = view.findViewById(filterFindViewId(this.U, "anythink_iv_close"));
            View findViewById = view.findViewById(filterFindViewId(this.U, "anythink_tv_cta"));
            if (findViewById != null && (findViewById instanceof TextView)) {
                this.W = (TextView) findViewById;
            }
            this.F = (FeedBackButton) view.findViewById(filterFindViewId(this.U, "anythink_native_endcard_feed_btn"));
            this.H = (RelativeLayout) view.findViewById(filterFindViewId(this.U, "anythink_native_ec_controller"));
            this.f11775v = (ImageView) view.findViewById(filterFindViewId(this.U, "anythink_iv_adbanner_bg"));
            if (this.f11692i) {
                ImageView imageView = this.f11776w;
                if (imageView != null && (imageView instanceof RoundImageView)) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                }
                ImageView imageView2 = this.f11777x;
                if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                    ((RoundImageView) imageView2).setBorderRadius(10);
                }
                return isNotNULL(this.f11775v, this.f11776w, this.f11777x, this.B, this.E, this.V);
            }
            this.C = (TextView) view.findViewById(filterFindViewId(this.U, "anythink_tv_appdesc"));
            TextView textView = (TextView) view.findViewById(filterFindViewId(this.U, "anythink_tv_number"));
            this.D = textView;
            return isNotNULL(this.f11775v, this.f11776w, this.f11777x, this.B, this.C, textView, this.E, this.V, this.W);
        } catch (Throwable th) {
            o.b(AnythinkBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public static /* synthetic */ void a(AnythinkNativeEndCardView anythinkNativeEndCardView, int i10) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e10) {
            e = e10;
        }
        try {
            jSONObject.put(com.anythink.expressad.foundation.g.a.ce, anythinkNativeEndCardView.a(i10));
            if (anythinkNativeEndCardView.f11686b.k() == 5) {
                jSONObject.put("camp_position", 0);
            }
        } catch (JSONException e11) {
            e = e11;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            jSONObject = jSONObject2;
            anythinkNativeEndCardView.f11689e.a(105, jSONObject);
        }
        anythinkNativeEndCardView.f11689e.a(105, jSONObject);
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet, boolean z10, int i10, boolean z11, int i11, int i12) {
        super(context, attributeSet, z10, i10, z11, i11, i12);
        this.J = false;
        this.K = false;
        this.L = 0;
        this.M = false;
        this.N = false;
        this.O = false;
        this.U = false;
        this.ag = 1;
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r1 = com.anythink.expressad.video.module.AnythinkNativeEndCardView.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002e, code lost:
    
        if (r6.f11767aa != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r6.f11767aa != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() {
        /*
            r6 = this;
            int r0 = r6.ag
            java.lang.String r1 = "anythink_reward_endcard_native_half_landscape"
            java.lang.String r2 = "anythink_reward_endcard_native_land"
            java.lang.String r3 = "anythink_reward_endcard_native_half_portrait"
            java.lang.String r4 = "anythink_reward_endcard_native_hor"
            if (r0 != 0) goto L1d
            boolean r0 = r6.f11767aa
            if (r0 == 0) goto L11
            goto L12
        L11:
            r3 = r4
        L12:
            boolean r0 = r6.isLandscape()
            if (r0 == 0) goto L33
            boolean r0 = r6.f11767aa
            if (r0 == 0) goto L31
            goto L32
        L1d:
            r5 = 1
            if (r0 != r5) goto L27
            boolean r5 = r6.f11767aa
            if (r5 == 0) goto L25
            goto L29
        L25:
            r3 = r4
            goto L29
        L27:
            java.lang.String r3 = ""
        L29:
            r4 = 2
            if (r0 != r4) goto L33
            boolean r0 = r6.f11767aa
            if (r0 == 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            r3 = r1
        L33:
            int r0 = r6.findLayout(r3)
            if (r0 <= 0) goto L6c
            boolean r1 = r6.isLandscape()
            r2 = 0
            if (r1 == 0) goto L54
            android.view.LayoutInflater r1 = r6.f11687c
            android.view.View r0 = r1.inflate(r0, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.f11772s = r0
            r6.addView(r0)
            android.view.ViewGroup r0 = r6.f11772s
            boolean r0 = r6.b(r0)
            goto L67
        L54:
            android.view.LayoutInflater r1 = r6.f11687c
            android.view.View r0 = r1.inflate(r0, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.f11771r = r0
            r6.addView(r0)
            android.view.ViewGroup r0 = r6.f11771r
            boolean r0 = r6.b(r0)
        L67:
            r6.f = r0
            r6.e()
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.AnythinkNativeEndCardView.b():void");
    }
}
