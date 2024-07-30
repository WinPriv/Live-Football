package com.anythink.expressad.exoplayer.j;

import android.content.Context;
import com.anythink.expressad.exoplayer.j.h;

/* loaded from: classes.dex */
public final class o implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8864a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super h> f8865b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a f8866c;

    public o(Context context, String str) {
        this(context, str, (aa<? super h>) null);
    }

    private n b() {
        return new n(this.f8864a, this.f8865b, this.f8866c.a());
    }

    @Override // com.anythink.expressad.exoplayer.j.h.a
    public final /* synthetic */ h a() {
        return new n(this.f8864a, this.f8865b, this.f8866c.a());
    }

    private o(Context context, String str, aa<? super h> aaVar) {
        this(context, aaVar, new q(str, aaVar));
    }

    private o(Context context, aa<? super h> aaVar, h.a aVar) {
        this.f8864a = context.getApplicationContext();
        this.f8865b = aaVar;
        this.f8866c = aVar;
    }
}
