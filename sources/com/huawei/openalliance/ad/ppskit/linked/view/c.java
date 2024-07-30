package com.huawei.openalliance.ad.ppskit.linked.view;

import android.content.Context;
import android.view.View;
import androidx.activity.n;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.linked.view.d;
import ka.j7;
import ka.k7;

/* loaded from: classes2.dex */
public final class c implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f22684s;

    public c(d dVar) {
        this.f22684s = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        j7 j7Var;
        d dVar = this.f22684s;
        CharSequence text = dVar.I.getText();
        Context context = dVar.D;
        if (context != null) {
            str = context.getResources().getString(R.string.hiad_continue_to_play);
        } else {
            str = null;
        }
        if (str != null && str.equals(text)) {
            dVar.O = false;
            d.h hVar = dVar.Y;
            if (hVar != null && (j7Var = LinkedLandVideoView.this.E) != null) {
                n.J(j7Var.f31322v, (ContentRecord) j7Var.f32660t, "linkedContinuePlay", -111111L, -111111L, -111111, -111111);
            }
        }
        k7 k7Var = dVar.J;
        if (k7Var != null) {
            dVar.B(k7Var.a(1, dVar.O));
        }
    }
}
