package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final x.d f26101a;

    public d(x.d dVar) {
        this.f26101a = dVar;
    }

    public final synchronized void a(String str, String str2) {
        if (this.f26101a == null) {
            Logger.e("d", "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = x.d.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.f26101a, str2);
        } else {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
    }
}
