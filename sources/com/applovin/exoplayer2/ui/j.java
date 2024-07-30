package com.applovin.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.exoplayer2.i.a;

/* loaded from: classes.dex */
final class j {
    public static float a(int i10, float f, int i11, int i12) {
        float f10;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f10 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f10 = i11;
        }
        return f * f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof com.applovin.exoplayer2.i.d.b);
    }

    public static void a(a.C0175a c0175a) {
        c0175a.d();
        if (c0175a.a() instanceof Spanned) {
            if (!(c0175a.a() instanceof Spannable)) {
                c0175a.a(SpannableString.valueOf(c0175a.a()));
            }
            a((Spannable) com.applovin.exoplayer2.l.a.b(c0175a.a()), new Predicate() { // from class: com.applovin.exoplayer2.ui.p
                @Override // com.applovin.exoplayer2.common.base.Predicate
                public final boolean apply(Object obj) {
                    boolean b10;
                    b10 = j.b(obj);
                    return b10;
                }
            });
        }
        b(c0175a);
    }

    public static void b(a.C0175a c0175a) {
        c0175a.b(-3.4028235E38f, Integer.MIN_VALUE);
        if (c0175a.a() instanceof Spanned) {
            if (!(c0175a.a() instanceof Spannable)) {
                c0175a.a(SpannableString.valueOf(c0175a.a()));
            }
            a((Spannable) com.applovin.exoplayer2.l.a.b(c0175a.a()), new Predicate() { // from class: com.applovin.exoplayer2.ui.q
                @Override // com.applovin.exoplayer2.common.base.Predicate
                public final boolean apply(Object obj) {
                    boolean a10;
                    a10 = j.a(obj);
                    return a10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    private static void a(Spannable spannable, Predicate<Object> predicate) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }
}
