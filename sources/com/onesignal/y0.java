package com.onesignal;

import android.content.DialogInterface;
import java.util.List;

/* compiled from: OSInAppMessageController.java */
/* loaded from: classes2.dex */
public final class y0 implements DialogInterface.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b1 f27196s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f27197t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v0 f27198u;

    public y0(v0 v0Var, b1 b1Var, List list) {
        this.f27198u = v0Var;
        this.f27196s = b1Var;
        this.f27197t = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f27198u.I(this.f27196s, this.f27197t);
    }
}
