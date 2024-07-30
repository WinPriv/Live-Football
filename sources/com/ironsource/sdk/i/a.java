package com.ironsource.sdk.i;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.b;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: com.ironsource.sdk.i.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C0344a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26527a;

        static {
            int[] iArr = new int[d.a.a().length];
            f26527a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26527a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26527a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static boolean a(Activity activity) {
        int i10;
        int parseInt = Integer.parseInt(b.a().f26568a.getString("back_button_state", "2"));
        if (parseInt == 0) {
            i10 = d.a.f26491a;
        } else if (parseInt == 1) {
            i10 = d.a.f26492b;
        } else {
            i10 = d.a.f26493c;
        }
        if (C0344a.f26527a[i10 - 1] != 3) {
            return false;
        }
        try {
            x xVar = (x) com.ironsource.sdk.d.b.a((Context) activity).f26402a.f26120a;
            if (xVar != null) {
                xVar.b(x.b("nativeNavigationPressed", x.a("action", "back", null, null, null, null, null, null, null, false)));
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
