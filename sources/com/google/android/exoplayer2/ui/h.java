package com.google.android.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import r5.a;

/* compiled from: SubtitleViewUtils.java */
/* loaded from: classes2.dex */
public final class h {
    public static void a(a.C0471a c0471a) {
        boolean z10;
        c0471a.f34910k = -3.4028235E38f;
        c0471a.f34909j = Integer.MIN_VALUE;
        CharSequence charSequence = c0471a.f34901a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c0471a.f34901a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c0471a.f34901a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if (!(obj instanceof AbsoluteSizeSpan) && !(obj instanceof RelativeSizeSpan)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float b(int i10, float f, int i11, int i12) {
        float f10;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f10 = i11;
        } else {
            f10 = i12;
        }
        return f * f10;
    }
}
