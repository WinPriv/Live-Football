package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.hamkho.livefoot.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import n0.c0;
import n0.g0;

/* compiled from: TooltipCompatHandler.java */
/* loaded from: classes.dex */
public final class r0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static r0 C;
    public static r0 D;
    public boolean A;
    public boolean B;

    /* renamed from: s, reason: collision with root package name */
    public final View f1247s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f1248t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1249u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.activity.b f1250v = new androidx.activity.b(this, 2);

    /* renamed from: w, reason: collision with root package name */
    public final n0 f1251w = new n0(this, 1);

    /* renamed from: x, reason: collision with root package name */
    public int f1252x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public s0 f1253z;

    public r0(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f1247s = view;
        this.f1248t = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = n0.g0.f33078a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = g0.b.a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f1249u = scaledTouchSlop;
        this.B = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(r0 r0Var) {
        r0 r0Var2 = C;
        if (r0Var2 != null) {
            r0Var2.f1247s.removeCallbacks(r0Var2.f1250v);
        }
        C = r0Var;
        if (r0Var != null) {
            r0Var.f1247s.postDelayed(r0Var.f1250v, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        boolean z10;
        r0 r0Var = D;
        View view = this.f1247s;
        if (r0Var == this) {
            D = null;
            s0 s0Var = this.f1253z;
            if (s0Var != null) {
                View view2 = s0Var.f1267b;
                if (view2.getParent() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((WindowManager) s0Var.f1266a.getSystemService("window")).removeView(view2);
                }
                this.f1253z = null;
                this.B = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (C == this) {
            b(null);
        }
        view.removeCallbacks(this.f1251w);
    }

    public final void c(boolean z10) {
        boolean z11;
        int height;
        int i10;
        int i11;
        String str;
        int i12;
        String str2;
        int i13;
        long longPressTimeout;
        long j10;
        long j11;
        boolean z12;
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        View view = this.f1247s;
        if (!c0.g.b(view)) {
            return;
        }
        b(null);
        r0 r0Var = D;
        if (r0Var != null) {
            r0Var.a();
        }
        D = this;
        this.A = z10;
        s0 s0Var = new s0(view.getContext());
        this.f1253z = s0Var;
        int i14 = this.f1252x;
        int i15 = this.y;
        boolean z13 = this.A;
        View view2 = s0Var.f1267b;
        if (view2.getParent() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Context context = s0Var.f1266a;
        if (z11) {
            if (view2.getParent() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
        }
        s0Var.f1268c.setText(this.f1248t);
        WindowManager.LayoutParams layoutParams = s0Var.f1269d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i14 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i15 + dimensionPixelOffset2;
            i10 = i15 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i10 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = context.getResources();
        if (z13) {
            i11 = R.dimen.tooltip_y_offset_touch;
        } else {
            i11 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i11);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
                if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            str2 = "window";
        } else {
            Rect rect = s0Var.f1270e;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left >= 0 || rect.top >= 0) {
                str = "window";
                i12 = 0;
            } else {
                Resources resources2 = context.getResources();
                str = "window";
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i13 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i13 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i12 = 0;
                rect.set(0, i13, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = s0Var.f1271g;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = s0Var.f;
            view.getLocationOnScreen(iArr2);
            int i16 = iArr2[i12] - iArr[i12];
            iArr2[i12] = i16;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams.x = (i16 + i14) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i17 = iArr2[1];
            int i18 = ((i10 + i17) - dimensionPixelOffset3) - measuredHeight;
            int i19 = i17 + height + dimensionPixelOffset3;
            if (z13) {
                if (i18 >= 0) {
                    layoutParams.y = i18;
                } else {
                    layoutParams.y = i19;
                }
            } else if (measuredHeight + i19 <= rect.height()) {
                layoutParams.y = i19;
            } else {
                layoutParams.y = i18;
            }
            str2 = str;
        }
        ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
        view.addOnAttachStateChangeListener(this);
        if (this.A) {
            j11 = 2500;
        } else {
            if ((c0.d.g(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = com.anythink.expressad.video.module.a.a.m.ag;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 15000;
            }
            j11 = j10 - longPressTimeout;
        }
        n0 n0Var = this.f1251w;
        view.removeCallbacks(n0Var);
        view.postDelayed(n0Var, j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.widget.s0 r5 = r4.f1253z
            r0 = 0
            if (r5 == 0) goto La
            boolean r5 = r4.A
            if (r5 == 0) goto La
            return r0
        La:
            android.view.View r5 = r4.f1247s
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r6.getAction()
            r2 = 7
            r3 = 1
            if (r1 == r2) goto L38
            r5 = 10
            if (r1 == r5) goto L32
            goto L74
        L32:
            r4.B = r3
            r4.a()
            goto L74
        L38:
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L74
            androidx.appcompat.widget.s0 r5 = r4.f1253z
            if (r5 != 0) goto L74
            float r5 = r6.getX()
            int r5 = (int) r5
            float r6 = r6.getY()
            int r6 = (int) r6
            boolean r1 = r4.B
            if (r1 != 0) goto L69
            int r1 = r4.f1252x
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r4.f1249u
            if (r1 > r2) goto L69
            int r1 = r4.y
            int r1 = r6 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L67
            goto L69
        L67:
            r3 = r0
            goto L6f
        L69:
            r4.f1252x = r5
            r4.y = r6
            r4.B = r0
        L6f:
            if (r3 == 0) goto L74
            b(r4)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f1252x = view.getWidth() / 2;
        this.y = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
