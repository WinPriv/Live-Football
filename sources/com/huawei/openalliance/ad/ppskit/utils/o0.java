package com.huawei.openalliance.ad.ppskit.utils;

import android.content.DialogInterface;
import com.hamkho.livefoot.R;
import ka.n7;

/* loaded from: classes2.dex */
public final class o0 implements DialogInterface.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p0 f22933s;

    public o0(p0 p0Var) {
        this.f22933s = p0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        n7.g("IPPSAppointJs", "appoint failed: not allowed");
        p0 p0Var = this.f22933s;
        p0Var.c(p0Var.f, 4, R.string.hiad_calender_appoint_failed);
        p0Var.f22946e.h(4, p0Var.f22944c, p0Var.f22943b);
    }
}
