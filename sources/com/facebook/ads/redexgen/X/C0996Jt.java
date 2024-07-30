package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.shield.NoAutoExceptionHandling;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@NoAutoExceptionHandling
@SuppressLint({"EmptyCatchBlock", "CatchGeneralException", "WrongCall"})
/* renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0996Jt extends RelativeLayout {
    public static String[] A00 = {"rKALTBDYJCbaiFNXEtUJroCn52VpZZ", "JV6MiXKUyj6JCzF1u", "kCmdEzEHbLuzxIacOyabQp9NKin7bt2r", "jWcGCQZMqdkAqfRZe6", "nlkBBG2n0OIOkXKFHLw9fg1KFY8VWnLB", "EEOdRs0yxrMLewCcdlWj6UoX1OR7WiBI", "iBrckNfFoUM659sftuZ", "XnvO082n6pbwhWKAJ"};
    public static final AtomicBoolean A01 = new AtomicBoolean();
    public static final AtomicReference<InterfaceC0988Jk> A02 = new AtomicReference<>();

    private final void A00() {
        super.onAttachedToWindow();
    }

    private final void A01() {
        super.onDetachedFromWindow();
    }

    private final void A02() {
        super.onFinishInflate();
    }

    private final void A03(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    private final void A04(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    private final void A05(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    private final void A06(Canvas canvas) {
        super.onDraw(canvas);
    }

    private void A07(Throwable th) {
        K1.A00().A8m(IronSourceConstants.BN_INSTANCE_DESTROY, th);
        InterfaceC0988Jk contextRepairHelper = A02.get();
        if (contextRepairHelper != null) {
            contextRepairHelper.ADt(th, this);
        }
    }

    private final void A08(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    private final void A09(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    private final void A0A(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
    }

    public static void A0B(boolean z10, InterfaceC0988Jk interfaceC0988Jk) {
        A01.set(z10);
        A02.set(interfaceC0988Jk);
    }

    private final boolean A0C() {
        return super.performClick();
    }

    private final boolean A0D(int i10, KeyEvent keyEvent) {
        return super.onKeyDown(i10, keyEvent);
    }

    private final boolean A0E(int i10, KeyEvent keyEvent) {
        return super.onKeyUp(i10, keyEvent);
    }

    private final boolean A0F(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    private final boolean A0G(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        try {
            A00();
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onAttachedToWindow();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        try {
            A01();
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onDetachedFromWindow();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            A06(canvas);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onDraw(canvas);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        try {
            A02();
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onFinishInflate();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        try {
            A0A(z10, i10, rect);
        } catch (Throwable th) {
            boolean z11 = A01.get();
            if (A00[4].charAt(9) == '8') {
                Throwable t10 = new RuntimeException();
                throw t10;
            }
            A00[0] = "cWID6xQloznFOrhLXGfxCs3XAeGgBa";
            if (z11) {
                A07(th);
                super.onFocusChanged(z10, i10, rect);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        try {
            return A0D(i10, keyEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                return super.onKeyDown(i10, keyEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        try {
            return A0E(i10, keyEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                return super.onKeyUp(i10, keyEvent);
            }
            throw th;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        try {
            A09(z10, i10, i11, i12, i13);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            }
            throw th;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        try {
            A04(i10, i11);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onMeasure(i10, i11);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        try {
            A05(i10, i11, i12, i13);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onSizeChanged(i10, i11, i12, i13);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return A0F(motionEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                return super.onTouchEvent(motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        try {
            return A0G(motionEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                return super.onTrackballEvent(motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        try {
            A08(z10);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onWindowFocusChanged(z10);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        try {
            A03(i10);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onWindowVisibilityChanged(i10);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        try {
            return A0C();
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                return super.performClick();
            }
            throw th;
        }
    }
}
