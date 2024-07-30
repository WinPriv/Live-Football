package com.google.android.material.datepicker;

import android.view.View;
import com.hamkho.livefoot.R;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class i extends n0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f20700d;

    public i(f fVar) {
        this.f20700d = fVar;
    }

    @Override // n0.a
    public final void d(View view, o0.g gVar) {
        String string;
        this.f33037a.onInitializeAccessibilityNodeInfo(view, gVar.f33521a);
        f fVar = this.f20700d;
        if (fVar.F.getVisibility() == 0) {
            string = fVar.getString(R.string.mtrl_picker_toggle_to_year_selection);
        } else {
            string = fVar.getString(R.string.mtrl_picker_toggle_to_day_selection);
        }
        gVar.h(string);
    }
}
