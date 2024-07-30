package com.onesignal;

import com.google.android.gms.common.Scopes;

/* compiled from: UserStateEmail.java */
/* loaded from: classes2.dex */
public final class r4 extends q4 {
    public r4(String str, boolean z10) {
        super(Scopes.EMAIL.concat(str), z10);
    }

    @Override // com.onesignal.q4
    public final q4 g() {
        return new r4("TOSYNC_STATE", false);
    }

    @Override // com.onesignal.q4
    public final void a() {
    }
}
