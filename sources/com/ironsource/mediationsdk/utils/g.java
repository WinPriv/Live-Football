package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f25914d = new g();

    /* renamed from: a, reason: collision with root package name */
    public String f25915a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f25916b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f25917c = "";

    public static g a() {
        return f25914d;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f25915a)) {
            this.f25915a = "C38FB23A402222A0C17D34A92F971D1F";
        }
        return this.f25915a;
    }

    public final synchronized String c() {
        if (TextUtils.isEmpty(this.f25916b)) {
            StringBuilder sb2 = new StringBuilder();
            Random random = new Random();
            for (int i10 = 0; i10 < 32; i10++) {
                sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".charAt(random.nextInt(93)));
            }
            this.f25916b = sb2.toString();
        }
        return this.f25916b;
    }

    public final String d() {
        if (TextUtils.isEmpty(this.f25917c)) {
            try {
                this.f25917c = a.AnonymousClass1.a(c(), "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB");
            } catch (Exception e10) {
                String str = "Session key encryption exception: " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f25917c;
    }
}
