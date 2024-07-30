package com.google.android.material.textfield;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.b0;

/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes2.dex */
public final class r implements AdapterView.OnItemClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MaterialAutoCompleteTextView f21213s;

    public r(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        this.f21213s = materialAutoCompleteTextView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        Object item;
        int selectedItemPosition;
        View view2 = null;
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f21213s;
        if (i10 < 0) {
            b0 b0Var = materialAutoCompleteTextView.f21099w;
            if (!b0Var.a()) {
                item = null;
            } else {
                item = b0Var.f1126u.getSelectedItem();
            }
        } else {
            item = materialAutoCompleteTextView.getAdapter().getItem(i10);
        }
        MaterialAutoCompleteTextView.a(materialAutoCompleteTextView, item);
        AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
        b0 b0Var2 = materialAutoCompleteTextView.f21099w;
        if (onItemClickListener != null) {
            if (view == null || i10 < 0) {
                if (b0Var2.a()) {
                    view2 = b0Var2.f1126u.getSelectedView();
                }
                view = view2;
                if (!b0Var2.a()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = b0Var2.f1126u.getSelectedItemPosition();
                }
                i10 = selectedItemPosition;
                if (!b0Var2.a()) {
                    j10 = Long.MIN_VALUE;
                } else {
                    j10 = b0Var2.f1126u.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(b0Var2.f1126u, view, i10, j10);
        }
        b0Var2.dismiss();
    }
}
