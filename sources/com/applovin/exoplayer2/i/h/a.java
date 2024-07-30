package com.applovin.exoplayer2.i.h;

import a3.k;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.ads.gl;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final y f15803a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15804b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15805c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15806d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15807e;
    private final float f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15808g;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f15803a = new y();
        int size = list.size();
        String str = com.anythink.expressad.exoplayer.b.f7305m;
        if (size == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f15805c = bArr[24];
            this.f15806d = ((bArr[26] & DefaultClassResolver.NAME) << 24) | ((bArr[27] & DefaultClassResolver.NAME) << 16) | ((bArr[28] & DefaultClassResolver.NAME) << 8) | (bArr[29] & DefaultClassResolver.NAME);
            this.f15807e = "Serif".equals(ai.a(bArr, 43, bArr.length - 43)) ? com.anythink.expressad.exoplayer.b.f7304l : str;
            int i10 = bArr[25] * Ascii.DC4;
            this.f15808g = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f15804b = z10;
            if (z10) {
                this.f = ai.a(((bArr[11] & DefaultClassResolver.NAME) | ((bArr[10] & DefaultClassResolver.NAME) << 8)) / i10, gl.Code, 0.95f);
                return;
            } else {
                this.f = 0.85f;
                return;
            }
        }
        this.f15805c = 0;
        this.f15806d = -1;
        this.f15807e = com.anythink.expressad.exoplayer.b.f7305m;
        this.f15804b = false;
        this.f = 0.85f;
        this.f15808g = -1;
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & p.f9095b) << 24)), i12, i13, i14 | 33);
        }
    }

    @Override // com.applovin.exoplayer2.i.d
    public f a(byte[] bArr, int i10, boolean z10) throws h {
        this.f15803a.a(bArr, i10);
        String a10 = a(this.f15803a);
        if (a10.isEmpty()) {
            return b.f15809a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a10);
        a(spannableStringBuilder, this.f15805c, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder, this.f15806d, -1, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f15807e, 0, spannableStringBuilder.length());
        float f = this.f;
        while (this.f15803a.a() >= 8) {
            int c10 = this.f15803a.c();
            int q10 = this.f15803a.q();
            int q11 = this.f15803a.q();
            if (q11 == 1937013100) {
                a(this.f15803a.a() >= 2);
                int i11 = this.f15803a.i();
                for (int i12 = 0; i12 < i11; i12++) {
                    a(this.f15803a, spannableStringBuilder);
                }
            } else if (q11 == 1952608120 && this.f15804b) {
                a(this.f15803a.a() >= 2);
                f = ai.a(this.f15803a.i() / this.f15808g, gl.Code, 0.95f);
            }
            this.f15803a.d(c10 + q10);
        }
        return new b(new a.C0175a().a(spannableStringBuilder).a(f, 0).a(0).e());
    }

    private static String a(y yVar) throws h {
        char g6;
        a(yVar.a() >= 2);
        int i10 = yVar.i();
        if (i10 == 0) {
            return "";
        }
        if (yVar.a() >= 2 && ((g6 = yVar.g()) == 65279 || g6 == 65534)) {
            return yVar.a(i10, Charsets.UTF_16);
        }
        return yVar.a(i10, Charsets.UTF_8);
    }

    private void a(y yVar, SpannableStringBuilder spannableStringBuilder) throws h {
        a(yVar.a() >= 12);
        int i10 = yVar.i();
        int i11 = yVar.i();
        yVar.e(2);
        int h10 = yVar.h();
        yVar.e(1);
        int q10 = yVar.q();
        if (i11 > spannableStringBuilder.length()) {
            StringBuilder n10 = k.n("Truncating styl end (", i11, ") to cueText.length() (");
            n10.append(spannableStringBuilder.length());
            n10.append(").");
            q.c("Tx3gDecoder", n10.toString());
            i11 = spannableStringBuilder.length();
        }
        if (i10 >= i11) {
            q.c("Tx3gDecoder", "Ignoring styl with start (" + i10 + ") >= end (" + i11 + ").");
            return;
        }
        int i12 = i11;
        a(spannableStringBuilder, h10, this.f15805c, i10, i12, 0);
        b(spannableStringBuilder, q10, this.f15806d, i10, i12, 0);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != com.anythink.expressad.exoplayer.b.f7305m) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static void a(boolean z10) throws h {
        if (!z10) {
            throw new h("Unexpected subtitle format.");
        }
    }
}
