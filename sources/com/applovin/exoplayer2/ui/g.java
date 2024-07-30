package com.applovin.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.ui.AspectRatioFrameLayout;
import com.applovin.exoplayer2.ui.f;
import com.applovin.sdk.R;
import com.huawei.hms.ads.gl;
import d0.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class g extends FrameLayout {
    private boolean A;

    /* renamed from: a, reason: collision with root package name */
    private final a f16760a;

    /* renamed from: b, reason: collision with root package name */
    private final AspectRatioFrameLayout f16761b;

    /* renamed from: c, reason: collision with root package name */
    private final View f16762c;

    /* renamed from: d, reason: collision with root package name */
    private final View f16763d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16764e;
    private final ImageView f;

    /* renamed from: g, reason: collision with root package name */
    private final SubtitleView f16765g;

    /* renamed from: h, reason: collision with root package name */
    private final View f16766h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f16767i;

    /* renamed from: j, reason: collision with root package name */
    private final f f16768j;

    /* renamed from: k, reason: collision with root package name */
    private final FrameLayout f16769k;

    /* renamed from: l, reason: collision with root package name */
    private final FrameLayout f16770l;

    /* renamed from: m, reason: collision with root package name */
    private an f16771m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16772n;
    private f.d o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16773p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f16774q;

    /* renamed from: r, reason: collision with root package name */
    private int f16775r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f16776s;

    /* renamed from: t, reason: collision with root package name */
    private com.applovin.exoplayer2.l.k<? super ak> f16777t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f16778u;

    /* renamed from: v, reason: collision with root package name */
    private int f16779v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f16780w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f16781x;
    private boolean y;

    /* renamed from: z, reason: collision with root package name */
    private int f16782z;

    public g(Context context) {
        this(context, null);
    }

    @SuppressLint({"InlinedApi"})
    private boolean a(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        f fVar = this.f16768j;
        String str = null;
        if (fVar != null && this.f16772n) {
            if (fVar.getVisibility() == 0) {
                if (this.y) {
                    str = getResources().getString(R.string.al_exo_controls_hide);
                }
                setContentDescription(str);
                return;
            }
            setContentDescription(getResources().getString(R.string.al_exo_controls_show));
            return;
        }
        setContentDescription(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (g() && this.f16781x) {
            b();
        } else {
            a(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        an anVar = this.f16771m;
        if (anVar != null && anVar.K()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean a10 = a(keyEvent.getKeyCode());
        if (a10 && c() && !this.f16768j.c()) {
            a(true);
            return true;
        }
        if (!a(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            if (a10 && c()) {
                a(true);
            }
            return false;
        }
        a(true);
        return true;
    }

    public List<com.applovin.exoplayer2.ui.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f16770l;
        if (frameLayout != null) {
            arrayList.add(new com.applovin.exoplayer2.ui.a(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        f fVar = this.f16768j;
        if (fVar != null) {
            arrayList.add(new com.applovin.exoplayer2.ui.a(fVar, 0));
        }
        return s.a((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) com.applovin.exoplayer2.l.a.a(this.f16769k, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f16780w;
    }

    public boolean getControllerHideOnTouch() {
        return this.y;
    }

    public int getControllerShowTimeoutMs() {
        return this.f16779v;
    }

    public Drawable getDefaultArtwork() {
        return this.f16774q;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f16770l;
    }

    public an getPlayer() {
        return this.f16771m;
    }

    public int getResizeMode() {
        com.applovin.exoplayer2.l.a.a(this.f16761b);
        return this.f16761b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f16765g;
    }

    public boolean getUseArtwork() {
        return this.f16773p;
    }

    public boolean getUseController() {
        return this.f16772n;
    }

    public View getVideoSurfaceView() {
        return this.f16763d;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c() || this.f16771m == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 || !this.A) {
                return false;
            }
            this.A = false;
            performClick();
            return true;
        }
        this.A = true;
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (c() && this.f16771m != null) {
            a(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return e();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.a aVar) {
        com.applovin.exoplayer2.l.a.a(this.f16761b);
        this.f16761b.setAspectRatioListener(aVar);
    }

    @Deprecated
    public void setControlDispatcher(com.applovin.exoplayer2.i iVar) {
        com.applovin.exoplayer2.l.a.a(this.f16768j);
        this.f16768j.setControlDispatcher(iVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f16780w = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f16781x = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f16768j);
        this.y = z10;
        m();
    }

    public void setControllerShowTimeoutMs(int i10) {
        com.applovin.exoplayer2.l.a.a(this.f16768j);
        this.f16779v = i10;
        if (this.f16768j.c()) {
            a();
        }
    }

    public void setControllerVisibilityListener(f.d dVar) {
        com.applovin.exoplayer2.l.a.a(this.f16768j);
        f.d dVar2 = this.o;
        if (dVar2 == dVar) {
            return;
        }
        if (dVar2 != null) {
            this.f16768j.b(dVar2);
        }
        this.o = dVar;
        if (dVar != null) {
            this.f16768j.a(dVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z10;
        if (this.f16767i != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
        this.f16778u = charSequence;
        l();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f16774q != drawable) {
            this.f16774q = drawable;
            c(false);
        }
    }

    public void setErrorMessageProvider(com.applovin.exoplayer2.l.k<? super ak> kVar) {
        if (this.f16777t != kVar) {
            this.f16777t = kVar;
            l();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f16776s != z10) {
            this.f16776s = z10;
            c(false);
        }
    }

    public void setPlayer(an anVar) {
        boolean z10;
        boolean z11;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
        if (anVar != null && anVar.r() != Looper.getMainLooper()) {
            z11 = false;
        } else {
            z11 = true;
        }
        com.applovin.exoplayer2.l.a.a(z11);
        an anVar2 = this.f16771m;
        if (anVar2 == anVar) {
            return;
        }
        if (anVar2 != null) {
            anVar2.b(this.f16760a);
            if (anVar2.a(26)) {
                View view = this.f16763d;
                if (view instanceof TextureView) {
                    anVar2.b((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    anVar2.b((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f16765g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f16771m = anVar;
        if (c()) {
            this.f16768j.setPlayer(anVar);
        }
        k();
        l();
        c(true);
        if (anVar != null) {
            if (anVar.a(26)) {
                View view2 = this.f16763d;
                if (view2 instanceof TextureView) {
                    anVar.a((TextureView) view2);
                } else if (view2 instanceof SurfaceView) {
                    anVar.a((SurfaceView) view2);
                }
                h();
            }
            if (this.f16765g != null && anVar.a(27)) {
                this.f16765g.setCues(anVar.V());
            }
            anVar.a(this.f16760a);
            a(false);
            return;
        }
        b();
    }

    public void setRepeatToggleModes(int i10) {
        com.applovin.exoplayer2.l.a.a(this.f16768j);
        this.f16768j.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        com.applovin.exoplayer2.l.a.a(this.f16761b);
        this.f16761b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f16775r != i10) {
            this.f16775r = i10;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f16768j);
        this.f16768j.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f16768j);
        this.f16768j.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f16768j);
        this.f16768j.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f16768j);
        this.f16768j.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f16768j);
        this.f16768j.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        com.applovin.exoplayer2.l.a.a(this.f16768j);
        this.f16768j.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f16762c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        boolean z11;
        if (z10 && this.f == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        com.applovin.exoplayer2.l.a.b(z11);
        if (this.f16773p != z10) {
            this.f16773p = z10;
            c(false);
        }
    }

    public void setUseController(boolean z10) {
        boolean z11;
        if (z10 && this.f16768j == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        com.applovin.exoplayer2.l.a.b(z11);
        if (this.f16772n == z10) {
            return;
        }
        this.f16772n = z10;
        if (c()) {
            this.f16768j.setPlayer(this.f16771m);
        } else {
            f fVar = this.f16768j;
            if (fVar != null) {
                fVar.b();
                this.f16768j.setPlayer(null);
            }
        }
        m();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f16763d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    /* loaded from: classes.dex */
    public final class a implements View.OnClickListener, View.OnLayoutChangeListener, an.d, f.d {

        /* renamed from: b, reason: collision with root package name */
        private final ba.a f16784b = new ba.a();

        /* renamed from: c, reason: collision with root package name */
        private Object f16785c;

        public a() {
        }

        @Override // com.applovin.exoplayer2.an.d
        public void a(List<com.applovin.exoplayer2.i.a> list) {
            if (g.this.f16765g != null) {
                g.this.f16765g.setCues(list);
            }
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void b(int i10) {
            g.this.k();
            g.this.l();
            g.this.n();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.e();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            g.b((TextureView) view, g.this.f16782z);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.m.n
        public void a(com.applovin.exoplayer2.m.o oVar) {
            g.this.h();
        }

        @Override // com.applovin.exoplayer2.an.d
        public void a() {
            if (g.this.f16762c != null) {
                g.this.f16762c.setVisibility(4);
            }
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void b(boolean z10, int i10) {
            g.this.k();
            g.this.n();
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void a(ad adVar, com.applovin.exoplayer2.j.h hVar) {
            an anVar = (an) com.applovin.exoplayer2.l.a.b(g.this.f16771m);
            ba S = anVar.S();
            if (S.d()) {
                this.f16785c = null;
            } else if (!anVar.P().a()) {
                this.f16785c = S.a(anVar.F(), this.f16784b, true).f13577b;
            } else {
                Object obj = this.f16785c;
                if (obj != null) {
                    int c10 = S.c(obj);
                    if (c10 != -1) {
                        if (anVar.G() == S.a(c10, this.f16784b).f13578c) {
                            return;
                        }
                    }
                    this.f16785c = null;
                }
            }
            g.this.c(false);
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void a(an.e eVar, an.e eVar2, int i10) {
            if (g.this.g() && g.this.f16781x) {
                g.this.b();
            }
        }

        @Override // com.applovin.exoplayer2.ui.f.d
        public void a(int i10) {
            g.this.m();
        }
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean c() {
        if (!this.f16772n) {
            return false;
        }
        com.applovin.exoplayer2.l.a.a(this.f16768j);
        return true;
    }

    private boolean d() {
        if (!this.f16773p) {
            return false;
        }
        com.applovin.exoplayer2.l.a.a(this.f);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        if (!c() || this.f16771m == null) {
            return false;
        }
        if (!this.f16768j.c()) {
            a(true);
        } else if (this.y) {
            this.f16768j.b();
        }
        return true;
    }

    private boolean f() {
        an anVar = this.f16771m;
        if (anVar == null) {
            return true;
        }
        int t10 = anVar.t();
        return this.f16780w && (t10 == 1 || t10 == 4 || !this.f16771m.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        an anVar = this.f16771m;
        return anVar != null && anVar.K() && this.f16771m.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        an anVar = this.f16771m;
        com.applovin.exoplayer2.m.o T = anVar != null ? anVar.T() : com.applovin.exoplayer2.m.o.f16538a;
        int i10 = T.f16539b;
        int i11 = T.f16540c;
        int i12 = T.f16541d;
        float f = gl.Code;
        float f10 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * T.f16542e) / i11;
        View view = this.f16763d;
        if (view instanceof TextureView) {
            if (f10 > gl.Code && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            if (this.f16782z != 0) {
                view.removeOnLayoutChangeListener(this.f16760a);
            }
            this.f16782z = i12;
            if (i12 != 0) {
                this.f16763d.addOnLayoutChangeListener(this.f16760a);
            }
            b((TextureView) this.f16763d, this.f16782z);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f16761b;
        if (!this.f16764e) {
            f = f10;
        }
        a(aspectRatioFrameLayout, f);
    }

    private void i() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.f.setVisibility(4);
        }
    }

    private void j() {
        View view = this.f16762c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r4.f16771m.x() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k() {
        /*
            r4 = this;
            android.view.View r0 = r4.f16766h
            if (r0 == 0) goto L2b
            com.applovin.exoplayer2.an r0 = r4.f16771m
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.t()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.f16775r
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            com.applovin.exoplayer2.an r0 = r4.f16771m
            boolean r0 = r0.x()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            android.view.View r0 = r4.f16766h
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.g.k():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        com.applovin.exoplayer2.l.k<? super ak> kVar;
        TextView textView = this.f16767i;
        if (textView != null) {
            CharSequence charSequence = this.f16778u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f16767i.setVisibility(0);
                return;
            }
            an anVar = this.f16771m;
            ak e10 = anVar != null ? anVar.e() : null;
            if (e10 != null && (kVar = this.f16777t) != null) {
                this.f16767i.setText((CharSequence) kVar.a(e10).second);
                this.f16767i.setVisibility(0);
            } else {
                this.f16767i.setVisibility(8);
            }
        }
    }

    public void b() {
        f fVar = this.f16768j;
        if (fVar != null) {
            fVar.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        boolean z13;
        boolean z14;
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        int i17;
        boolean z18;
        a aVar = new a();
        this.f16760a = aVar;
        if (isInEditMode()) {
            this.f16761b = null;
            this.f16762c = null;
            this.f16763d = null;
            this.f16764e = false;
            this.f = null;
            this.f16765g = null;
            this.f16766h = null;
            this.f16767i = null;
            this.f16768j = null;
            this.f16769k = null;
            this.f16770l = null;
            ImageView imageView = new ImageView(context);
            if (ai.f16274a >= 23) {
                a(getResources(), imageView);
            } else {
                b(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i18 = R.layout.applovin_exo_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinPlayerView, i10, 0);
            try {
                int i19 = R.styleable.AppLovinPlayerView_al_shutter_background_color;
                boolean hasValue = obtainStyledAttributes.hasValue(i19);
                int color = obtainStyledAttributes.getColor(i19, 0);
                int resourceId = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_player_layout_id, i18);
                boolean z19 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_artwork, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_default_artwork, 0);
                boolean z20 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_controller, true);
                int i20 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_surface_type, 1);
                int i21 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_resize_mode, 0);
                int i22 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_show_timeout, 5000);
                boolean z21 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_on_touch, true);
                boolean z22 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_auto_show, true);
                i13 = obtainStyledAttributes.getInteger(R.styleable.AppLovinPlayerView_al_show_buffering, 0);
                this.f16776s = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_keep_content_on_player_reset, this.f16776s);
                boolean z23 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z12 = z21;
                z10 = z22;
                i12 = i21;
                z15 = z20;
                i16 = resourceId2;
                z14 = z19;
                z13 = hasValue;
                i15 = color;
                i14 = i20;
                i18 = resourceId;
                i11 = i22;
                z11 = z23;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i11 = 5000;
            z10 = true;
            i12 = 0;
            i13 = 0;
            z11 = true;
            z12 = true;
            i14 = 1;
            i15 = 0;
            z13 = false;
            z14 = true;
            i16 = 0;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i18, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.al_exo_content_frame);
        this.f16761b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            a(aspectRatioFrameLayout, i12);
        }
        View findViewById = findViewById(R.id.al_exo_shutter);
        this.f16762c = findViewById;
        if (findViewById != null && z13) {
            findViewById.setBackgroundColor(i15);
        }
        if (aspectRatioFrameLayout != null && i14 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i14 == 2) {
                z16 = true;
                this.f16763d = new TextureView(context);
            } else if (i14 != 3) {
                if (i14 != 4) {
                    this.f16763d = new SurfaceView(context);
                } else {
                    try {
                        int i23 = com.applovin.exoplayer2.m.i.f16493s;
                        this.f16763d = (View) com.applovin.exoplayer2.m.i.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e10) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                    }
                }
                z16 = true;
            } else {
                try {
                    int i24 = com.applovin.exoplayer2.m.a.i.f16420s;
                    z16 = true;
                    this.f16763d = (View) com.applovin.exoplayer2.m.a.i.class.getConstructor(Context.class).newInstance(context);
                    z18 = true;
                    this.f16763d.setLayoutParams(layoutParams);
                    this.f16763d.setOnClickListener(aVar);
                    this.f16763d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f16763d, 0);
                    z17 = z18;
                } catch (Exception e11) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z18 = false;
            this.f16763d.setLayoutParams(layoutParams);
            this.f16763d.setOnClickListener(aVar);
            this.f16763d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f16763d, 0);
            z17 = z18;
        } else {
            z16 = true;
            this.f16763d = null;
            z17 = false;
        }
        this.f16764e = z17;
        this.f16769k = (FrameLayout) findViewById(R.id.al_exo_ad_overlay);
        this.f16770l = (FrameLayout) findViewById(R.id.al_exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_artwork);
        this.f = imageView2;
        this.f16773p = (!z14 || imageView2 == null) ? false : z16;
        if (i16 != 0) {
            Context context2 = getContext();
            Object obj = d0.a.f27248a;
            this.f16774q = a.c.b(context2, i16);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.al_exo_subtitles);
        this.f16765g = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.c();
        }
        View findViewById2 = findViewById(R.id.al_exo_buffering);
        this.f16766h = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f16775r = i13;
        TextView textView = (TextView) findViewById(R.id.al_exo_error_message);
        this.f16767i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i25 = R.id.al_exo_controller;
        f fVar = (f) findViewById(i25);
        View findViewById3 = findViewById(R.id.al_exo_controller_placeholder);
        if (fVar != null) {
            this.f16768j = fVar;
            i17 = 0;
        } else if (findViewById3 != null) {
            i17 = 0;
            f fVar2 = new f(context, null, 0, attributeSet);
            this.f16768j = fVar2;
            fVar2.setId(i25);
            fVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(fVar2, indexOfChild);
        } else {
            i17 = 0;
            this.f16768j = null;
        }
        f fVar3 = this.f16768j;
        this.f16779v = fVar3 != null ? i11 : i17;
        this.y = z12;
        this.f16780w = z10;
        this.f16781x = z11;
        this.f16772n = (!z15 || fVar3 == null) ? i17 : z16;
        b();
        m();
        f fVar4 = this.f16768j;
        if (fVar4 != null) {
            fVar4.a(aVar);
        }
    }

    private void b(boolean z10) {
        if (c()) {
            this.f16768j.setShowTimeoutMs(z10 ? 0 : this.f16779v);
            this.f16768j.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z10) {
        an anVar = this.f16771m;
        if (anVar != null && !anVar.P().a()) {
            if (z10 && !this.f16776s) {
                j();
            }
            com.applovin.exoplayer2.j.h Q = anVar.Q();
            for (int i10 = 0; i10 < Q.f15985a; i10++) {
                com.applovin.exoplayer2.j.g a10 = Q.a(i10);
                if (a10 != null) {
                    for (int i11 = 0; i11 < a10.e(); i11++) {
                        if (u.e(a10.a(i11).f16838l) == 2) {
                            i();
                            return;
                        }
                    }
                }
            }
            j();
            if (d() && (a(anVar.R()) || a(this.f16774q))) {
                return;
            }
            i();
            return;
        }
        if (this.f16776s) {
            return;
        }
        i();
        j();
    }

    public boolean a(KeyEvent keyEvent) {
        return c() && this.f16768j.a(keyEvent);
    }

    public void a() {
        b(f());
    }

    private static void b(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color));
    }

    public void a(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    private void a(boolean z10) {
        if (!(g() && this.f16781x) && c()) {
            boolean z11 = this.f16768j.c() && this.f16768j.getShowTimeoutMs() <= 0;
            boolean f = f();
            if (z10 || z11 || f) {
                b(f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != gl.Code && height != gl.Code && i10 != 0) {
            float f = width / 2.0f;
            float f10 = height / 2.0f;
            matrix.postRotate(i10, f, f10);
            RectF rectF = new RectF(gl.Code, gl.Code, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f10);
        }
        textureView.setTransform(matrix);
    }

    private boolean a(ac acVar) {
        byte[] bArr = acVar.f13093l;
        if (bArr == null) {
            return false;
        }
        return a(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private boolean a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                a(this.f16761b, intrinsicWidth / intrinsicHeight);
                this.f.setImageDrawable(drawable);
                this.f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void a(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color, null));
    }

    private static void a(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }
}
