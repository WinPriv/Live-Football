package com.google.android.exoplayer2.ui;

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
import androidx.activity.n;
import com.google.android.exoplayer2.ui.i;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import d6.g0;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.e1;
import k4.q1;

/* loaded from: classes2.dex */
public class PlayerControlView extends FrameLayout {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f20261x0 = 0;
    public final ImageView A;
    public final ImageView B;
    public final View C;
    public final TextView D;
    public final TextView E;
    public final i F;
    public final StringBuilder G;
    public final Formatter H;
    public final q1.b I;
    public final q1.c J;
    public final androidx.activity.g K;
    public final androidx.activity.b L;
    public final Drawable M;
    public final Drawable N;
    public final Drawable O;
    public final String P;
    public final String Q;
    public final String R;
    public final Drawable S;
    public final Drawable T;
    public final float U;
    public final float V;
    public final String W;

    /* renamed from: c0, reason: collision with root package name */
    public final String f20262c0;

    /* renamed from: d0, reason: collision with root package name */
    public e1 f20263d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f20264e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f20265f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f20266g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f20267h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f20268i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f20269j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f20270k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f20271l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f20272m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f20273n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f20274o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f20275p0;

    /* renamed from: q0, reason: collision with root package name */
    public long f20276q0;

    /* renamed from: r0, reason: collision with root package name */
    public long[] f20277r0;

    /* renamed from: s, reason: collision with root package name */
    public final b f20278s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean[] f20279s0;

    /* renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList<d> f20280t;

    /* renamed from: t0, reason: collision with root package name */
    public final long[] f20281t0;

    /* renamed from: u, reason: collision with root package name */
    public final View f20282u;

    /* renamed from: u0, reason: collision with root package name */
    public final boolean[] f20283u0;

    /* renamed from: v, reason: collision with root package name */
    public final View f20284v;

    /* renamed from: v0, reason: collision with root package name */
    public long f20285v0;

    /* renamed from: w, reason: collision with root package name */
    public final View f20286w;

    /* renamed from: w0, reason: collision with root package name */
    public long f20287w0;

    /* renamed from: x, reason: collision with root package name */
    public final View f20288x;
    public final View y;

    /* renamed from: z, reason: collision with root package name */
    public final View f20289z;

    /* loaded from: classes2.dex */
    public static final class a {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* loaded from: classes2.dex */
    public final class b implements e1.c, i.a, View.OnClickListener {
        public b() {
        }

        @Override // com.google.android.exoplayer2.ui.i.a
        public final void A(long j10) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.f20267h0 = true;
            TextView textView = playerControlView.E;
            if (textView != null) {
                textView.setText(g0.z(playerControlView.G, playerControlView.H, j10));
            }
        }

        @Override // com.google.android.exoplayer2.ui.i.a
        public final void B(long j10, boolean z10) {
            e1 e1Var;
            PlayerControlView playerControlView = PlayerControlView.this;
            int i10 = 0;
            playerControlView.f20267h0 = false;
            if (!z10 && (e1Var = playerControlView.f20263d0) != null) {
                q1 I = e1Var.I();
                if (playerControlView.f20266g0 && !I.p()) {
                    int o = I.o();
                    while (true) {
                        long S = g0.S(I.m(i10, playerControlView.J).F);
                        if (j10 < S) {
                            break;
                        }
                        if (i10 == o - 1) {
                            j10 = S;
                            break;
                        } else {
                            j10 -= S;
                            i10++;
                        }
                    }
                } else {
                    i10 = e1Var.B();
                }
                e1Var.f(i10, j10);
                playerControlView.j();
            }
        }

        @Override // k4.e1.c
        public final void Y(e1.b bVar) {
            boolean a10 = bVar.a(4, 5);
            PlayerControlView playerControlView = PlayerControlView.this;
            if (a10) {
                int i10 = PlayerControlView.f20261x0;
                playerControlView.i();
            }
            if (bVar.a(4, 5, 7)) {
                int i11 = PlayerControlView.f20261x0;
                playerControlView.j();
            }
            d6.j jVar = bVar.f30414a;
            if (jVar.f27321a.get(8)) {
                int i12 = PlayerControlView.f20261x0;
                playerControlView.k();
            }
            if (jVar.f27321a.get(9)) {
                int i13 = PlayerControlView.f20261x0;
                playerControlView.l();
            }
            if (bVar.a(8, 9, 11, 0, 13)) {
                int i14 = PlayerControlView.f20261x0;
                playerControlView.h();
            }
            if (bVar.a(11, 0)) {
                int i15 = PlayerControlView.f20261x0;
                playerControlView.m();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x006b A[LOOP:0: B:35:0x004c->B:45:0x006b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0069 A[SYNTHETIC] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onClick(android.view.View r7) {
            /*
                r6 = this;
                com.google.android.exoplayer2.ui.PlayerControlView r0 = com.google.android.exoplayer2.ui.PlayerControlView.this
                k4.e1 r1 = r0.f20263d0
                if (r1 != 0) goto L7
                return
            L7:
                android.view.View r2 = r0.f20284v
                if (r2 != r7) goto L10
                r1.M()
                goto L7e
            L10:
                android.view.View r2 = r0.f20282u
                if (r2 != r7) goto L19
                r1.r()
                goto L7e
            L19:
                android.view.View r2 = r0.y
                if (r2 != r7) goto L28
                int r7 = r1.v()
                r0 = 4
                if (r7 == r0) goto L7e
                r1.N()
                goto L7e
            L28:
                android.view.View r2 = r0.f20289z
                if (r2 != r7) goto L30
                r1.P()
                goto L7e
            L30:
                android.view.View r2 = r0.f20286w
                if (r2 != r7) goto L38
                com.google.android.exoplayer2.ui.PlayerControlView.b(r1)
                goto L7e
            L38:
                android.view.View r2 = r0.f20288x
                if (r2 != r7) goto L40
                r1.pause()
                goto L7e
            L40:
                android.widget.ImageView r2 = r0.A
                r3 = 1
                if (r2 != r7) goto L72
                int r7 = r1.H()
                int r0 = r0.f20270k0
                r2 = r3
            L4c:
                r4 = 2
                if (r2 > r4) goto L6e
                int r5 = r7 + r2
                int r5 = r5 % 3
                if (r5 == 0) goto L66
                if (r5 == r3) goto L5f
                if (r5 == r4) goto L5a
                goto L64
            L5a:
                r4 = r0 & 2
                if (r4 == 0) goto L64
                goto L66
            L5f:
                r4 = r0 & 1
                if (r4 == 0) goto L64
                goto L66
            L64:
                r4 = 0
                goto L67
            L66:
                r4 = r3
            L67:
                if (r4 == 0) goto L6b
                r7 = r5
                goto L6e
            L6b:
                int r2 = r2 + 1
                goto L4c
            L6e:
                r1.D(r7)
                goto L7e
            L72:
                android.widget.ImageView r0 = r0.B
                if (r0 != r7) goto L7e
                boolean r7 = r1.K()
                r7 = r7 ^ r3
                r1.h(r7)
            L7e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerControlView.b.onClick(android.view.View):void");
        }

        @Override // com.google.android.exoplayer2.ui.i.a
        public final void z(long j10) {
            PlayerControlView playerControlView = PlayerControlView.this;
            TextView textView = playerControlView.E;
            if (textView != null) {
                textView.setText(g0.z(playerControlView.G, playerControlView.H, j10));
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
    }

    /* loaded from: classes2.dex */
    public interface d {
        void z();
    }

    static {
        k4.g0.a("goog.exo.ui");
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.f20268i0 = 5000;
        this.f20270k0 = 0;
        this.f20269j0 = 200;
        this.f20276q0 = com.anythink.expressad.exoplayer.b.f7291b;
        this.f20271l0 = true;
        this.f20272m0 = true;
        this.f20273n0 = true;
        this.f20274o0 = true;
        this.f20275p0 = false;
        int i10 = R.layout.exo_player_control_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n.f513v, 0, 0);
            try {
                this.f20268i0 = obtainStyledAttributes.getInt(19, this.f20268i0);
                i10 = obtainStyledAttributes.getResourceId(5, R.layout.exo_player_control_view);
                this.f20270k0 = obtainStyledAttributes.getInt(8, this.f20270k0);
                this.f20271l0 = obtainStyledAttributes.getBoolean(17, this.f20271l0);
                this.f20272m0 = obtainStyledAttributes.getBoolean(14, this.f20272m0);
                this.f20273n0 = obtainStyledAttributes.getBoolean(16, this.f20273n0);
                this.f20274o0 = obtainStyledAttributes.getBoolean(15, this.f20274o0);
                this.f20275p0 = obtainStyledAttributes.getBoolean(18, this.f20275p0);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(20, this.f20269j0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f20280t = new CopyOnWriteArrayList<>();
        this.I = new q1.b();
        this.J = new q1.c();
        StringBuilder sb2 = new StringBuilder();
        this.G = sb2;
        this.H = new Formatter(sb2, Locale.getDefault());
        this.f20277r0 = new long[0];
        this.f20279s0 = new boolean[0];
        this.f20281t0 = new long[0];
        this.f20283u0 = new boolean[0];
        b bVar = new b();
        this.f20278s = bVar;
        this.K = new androidx.activity.g(this, 7);
        this.L = new androidx.activity.b(this, 11);
        LayoutInflater.from(context).inflate(i10, this);
        setDescendantFocusability(262144);
        i iVar = (i) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (iVar != null) {
            this.F = iVar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, attributeSet);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.F = defaultTimeBar;
        } else {
            this.F = null;
        }
        this.D = (TextView) findViewById(R.id.exo_duration);
        this.E = (TextView) findViewById(R.id.exo_position);
        i iVar2 = this.F;
        if (iVar2 != null) {
            iVar2.b(bVar);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.f20286w = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(bVar);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.f20288x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(bVar);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.f20282u = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(bVar);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.f20284v = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(bVar);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.f20289z = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(bVar);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.y = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.A = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.B = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.C = findViewById8;
        setShowVrButton(false);
        g(false, false, findViewById8);
        Resources resources = context.getResources();
        this.U = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.V = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.M = g0.q(context, resources, R.drawable.exo_controls_repeat_off);
        this.N = g0.q(context, resources, R.drawable.exo_controls_repeat_one);
        this.O = g0.q(context, resources, R.drawable.exo_controls_repeat_all);
        this.S = g0.q(context, resources, R.drawable.exo_controls_shuffle_on);
        this.T = g0.q(context, resources, R.drawable.exo_controls_shuffle_off);
        this.P = resources.getString(R.string.exo_controls_repeat_off_description);
        this.Q = resources.getString(R.string.exo_controls_repeat_one_description);
        this.R = resources.getString(R.string.exo_controls_repeat_all_description);
        this.W = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f20262c0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.f20287w0 = com.anythink.expressad.exoplayer.b.f7291b;
    }

    public static void b(e1 e1Var) {
        int v3 = e1Var.v();
        if (v3 == 1) {
            e1Var.b();
        } else if (v3 == 4) {
            e1Var.f(e1Var.B(), com.anythink.expressad.exoplayer.b.f7291b);
        }
        e1Var.play();
    }

    public final boolean a(KeyEvent keyEvent) {
        boolean z10;
        int keyCode = keyEvent.getKeyCode();
        e1 e1Var = this.f20263d0;
        if (e1Var != null) {
            if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (e1Var.v() != 4) {
                            e1Var.N();
                        }
                    } else if (keyCode == 89) {
                        e1Var.P();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode != 79 && keyCode != 85) {
                            if (keyCode != 87) {
                                if (keyCode != 88) {
                                    if (keyCode != 126) {
                                        if (keyCode == 127) {
                                            e1Var.pause();
                                        }
                                    } else {
                                        b(e1Var);
                                    }
                                } else {
                                    e1Var.r();
                                }
                            } else {
                                e1Var.M();
                            }
                        } else {
                            int v3 = e1Var.v();
                            if (v3 != 1 && v3 != 4 && e1Var.g()) {
                                e1Var.pause();
                            } else {
                                b(e1Var);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void c() {
        if (e()) {
            setVisibility(8);
            Iterator<d> it = this.f20280t.iterator();
            while (it.hasNext()) {
                d next = it.next();
                getVisibility();
                next.z();
            }
            removeCallbacks(this.K);
            removeCallbacks(this.L);
            this.f20276q0 = com.anythink.expressad.exoplayer.b.f7291b;
        }
    }

    public final void d() {
        androidx.activity.b bVar = this.L;
        removeCallbacks(bVar);
        if (this.f20268i0 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j10 = this.f20268i0;
            this.f20276q0 = uptimeMillis + j10;
            if (this.f20264e0) {
                postDelayed(bVar, j10);
                return;
            }
            return;
        }
        this.f20276q0 = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!a(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.L);
        } else if (motionEvent.getAction() == 1) {
            d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        e1 e1Var = this.f20263d0;
        if (e1Var != null && e1Var.v() != 4 && this.f20263d0.v() != 1 && this.f20263d0.g()) {
            return true;
        }
        return false;
    }

    public final void g(boolean z10, boolean z11, View view) {
        float f;
        int i10;
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        if (z11) {
            f = this.U;
        } else {
            f = this.V;
        }
        view.setAlpha(f);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
    }

    public e1 getPlayer() {
        return this.f20263d0;
    }

    public int getRepeatToggleModes() {
        return this.f20270k0;
    }

    public boolean getShowShuffleButton() {
        return this.f20275p0;
    }

    public int getShowTimeoutMs() {
        return this.f20268i0;
    }

    public boolean getShowVrButton() {
        View view = this.C;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void h() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (e() && this.f20264e0) {
            e1 e1Var = this.f20263d0;
            if (e1Var != null) {
                z10 = e1Var.C(5);
                z12 = e1Var.C(7);
                z13 = e1Var.C(11);
                z14 = e1Var.C(12);
                z11 = e1Var.C(9);
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            g(this.f20273n0, z12, this.f20282u);
            g(this.f20271l0, z13, this.f20289z);
            g(this.f20272m0, z14, this.y);
            g(this.f20274o0, z11, this.f20284v);
            i iVar = this.F;
            if (iVar != null) {
                iVar.setEnabled(z10);
            }
        }
    }

    public final void i() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        if (e() && this.f20264e0) {
            boolean f = f();
            View view = this.f20286w;
            boolean z15 = true;
            int i11 = 0;
            if (view != null) {
                if (f && view.isFocused()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z10 = z13 | false;
                if (g0.f27302a < 21) {
                    z14 = z10;
                } else if (f && a.a(view)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z11 = z14 | false;
                if (f) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                view.setVisibility(i10);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.f20288x;
            if (view2 != null) {
                if (!f && view2.isFocused()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 |= z12;
                if (g0.f27302a < 21) {
                    z15 = z10;
                } else if (f || !a.a(view2)) {
                    z15 = false;
                }
                z11 |= z15;
                if (!f) {
                    i11 = 8;
                }
                view2.setVisibility(i11);
            }
            if (z10) {
                boolean f10 = f();
                if (!f10 && view != null) {
                    view.requestFocus();
                } else if (f10 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z11) {
                boolean f11 = f();
                if (!f11 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else if (f11 && view2 != null) {
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final void j() {
        long j10;
        long j11;
        boolean z10;
        int v3;
        long j12;
        if (e() && this.f20264e0) {
            e1 e1Var = this.f20263d0;
            if (e1Var != null) {
                j10 = e1Var.t() + this.f20285v0;
                j11 = e1Var.L() + this.f20285v0;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j10 != this.f20287w0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f20287w0 = j10;
            TextView textView = this.E;
            if (textView != null && !this.f20267h0 && z10) {
                textView.setText(g0.z(this.G, this.H, j10));
            }
            i iVar = this.F;
            if (iVar != null) {
                iVar.setPosition(j10);
                iVar.setBufferedPosition(j11);
            }
            androidx.activity.g gVar = this.K;
            removeCallbacks(gVar);
            if (e1Var == null) {
                v3 = 1;
            } else {
                v3 = e1Var.v();
            }
            long j13 = 1000;
            if (e1Var != null && e1Var.isPlaying()) {
                if (iVar != null) {
                    j12 = iVar.getPreferredUpdateDelay();
                } else {
                    j12 = 1000;
                }
                long min = Math.min(j12, 1000 - (j10 % 1000));
                float f = e1Var.d().f30401s;
                if (f > gl.Code) {
                    j13 = ((float) min) / f;
                }
                postDelayed(gVar, g0.i(j13, this.f20269j0, 1000L));
                return;
            }
            if (v3 != 4 && v3 != 1) {
                postDelayed(gVar, 1000L);
            }
        }
    }

    public final void k() {
        ImageView imageView;
        if (e() && this.f20264e0 && (imageView = this.A) != null) {
            if (this.f20270k0 == 0) {
                g(false, false, imageView);
                return;
            }
            e1 e1Var = this.f20263d0;
            String str = this.P;
            Drawable drawable = this.M;
            if (e1Var == null) {
                g(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            g(true, true, imageView);
            int H = e1Var.H();
            if (H != 0) {
                if (H != 1) {
                    if (H == 2) {
                        imageView.setImageDrawable(this.O);
                        imageView.setContentDescription(this.R);
                    }
                } else {
                    imageView.setImageDrawable(this.N);
                    imageView.setContentDescription(this.Q);
                }
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
            imageView.setVisibility(0);
        }
    }

    public final void l() {
        ImageView imageView;
        if (e() && this.f20264e0 && (imageView = this.B) != null) {
            e1 e1Var = this.f20263d0;
            if (!this.f20275p0) {
                g(false, false, imageView);
                return;
            }
            String str = this.f20262c0;
            Drawable drawable = this.T;
            if (e1Var == null) {
                g(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            g(true, true, imageView);
            if (e1Var.K()) {
                drawable = this.S;
            }
            imageView.setImageDrawable(drawable);
            if (e1Var.K()) {
                str = this.W;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerControlView.m():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20264e0 = true;
        long j10 = this.f20276q0;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            long uptimeMillis = j10 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                c();
            } else {
                postDelayed(this.L, uptimeMillis);
            }
        } else if (e()) {
            d();
        }
        i();
        h();
        k();
        l();
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20264e0 = false;
        removeCallbacks(this.K);
        removeCallbacks(this.L);
    }

    public void setPlayer(e1 e1Var) {
        boolean z10;
        boolean z11 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        if (e1Var != null && e1Var.J() != Looper.getMainLooper()) {
            z11 = false;
        }
        d6.a.a(z11);
        e1 e1Var2 = this.f20263d0;
        if (e1Var2 == e1Var) {
            return;
        }
        b bVar = this.f20278s;
        if (e1Var2 != null) {
            e1Var2.s(bVar);
        }
        this.f20263d0 = e1Var;
        if (e1Var != null) {
            e1Var.q(bVar);
        }
        i();
        h();
        k();
        l();
        m();
    }

    public void setRepeatToggleModes(int i10) {
        this.f20270k0 = i10;
        e1 e1Var = this.f20263d0;
        if (e1Var != null) {
            int H = e1Var.H();
            if (i10 == 0 && H != 0) {
                this.f20263d0.D(0);
            } else if (i10 == 1 && H == 2) {
                this.f20263d0.D(1);
            } else if (i10 == 2 && H == 1) {
                this.f20263d0.D(2);
            }
        }
        k();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f20272m0 = z10;
        h();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f20265f0 = z10;
        m();
    }

    public void setShowNextButton(boolean z10) {
        this.f20274o0 = z10;
        h();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f20273n0 = z10;
        h();
    }

    public void setShowRewindButton(boolean z10) {
        this.f20271l0 = z10;
        h();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f20275p0 = z10;
        l();
    }

    public void setShowTimeoutMs(int i10) {
        this.f20268i0 = i10;
        if (e()) {
            d();
        }
    }

    public void setShowVrButton(boolean z10) {
        int i10;
        View view = this.C;
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
        this.f20269j0 = g0.h(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z10;
        View view = this.C;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            boolean showVrButton = getShowVrButton();
            if (onClickListener != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            g(showVrButton, z10, view);
        }
    }

    public void setProgressUpdateListener(c cVar) {
    }
}
