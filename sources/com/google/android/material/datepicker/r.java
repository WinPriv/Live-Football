package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
/* loaded from: classes2.dex */
public final class r<S> extends w<S> {

    /* renamed from: t, reason: collision with root package name */
    public int f20722t;

    /* renamed from: u, reason: collision with root package name */
    public DateSelector<S> f20723u;

    /* renamed from: v, reason: collision with root package name */
    public CalendarConstraints f20724v;

    /* compiled from: MaterialTextInputPicker.java */
    /* loaded from: classes2.dex */
    public class a extends v<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.v
        public final void a(S s10) {
            Iterator<v<S>> it = r.this.f20742s.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f20722t = bundle.getInt("THEME_RES_ID_KEY");
        this.f20723u = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f20724v = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f20722t));
        DateSelector<S> dateSelector = this.f20723u;
        new a();
        return dateSelector.Q();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f20722t);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f20723u);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f20724v);
    }
}
