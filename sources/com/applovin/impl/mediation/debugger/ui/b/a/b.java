package com.applovin.impl.mediation.debugger.ui.b.a;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.b.a;
import com.applovin.impl.mediation.debugger.ui.d.c;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final a.C0193a f18074a;
    private final Context o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f18075p;

    public b(a.C0193a c0193a, boolean z10, Context context) {
        super(c.b.RIGHT_DETAIL);
        this.f18074a = c0193a;
        this.o = context;
        this.f18137d = new SpannedString(c0193a.a());
        this.f18075p = z10;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean c() {
        return true;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public SpannedString i_() {
        return new SpannedString(this.f18074a.b(this.o));
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean j_() {
        Boolean a10 = this.f18074a.a(this.o);
        if (a10 != null) {
            return a10.equals(Boolean.valueOf(this.f18075p));
        }
        return false;
    }
}
