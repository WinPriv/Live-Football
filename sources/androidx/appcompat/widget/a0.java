package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public final class a0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b0 f1123s;

    public a0(b0 b0Var) {
        this.f1123s = b0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        DropDownListView dropDownListView;
        if (i10 != -1 && (dropDownListView = this.f1123s.f1126u) != null) {
            dropDownListView.setListSelectionHidden(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
