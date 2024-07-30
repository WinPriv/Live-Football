package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: s, reason: collision with root package name */
    public int f1118s;

    /* renamed from: t, reason: collision with root package name */
    public int f1119t;

    /* renamed from: u, reason: collision with root package name */
    public WeakReference<View> f1120u;

    /* renamed from: v, reason: collision with root package name */
    public LayoutInflater f1121v;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1118s = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f8e0, 0, 0);
        this.f1119t = obtainStyledAttributes.getResourceId(2, -1);
        this.f1118s = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f1118s != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f1121v;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f1118s, viewGroup, false);
                int i10 = this.f1119t;
                if (i10 != -1) {
                    inflate.setId(i10);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f1120u = new WeakReference<>(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public int getInflatedId() {
        return this.f1119t;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1121v;
    }

    public int getLayoutResource() {
        return this.f1118s;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f1119t = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1121v = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f1118s = i10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f1120u;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i10);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(a aVar) {
    }
}
