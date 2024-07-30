package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public TypedValue f1004s;

    /* renamed from: t, reason: collision with root package name */
    public TypedValue f1005t;

    /* renamed from: u, reason: collision with root package name */
    public TypedValue f1006u;

    /* renamed from: v, reason: collision with root package name */
    public TypedValue f1007v;

    /* renamed from: w, reason: collision with root package name */
    public TypedValue f1008w;

    /* renamed from: x, reason: collision with root package name */
    public TypedValue f1009x;
    public final Rect y;

    /* renamed from: z, reason: collision with root package name */
    public a f1010z;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.y = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1008w == null) {
            this.f1008w = new TypedValue();
        }
        return this.f1008w;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1009x == null) {
            this.f1009x = new TypedValue();
        }
        return this.f1009x;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1006u == null) {
            this.f1006u = new TypedValue();
        }
        return this.f1006u;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1007v == null) {
            this.f1007v = new TypedValue();
        }
        return this.f1007v;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1004s == null) {
            this.f1004s = new TypedValue();
        }
        return this.f1004s;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1005t == null) {
            this.f1005t = new TypedValue();
        }
        return this.f1005t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1010z;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1010z;
        if (aVar != null) {
            AppCompatDelegateImpl appCompatDelegateImpl = ((androidx.appcompat.app.i) aVar).f658a;
            v vVar = appCompatDelegateImpl.J;
            if (vVar != null) {
                vVar.i();
            }
            if (appCompatDelegateImpl.O != null) {
                appCompatDelegateImpl.D.getDecorView().removeCallbacks(appCompatDelegateImpl.P);
                if (appCompatDelegateImpl.O.isShowing()) {
                    try {
                        appCompatDelegateImpl.O.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                appCompatDelegateImpl.O = null;
            }
            n0.l0 l0Var = appCompatDelegateImpl.Q;
            if (l0Var != null) {
                l0Var.b();
            }
            androidx.appcompat.view.menu.h hVar = appCompatDelegateImpl.Q(0).f633h;
            if (hVar != null) {
                hVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f1010z = aVar;
    }
}
