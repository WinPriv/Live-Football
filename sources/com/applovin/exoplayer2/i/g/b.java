package com.applovin.exoplayer2.i.g;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.a.w;
import com.applovin.exoplayer2.common.base.Ascii;
import com.huawei.openalliance.ad.constant.av;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class b {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f15737d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    private static final w<String> f15738e = w.a("auto", "none");
    private static final w<String> f = w.a("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    private static final w<String> f15739g = w.a("filled", av.ai);

    /* renamed from: h, reason: collision with root package name */
    private static final w<String> f15740h = w.a("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f15741a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15742b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15743c;

    private b(int i10, int i11, int i12) {
        this.f15741a = i10;
        this.f15742b = i11;
        this.f15743c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return a((w<String>) w.a((Object[]) TextUtils.split(lowerCase, f15737d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r9.equals("auto") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fe, code lost:
    
        if (r9.equals("dot") == false) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.exoplayer2.i.g.b a(com.applovin.exoplayer2.common.a.w<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.g.b.a(com.applovin.exoplayer2.common.a.w):com.applovin.exoplayer2.i.g.b");
    }
}
