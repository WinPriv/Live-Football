package com.applovin.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.l.ab;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.t;
import com.applovin.exoplayer2.ui.k;
import com.applovin.sdk.R;
import com.huawei.hms.ads.gl;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class f extends FrameLayout {
    private final Drawable A;
    private final Drawable B;
    private final float C;
    private final float D;
    private final String E;
    private final String F;
    private an G;
    private com.applovin.exoplayer2.i H;
    private c I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private long[] W;

    /* renamed from: a */
    private final b f16732a;

    /* renamed from: aa */
    private boolean[] f16733aa;

    /* renamed from: ab */
    private long[] f16734ab;

    /* renamed from: ac */
    private boolean[] f16735ac;

    /* renamed from: ad */
    private long f16736ad;
    private long ae;
    private long af;

    /* renamed from: b */
    private final CopyOnWriteArrayList<d> f16737b;

    /* renamed from: c */
    private final View f16738c;

    /* renamed from: d */
    private final View f16739d;

    /* renamed from: e */
    private final View f16740e;
    private final View f;

    /* renamed from: g */
    private final View f16741g;

    /* renamed from: h */
    private final View f16742h;

    /* renamed from: i */
    private final ImageView f16743i;

    /* renamed from: j */
    private final ImageView f16744j;

    /* renamed from: k */
    private final View f16745k;

    /* renamed from: l */
    private final TextView f16746l;

    /* renamed from: m */
    private final TextView f16747m;

    /* renamed from: n */
    private final k f16748n;
    private final StringBuilder o;

    /* renamed from: p */
    private final Formatter f16749p;

    /* renamed from: q */
    private final ba.a f16750q;

    /* renamed from: r */
    private final ba.c f16751r;

    /* renamed from: s */
    private final Runnable f16752s;

    /* renamed from: t */
    private final Runnable f16753t;

    /* renamed from: u */
    private final Drawable f16754u;

    /* renamed from: v */
    private final Drawable f16755v;

    /* renamed from: w */
    private final Drawable f16756w;

    /* renamed from: x */
    private final String f16757x;
    private final String y;

    /* renamed from: z */
    private final String f16758z;

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* loaded from: classes.dex */
    public final class b implements View.OnClickListener, an.d, k.a {
        private b() {
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void a(an anVar, an.c cVar) {
            if (cVar.a(4, 5)) {
                f.this.f();
            }
            if (cVar.a(4, 5, 7)) {
                f.this.k();
            }
            if (cVar.a(8)) {
                f.this.h();
            }
            if (cVar.a(9)) {
                f.this.i();
            }
            if (cVar.a(8, 9, 11, 0, 13)) {
                f.this.g();
            }
            if (cVar.a(11, 0)) {
                f.this.j();
            }
        }

        @Override // com.applovin.exoplayer2.ui.k.a
        public void b(k kVar, long j10) {
            if (f.this.f16747m != null) {
                f.this.f16747m.setText(ai.a(f.this.o, f.this.f16749p, j10));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            an anVar = f.this.G;
            if (anVar == null) {
                return;
            }
            if (f.this.f16739d == view) {
                f.this.H.c(anVar);
                return;
            }
            if (f.this.f16738c == view) {
                f.this.H.b(anVar);
                return;
            }
            if (f.this.f16741g == view) {
                if (anVar.t() != 4) {
                    f.this.H.e(anVar);
                    return;
                }
                return;
            }
            if (f.this.f16742h == view) {
                f.this.H.d(anVar);
                return;
            }
            if (f.this.f16740e == view) {
                f.this.b(anVar);
                return;
            }
            if (f.this.f == view) {
                f.this.c(anVar);
            } else if (f.this.f16743i == view) {
                f.this.H.a(anVar, ab.a(anVar.y(), f.this.P));
            } else if (f.this.f16744j == view) {
                f.this.H.b(anVar, !anVar.z());
            }
        }

        public /* synthetic */ b(f fVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.applovin.exoplayer2.ui.k.a
        public void a(k kVar, long j10) {
            f.this.M = true;
            if (f.this.f16747m != null) {
                f.this.f16747m.setText(ai.a(f.this.o, f.this.f16749p, j10));
            }
        }

        @Override // com.applovin.exoplayer2.ui.k.a
        public void a(k kVar, long j10, boolean z10) {
            f.this.M = false;
            if (z10 || f.this.G == null) {
                return;
            }
            f fVar = f.this;
            fVar.a(fVar.G, j10);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(long j10, long j11);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(int i10);
    }

    static {
        t.a("goog.exo.ui");
    }

    public f(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int i11 = R.layout.applovin_exo_player_control_view;
        this.N = 5000;
        this.P = 0;
        this.O = 200;
        this.V = com.anythink.expressad.exoplayer.b.f7291b;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinPlayerControlView, i10, 0);
            try {
                this.N = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_show_timeout, this.N);
                i11 = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerControlView_al_controller_layout_id, i11);
                this.P = a(obtainStyledAttributes, this.P);
                this.Q = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_rewind_button, this.Q);
                this.R = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_fastforward_button, this.R);
                this.S = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_previous_button, this.S);
                this.T = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_next_button, this.T);
                this.U = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_shuffle_button, this.U);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_time_bar_min_update_interval, this.O));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f16737b = new CopyOnWriteArrayList<>();
        this.f16750q = new ba.a();
        this.f16751r = new ba.c();
        StringBuilder sb2 = new StringBuilder();
        this.o = sb2;
        this.f16749p = new Formatter(sb2, Locale.getDefault());
        this.W = new long[0];
        this.f16733aa = new boolean[0];
        this.f16734ab = new long[0];
        this.f16735ac = new boolean[0];
        b bVar = new b();
        this.f16732a = bVar;
        this.H = new com.applovin.exoplayer2.j();
        this.f16752s = new androidx.activity.k(this, 3);
        this.f16753t = new androidx.activity.g(this, 2);
        LayoutInflater.from(context).inflate(i11, this);
        setDescendantFocusability(262144);
        int i12 = R.id.al_exo_progress;
        k kVar = (k) findViewById(i12);
        View findViewById = findViewById(R.id.al_exo_progress_placeholder);
        if (kVar != null) {
            this.f16748n = kVar;
        } else if (findViewById != null) {
            com.applovin.exoplayer2.ui.d dVar = new com.applovin.exoplayer2.ui.d(context, null, 0, attributeSet2);
            dVar.setId(i12);
            dVar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(dVar, indexOfChild);
            this.f16748n = dVar;
        } else {
            this.f16748n = null;
        }
        this.f16746l = (TextView) findViewById(R.id.al_exo_duration);
        this.f16747m = (TextView) findViewById(R.id.al_exo_position);
        k kVar2 = this.f16748n;
        if (kVar2 != null) {
            kVar2.a(bVar);
        }
        View findViewById2 = findViewById(R.id.al_exo_play);
        this.f16740e = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(bVar);
        }
        View findViewById3 = findViewById(R.id.al_exo_pause);
        this.f = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(bVar);
        }
        View findViewById4 = findViewById(R.id.al_exo_prev);
        this.f16738c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(bVar);
        }
        View findViewById5 = findViewById(R.id.al_exo_next);
        this.f16739d = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(bVar);
        }
        View findViewById6 = findViewById(R.id.al_exo_rew);
        this.f16742h = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(bVar);
        }
        View findViewById7 = findViewById(R.id.al_exo_ffwd);
        this.f16741g = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.al_exo_repeat_toggle);
        this.f16743i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_shuffle);
        this.f16744j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View findViewById8 = findViewById(R.id.al_exo_vr);
        this.f16745k = findViewById8;
        setShowVrButton(false);
        a(false, false, findViewById8);
        Resources resources = context.getResources();
        this.C = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.D = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f16754u = resources.getDrawable(R.drawable.al_exo_controls_repeat_off);
        this.f16755v = resources.getDrawable(R.drawable.al_exo_controls_repeat_one);
        this.f16756w = resources.getDrawable(R.drawable.al_exo_controls_repeat_all);
        this.A = resources.getDrawable(R.drawable.al_exo_controls_shuffle_on);
        this.B = resources.getDrawable(R.drawable.al_exo_controls_shuffle_off);
        this.f16757x = resources.getString(R.string.al_exo_controls_repeat_off_description);
        this.y = resources.getString(R.string.al_exo_controls_repeat_one_description);
        this.f16758z = resources.getString(R.string.al_exo_controls_repeat_all_description);
        this.E = resources.getString(R.string.al_exo_controls_shuffle_on_description);
        this.F = resources.getString(R.string.al_exo_controls_shuffle_off_description);
    }

    @SuppressLint({"InlinedApi"})
    private static boolean a(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!a(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f16753t);
        } else if (motionEvent.getAction() == 1) {
            d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public an getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.P;
    }

    public boolean getShowShuffleButton() {
        return this.U;
    }

    public int getShowTimeoutMs() {
        return this.N;
    }

    public boolean getShowVrButton() {
        View view = this.f16745k;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        long j10 = this.V;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            long uptimeMillis = j10 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                b();
            } else {
                postDelayed(this.f16753t, uptimeMillis);
            }
        } else if (c()) {
            d();
        }
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        removeCallbacks(this.f16752s);
        removeCallbacks(this.f16753t);
    }

    @Deprecated
    public void setControlDispatcher(com.applovin.exoplayer2.i iVar) {
        if (this.H != iVar) {
            this.H = iVar;
            g();
        }
    }

    public void setPlayer(an anVar) {
        boolean z10;
        boolean z11 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
        if (anVar != null && anVar.r() != Looper.getMainLooper()) {
            z11 = false;
        }
        com.applovin.exoplayer2.l.a.a(z11);
        an anVar2 = this.G;
        if (anVar2 == anVar) {
            return;
        }
        if (anVar2 != null) {
            anVar2.b(this.f16732a);
        }
        this.G = anVar;
        if (anVar != null) {
            anVar.a(this.f16732a);
        }
        e();
    }

    public void setProgressUpdateListener(c cVar) {
        this.I = cVar;
    }

    public void setRepeatToggleModes(int i10) {
        this.P = i10;
        an anVar = this.G;
        if (anVar != null) {
            int y = anVar.y();
            if (i10 == 0 && y != 0) {
                this.H.a(this.G, 0);
            } else if (i10 == 1 && y == 2) {
                this.H.a(this.G, 1);
            } else if (i10 == 2 && y == 1) {
                this.H.a(this.G, 2);
            }
        }
        h();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.R = z10;
        g();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.K = z10;
        j();
    }

    public void setShowNextButton(boolean z10) {
        this.T = z10;
        g();
    }

    public void setShowPreviousButton(boolean z10) {
        this.S = z10;
        g();
    }

    public void setShowRewindButton(boolean z10) {
        this.Q = z10;
        g();
    }

    public void setShowShuffleButton(boolean z10) {
        this.U = z10;
        i();
    }

    public void setShowTimeoutMs(int i10) {
        this.N = i10;
        if (c()) {
            d();
        }
    }

    public void setShowVrButton(boolean z10) {
        int i10;
        View view = this.f16745k;
        if (view != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.O = ai.a(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z10;
        View view = this.f16745k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            boolean showVrButton = getShowVrButton();
            if (onClickListener != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            a(showVrButton, z10, this.f16745k);
        }
    }

    private void d() {
        removeCallbacks(this.f16753t);
        if (this.N > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i10 = this.N;
            this.V = uptimeMillis + i10;
            if (this.J) {
                postDelayed(this.f16753t, i10);
                return;
            }
            return;
        }
        this.V = com.anythink.expressad.exoplayer.b.f7291b;
    }

    private void e() {
        f();
        g();
        h();
        i();
        j();
    }

    public void f() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (c() && this.J) {
            boolean n10 = n();
            View view = this.f16740e;
            boolean z13 = true;
            if (view != null) {
                z10 = (n10 && view.isFocused()) | false;
                if (ai.f16274a < 21) {
                    z12 = z10;
                } else {
                    z12 = n10 && a.a(this.f16740e);
                }
                z11 = z12 | false;
                this.f16740e.setVisibility(n10 ? 8 : 0);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.f;
            if (view2 != null) {
                z10 |= !n10 && view2.isFocused();
                if (ai.f16274a < 21) {
                    z13 = z10;
                } else if (n10 || !a.a(this.f)) {
                    z13 = false;
                }
                z11 |= z13;
                this.f.setVisibility(n10 ? 0 : 8);
            }
            if (z10) {
                l();
            }
            if (z11) {
                m();
            }
        }
    }

    public void g() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (c() && this.J) {
            an anVar = this.G;
            boolean z14 = false;
            if (anVar != null) {
                boolean a10 = anVar.a(4);
                boolean a11 = anVar.a(6);
                z13 = anVar.a(10) && this.H.a();
                if (anVar.a(11) && this.H.b()) {
                    z14 = true;
                }
                z11 = anVar.a(8);
                z10 = z14;
                z14 = a11;
                z12 = a10;
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            a(this.S, z14, this.f16738c);
            a(this.Q, z13, this.f16742h);
            a(this.R, z10, this.f16741g);
            a(this.T, z11, this.f16739d);
            k kVar = this.f16748n;
            if (kVar != null) {
                kVar.setEnabled(z12);
            }
        }
    }

    public void h() {
        ImageView imageView;
        if (c() && this.J && (imageView = this.f16743i) != null) {
            if (this.P == 0) {
                a(false, false, (View) imageView);
                return;
            }
            an anVar = this.G;
            if (anVar == null) {
                a(true, false, (View) imageView);
                this.f16743i.setImageDrawable(this.f16754u);
                this.f16743i.setContentDescription(this.f16757x);
                return;
            }
            a(true, true, (View) imageView);
            int y = anVar.y();
            if (y == 0) {
                this.f16743i.setImageDrawable(this.f16754u);
                this.f16743i.setContentDescription(this.f16757x);
            } else if (y == 1) {
                this.f16743i.setImageDrawable(this.f16755v);
                this.f16743i.setContentDescription(this.y);
            } else if (y == 2) {
                this.f16743i.setImageDrawable(this.f16756w);
                this.f16743i.setContentDescription(this.f16758z);
            }
            this.f16743i.setVisibility(0);
        }
    }

    public void i() {
        ImageView imageView;
        String str;
        if (c() && this.J && (imageView = this.f16744j) != null) {
            an anVar = this.G;
            if (!this.U) {
                a(false, false, (View) imageView);
                return;
            }
            if (anVar == null) {
                a(true, false, (View) imageView);
                this.f16744j.setImageDrawable(this.B);
                this.f16744j.setContentDescription(this.F);
                return;
            }
            a(true, true, (View) imageView);
            this.f16744j.setImageDrawable(anVar.z() ? this.A : this.B);
            ImageView imageView2 = this.f16744j;
            if (anVar.z()) {
                str = this.E;
            } else {
                str = this.F;
            }
            imageView2.setContentDescription(str);
        }
    }

    public void j() {
        long j10;
        int i10;
        ba.c cVar;
        an anVar = this.G;
        if (anVar == null) {
            return;
        }
        boolean z10 = true;
        this.L = this.K && a(anVar.S(), this.f16751r);
        long j11 = 0;
        this.f16736ad = 0L;
        ba S = anVar.S();
        if (S.d()) {
            j10 = 0;
            i10 = 0;
        } else {
            int G = anVar.G();
            boolean z11 = this.L;
            int i11 = z11 ? 0 : G;
            int b10 = z11 ? S.b() - 1 : G;
            long j12 = 0;
            i10 = 0;
            while (true) {
                if (i11 > b10) {
                    break;
                }
                if (i11 == G) {
                    this.f16736ad = com.applovin.exoplayer2.h.a(j12);
                }
                S.a(i11, this.f16751r);
                ba.c cVar2 = this.f16751r;
                if (cVar2.o == com.anythink.expressad.exoplayer.b.f7291b) {
                    com.applovin.exoplayer2.l.a.b(this.L ^ z10);
                    break;
                }
                int i12 = cVar2.f13601p;
                while (true) {
                    cVar = this.f16751r;
                    if (i12 <= cVar.f13602q) {
                        S.a(i12, this.f16750q);
                        int e10 = this.f16750q.e();
                        int d10 = this.f16750q.d();
                        while (e10 < d10) {
                            long a10 = this.f16750q.a(e10);
                            if (a10 == Long.MIN_VALUE) {
                                long j13 = this.f16750q.f13579d;
                                if (j13 == com.anythink.expressad.exoplayer.b.f7291b) {
                                    e10++;
                                    j11 = 0;
                                } else {
                                    a10 = j13;
                                }
                            }
                            long c10 = this.f16750q.c() + a10;
                            if (c10 >= j11) {
                                long[] jArr = this.W;
                                if (i10 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.W = Arrays.copyOf(jArr, length);
                                    this.f16733aa = Arrays.copyOf(this.f16733aa, length);
                                }
                                this.W[i10] = com.applovin.exoplayer2.h.a(c10 + j12);
                                this.f16733aa[i10] = this.f16750q.c(e10);
                                i10++;
                            }
                            e10++;
                            j11 = 0;
                        }
                        i12++;
                        j11 = 0;
                    }
                }
                j12 += cVar.o;
                i11++;
                z10 = true;
                j11 = 0;
            }
            j10 = j12;
        }
        long a11 = com.applovin.exoplayer2.h.a(j10);
        TextView textView = this.f16746l;
        if (textView != null) {
            textView.setText(ai.a(this.o, this.f16749p, a11));
        }
        k kVar = this.f16748n;
        if (kVar != null) {
            kVar.setDuration(a11);
            int length2 = this.f16734ab.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.W;
            if (i13 > jArr2.length) {
                this.W = Arrays.copyOf(jArr2, i13);
                this.f16733aa = Arrays.copyOf(this.f16733aa, i13);
            }
            System.arraycopy(this.f16734ab, 0, this.W, i10, length2);
            System.arraycopy(this.f16735ac, 0, this.f16733aa, i10, length2);
            this.f16748n.a(this.W, this.f16733aa, i13);
        }
        k();
    }

    public void k() {
        long j10;
        long j11;
        if (c() && this.J) {
            an anVar = this.G;
            if (anVar != null) {
                j10 = anVar.N() + this.f16736ad;
                j11 = anVar.O() + this.f16736ad;
            } else {
                j10 = 0;
                j11 = 0;
            }
            boolean z10 = j10 != this.ae;
            boolean z11 = j11 != this.af;
            this.ae = j10;
            this.af = j11;
            TextView textView = this.f16747m;
            if (textView != null && !this.M && z10) {
                textView.setText(ai.a(this.o, this.f16749p, j10));
            }
            k kVar = this.f16748n;
            if (kVar != null) {
                kVar.setPosition(j10);
                this.f16748n.setBufferedPosition(j11);
            }
            c cVar = this.I;
            if (cVar != null && (z10 || z11)) {
                cVar.a(j10, j11);
            }
            removeCallbacks(this.f16752s);
            int t10 = anVar == null ? 1 : anVar.t();
            if (anVar == null || !anVar.a()) {
                if (t10 == 4 || t10 == 1) {
                    return;
                }
                postDelayed(this.f16752s, 1000L);
                return;
            }
            k kVar2 = this.f16748n;
            long min = Math.min(kVar2 != null ? kVar2.getPreferredUpdateDelay() : 1000L, 1000 - (j10 % 1000));
            postDelayed(this.f16752s, ai.a(anVar.D().f13211b > gl.Code ? ((float) min) / r0 : 1000L, this.O, 1000L));
        }
    }

    private void l() {
        View view;
        View view2;
        boolean n10 = n();
        if (!n10 && (view2 = this.f16740e) != null) {
            view2.requestFocus();
        } else {
            if (!n10 || (view = this.f) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void m() {
        View view;
        View view2;
        boolean n10 = n();
        if (!n10 && (view2 = this.f16740e) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!n10 || (view = this.f) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private boolean n() {
        an anVar = this.G;
        return (anVar == null || anVar.t() == 4 || this.G.t() == 1 || !this.G.x()) ? false : true;
    }

    public boolean c() {
        return getVisibility() == 0;
    }

    public void c(an anVar) {
        this.H.a(anVar, false);
    }

    public void b(d dVar) {
        this.f16737b.remove(dVar);
    }

    public void b() {
        if (c()) {
            setVisibility(8);
            Iterator<d> it = this.f16737b.iterator();
            while (it.hasNext()) {
                it.next().a(getVisibility());
            }
            removeCallbacks(this.f16752s);
            removeCallbacks(this.f16753t);
            this.V = com.anythink.expressad.exoplayer.b.f7291b;
        }
    }

    public void a(d dVar) {
        com.applovin.exoplayer2.l.a.b(dVar);
        this.f16737b.add(dVar);
    }

    public void a() {
        if (!c()) {
            setVisibility(0);
            Iterator<d> it = this.f16737b.iterator();
            while (it.hasNext()) {
                it.next().a(getVisibility());
            }
            e();
            l();
            m();
        }
        d();
    }

    public void b(an anVar) {
        int t10 = anVar.t();
        if (t10 == 1) {
            this.H.a(anVar);
        } else if (t10 == 4) {
            a(anVar, anVar.G(), com.anythink.expressad.exoplayer.b.f7291b);
        }
        this.H.a(anVar, true);
    }

    private void a(boolean z10, boolean z11, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.C : this.D);
        view.setVisibility(z10 ? 0 : 8);
    }

    public void a(an anVar, long j10) {
        int G;
        ba S = anVar.S();
        if (this.L && !S.d()) {
            int b10 = S.b();
            G = 0;
            while (true) {
                long c10 = S.a(G, this.f16751r).c();
                if (j10 < c10) {
                    break;
                }
                if (G == b10 - 1) {
                    j10 = c10;
                    break;
                } else {
                    j10 -= c10;
                    G++;
                }
            }
        } else {
            G = anVar.G();
        }
        a(anVar, G, j10);
        k();
    }

    private boolean a(an anVar, int i10, long j10) {
        return this.H.a(anVar, i10, j10);
    }

    public boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        an anVar = this.G;
        if (anVar == null || !a(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (anVar.t() == 4) {
                return true;
            }
            this.H.e(anVar);
            return true;
        }
        if (keyCode == 89) {
            this.H.d(anVar);
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            a(anVar);
            return true;
        }
        if (keyCode == 87) {
            this.H.c(anVar);
            return true;
        }
        if (keyCode == 88) {
            this.H.b(anVar);
            return true;
        }
        if (keyCode == 126) {
            b(anVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        c(anVar);
        return true;
    }

    private void a(an anVar) {
        int t10 = anVar.t();
        if (t10 != 1 && t10 != 4 && anVar.x()) {
            c(anVar);
        } else {
            b(anVar);
        }
    }

    private static boolean a(ba baVar, ba.c cVar) {
        if (baVar.b() > 100) {
            return false;
        }
        int b10 = baVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            if (baVar.a(i10, cVar).o == com.anythink.expressad.exoplayer.b.f7291b) {
                return false;
            }
        }
        return true;
    }

    private static int a(TypedArray typedArray, int i10) {
        return typedArray.getInt(R.styleable.AppLovinPlayerControlView_al_repeat_toggle_modes, i10);
    }
}
