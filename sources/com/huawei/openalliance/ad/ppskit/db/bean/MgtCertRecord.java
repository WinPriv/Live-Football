package com.huawei.openalliance.ad.ppskit.db.bean;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.Arrays;
import java.util.List;
import pa.a;

@DataKeep
/* loaded from: classes2.dex */
public class MgtCertRecord extends a {
    public static final String APP_PACKAGE_NAME = "appPkgName";
    public static final String CERT_SIGN = "certSign";
    private String appPkgName;
    private List<String> certSign;

    public MgtCertRecord() {
    }

    public MgtCertRecord(String str, List<String> list) {
        this.appPkgName = str;
        this.certSign = list;
    }

    public final List<String> A() {
        return this.certSign;
    }

    public final String a() {
        return this.appPkgName;
    }

    public final String toString() {
        return "MgtCertRecord{appPkgName='" + this.appPkgName + "', certSign='" + Arrays.toString(this.certSign.toArray()) + "'}";
    }
}
