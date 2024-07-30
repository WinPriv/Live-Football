package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f933v = {R.attr.popupBackground};

    /* renamed from: s, reason: collision with root package name */
    public final c f934s;

    /* renamed from: t, reason: collision with root package name */
    public final p f935t;

    /* renamed from: u, reason: collision with root package name */
    public final g f936u;

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.f934s;
        if (cVar != null) {
            cVar.a();
        }
        p pVar = this.f935t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r0.j.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        c cVar = this.f934s;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.f934s;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f935t.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f935t.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a0.a.T0(this, editorInfo, onCreateInputConnection);
        return this.f936u.h(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.f934s;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.f934s;
        if (cVar != null) {
            cVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f935t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f935t;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r0.j.e(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(g.a.a(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f936u.j(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f936u.d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c cVar = this.f934s;
        if (cVar != null) {
            cVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c cVar = this.f934s;
        if (cVar != null) {
            cVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        p pVar = this.f935t;
        pVar.l(colorStateList);
        pVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        p pVar = this.f935t;
        pVar.m(mode);
        pVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f935t;
        if (pVar != null) {
            pVar.g(i10, context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, com.hamkho.livefoot.R.attr.autoCompleteTextViewStyle);
        j0.a(context);
        h0.a(getContext(), this);
        m0 m10 = m0.m(getContext(), attributeSet, f933v, com.hamkho.livefoot.R.attr.autoCompleteTextViewStyle);
        if (m10.l(0)) {
            setDropDownBackgroundDrawable(m10.e(0));
        }
        m10.n();
        c cVar = new c(this);
        this.f934s = cVar;
        cVar.d(attributeSet, com.hamkho.livefoot.R.attr.autoCompleteTextViewStyle);
        p pVar = new p(this);
        this.f935t = pVar;
        pVar.f(attributeSet, com.hamkho.livefoot.R.attr.autoCompleteTextViewStyle);
        pVar.b();
        g gVar = new g(this);
        this.f936u = gVar;
        gVar.g(attributeSet, com.hamkho.livefoot.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener d10 = gVar.d(keyListener);
            if (d10 == keyListener) {
                return;
            }
            super.setKeyListener(d10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }
}
