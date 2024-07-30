package com.google.android.exoplayer2.ui;

import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import k4.d1;
import k4.e1;
import k4.g0;
import k4.q1;

/* loaded from: classes2.dex */
public class StyledPlayerControlView extends FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public e1 f20301s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20302t;

    /* renamed from: u, reason: collision with root package name */
    public int f20303u;

    /* renamed from: v, reason: collision with root package name */
    public int f20304v;

    @Deprecated
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface c {
    }

    static {
        g0.a("goog.exo.ui");
    }

    public static boolean a(e1 e1Var) {
        q1 I;
        int o;
        if (!e1Var.C(17) || (o = (I = e1Var.I()).o()) <= 1 || o > 100) {
            return false;
        }
        for (int i10 = 0; i10 < o; i10++) {
            if (I.m(i10, null).F == com.anythink.expressad.exoplayer.b.f7291b) {
                return false;
            }
        }
        return true;
    }

    public static void b(e1 e1Var) {
        int v3 = e1Var.v();
        if (v3 == 1 && e1Var.C(2)) {
            e1Var.b();
        } else if (v3 == 4 && e1Var.C(4)) {
            e1Var.m();
        }
        if (e1Var.C(1)) {
            e1Var.play();
        }
    }

    private void setPlaybackSpeed(float f) {
        e1 e1Var = this.f20301s;
        if (e1Var != null && e1Var.C(13)) {
            e1 e1Var2 = this.f20301s;
            e1Var2.a(new d1(f, e1Var2.d().f30402t));
        }
    }

    public final boolean c() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        int keyCode = keyEvent.getKeyCode();
        e1 e1Var = this.f20301s;
        if (e1Var != null) {
            if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (e1Var.v() != 4 && e1Var.C(12)) {
                            e1Var.N();
                        }
                    } else if (keyCode == 89 && e1Var.C(11)) {
                        e1Var.P();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode != 79 && keyCode != 85) {
                            if (keyCode != 87) {
                                if (keyCode != 88) {
                                    if (keyCode != 126) {
                                        if (keyCode == 127 && e1Var.C(1)) {
                                            e1Var.pause();
                                        }
                                    } else {
                                        b(e1Var);
                                    }
                                } else if (e1Var.C(7)) {
                                    e1Var.r();
                                }
                            } else if (e1Var.C(9)) {
                                e1Var.M();
                            }
                        } else {
                            int v3 = e1Var.v();
                            if (v3 != 1 && v3 != 4 && e1Var.g()) {
                                if (e1Var.C(1)) {
                                    e1Var.pause();
                                }
                            } else {
                                b(e1Var);
                            }
                        }
                    }
                }
                z10 = true;
                if (z10 && !super.dispatchKeyEvent(keyEvent)) {
                    return false;
                }
            }
        }
        z10 = false;
        return z10 ? true : true;
    }

    public e1 getPlayer() {
        return this.f20301s;
    }

    public int getRepeatToggleModes() {
        return this.f20304v;
    }

    public boolean getShowShuffleButton() {
        throw null;
    }

    public boolean getShowSubtitleButton() {
        throw null;
    }

    public int getShowTimeoutMs() {
        return this.f20303u;
    }

    public boolean getShowVrButton() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        throw null;
    }

    public void setAnimationEnabled(boolean z10) {
        throw null;
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
        e1 e1Var2 = this.f20301s;
        if (e1Var2 == e1Var) {
            return;
        }
        if (e1Var2 != null) {
            e1Var2.s(null);
        }
        this.f20301s = e1Var;
        if (e1Var != null) {
            e1Var.q(null);
        }
        c();
        c();
        c();
        c();
        throw null;
    }

    public void setRepeatToggleModes(int i10) {
        this.f20304v = i10;
        e1 e1Var = this.f20301s;
        if (e1Var != null && e1Var.C(15)) {
            int H = this.f20301s.H();
            if (i10 == 0 && H != 0) {
                this.f20301s.D(0);
            } else if (i10 == 1 && H == 2) {
                this.f20301s.D(1);
            } else if (i10 == 2 && H == 1) {
                this.f20301s.D(2);
            }
        }
        throw null;
    }

    public void setShowFastForwardButton(boolean z10) {
        throw null;
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        boolean z11;
        q1 q1Var;
        int i10;
        e1 e1Var = this.f20301s;
        if (e1Var != null) {
            int i11 = 0;
            if (z10 && a(e1Var)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f20302t = z11;
            long j10 = 0;
            if (e1Var.C(17)) {
                q1Var = e1Var.I();
            } else {
                q1Var = q1.f30752s;
            }
            if (!q1Var.p()) {
                int B = e1Var.B();
                boolean z12 = this.f20302t;
                if (!z12) {
                    i11 = B;
                }
                if (z12) {
                    i10 = q1Var.o() - 1;
                } else {
                    i10 = B;
                }
                if (i11 <= i10) {
                    if (i11 == B) {
                        d6.g0.S(0L);
                    }
                    q1Var.m(i11, null);
                    throw null;
                }
            } else if (e1Var.C(16)) {
                long i12 = e1Var.i();
                if (i12 != com.anythink.expressad.exoplayer.b.f7291b) {
                    j10 = d6.g0.J(i12);
                }
            }
            d6.g0.S(j10);
            c();
        }
    }

    public void setShowNextButton(boolean z10) {
        throw null;
    }

    public void setShowPreviousButton(boolean z10) {
        throw null;
    }

    public void setShowRewindButton(boolean z10) {
        throw null;
    }

    public void setShowShuffleButton(boolean z10) {
        throw null;
    }

    public void setShowSubtitleButton(boolean z10) {
        throw null;
    }

    public void setShowTimeoutMs(int i10) {
        this.f20303u = i10;
        throw null;
    }

    public void setShowVrButton(boolean z10) {
        throw null;
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        d6.g0.h(i10, 16, 1000);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(a aVar) {
    }

    public void setProgressUpdateListener(b bVar) {
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
    }
}
