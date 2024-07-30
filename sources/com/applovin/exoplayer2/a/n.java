package com.applovin.exoplayer2.a;

import android.content.Intent;
import b6.e;
import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.l.p;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.EnhancedIntentService;
import d6.o;
import l4.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements p.a, o.a, e.g.a, OnCompleteListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12979s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12980t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12981u;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f12979s = i10;
        this.f12980t = obj;
        this.f12981u = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    @Override // b6.e.g.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j7.v1 a(int r19, j5.m0 r20, int[] r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.a.n.a(int, j5.m0, int[]):j7.v1");
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        int i10 = this.f12979s;
        Object obj2 = this.f12981u;
        Object obj3 = this.f12980t;
        switch (i10) {
            case 0:
                ((b) obj).a((b.a) obj3, (ak) obj2);
                return;
            case 1:
                ((b) obj).a((b.a) obj3, (Exception) obj2);
                return;
            case 2:
                ((b) obj).a((b.a) obj3, (String) obj2);
                return;
            case 3:
                ((l4.b) obj).getClass();
                return;
            case 4:
                ((l4.b) obj).getClass();
                return;
            case 5:
                ((l4.b) obj).getClass();
                return;
            case 6:
                ((l4.b) obj).d((b.a) obj3, (j5.r) obj2);
                return;
            case 7:
                ((l4.b) obj).getClass();
                return;
            default:
                ((l4.b) obj).getClass();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.f12980t;
        Intent intent = (Intent) this.f12981u;
        int i10 = EnhancedIntentService.f21271x;
        enhancedIntentService.a(intent);
    }
}
