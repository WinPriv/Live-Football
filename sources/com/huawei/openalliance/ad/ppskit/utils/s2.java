package com.huawei.openalliance.ad.ppskit.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.BluetoothInfo;
import com.huawei.openalliance.ad.ppskit.utils.t2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ka.n7;
import ka.u;

/* loaded from: classes2.dex */
public final class s2 implements BluetoothProfile.ServiceListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t2.a f23017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f23018b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f23019c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BluetoothAdapter f23020d;

    public s2(u.a aVar, ArrayList arrayList, HashMap hashMap, BluetoothAdapter bluetoothAdapter) {
        this.f23017a = aVar;
        this.f23018b = arrayList;
        this.f23019c = hashMap;
        this.f23020d = bluetoothAdapter;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i10, BluetoothProfile bluetoothProfile) {
        BluetoothInfo bluetoothInfo;
        try {
            n7.e("BluetoothUtils", "onServiceConnected");
            List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
            if (!androidx.transition.n.M(connectedDevices)) {
                for (BluetoothDevice bluetoothDevice : connectedDevices) {
                    if (bluetoothDevice != null) {
                        String address = bluetoothDevice.getAddress();
                        if (!TextUtils.isEmpty(address) && (bluetoothInfo = (BluetoothInfo) this.f23019c.get(address)) != null) {
                            bluetoothInfo.a(1);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            n7.h("BluetoothUtils", "onServiceConnected exception: %s", th.getClass().getSimpleName());
        }
        this.f23020d.closeProfileProxy(i10, bluetoothProfile);
        t2.b(this.f23017a, this.f23018b);
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i10) {
        n7.e("BluetoothUtils", "onServiceDisconnected");
        t2.b(this.f23017a, this.f23018b);
    }
}
