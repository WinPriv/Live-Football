package com.huawei.hms.framework.network.grs.h.g;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import jb.b;
import jb.c;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final HostnameVerifier f21923a = new kb.a();

    public static HostnameVerifier a() {
        return f21923a;
    }

    public static SSLSocketFactory a(Context context) {
        try {
            return new b(new c(context.getAssets().open(GrsApp.getInstance().getBrand("/") + "grs_sp.bks")));
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }
}
