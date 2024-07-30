package com.google.android.exoplayer2.ui;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import e6.n;
import j7.j0;
import java.util.ArrayList;
import java.util.List;
import k4.b1;
import k4.e1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes2.dex */
public class StyledPlayerView extends FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public e1 f20305s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20306t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20307u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f20308v;

    /* renamed from: w, reason: collision with root package name */
    public int f20309w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20310x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20311z;

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    public final void a(boolean z10) {
        boolean z11;
        e1 e1Var = this.f20305s;
        if (e1Var != null && e1Var.C(16) && this.f20305s.c() && this.f20305s.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((z11 && this.f20311z) || !c()) {
        } else {
            throw null;
        }
    }

    public final void b(boolean z10) {
        boolean z11;
        byte[] bArr;
        e1 e1Var = this.f20305s;
        if (e1Var == null || !e1Var.C(30) || e1Var.w().f30780s.isEmpty() || e1Var.w().a(2)) {
            return;
        }
        if (this.f20307u) {
            d6.a.e(null);
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (e1Var.C(18) && (bArr = e1Var.Q().B) != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                int intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
                int intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    throw null;
                }
            }
            Drawable drawable = this.f20308v;
            if (drawable != null) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth();
                int intrinsicHeight2 = drawable.getIntrinsicHeight();
                if (intrinsicWidth2 > 0 && intrinsicHeight2 > 0) {
                    throw null;
                }
            }
        }
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    public final boolean c() {
        if (this.f20306t) {
            d6.a.e(null);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        e1 e1Var = this.f20305s;
        if (e1Var != null && e1Var.C(16) && this.f20305s.c()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 270 && keyCode != 22 && keyCode != 271 && keyCode != 20 && keyCode != 269 && keyCode != 21 && keyCode != 268 && keyCode != 23) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && c()) {
            throw null;
        }
        if (!c()) {
            if (super.dispatchKeyEvent(keyEvent)) {
                a(true);
                return true;
            }
            if (!z10 || !c()) {
                return false;
            }
            a(true);
            return false;
        }
        throw null;
    }

    public List<com.google.android.exoplayer2.ui.a> getAdOverlayInfos() {
        return j0.C(new ArrayList());
    }

    public ViewGroup getAdViewGroup() {
        d6.a.f(null, "exo_ad_overlay must be present for ad playback");
        throw null;
    }

    public boolean getControllerAutoShow() {
        return this.y;
    }

    public boolean getControllerHideOnTouch() {
        return false;
    }

    public int getControllerShowTimeoutMs() {
        return 0;
    }

    public Drawable getDefaultArtwork() {
        return this.f20308v;
    }

    public FrameLayout getOverlayFrameLayout() {
        return null;
    }

    public e1 getPlayer() {
        return this.f20305s;
    }

    public int getResizeMode() {
        d6.a.e(null);
        throw null;
    }

    public SubtitleView getSubtitleView() {
        return null;
    }

    public boolean getUseArtwork() {
        return this.f20307u;
    }

    public boolean getUseController() {
        return this.f20306t;
    }

    public View getVideoSurfaceView() {
        return null;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (c() && this.f20305s != null) {
            a(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (c() && this.f20305s != null) {
            throw null;
        }
        return super.performClick();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.a aVar) {
        d6.a.e(null);
        throw null;
    }

    public void setControllerAutoShow(boolean z10) {
        this.y = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f20311z = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        d6.a.e(null);
        throw null;
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(StyledPlayerControlView.a aVar) {
        d6.a.e(null);
        throw null;
    }

    public void setControllerShowTimeoutMs(int i10) {
        d6.a.e(null);
        throw null;
    }

    public void setControllerVisibilityListener(a aVar) {
        if (aVar != null) {
            setControllerVisibilityListener((StyledPlayerControlView.c) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        d6.a.d(false);
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f20308v != drawable) {
            this.f20308v = drawable;
            b(false);
        }
    }

    public void setFullscreenButtonClickListener(b bVar) {
        d6.a.e(null);
        throw null;
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f20310x != z10) {
            this.f20310x = z10;
            b(false);
        }
    }

    public void setPlayer(e1 e1Var) {
        boolean z10;
        boolean z11;
        n nVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        if (e1Var != null && e1Var.J() != Looper.getMainLooper()) {
            z11 = false;
        } else {
            z11 = true;
        }
        d6.a.a(z11);
        e1 e1Var2 = this.f20305s;
        if (e1Var2 == e1Var) {
            return;
        }
        if (e1Var2 != null) {
            e1Var2.s(null);
            e1Var2.C(27);
        }
        this.f20305s = e1Var;
        if (!c()) {
            b(true);
            if (e1Var != null) {
                if (e1Var.C(27)) {
                    e1 e1Var3 = this.f20305s;
                    if (e1Var3 != null) {
                        nVar = e1Var3.l();
                    } else {
                        nVar = n.f27842w;
                    }
                    int i10 = nVar.f27845s;
                }
                e1Var.q(null);
                a(false);
                return;
            }
            return;
        }
        throw null;
    }

    public void setRepeatToggleModes(int i10) {
        d6.a.e(null);
        throw null;
    }

    public void setResizeMode(int i10) {
        d6.a.e(null);
        throw null;
    }

    public void setShowBuffering(int i10) {
        if (this.f20309w != i10) {
            this.f20309w = i10;
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        d6.a.e(null);
        throw null;
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        d6.a.e(null);
        throw null;
    }

    public void setShowNextButton(boolean z10) {
        d6.a.e(null);
        throw null;
    }

    public void setShowPreviousButton(boolean z10) {
        d6.a.e(null);
        throw null;
    }

    public void setShowRewindButton(boolean z10) {
        d6.a.e(null);
        throw null;
    }

    public void setShowShuffleButton(boolean z10) {
        d6.a.e(null);
        throw null;
    }

    public void setShowSubtitleButton(boolean z10) {
        d6.a.e(null);
        throw null;
    }

    public void setShowVrButton(boolean z10) {
        d6.a.e(null);
        throw null;
    }

    public void setUseArtwork(boolean z10) {
        boolean z11;
        if (z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        d6.a.d(z11);
        if (this.f20307u != z10) {
            this.f20307u = z10;
            b(false);
        }
    }

    public void setUseController(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        d6.a.d(z11);
        if (z10 || hasOnClickListeners()) {
            z12 = true;
        }
        setClickable(z12);
        if (this.f20306t == z10) {
            return;
        }
        this.f20306t = z10;
        if (!c()) {
            setContentDescription(null);
            return;
        }
        throw null;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Deprecated
    public void setControllerVisibilityListener(StyledPlayerControlView.c cVar) {
        d6.a.e(null);
        throw null;
    }

    public void setErrorMessageProvider(d6.i<? super b1> iVar) {
    }

    public void setShutterBackgroundColor(int i10) {
    }
}
