package com.onesignal;

import com.onesignal.e3;
import com.onesignal.v0;

/* compiled from: OSInAppMessagePushPrompt.java */
/* loaded from: classes2.dex */
public final class g1 extends e1 {
    @Override // com.onesignal.e1
    public final String a() {
        return "push";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.onesignal.f1] */
    @Override // com.onesignal.e1
    public final void b(final v0.g gVar) {
        e3.G(true, new e3.v() { // from class: com.onesignal.f1
            @Override // com.onesignal.e3.v
            public final void a(boolean z10) {
                e3.u uVar;
                if (z10) {
                    uVar = e3.u.PERMISSION_GRANTED;
                } else {
                    uVar = e3.u.PERMISSION_DENIED;
                }
                ((v0.g) gVar).a(uVar);
            }
        });
    }
}
