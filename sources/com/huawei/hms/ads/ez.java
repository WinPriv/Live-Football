package com.huawei.hms.ads;

import android.util.Log;

/* loaded from: classes2.dex */
public final class ez extends ev {
    private ez() {
    }

    public static fc Code() {
        return new ez();
    }

    @Override // com.huawei.hms.ads.fc
    public fc Code(String str, String str2) {
        fc fcVar = this.Code;
        if (fcVar != null) {
            fcVar.Code(str, str2);
        }
        return this;
    }

    @Override // com.huawei.hms.ads.fc
    public void Code(fe feVar, int i10, String str) {
        if (feVar == null) {
            return;
        }
        Code(feVar.V(), i10, str);
        fc fcVar = this.Code;
        if (fcVar != null) {
            fcVar.Code(feVar, i10, str);
        }
    }

    private void Code(String str, int i10, String str2) {
        if (str == null) {
            return;
        }
        if (i10 == 3) {
            Log.d(str2, str);
            return;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                Log.w(str2, str);
                return;
            } else if (i10 == 6) {
                Log.e(str2, str);
                return;
            }
        }
        Log.i(str2, str);
    }
}
