package com.google.android.material.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public final class m implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f20884s;

    public m(EditText editText) {
        this.f20884s = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f20884s;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
