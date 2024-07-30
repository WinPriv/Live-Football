package com.applovin.exoplayer2.j;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f15985a;

    /* renamed from: b, reason: collision with root package name */
    private final g[] f15986b;

    /* renamed from: c, reason: collision with root package name */
    private int f15987c;

    public h(g... gVarArr) {
        this.f15986b = gVarArr;
        this.f15985a = gVarArr.length;
    }

    public g a(int i10) {
        return this.f15986b[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            return Arrays.equals(this.f15986b, ((h) obj).f15986b);
        }
        return false;
    }

    public int hashCode() {
        if (this.f15987c == 0) {
            this.f15987c = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f15986b);
        }
        return this.f15987c;
    }
}
