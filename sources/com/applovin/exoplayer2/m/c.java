package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.l.y;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f16436a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16437b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16438c;

    private c(int i10, int i11, String str) {
        this.f16436a = i10;
        this.f16437b = i11;
        this.f16438c = str;
    }

    public static c a(y yVar) {
        String str;
        yVar.e(2);
        int h10 = yVar.h();
        int i10 = h10 >> 1;
        int h11 = ((yVar.h() >> 3) & 31) | ((h10 & 1) << 5);
        if (i10 != 4 && i10 != 5 && i10 != 7) {
            if (i10 == 8) {
                str = "hev1";
            } else if (i10 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(".0");
        sb2.append(i10);
        if (h11 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(h11);
        return new c(i10, h11, sb2.toString());
    }
}
