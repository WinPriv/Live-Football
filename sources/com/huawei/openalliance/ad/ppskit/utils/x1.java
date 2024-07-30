package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import com.huawei.android.hms.ppskit.PpsCoreService;
import java.io.File;
import java.util.ArrayList;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f23060a = new ArrayList();

    public static void a(PpsCoreService ppsCoreService) {
        String str;
        Context createDeviceProtectedStorageContext = ppsCoreService.createDeviceProtectedStorageContext();
        ArrayList arrayList = f23060a;
        arrayList.clear();
        arrayList.add(w1.c(createDeviceProtectedStorageContext));
        arrayList.add(w1.f(createDeviceProtectedStorageContext));
        arrayList.add(w1.d(createDeviceProtectedStorageContext));
        if (createDeviceProtectedStorageContext == null) {
            str = "";
        } else {
            try {
                File externalFilesDir = createDeviceProtectedStorageContext.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    str = x.w(externalFilesDir);
                }
            } catch (Exception unused) {
                n7.g("StorageUtils", "getExternalFilesDir exception, use memory card folder.");
            }
            str = null;
        }
        arrayList.add(str);
    }
}
