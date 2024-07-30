package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.hamkho.livefoot.R;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: classes2.dex */
public final class t extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f21214e;
    public EditText f;

    /* renamed from: g, reason: collision with root package name */
    public final b7.a f21215g;

    public t(EndCompoundLayout endCompoundLayout, int i10) {
        super(endCompoundLayout);
        this.f21214e = R.drawable.design_password_eye;
        this.f21215g = new b7.a(this, 2);
        if (i10 != 0) {
            this.f21214e = i10;
        }
    }

    @Override // com.google.android.material.textfield.n
    public final void b() {
        q();
    }

    @Override // com.google.android.material.textfield.n
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.n
    public final int d() {
        return this.f21214e;
    }

    @Override // com.google.android.material.textfield.n
    public final View.OnClickListener f() {
        return this.f21215g;
    }

    @Override // com.google.android.material.textfield.n
    public final boolean k() {
        return true;
    }

    @Override // com.google.android.material.textfield.n
    public final boolean l() {
        boolean z10;
        EditText editText = this.f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    @Override // com.google.android.material.textfield.n
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    @Override // com.google.android.material.textfield.n
    public final void r() {
        boolean z10;
        EditText editText = this.f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.n
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
