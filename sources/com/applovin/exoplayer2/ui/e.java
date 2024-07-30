package com.applovin.exoplayer2.ui;

import android.graphics.Color;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e {
    public static String a(String str) {
        return e0.i.g(".", str, ",.", str, " *");
    }

    public static String a(int i10) {
        return ai.a("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }
}
