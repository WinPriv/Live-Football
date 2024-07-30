package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.hamkho.livefoot.R;

/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements r0.l {

    /* renamed from: s, reason: collision with root package name */
    public final e f965s;

    /* renamed from: t, reason: collision with root package name */
    public final c f966t;

    /* renamed from: u, reason: collision with root package name */
    public final p f967u;

    /* renamed from: v, reason: collision with root package name */
    public h f968v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        j0.a(context);
        h0.a(getContext(), this);
        e eVar = new e(this);
        this.f965s = eVar;
        eVar.b(attributeSet, R.attr.radioButtonStyle);
        c cVar = new c(this);
        this.f966t = cVar;
        cVar.d(attributeSet, R.attr.radioButtonStyle);
        p pVar = new p(this);
        this.f967u = pVar;
        pVar.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private h getEmojiTextViewHelper() {
        if (this.f968v == null) {
            this.f968v = new h(this);
        }
        return this.f968v;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.f966t;
        if (cVar != null) {
            cVar.a();
        }
        p pVar = this.f967u;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        e eVar = this.f965s;
        if (eVar != null) {
            eVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        c cVar = this.f966t;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.f966t;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // r0.l
    public ColorStateList getSupportButtonTintList() {
        e eVar = this.f965s;
        if (eVar != null) {
            return eVar.f1154b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        e eVar = this.f965s;
        if (eVar != null) {
            return eVar.f1155c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f967u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f967u.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.f966t;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.f966t;
        if (cVar != null) {
            cVar.f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        e eVar = this.f965s;
        if (eVar != null) {
            if (eVar.f) {
                eVar.f = false;
            } else {
                eVar.f = true;
                eVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f967u;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f967u;
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
        c cVar = this.f966t;
        if (cVar != null) {
            cVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c cVar = this.f966t;
        if (cVar != null) {
            cVar.i(mode);
        }
    }

    @Override // r0.l
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        e eVar = this.f965s;
        if (eVar != null) {
            eVar.f1154b = colorStateList;
            eVar.f1156d = true;
            eVar.a();
        }
    }

    @Override // r0.l
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        e eVar = this.f965s;
        if (eVar != null) {
            eVar.f1155c = mode;
            eVar.f1157e = true;
            eVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        p pVar = this.f967u;
        pVar.l(colorStateList);
        pVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        p pVar = this.f967u;
        pVar.m(mode);
        pVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(g.a.a(getContext(), i10));
    }
}
