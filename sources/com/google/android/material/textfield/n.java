package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: EndIconDelegate.java */
/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f21180a;

    /* renamed from: b, reason: collision with root package name */
    public final EndCompoundLayout f21181b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f21182c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f21183d;

    public n(EndCompoundLayout endCompoundLayout) {
        this.f21180a = endCompoundLayout.f21085s;
        this.f21181b = endCompoundLayout;
        this.f21182c = endCompoundLayout.getContext();
        this.f21183d = endCompoundLayout.y;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public o0.d h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof m;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f21181b.e(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(o0.g gVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z10) {
    }
}
