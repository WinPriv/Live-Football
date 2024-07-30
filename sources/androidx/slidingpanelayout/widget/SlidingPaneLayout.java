package androidx.slidingpanelayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import com.huawei.hms.ads.gl;
import d0.a;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {
    public float A;
    public boolean B;
    public boolean C;

    /* renamed from: s, reason: collision with root package name */
    public int f2407s;

    /* renamed from: t, reason: collision with root package name */
    public int f2408t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f2409u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f2410v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2411w;

    /* renamed from: x, reason: collision with root package name */
    public View f2412x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public float f2413z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public boolean f2414u;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeInt(this.f2414u ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.f2414u = parcel.readInt() != 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public final boolean a() {
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.e.d(this) == 1) {
            return true;
        }
        return false;
    }

    public final void b() {
        if (!this.f2411w) {
            return;
        }
        boolean a10 = a();
        a aVar = (a) this.f2412x.getLayoutParams();
        if (a10) {
            getPaddingRight();
            int i10 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            this.f2412x.getWidth();
            getWidth();
        } else {
            getPaddingLeft();
            int i11 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
        }
        this.f2412x.getTop();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof a) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        throw null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i10;
        int i11;
        super.draw(canvas);
        if (a()) {
            drawable = this.f2410v;
        } else {
            drawable = this.f2409u;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (a()) {
                i11 = view.getRight();
                i10 = intrinsicWidth + i11;
            } else {
                int left = view.getLeft();
                int i12 = left - intrinsicWidth;
                i10 = left;
                i11 = i12;
            }
            drawable.setBounds(i11, top, i10, bottom);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        a aVar = (a) view.getLayoutParams();
        int save = canvas.save();
        if (this.f2411w && !aVar.f2417b && this.f2412x != null) {
            canvas.getClipBounds(null);
            if (a()) {
                throw null;
            }
            throw null;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f2408t;
    }

    public int getParallaxDistance() {
        return this.y;
    }

    public int getSliderFadeColor() {
        return this.f2407s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C = true;
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f2411w && actionMasked == 0 && getChildCount() > 1 && getChildAt(1) != null) {
            motionEvent.getX();
            motionEvent.getY();
            throw null;
        }
        if (this.f2411w) {
            if (actionMasked != 3) {
                if (actionMasked != 1) {
                    if (actionMasked != 0) {
                        if (actionMasked != 2) {
                            throw null;
                        }
                        float x10 = motionEvent.getX();
                        float y = motionEvent.getY();
                        Math.abs(x10 - this.f2413z);
                        Math.abs(y - this.A);
                        throw null;
                    }
                    float x11 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    this.f2413z = x11;
                    this.A = y10;
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (a()) {
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r20, int r21) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1595s);
        if (savedState.f2414u) {
            if (!this.C) {
                b();
            } else {
                this.B = true;
            }
        } else if (!this.C) {
            b();
        } else {
            this.B = false;
        }
        this.B = savedState.f2414u;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        boolean z11 = this.f2411w;
        if (z11) {
            z10 = !z11;
        } else {
            z10 = this.B;
        }
        savedState.f2414u = z10;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            this.C = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f2411w) {
            return super.onTouchEvent(motionEvent);
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        boolean z10;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f2411w) {
            if (view == this.f2412x) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.B = z10;
        }
    }

    public void setCoveredFadeColor(int i10) {
        this.f2408t = i10;
    }

    public void setParallaxDistance(int i10) {
        this.y = i10;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f2409u = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f2410v = drawable;
    }

    @Deprecated
    public void setShadowResource(int i10) {
        setShadowDrawable(getResources().getDrawable(i10));
    }

    public void setShadowResourceLeft(int i10) {
        Context context = getContext();
        Object obj = d0.a.f27248a;
        setShadowDrawableLeft(a.c.b(context, i10));
    }

    public void setShadowResourceRight(int i10) {
        Context context = getContext();
        Object obj = d0.a.f27248a;
        setShadowDrawableRight(a.c.b(context, i10));
    }

    public void setSliderFadeColor(int i10) {
        this.f2407s = i10;
    }

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: c, reason: collision with root package name */
        public static final int[] f2415c = {R.attr.layout_weight};

        /* renamed from: a, reason: collision with root package name */
        public final float f2416a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2417b;

        public a() {
            super(-1, -1);
            this.f2416a = gl.Code;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2416a = gl.Code;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2416a = gl.Code;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2416a = gl.Code;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2415c);
            this.f2416a = obtainStyledAttributes.getFloat(0, gl.Code);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public void setPanelSlideListener(b bVar) {
    }
}
