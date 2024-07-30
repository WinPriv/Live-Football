package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton {

    /* renamed from: s, reason: collision with root package name */
    public final c f998s;

    /* renamed from: t, reason: collision with root package name */
    public final p f999t;

    /* renamed from: u, reason: collision with root package name */
    public h f1000u;

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        h0.a(getContext(), this);
        c cVar = new c(this);
        this.f998s = cVar;
        cVar.d(attributeSet, R.attr.buttonStyleToggle);
        p pVar = new p(this);
        this.f999t = pVar;
        pVar.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private h getEmojiTextViewHelper() {
        if (this.f1000u == null) {
            this.f1000u = new h(this);
        }
        return this.f1000u;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.f998s;
        if (cVar != null) {
            cVar.a();
        }
        p pVar = this.f999t;
        if (pVar != null) {
            pVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        c cVar = this.f998s;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.f998s;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f999t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f999t.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.f998s;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.f998s;
        if (cVar != null) {
            cVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f999t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f999t;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c cVar = this.f998s;
        if (cVar != null) {
            cVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c cVar = this.f998s;
        if (cVar != null) {
            cVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        p pVar = this.f999t;
        pVar.l(colorStateList);
        pVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        p pVar = this.f999t;
        pVar.m(mode);
        pVar.b();
    }
}
