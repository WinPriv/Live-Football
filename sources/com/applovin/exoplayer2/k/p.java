package com.applovin.exoplayer2.k;

import android.content.Context;
import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.k.q;

@Deprecated
/* loaded from: classes.dex */
public final class p implements i.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16160a;

    /* renamed from: b, reason: collision with root package name */
    private final aa f16161b;

    /* renamed from: c, reason: collision with root package name */
    private final i.a f16162c;

    public p(Context context, String str) {
        this(context, str, (aa) null);
    }

    @Override // com.applovin.exoplayer2.k.i.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o a() {
        o oVar = new o(this.f16160a, this.f16162c.a());
        aa aaVar = this.f16161b;
        if (aaVar != null) {
            oVar.a(aaVar);
        }
        return oVar;
    }

    public p(Context context, String str, aa aaVar) {
        this(context, aaVar, new q.a().a(str));
    }

    public p(Context context, aa aaVar, i.a aVar) {
        this.f16160a = context.getApplicationContext();
        this.f16161b = aaVar;
        this.f16162c = aVar;
    }
}
