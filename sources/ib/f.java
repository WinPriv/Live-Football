package ib;

import android.content.Context;
import android.content.DialogInterface;
import com.huawei.openalliance.ad.ppskit.beans.metadata.OaidRecord;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.opendevice.open.OAIDSettingActivity;
import java.util.LinkedHashMap;
import ka.lj;
import ka.n7;

/* loaded from: classes2.dex */
public final class f implements DialogInterface.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ OAIDSettingActivity f29482s;

    public f(OAIDSettingActivity oAIDSettingActivity) {
        this.f29482s = oAIDSettingActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        String str2;
        dialogInterface.dismiss();
        int i11 = OAIDSettingActivity.Q;
        OAIDSettingActivity oAIDSettingActivity = this.f29482s;
        oAIDSettingActivity.getClass();
        try {
            str = r.c(oAIDSettingActivity);
        } catch (s unused) {
            n7.i("OAIDSettingActivity", "oldOaid handleAnonymousIDStatusChange PpsOpenDeviceException");
            str = "";
        }
        r.a(oAIDSettingActivity, r.d(oAIDSettingActivity));
        try {
            str2 = r.c(oAIDSettingActivity);
        } catch (s unused2) {
            n7.i("OAIDSettingActivity", "newOAID handleAnonymousIDStatusChange PpsOpenDeviceException");
            str2 = "";
        }
        p2.a(new h(oAIDSettingActivity, str, str2), 5);
        oAIDSettingActivity.s("37", OaidRecord.RESET_OAID_KEY);
        if (oAIDSettingActivity.v() && r.g(oAIDSettingActivity)) {
            lj ljVar = lj.f31435b;
            Context applicationContext = oAIDSettingActivity.getApplicationContext();
            ljVar.getClass();
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("old", str);
            linkedHashMap.put("new", "");
            ljVar.a(applicationContext, "HMS_OPEN_DEVICE_CLICK_OAID_RESET", linkedHashMap);
        }
    }
}
