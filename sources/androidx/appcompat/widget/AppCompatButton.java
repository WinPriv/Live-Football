package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.hamkho.livefoot.R;

/* loaded from: classes.dex */
public class AppCompatButton extends Button {

    /* renamed from: s, reason: collision with root package name */
    public final c f937s;

    /* renamed from: t, reason: collision with root package name */
    public final p f938t;

    /* renamed from: u, reason: collision with root package name */
    public h f939u;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private h getEmojiTextViewHelper() {
        if (this.f939u == null) {
            this.f939u = new h(this);
        }
        return this.f939u;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.f937s;
        if (cVar != null) {
            cVar.a();
        }
        p pVar = this.f938t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (u0.f1274b) {
            return super.getAutoSizeMaxTextSize();
        }
        p pVar = this.f938t;
        if (pVar != null) {
            return Math.round(pVar.f1221i.f1260e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (u0.f1274b) {
            return super.getAutoSizeMinTextSize();
        }
        p pVar = this.f938t;
        if (pVar != null) {
            return Math.round(pVar.f1221i.f1259d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (u0.f1274b) {
            return super.getAutoSizeStepGranularity();
        }
        p pVar = this.f938t;
        if (pVar != null) {
            return Math.round(pVar.f1221i.f1258c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (u0.f1274b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        p pVar = this.f938t;
        if (pVar != null) {
            return pVar.f1221i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (u0.f1274b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        p pVar = this.f938t;
        if (pVar == null) {
            return 0;
        }
        return pVar.f1221i.f1256a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r0.j.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        c cVar = this.f937s;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.f937s;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f938t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f938t.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        p pVar = this.f938t;
        if (pVar != null && !u0.f1274b) {
            pVar.f1221i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        super.onTextChanged(charSequence, i10, i11, i12);
        boolean z11 = false;
        p pVar = this.f938t;
        if (pVar != null && !u0.f1274b) {
            s sVar = pVar.f1221i;
            if (sVar.i() && sVar.f1256a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            pVar.f1221i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (u0.f1274b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        p pVar = this.f938t;
        if (pVar != null) {
            pVar.i(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (u0.f1274b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        p pVar = this.f938t;
        if (pVar != null) {
            pVar.j(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (u0.f1274b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        p pVar = this.f938t;
        if (pVar != null) {
            pVar.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.f937s;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.f937s;
        if (cVar != null) {
            cVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r0.j.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        p pVar = this.f938t;
        if (pVar != null) {
            pVar.f1214a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c cVar = this.f937s;
        if (cVar != null) {
            cVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c cVar = this.f937s;
        if (cVar != null) {
            cVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        p pVar = this.f938t;
        pVar.l(colorStateList);
        pVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        p pVar = this.f938t;
        pVar.m(mode);
        pVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f938t;
        if (pVar != null) {
            pVar.g(i10, context);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f) {
        boolean z10;
        boolean z11 = u0.f1274b;
        if (z11) {
            super.setTextSize(i10, f);
            return;
        }
        p pVar = this.f938t;
        if (pVar != null && !z11) {
            s sVar = pVar.f1221i;
            if (sVar.i() && sVar.f1256a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                sVar.f(f, i10);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.a(context);
        h0.a(getContext(), this);
        c cVar = new c(this);
        this.f937s = cVar;
        cVar.d(attributeSet, i10);
        p pVar = new p(this);
        this.f938t = pVar;
        pVar.f(attributeSet, i10);
        pVar.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }
}
