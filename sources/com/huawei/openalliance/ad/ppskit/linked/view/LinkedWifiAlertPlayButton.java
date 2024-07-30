package com.huawei.openalliance.ad.ppskit.linked.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.openalliance.ad.ppskit.views.ProgressButton;

/* loaded from: classes2.dex */
public class LinkedWifiAlertPlayButton extends ProgressButton {
    public Context V;
    public b W;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public LinkedWifiAlertPlayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = context;
        this.W = new b(context);
    }

    public b getStyle() {
        return this.W;
    }

    public void setText(int i10) {
        super.setText(this.V.getResources().getString(i10));
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.ProgressButton
    public void setTextColor(int i10) {
        super.setTextColor(i10);
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.ProgressButton, android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    public void setCoverListener(a aVar) {
    }
}
