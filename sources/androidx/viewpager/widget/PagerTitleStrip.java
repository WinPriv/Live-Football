package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.ads.gl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;

@ViewPager.b
/* loaded from: classes.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: s, reason: collision with root package name */
    public ViewPager f2500s;

    /* renamed from: t, reason: collision with root package name */
    public int f2501t;

    /* renamed from: u, reason: collision with root package name */
    public float f2502u;

    /* renamed from: v, reason: collision with root package name */
    public int f2503v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2504w;

    /* renamed from: x, reason: collision with root package name */
    public WeakReference<p1.a> f2505x;

    /* loaded from: classes.dex */
    public static class a extends SingleLineTransformationMethod {

        /* renamed from: s, reason: collision with root package name */
        public final Locale f2506s;

        public a(Context context) {
            this.f2506s = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f2506s);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new a(textView.getContext()));
    }

    public final void a(p1.a aVar, p1.a aVar2) {
        if (aVar != null) {
            aVar.f34229a.unregisterObserver(null);
            this.f2505x = null;
        }
        if (aVar2 != null) {
            aVar2.f34229a.registerObserver(null);
            this.f2505x = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f2500s;
        if (viewPager == null) {
            return;
        }
        this.f2501t = -1;
        this.f2502u = -1.0f;
        viewPager.getCurrentItem();
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f2504w = true;
        throw null;
    }

    public void b(float f, int i10) {
        if (i10 != this.f2501t) {
            p1.a adapter = this.f2500s.getAdapter();
            if (adapter != null) {
                adapter.a();
            }
            this.f2504w = true;
            throw null;
        }
        throw null;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f2503v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            p1.a adapter = viewPager.getAdapter();
            p1.a aVar = null;
            viewPager.R = null;
            if (viewPager.S == null) {
                viewPager.S = new ArrayList();
            }
            viewPager.S.add(null);
            this.f2500s = viewPager;
            WeakReference<p1.a> weakReference = this.f2505x;
            if (weakReference != null) {
                aVar = weakReference.get();
            }
            a(aVar, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f2500s;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.f2500s;
            ViewPager.f fVar = viewPager2.R;
            viewPager2.R = null;
            ArrayList arrayList = viewPager2.S;
            if (arrayList != null) {
                arrayList.remove((Object) null);
            }
            this.f2500s = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f2500s != null) {
            float f = this.f2502u;
            if (f < gl.Code) {
                f = 0.0f;
            }
            b(f, this.f2501t);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), -2);
        ViewGroup.getChildMeasureSpec(i10, (int) (View.MeasureSpec.getSize(i10) * 0.2f), -2);
        throw null;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (!this.f2504w) {
            super.requestLayout();
        }
    }

    public void setGravity(int i10) {
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        throw null;
    }

    public void setTextColor(int i10) {
        throw null;
    }

    public void setTextSpacing(int i10) {
        this.f2503v = i10;
        requestLayout();
    }
}
