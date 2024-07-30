package com.onesignal;

/* compiled from: UserStateSMS.java */
/* loaded from: classes2.dex */
public final class w4 extends q4 {
    public w4(String str, boolean z10) {
        super("sms".concat(str), z10);
    }

    @Override // com.onesignal.q4
    public final q4 g() {
        return new w4("TOSYNC_STATE", false);
    }

    @Override // com.onesignal.q4
    public final void a() {
    }
}
