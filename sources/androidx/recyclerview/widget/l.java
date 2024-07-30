package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.ads.gl;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: FastScroller.java */
/* loaded from: classes.dex */
public final class l extends RecyclerView.n implements RecyclerView.s {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2318a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2319b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2320c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f2321d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2322e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2323g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f2324h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2325i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2326j;

    /* renamed from: k, reason: collision with root package name */
    public int f2327k;

    /* renamed from: l, reason: collision with root package name */
    public int f2328l;

    /* renamed from: m, reason: collision with root package name */
    public float f2329m;

    /* renamed from: n, reason: collision with root package name */
    public int f2330n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public float f2331p;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f2334s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2340z;

    /* renamed from: q, reason: collision with root package name */
    public int f2332q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2333r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2335t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2336u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2337v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2338w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2339x = new int[2];
    public final int[] y = new int[2];

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l lVar = l.this;
            int i10 = lVar.A;
            ValueAnimator valueAnimator = lVar.f2340z;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
            } else {
                valueAnimator.cancel();
            }
            lVar.A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), gl.Code);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            boolean z10;
            boolean z11;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            l lVar = l.this;
            int computeVerticalScrollRange = lVar.f2334s.computeVerticalScrollRange();
            int i12 = lVar.f2333r;
            int i13 = computeVerticalScrollRange - i12;
            int i14 = lVar.f2318a;
            if (i13 > 0 && i12 >= i14) {
                z10 = true;
            } else {
                z10 = false;
            }
            lVar.f2335t = z10;
            int computeHorizontalScrollRange = lVar.f2334s.computeHorizontalScrollRange();
            int i15 = lVar.f2332q;
            if (computeHorizontalScrollRange - i15 > 0 && i15 >= i14) {
                z11 = true;
            } else {
                z11 = false;
            }
            lVar.f2336u = z11;
            boolean z12 = lVar.f2335t;
            if (!z12 && !z11) {
                if (lVar.f2337v != 0) {
                    lVar.g(0);
                    return;
                }
                return;
            }
            if (z12) {
                float f = i12;
                lVar.f2328l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                lVar.f2327k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
            }
            if (lVar.f2336u) {
                float f10 = computeHorizontalScrollOffset;
                float f11 = i15;
                lVar.o = (int) ((((f11 / 2.0f) + f10) * f11) / computeHorizontalScrollRange);
                lVar.f2330n = Math.min(i15, (i15 * i15) / computeHorizontalScrollRange);
            }
            int i16 = lVar.f2337v;
            if (i16 == 0 || i16 == 1) {
                lVar.g(1);
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2343a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f2343a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f2343a) {
                this.f2343a = false;
                return;
            }
            l lVar = l.this;
            if (((Float) lVar.f2340z.getAnimatedValue()).floatValue() == gl.Code) {
                lVar.A = 0;
                lVar.g(0);
            } else {
                lVar.A = 2;
                lVar.f2334s.invalidate();
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l lVar = l.this;
            lVar.f2320c.setAlpha(floatValue);
            lVar.f2321d.setAlpha(floatValue);
            lVar.f2334s.invalidate();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(gl.Code, 1.0f);
        this.f2340z = ofFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.f2320c = stateListDrawable;
        this.f2321d = drawable;
        this.f2323g = stateListDrawable2;
        this.f2324h = drawable2;
        this.f2322e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f2325i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f2326j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f2318a = i11;
        this.f2319b = i12;
        stateListDrawable.setAlpha(com.anythink.expressad.exoplayer.k.p.f9095b);
        drawable.setAlpha(com.anythink.expressad.exoplayer.k.p.f9095b);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f2334s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.f2334s.removeOnItemTouchListener(this);
                this.f2334s.removeOnScrollListener(bVar);
                this.f2334s.removeCallbacks(aVar);
            }
            this.f2334s = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.f2334s.addOnItemTouchListener(this);
                this.f2334s.addOnScrollListener(bVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean b(MotionEvent motionEvent) {
        int i10 = this.f2337v;
        if (i10 == 1) {
            boolean f = f(motionEvent.getX(), motionEvent.getY());
            boolean e10 = e(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (f || e10)) {
                if (e10) {
                    this.f2338w = 1;
                    this.f2331p = (int) motionEvent.getX();
                } else if (f) {
                    this.f2338w = 2;
                    this.f2329m = (int) motionEvent.getY();
                }
                g(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void d(Canvas canvas) {
        if (this.f2332q == this.f2334s.getWidth() && this.f2333r == this.f2334s.getHeight()) {
            if (this.A != 0) {
                if (this.f2335t) {
                    int i10 = this.f2332q;
                    int i11 = this.f2322e;
                    int i12 = i10 - i11;
                    int i13 = this.f2328l;
                    int i14 = this.f2327k;
                    int i15 = i13 - (i14 / 2);
                    StateListDrawable stateListDrawable = this.f2320c;
                    stateListDrawable.setBounds(0, 0, i11, i14);
                    int i16 = this.f2333r;
                    int i17 = this.f;
                    Drawable drawable = this.f2321d;
                    drawable.setBounds(0, 0, i17, i16);
                    RecyclerView recyclerView = this.f2334s;
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    boolean z10 = true;
                    if (c0.e.d(recyclerView) != 1) {
                        z10 = false;
                    }
                    if (z10) {
                        drawable.draw(canvas);
                        canvas.translate(i11, i15);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i11, -i15);
                    } else {
                        canvas.translate(i12, gl.Code);
                        drawable.draw(canvas);
                        canvas.translate(gl.Code, i15);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i12, -i15);
                    }
                }
                if (this.f2336u) {
                    int i18 = this.f2333r;
                    int i19 = this.f2325i;
                    int i20 = i18 - i19;
                    int i21 = this.o;
                    int i22 = this.f2330n;
                    int i23 = i21 - (i22 / 2);
                    StateListDrawable stateListDrawable2 = this.f2323g;
                    stateListDrawable2.setBounds(0, 0, i22, i19);
                    int i24 = this.f2332q;
                    int i25 = this.f2326j;
                    Drawable drawable2 = this.f2324h;
                    drawable2.setBounds(0, 0, i24, i25);
                    canvas.translate(gl.Code, i20);
                    drawable2.draw(canvas);
                    canvas.translate(i23, gl.Code);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i23, -i20);
                    return;
                }
                return;
            }
            return;
        }
        this.f2332q = this.f2334s.getWidth();
        this.f2333r = this.f2334s.getHeight();
        g(0);
    }

    public final boolean e(float f, float f10) {
        if (f10 >= this.f2333r - this.f2325i) {
            int i10 = this.o;
            int i11 = this.f2330n;
            if (f >= i10 - (i11 / 2) && f <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(float f, float f10) {
        boolean z10;
        RecyclerView recyclerView = this.f2334s;
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.e.d(recyclerView) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f2322e;
        if (z10) {
            if (f > i10) {
                return false;
            }
        } else if (f < this.f2332q - i10) {
            return false;
        }
        int i11 = this.f2328l;
        int i12 = this.f2327k / 2;
        if (f10 < i11 - i12 || f10 > i12 + i11) {
            return false;
        }
        return true;
    }

    public final void g(int i10) {
        a aVar = this.B;
        StateListDrawable stateListDrawable = this.f2320c;
        if (i10 == 2 && this.f2337v != 2) {
            stateListDrawable.setState(C);
            this.f2334s.removeCallbacks(aVar);
        }
        if (i10 == 0) {
            this.f2334s.invalidate();
        } else {
            h();
        }
        if (this.f2337v == 2 && i10 != 2) {
            stateListDrawable.setState(D);
            this.f2334s.removeCallbacks(aVar);
            this.f2334s.postDelayed(aVar, 1200);
        } else if (i10 == 1) {
            this.f2334s.removeCallbacks(aVar);
            this.f2334s.postDelayed(aVar, 1500);
        }
        this.f2337v = i10;
    }

    public final void h() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f2340z;
        if (i10 != 0) {
            if (i10 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (r9 >= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
    
        if (r5 >= 0) goto L49;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.onTouchEvent(android.view.MotionEvent):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void a() {
    }
}
