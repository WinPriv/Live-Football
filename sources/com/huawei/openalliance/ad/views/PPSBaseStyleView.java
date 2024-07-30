package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public class PPSBaseStyleView extends RelativeLayout {

    /* renamed from: s, reason: collision with root package name */
    public View f23805s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f23806t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f23807u;

    /* renamed from: v, reason: collision with root package name */
    public int f23808v;

    public PPSBaseStyleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23808v = 1;
    }

    public final void a(String str, String str2) {
        if (this.f23806t != null && !TextUtils.isEmpty(str)) {
            this.f23806t.setText(str);
        }
        if (this.f23807u != null && !TextUtils.isEmpty(str2)) {
            this.f23807u.setText(str2);
        }
    }

    public void setOrientation(int i10) {
        this.f23808v = i10;
    }

    public void setShowLogo(boolean z10) {
        if (!z10 && this.f23808v == 1) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = gb.u.j(getContext()) + layoutParams2.bottomMargin;
                setLayoutParams(layoutParams2);
            }
        }
    }
}
