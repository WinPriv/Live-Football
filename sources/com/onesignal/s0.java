package com.onesignal;

import com.onesignal.q1;
import java.util.Set;

/* compiled from: OSInAppMessageController.java */
/* loaded from: classes2.dex */
public final class s0 implements q1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f27020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f27021c;

    public s0(v0 v0Var, String str, b1 b1Var) {
        this.f27021c = v0Var;
        this.f27019a = str;
        this.f27020b = b1Var;
    }

    @Override // com.onesignal.q1.a
    public final void onFailure(String str) {
        Set<String> set = this.f27021c.f27117k;
        String str2 = this.f27019a;
        set.remove(str2);
        this.f27020b.f26670d.remove(str2);
    }

    @Override // com.onesignal.q1.a
    public final void a(String str) {
    }
}
