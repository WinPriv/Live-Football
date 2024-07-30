package com.anythink.expressad.video.bt.module;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.k.l;
import com.anythink.expressad.foundation.b.a;
import com.anythink.expressad.foundation.g.d.b;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.module.a.a.e;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.videocommon.e.d;
import com.anythink.expressad.videocommon.view.RoundImageView;
import com.anythink.expressad.videocommon.view.StarLevelView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkBTNativeEC extends BTBaseView {

    /* renamed from: p, reason: collision with root package name */
    private static final String f11285p = "anythink_reward_endcard_native_hor";

    /* renamed from: q, reason: collision with root package name */
    private static final String f11286q = "anythink_reward_endcard_native_land";
    private TextView A;
    private TextView B;
    private StarLevelView C;
    private boolean D;
    private boolean E;
    private int F;
    private Runnable G;
    private View H;
    private View I;
    private String J;
    private j K;
    private WebView L;

    /* renamed from: r, reason: collision with root package name */
    private ViewGroup f11287r;

    /* renamed from: s, reason: collision with root package name */
    private ViewGroup f11288s;

    /* renamed from: t, reason: collision with root package name */
    private RelativeLayout f11289t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f11290u;

    /* renamed from: v, reason: collision with root package name */
    private RoundImageView f11291v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f11292w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f11293x;
    private ImageView y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f11294z;

    public AnythinkBTNativeEC(Context context) {
        super(context);
        this.D = false;
        this.E = false;
        this.F = 0;
    }

    public static /* synthetic */ boolean a(AnythinkBTNativeEC anythinkBTNativeEC) {
        anythinkBTNativeEC.E = true;
        return true;
    }

    @TargetApi(17)
    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript create = RenderScript.create(this.f11345a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            bitmap.recycle();
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        String str;
        boolean b10;
        if (isLandscape()) {
            str = f11286q;
        } else {
            str = f11285p;
        }
        int findLayout = findLayout(str);
        if (findLayout > 0) {
            if (isLandscape()) {
                ViewGroup viewGroup = (ViewGroup) this.f.inflate(findLayout, (ViewGroup) null);
                this.f11288s = viewGroup;
                addView(viewGroup);
                b10 = b(this.f11288s);
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.f.inflate(findLayout, (ViewGroup) null);
                this.f11287r = viewGroup2;
                addView(viewGroup2);
                b10 = b(this.f11287r);
            }
            this.f11351h = b10;
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.G == null) {
            this.G = new Runnable() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this);
                    if (AnythinkBTNativeEC.this.H != null) {
                        AnythinkBTNativeEC.this.H.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.G;
        if (runnable != null) {
            postDelayed(runnable, this.F * 1000);
        }
        if (!this.f11351h && this.L != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f11348d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unitId", this.J);
                jSONObject.put("data", jSONObject2);
                o.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
            } catch (JSONException e10) {
                o.a(BTBaseView.TAG, e10.getMessage());
            }
            com.anythink.expressad.atsignalcommon.windvane.j.a();
            com.anythink.expressad.atsignalcommon.windvane.j.a(this.L, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.L != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.f11348d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("unitId", this.J);
                jSONObject3.put("data", jSONObject4);
                o.a(BTBaseView.TAG, "NativeEC Call H5 onEndCardShow " + jSONObject3.toString());
            } catch (JSONException e11) {
                o.a(BTBaseView.TAG, e11.getMessage());
            }
            com.anythink.expressad.atsignalcommon.windvane.j.a();
            com.anythink.expressad.atsignalcommon.windvane.j.a(this.L, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.G;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        int i10 = configuration.orientation;
        this.f11350g = i10;
        if (i10 == 2) {
            removeView(this.f11287r);
            a(this.f11288s);
        } else {
            removeView(this.f11288s);
            a(this.f11287r);
        }
    }

    public void preLoadData() {
        String aE;
        Bitmap blurBitmap;
        try {
            if (this.f11346b != null && this.f11351h) {
                d dVar = this.f11349e;
                if (dVar != null) {
                    this.F = dVar.p();
                }
                b.a(this.f11345a.getApplicationContext()).a(this.f11346b.be(), new e(this.f11291v, this.f11346b, this.J));
                b.a(this.f11345a.getApplicationContext()).a(this.f11346b.bd(), new com.anythink.expressad.video.module.a.a.j(this.f11292w, t.b(a.b().d(), 8.0f)));
                this.f11294z.setText(this.f11346b.bb());
                this.A.setText(this.f11346b.bc());
                this.B.setText(this.f11346b.aY() + ")");
                this.C.removeAllViews();
                double aX = this.f11346b.aX();
                if (aX <= 0.0d) {
                    aX = 5.0d;
                }
                this.C.initScore(aX);
                try {
                    Bitmap a10 = a(this.f11291v.getDrawable());
                    if (a10 != null && (blurBitmap = blurBitmap(a10)) != null) {
                        this.f11290u.setImageBitmap(blurBitmap);
                    }
                } catch (Throwable unused) {
                    this.f11290u.setVisibility(8);
                }
                if (!TextUtils.isEmpty(this.f11346b.I()) && this.f11346b.I().contains("alecfc=1")) {
                    this.D = true;
                }
                if (TextUtils.isEmpty(this.f11346b.aE())) {
                    aE = com.anythink.expressad.a.f6554ab;
                } else {
                    aE = this.f11346b.aE();
                }
                b.a(this.f11345a.getApplicationContext()).a(aE, new c() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.2
                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(String str, String str2) {
                    }

                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(Bitmap bitmap, String str) {
                        if (bitmap == null || bitmap.isRecycled()) {
                            return;
                        }
                        try {
                            int b10 = t.b(AnythinkBTNativeEC.this.f11345a, 12.0f);
                            AnythinkBTNativeEC.this.f11293x.getLayoutParams().height = b10;
                            AnythinkBTNativeEC.this.f11293x.getLayoutParams().width = (int) (b10 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                            AnythinkBTNativeEC.this.f11293x.setImageBitmap(bitmap);
                            AnythinkBTNativeEC.this.f11293x.setBackgroundColor(1426063360);
                        } catch (Throwable unused2) {
                        }
                    }
                });
                a.b().e();
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.d.a b10 = com.anythink.expressad.d.b.b();
                if (b10 != null) {
                    final String J = b10.J();
                    if (TextUtils.isEmpty(J)) {
                        this.y.setVisibility(8);
                    }
                    this.y.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            l.b(AnythinkBTNativeEC.this.f11345a, J);
                        }
                    });
                } else {
                    this.y.setVisibility(8);
                }
                if (!this.E) {
                    this.H.setVisibility(8);
                }
            }
        } catch (Throwable th) {
            o.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setCreateWebView(WebView webView) {
        this.L = webView;
    }

    public void setJSCommon(j jVar) {
        this.K = jVar;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void setUnitId(String str) {
        this.J = str;
    }

    private void a(View view) {
        if (view == null) {
            init(this.f11345a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        b(view);
        a();
    }

    private boolean b(int i10) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f.inflate(i10, (ViewGroup) null);
            this.f11288s = viewGroup;
            addView(viewGroup);
            return b(this.f11288s);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f.inflate(i10, (ViewGroup) null);
        this.f11287r = viewGroup2;
        addView(viewGroup2);
        return b(this.f11287r);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(int r3) {
        /*
            r2 = this;
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L15
            java.lang.String r0 = com.anythink.expressad.foundation.g.a.ce     // Catch: org.json.JSONException -> L10 java.lang.Throwable -> L13
            org.json.JSONObject r3 = r2.a(r3)     // Catch: org.json.JSONException -> L10 java.lang.Throwable -> L13
            r1.put(r0, r3)     // Catch: org.json.JSONException -> L10 java.lang.Throwable -> L13
            goto L1a
        L10:
            r3 = move-exception
            r0 = r1
            goto L16
        L13:
            r3 = move-exception
            goto L2c
        L15:
            r3 = move-exception
        L16:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L13
            r1 = r0
        L1a:
            com.anythink.expressad.video.signal.a.j r3 = r2.K     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L2b
            if (r1 == 0) goto L25
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L13
            goto L27
        L25:
            java.lang.String r0 = ""
        L27:
            r1 = 1
            r3.click(r1, r0)     // Catch: java.lang.Throwable -> L13
        L2b:
            return
        L2c:
            java.lang.String r0 = "BTBaseView"
            java.lang.String r3 = r3.getMessage()
            com.anythink.expressad.foundation.h.o.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.c(int):void");
    }

    public AnythinkBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = false;
        this.E = false;
        this.F = 0;
    }

    private boolean b(View view) {
        try {
            this.f11289t = (RelativeLayout) view.findViewById(findID("anythink_native_ec_layout"));
            this.f11290u = (ImageView) view.findViewById(findID("anythink_iv_adbanner_bg"));
            this.f11291v = (RoundImageView) view.findViewById(findID("anythink_iv_adbanner"));
            this.f11292w = (ImageView) view.findViewById(findID("anythink_iv_icon"));
            this.f11293x = (ImageView) view.findViewById(findID("anythink_iv_flag"));
            this.y = (ImageView) view.findViewById(findID("anythink_iv_link"));
            this.f11294z = (TextView) view.findViewById(findID("anythink_tv_apptitle"));
            this.A = (TextView) view.findViewById(findID("anythink_tv_appdesc"));
            this.B = (TextView) view.findViewById(findID("anythink_tv_nuater"));
            this.C = (StarLevelView) view.findViewById(findID("anythink_sv_starlevel"));
            this.H = view.findViewById(findID("anythink_iv_close"));
            View findViewById = view.findViewById(findID("anythink_tv_cta"));
            this.I = findViewById;
            return isNotNULL(this.f11290u, this.f11291v, this.f11292w, this.f11294z, this.A, this.B, this.C, this.H, findViewById);
        } catch (Throwable th) {
            o.b(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public final void a() {
        if (this.f11351h) {
            this.f11289t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTNativeEC.this.D) {
                        AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, 1);
                        AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                    }
                }
            });
            this.H.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTNativeEC.this.L != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", AnythinkBTNativeEC.this.f11348d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("unitId", AnythinkBTNativeEC.this.J);
                            jSONObject.put("data", jSONObject2);
                            o.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
                        } catch (JSONException e10) {
                            o.a(BTBaseView.TAG, e10.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a(AnythinkBTNativeEC.this.L, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            });
            this.I.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.6
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, 0);
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.f11292w.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.7
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, 0);
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.f11291v.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.8
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, 0);
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                }
            });
        }
    }

    private static Bitmap a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            o.a(BTBaseView.TAG, th.getMessage());
            return null;
        }
    }

    private void a(float f, float f10) {
        if (this.L != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.f11343n);
                jSONObject.put("id", this.f11348d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f));
                jSONObject2.put("y", String.valueOf(f10));
                jSONObject.put("data", jSONObject2);
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.a(this.L, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.anythink.expressad.video.bt.a.c.a();
                com.anythink.expressad.video.bt.a.c.a(this.L, "onClicked", this.f11348d);
            }
        }
    }

    private int b() {
        return findLayout(isLandscape() ? f11286q : f11285p);
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onDestory() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.anythink.expressad.video.bt.module.AnythinkBTNativeEC r2, int r3) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L15
            java.lang.String r0 = com.anythink.expressad.foundation.g.a.ce     // Catch: org.json.JSONException -> L10 java.lang.Throwable -> L13
            org.json.JSONObject r3 = r2.a(r3)     // Catch: org.json.JSONException -> L10 java.lang.Throwable -> L13
            r1.put(r0, r3)     // Catch: org.json.JSONException -> L10 java.lang.Throwable -> L13
            goto L1a
        L10:
            r3 = move-exception
            r0 = r1
            goto L16
        L13:
            r2 = move-exception
            goto L2c
        L15:
            r3 = move-exception
        L16:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L13
            r1 = r0
        L1a:
            com.anythink.expressad.video.signal.a.j r2 = r2.K     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L2b
            if (r1 == 0) goto L25
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L13
            goto L27
        L25:
            java.lang.String r3 = ""
        L27:
            r0 = 1
            r2.click(r0, r3)     // Catch: java.lang.Throwable -> L13
        L2b:
            return
        L2c:
            java.lang.String r3 = "BTBaseView"
            java.lang.String r2 = r2.getMessage()
            com.anythink.expressad.foundation.h.o.a(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.a(com.anythink.expressad.video.bt.module.AnythinkBTNativeEC, int):void");
    }

    public static /* synthetic */ void a(AnythinkBTNativeEC anythinkBTNativeEC, float f, float f10) {
        if (anythinkBTNativeEC.L != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.f11343n);
                jSONObject.put("id", anythinkBTNativeEC.f11348d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f));
                jSONObject2.put("y", String.valueOf(f10));
                jSONObject.put("data", jSONObject2);
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.a(anythinkBTNativeEC.L, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.anythink.expressad.video.bt.a.c.a();
                com.anythink.expressad.video.bt.a.c.a(anythinkBTNativeEC.L, "onClicked", anythinkBTNativeEC.f11348d);
            }
        }
    }
}
