package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.utils.y1;

@DataKeep
/* loaded from: classes2.dex */
public class BluetoothInfo implements Comparable<BluetoothInfo> {
    private String address;
    private int bondState = 0;
    private String name;

    public final void a(Integer num) {
        this.bondState = num.intValue();
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.name = "";
        }
        this.name = y1.y(str);
    }

    public final String c() {
        return this.address;
    }

    @Override // java.lang.Comparable
    public final int compareTo(BluetoothInfo bluetoothInfo) {
        BluetoothInfo bluetoothInfo2 = bluetoothInfo;
        if (bluetoothInfo2 == null) {
            return -1;
        }
        return bluetoothInfo2.bondState - this.bondState;
    }

    public final void d(String str) {
        this.address = str;
    }
}
