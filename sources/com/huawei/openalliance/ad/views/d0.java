package com.huawei.openalliance.ad.views;

import android.view.View;

/* loaded from: classes2.dex */
public final class d0 implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f24137s;

    public d0(a0 a0Var) {
        this.f24137s = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        a0 a0Var = this.f24137s;
        VideoView videoView = a0Var.f24109a;
        if (videoView != null && (onClickListener = a0Var.f24121n) != null) {
            onClickListener.onClick(videoView);
        }
    }
}
