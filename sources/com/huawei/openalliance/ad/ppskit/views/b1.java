package com.huawei.openalliance.ad.ppskit.views;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.views.SixElementsView;

/* loaded from: classes2.dex */
public final class b1 extends ClickableSpan {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f23394s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SixElementsView f23395t;

    public b1(SixElementsView sixElementsView, int i10) {
        this.f23395t = sixElementsView;
        this.f23394s = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10 = SixElementsView.b.f23347a[s.f.c(this.f23394s)];
        SixElementsView sixElementsView = this.f23395t;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    int i11 = SixElementsView.J;
                    sixElementsView.e();
                    return;
                }
                return;
            }
            int i12 = SixElementsView.J;
            sixElementsView.f();
            return;
        }
        int i13 = SixElementsView.J;
        sixElementsView.g();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f23395t.f23340v.getResources().getColor(R.color.hiad_40_percent_black));
        textPaint.setUnderlineText(false);
    }
}
