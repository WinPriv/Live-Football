package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.j;
import com.google.android.material.internal.m;
import com.google.android.material.textfield.TextInputLayout;
import com.hamkho.livefoot.R;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: s, reason: collision with root package name */
    public final Chip f21216s;

    /* renamed from: t, reason: collision with root package name */
    public final EditText f21217t;

    /* loaded from: classes2.dex */
    public class a extends j {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean isEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (isEmpty) {
                chipTextInputComboView.f21216s.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            String a10 = ChipTextInputComboView.a(chipTextInputComboView, editable);
            Chip chip = chipTextInputComboView.f21216s;
            if (TextUtils.isEmpty(a10)) {
                a10 = ChipTextInputComboView.a(chipTextInputComboView, "00");
            }
            chip.setText(a10);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f21216s = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f21217t = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a());
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        editText.setId(c0.e.a());
        c0.e.h(textView, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f21216s.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21217t.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z10) {
        int i10;
        Chip chip = this.f21216s;
        chip.setChecked(z10);
        int i11 = 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        EditText editText = this.f21217t;
        editText.setVisibility(i10);
        if (z10) {
            i11 = 8;
        }
        chip.setVisibility(i11);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new m(editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f21216s.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        this.f21216s.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f21216s.toggle();
    }
}
