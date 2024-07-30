package com.google.firebase.messaging;

import android.content.Intent;
import i8.x;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final ArrayDeque y = new ArrayDeque(10);

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public final Intent b(Intent intent) {
        return (Intent) x.a().f29309d.poll();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    @Override // com.google.firebase.messaging.EnhancedIntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Intent r26) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }
}
