package com.applovin.exoplayer2.i.g;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f {
    public static g a(g gVar, String[] strArr, Map<String, g> map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a(map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }

    private static d b(d dVar, Map<String, g> map) {
        while (dVar != null) {
            g a10 = a(dVar.f, dVar.c(), map);
            if (a10 != null && a10.k() == 1) {
                return dVar;
            }
            dVar = dVar.f15767i;
        }
        return null;
    }

    public static void a(Spannable spannable, int i10, int i11, g gVar, d dVar, Map<String, g> map, int i12) {
        d a10;
        g a11;
        int i13;
        if (gVar.a() != -1) {
            spannable.setSpan(new StyleSpan(gVar.a()), i10, i11, 33);
        }
        if (gVar.b()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.c()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.f()) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new ForegroundColorSpan(gVar.e()), i10, i11, 33);
        }
        if (gVar.h()) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new BackgroundColorSpan(gVar.g()), i10, i11, 33);
        }
        if (gVar.d() != null) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new TypefaceSpan(gVar.d()), i10, i11, 33);
        }
        if (gVar.p() != null) {
            b bVar = (b) com.applovin.exoplayer2.l.a.b(gVar.p());
            int i14 = bVar.f15741a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = bVar.f15742b;
            }
            int i15 = bVar.f15743c;
            if (i15 == -2) {
                i15 = 1;
            }
            com.applovin.exoplayer2.i.d.d.a(spannable, new com.applovin.exoplayer2.i.d.e(i14, i13, i15), i10, i11, 33);
        }
        int k10 = gVar.k();
        if (k10 == 2) {
            d b10 = b(dVar, map);
            if (b10 != null && (a10 = a(b10, map)) != null) {
                if (a10.a() == 1 && a10.a(0).f15761b != null) {
                    String str = (String) ai.a(a10.a(0).f15761b);
                    g a12 = a(a10.f, a10.c(), map);
                    int l10 = a12 != null ? a12.l() : -1;
                    if (l10 == -1 && (a11 = a(b10.f, b10.c(), map)) != null) {
                        l10 = a11.l();
                    }
                    spannable.setSpan(new com.applovin.exoplayer2.i.d.c(str, l10), i10, i11, 33);
                } else {
                    q.b("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        } else if (k10 == 3 || k10 == 4) {
            spannable.setSpan(new a(), i10, i11, 33);
        }
        if (gVar.o()) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new com.applovin.exoplayer2.i.d.a(), i10, i11, 33);
        }
        int q10 = gVar.q();
        if (q10 == 1) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new AbsoluteSizeSpan((int) gVar.r(), true), i10, i11, 33);
        } else if (q10 == 2) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new RelativeSizeSpan(gVar.r()), i10, i11, 33);
        } else {
            if (q10 != 3) {
                return;
            }
            com.applovin.exoplayer2.i.d.d.a(spannable, new RelativeSizeSpan(gVar.r() / 100.0f), i10, i11, 33);
        }
    }

    private static d a(d dVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            d dVar2 = (d) arrayDeque.pop();
            g a10 = a(dVar2.f, dVar2.c(), map);
            if (a10 != null && a10.k() == 3) {
                return dVar2;
            }
            for (int a11 = dVar2.a() - 1; a11 >= 0; a11--) {
                arrayDeque.push(dVar2.a(a11));
            }
        }
        return null;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    public static String a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }
}
