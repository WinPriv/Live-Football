package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    protected final x f14162a;

    /* loaded from: classes.dex */
    public static final class a extends ai {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public d(x xVar) {
        this.f14162a = xVar;
    }

    public abstract boolean a(y yVar) throws ai;

    public abstract boolean a(y yVar, long j10) throws ai;

    public final boolean b(y yVar, long j10) throws ai {
        if (a(yVar) && a(yVar, j10)) {
            return true;
        }
        return false;
    }
}
