package com.anythink.expressad.atsignalcommon.base;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class c implements a {
    @Override // com.anythink.expressad.atsignalcommon.base.a
    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String scheme = Uri.parse(str).getScheme();
            if (!TextUtils.isEmpty(scheme)) {
                scheme.equals("intent");
                return false;
            }
            return false;
        }
        return false;
    }
}
