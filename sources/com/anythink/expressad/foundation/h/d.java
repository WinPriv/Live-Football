package com.anythink.expressad.foundation.h;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.webEnvCheck.WebEnvCheckEntry;

/* loaded from: classes.dex */
public class d {
    private static void a() {
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
