package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.hamkho.livefoot.R;
import java.util.WeakHashMap;
import n0.c0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean A;
    public final int B;

    /* renamed from: s, reason: collision with root package name */
    public boolean f899s;

    /* renamed from: t, reason: collision with root package name */
    public ScrollingTabContainerView f900t;

    /* renamed from: u, reason: collision with root package name */
    public View f901u;

    /* renamed from: v, reason: collision with root package name */
    public View f902v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f903w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f904x;
    public Drawable y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f905z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        c0.d.q(this, aVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.C);
        boolean z10 = false;
        this.f903w = obtainStyledAttributes.getDrawable(0);
        this.f904x = obtainStyledAttributes.getDrawable(2);
        this.B = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f905z = true;
            this.y = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f905z ? !(this.f903w != null || this.f904x != null) : this.y == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f903w;
        if (drawable != null && drawable.isStateful()) {
            this.f903w.setState(getDrawableState());
        }
        Drawable drawable2 = this.f904x;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f904x.setState(getDrawableState());
        }
        Drawable drawable3 = this.y;
        if (drawable3 != null && drawable3.isStateful()) {
            this.y.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f900t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f903w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f904x;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.y;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f901u = findViewById(R.id.action_bar);
        this.f902v = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f899s && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        ScrollingTabContainerView scrollingTabContainerView = this.f900t;
        boolean z12 = true;
        boolean z13 = false;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) scrollingTabContainerView.getLayoutParams();
            int measuredHeight2 = measuredHeight - scrollingTabContainerView.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            scrollingTabContainerView.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f905z) {
            Drawable drawable2 = this.y;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z12 = z13;
        } else {
            if (this.f903w != null) {
                if (this.f901u.getVisibility() == 0) {
                    this.f903w.setBounds(this.f901u.getLeft(), this.f901u.getTop(), this.f901u.getRight(), this.f901u.getBottom());
                } else {
                    View view = this.f902v;
                    if (view != null && view.getVisibility() == 0) {
                        this.f903w.setBounds(this.f902v.getLeft(), this.f902v.getTop(), this.f902v.getRight(), this.f902v.getBottom());
                    } else {
                        this.f903w.setBounds(0, 0, 0, 0);
                    }
                }
                z13 = true;
            }
            this.A = z11;
            if (z11 && (drawable = this.f904x) != null) {
                drawable.setBounds(scrollingTabContainerView.getLeft(), scrollingTabContainerView.getTop(), scrollingTabContainerView.getRight(), scrollingTabContainerView.getBottom());
            }
            z12 = z13;
        }
        if (z12) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        if (this.f901u == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i13 = this.B) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i13, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f901u == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        ScrollingTabContainerView scrollingTabContainerView = this.f900t;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8 && mode != 1073741824) {
            View view = this.f901u;
            boolean z11 = true;
            int i14 = 0;
            if (view != null && view.getVisibility() != 8 && view.getMeasuredHeight() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                i14 = a(this.f901u);
            } else {
                View view2 = this.f902v;
                if (view2 != null && view2.getVisibility() != 8 && view2.getMeasuredHeight() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    i14 = a(this.f902v);
                }
            }
            if (mode == Integer.MIN_VALUE) {
                i12 = View.MeasureSpec.getSize(i11);
            } else {
                i12 = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f900t) + i14, i12));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f903w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f903w);
        }
        this.f903w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f901u;
            if (view != null) {
                this.f903w.setBounds(view.getLeft(), this.f901u.getTop(), this.f901u.getRight(), this.f901u.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f905z ? this.f903w != null || this.f904x != null : this.y != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.y;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.y);
        }
        this.y = drawable;
        boolean z10 = this.f905z;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.y) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f903w != null || this.f904x != null) : this.y == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2;
        Drawable drawable3 = this.f904x;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f904x);
        }
        this.f904x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.A && (drawable2 = this.f904x) != null) {
                drawable2.setBounds(this.f900t.getLeft(), this.f900t.getTop(), this.f900t.getRight(), this.f900t.getBottom());
            }
        }
        if (!this.f905z ? !(this.f903w != null || this.f904x != null) : this.y == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f900t;
        if (scrollingTabContainerView2 != null) {
            removeView(scrollingTabContainerView2);
        }
        this.f900t = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        int i10;
        this.f899s = z10;
        if (z10) {
            i10 = 393216;
        } else {
            i10 = 262144;
        }
        setDescendantFocusability(i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f903w;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f904x;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.y;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f903w;
        boolean z10 = this.f905z;
        if ((drawable == drawable2 && !z10) || ((drawable == this.f904x && this.A) || ((drawable == this.y && z10) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
