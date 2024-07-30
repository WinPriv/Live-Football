package com.huawei.opendevice.open;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.o2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import ib.e;
import ib.r;
import ib.s;
import ka.Cif;
import ka.c7;
import ka.d7;
import ka.kj;
import ka.n7;
import ka.y6;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class OAIDMoreSettingActivity extends BaseSettingActivity {
    public static final /* synthetic */ int H = 0;
    public kj B;
    public TextView D;
    public TextView E;
    public View F;
    public Switch A = null;
    public TextView C = null;
    public final a G = new a();

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view.getId() == R.id.opendevice_view_ad_ll) {
                OAIDMoreSettingActivity oAIDMoreSettingActivity = OAIDMoreSettingActivity.this;
                oAIDMoreSettingActivity.startActivity(new Intent(oAIDMoreSettingActivity, (Class<?>) PpsAdActivity.class));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ boolean f24202s;

            public a(boolean z10) {
                this.f24202s = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                OAIDMoreSettingActivity.this.A.setChecked(this.f24202s);
                OAIDMoreSettingActivity.this.B.f31400b = true;
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d2.a(new a(r.e(OAIDMoreSettingActivity.this)));
        }
    }

    /* loaded from: classes2.dex */
    public class c implements CompoundButton.OnCheckedChangeListener {
        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            String str;
            n7.e("OAIDMoreSettingActivity", "onCheckedChanged: " + z10);
            int i10 = r.f29513a;
            OAIDMoreSettingActivity oAIDMoreSettingActivity = OAIDMoreSettingActivity.this;
            if (oAIDMoreSettingActivity == null) {
                str = "disableOaidCollection context is null";
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("disable_collection", Boolean.valueOf(z10));
                Uri I = z1.I(oAIDMoreSettingActivity, "/oaid_disable_collection/switch");
                if (!d0.g(oAIDMoreSettingActivity, I)) {
                    str = "provider uri invalid.";
                } else {
                    oAIDMoreSettingActivity.getContentResolver().update(I, contentValues, null, null);
                    int i11 = OAIDMoreSettingActivity.H;
                    oAIDMoreSettingActivity.s(oAIDMoreSettingActivity, "53", z10);
                }
            }
            n7.g("OaidAccessUtil", str);
            int i112 = OAIDMoreSettingActivity.H;
            oAIDMoreSettingActivity.s(oAIDMoreSettingActivity, "53", z10);
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements d7<String> {

        /* renamed from: a, reason: collision with root package name */
        public final String f24205a;

        public d(String str) {
            this.f24205a = str;
        }

        @Override // ka.d7
        public final void a(y6 y6Var) {
            if (y6Var.f32210b != -1) {
                n7.e("OAIDMoreSettingActivity", "oaidMoreSettingException-event: " + this.f24205a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01c3, code lost:
    
        if (r0 > r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f7, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01f4, code lost:
    
        if (r0 > r5) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t() {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.opendevice.open.OAIDMoreSettingActivity.t():void");
    }

    @Override // com.huawei.opendevice.open.BaseSettingActivity, com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void b() {
        if (m()) {
            setContentView(R.layout.opendevice_oaid_setting_more_hm);
            n7.f("OAIDMoreSettingActivity", "hosVersionName: %s", this.f22388t.f());
        } else {
            setContentView(R.layout.opendevice_oaid_setting_more);
        }
        this.f22387s = (ViewGroup) findViewById(R.id.ll_content_root);
    }

    @Override // com.huawei.opendevice.open.BaseSettingActivity
    public final int l() {
        return R.string.opendevice_item_more_settings;
    }

    @Override // com.huawei.opendevice.open.BaseSettingActivity
    public final boolean m() {
        boolean z10;
        if (!p() || !this.f24180w) {
            return false;
        }
        if (!this.f22388t.g() && !Cif.b() && !Cif.g(this)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // com.huawei.opendevice.open.BaseSettingActivity, com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String simpleName;
        String str;
        i();
        super.onCreate(bundle);
        try {
            Cif.c(this);
            r(this);
            t();
            p2.a(new e(this), 5);
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str = "onCreate ";
            n7.g("OAIDMoreSettingActivity", str.concat(simpleName));
        } catch (Throwable th) {
            simpleName = th.getClass().getSimpleName();
            str = "onCreate ex: ";
            n7.g("OAIDMoreSettingActivity", str.concat(simpleName));
        }
    }

    @Override // com.huawei.opendevice.open.BaseSettingActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            super.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.huawei.opendevice.open.BaseSettingActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        kj kjVar = this.B;
        if (kjVar != null) {
            kjVar.f31400b = false;
            p2.a(new b(), 0);
        }
        try {
            this.E.setText(r.c(this));
        } catch (s unused) {
            n7.i("OAIDMoreSettingActivity", "getOaid PpsOpenDeviceException");
        }
    }

    public final void r(Activity activity) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        try {
            attributes.getClass().getDeclaredField("layoutInDisplayCutoutMode").setInt(attributes, 1);
            activity.getWindow().setAttributes(attributes);
        } catch (Throwable unused) {
            n7.g("OAIDMoreSettingActivity", "setLayoutMode error");
        }
    }

    public final void s(Context context, String str, boolean z10) {
        if (this.f24178u) {
            n7.e("OAIDMoreSettingActivity", "reportEvent is oobe, return");
            return;
        }
        String bool = Boolean.toString(z10);
        String h10 = o2.h(context);
        d dVar = new d(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", bool);
            jSONObject.put(ba.f22049a, str);
            jSONObject.put("sdk_version", "3.4.65.300");
            jSONObject.put("package_name", h10);
            c7.l(this).k("oaidMoreSettingException", jSONObject.toString(), dVar, String.class);
        } catch (JSONException unused) {
            n7.g("OAIDMoreSettingActivity", "reportAnalysisEvent JSONException");
        }
    }
}
