package com.applovin.exoplayer2.i.e;

import android.text.TextUtils;
import com.anythink.expressad.exoplayer.k.o;
import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f15704a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15705b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15706c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15707d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15708e;

    private b(int i10, int i11, int i12, int i13, int i14) {
        this.f15704a = i10;
        this.f15705b = i11;
        this.f15706c = i12;
        this.f15707d = i13;
        this.f15708e = i14;
    }

    public static b a(String str) {
        char c10;
        com.applovin.exoplayer2.l.a.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String lowerCase = Ascii.toLowerCase(split[i14].trim());
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case 100571:
                    if (lowerCase.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (lowerCase.equals(o.f9070c)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (lowerCase.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (lowerCase.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i12 = i14;
                    break;
            }
        }
        if (i10 != -1 && i11 != -1 && i13 != -1) {
            return new b(i10, i11, i12, i13, split.length);
        }
        return null;
    }
}
