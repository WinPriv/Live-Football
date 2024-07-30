package com.huawei.opendevice.open;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.beans.metadata.OaidRecord;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.handlers.l;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.e0;
import com.huawei.openalliance.ad.ppskit.utils.m;
import com.huawei.openalliance.ad.ppskit.utils.o2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import ib.f;
import ib.g;
import ib.i;
import ib.n;
import ib.q;
import ib.r;
import ib.s;
import java.util.LinkedHashMap;
import java.util.Locale;
import ka.Cif;
import ka.c7;
import ka.d7;
import ka.kj;
import ka.lj;
import ka.n7;
import ka.y6;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class OAIDSettingActivity extends BaseSettingActivity {
    public static final /* synthetic */ int Q = 0;
    public kj C;
    public View K;
    public TextView L;
    public Switch A = null;
    public boolean B = false;
    public TextView D = null;
    public TextView E = null;
    public View F = null;
    public TextView G = null;
    public View H = null;
    public View I = null;
    public View J = null;
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;
    public final a P = new a();

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            n7.b("OAIDSettingActivity", "onclick");
            int id2 = view.getId();
            OAIDSettingActivity oAIDSettingActivity = OAIDSettingActivity.this;
            if (id2 == R.id.opendevice_oaid_reset_rl) {
                int i10 = OAIDSettingActivity.Q;
                String string = oAIDSettingActivity.getString(R.string.opendevice_dlg_title_reset_ad);
                new AlertDialog.Builder(oAIDSettingActivity).setTitle(string).setMessage(oAIDSettingActivity.getString(R.string.opendevice_dlg_msg_ad_reset)).setPositiveButton(oAIDSettingActivity.getString(R.string.opendevice_bt_reset), new f(oAIDSettingActivity)).setNegativeButton(oAIDSettingActivity.getString(R.string.opendevice_bt_cancel), new d()).show().getButton(-1).requestFocus();
                return;
            }
            if (view.getId() == R.id.opendevice_oaid_more_rl) {
                oAIDSettingActivity.startActivity(new Intent(oAIDSettingActivity, (Class<?>) OAIDMoreSettingActivity.class));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ boolean f24208s;

            public a(boolean z10) {
                this.f24208s = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                OAIDSettingActivity oAIDSettingActivity = OAIDSettingActivity.this;
                int i10 = OAIDSettingActivity.Q;
                boolean z10 = this.f24208s;
                oAIDSettingActivity.t(z10);
                OAIDSettingActivity.this.A.setChecked(z10);
                OAIDSettingActivity.this.C.f31400b = true;
            }
        }

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        
            if (r3 != null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        
            if (r3 == null) goto L28;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:14:0x009c). Please report as a decompilation issue!!! */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r11 = this;
                com.huawei.opendevice.open.OAIDSettingActivity r0 = com.huawei.opendevice.open.OAIDSettingActivity.this
                boolean r1 = r0.f24180w
                if (r1 == 0) goto L86
                int r1 = ib.r.f29513a
                java.lang.String r1 = "OaidAccessUtil"
                java.lang.String r2 = "isLimitTrackingForShow "
                boolean r3 = com.huawei.openalliance.ad.ppskit.utils.z1.P(r0)
                if (r3 == 0) goto L1c
                com.huawei.opendevice.open.PpsOaidManager r0 = com.huawei.opendevice.open.PpsOaidManager.getInstance(r0)
                boolean r0 = r0.isLimitTrackingForShow()
                goto L9c
            L1c:
                r3 = 0
                java.lang.String r4 = "/oaid_show_state"
                android.net.Uri r6 = com.huawei.openalliance.ad.ppskit.utils.z1.I(r0, r4)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61 java.lang.IllegalArgumentException -> L74
                boolean r4 = com.huawei.openalliance.ad.ppskit.utils.d0.g(r0, r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61 java.lang.IllegalArgumentException -> L74
                if (r4 != 0) goto L30
                java.lang.String r0 = "provider uri invalid."
                ka.n7.g(r1, r0)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61 java.lang.IllegalArgumentException -> L74
                r0 = 1
                goto L9c
            L30:
                android.content.ContentResolver r5 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61 java.lang.IllegalArgumentException -> L74
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61 java.lang.IllegalArgumentException -> L74
                if (r3 == 0) goto L5c
                boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61 java.lang.IllegalArgumentException -> L74
                if (r0 == 0) goto L5c
                java.lang.String r0 = "limit_track"
                int r0 = r3.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61 java.lang.IllegalArgumentException -> L74
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61 java.lang.IllegalArgumentException -> L74
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61 java.lang.IllegalArgumentException -> L74
                java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61 java.lang.IllegalArgumentException -> L74
                boolean r0 = android.text.TextUtils.equals(r4, r0)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61 java.lang.IllegalArgumentException -> L74
                r3.close()
                goto L9c
            L5c:
                if (r3 == 0) goto L7e
                goto L7b
            L5f:
                r0 = move-exception
                goto L80
            L61:
                r0 = move-exception
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L5f
                java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L5f
                java.lang.String r0 = r2.concat(r0)     // Catch: java.lang.Throwable -> L5f
                ka.n7.g(r1, r0)     // Catch: java.lang.Throwable -> L5f
                if (r3 == 0) goto L7e
                goto L7b
            L74:
                java.lang.String r0 = "isLimitTrackingForShow IllegalArgumentException"
                ka.n7.g(r1, r0)     // Catch: java.lang.Throwable -> L5f
                if (r3 == 0) goto L7e
            L7b:
                r3.close()
            L7e:
                r0 = 0
                goto L9c
            L80:
                if (r3 == 0) goto L85
                r3.close()
            L85:
                throw r0
            L86:
                android.content.Context r1 = r0.getApplicationContext()
                com.huawei.openalliance.ad.ppskit.handlers.l r1 = com.huawei.openalliance.ad.ppskit.handlers.l.d(r1)
                java.lang.String r0 = r0.getPackageName()
                java.lang.String r0 = r1.r(r0)
                java.lang.String r1 = "1"
                boolean r0 = r1.equals(r0)
            L9c:
                com.huawei.opendevice.open.OAIDSettingActivity$b$a r1 = new com.huawei.opendevice.open.OAIDSettingActivity$b$a
                r1.<init>(r0)
                com.huawei.openalliance.ad.ppskit.utils.d2.a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.opendevice.open.OAIDSettingActivity.b.run():void");
        }
    }

    /* loaded from: classes2.dex */
    public class c implements CompoundButton.OnCheckedChangeListener {
        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            int i10;
            OAIDSettingActivity oAIDSettingActivity = OAIDSettingActivity.this;
            int i11 = OAIDSettingActivity.Q;
            oAIDSettingActivity.t(z10);
            if (oAIDSettingActivity.f24180w) {
                boolean d10 = r.d(oAIDSettingActivity);
                n7.e("OAIDSettingActivity", "handleAnonymousIDStatusChange isLimitTracking=" + d10 + ", isChecked=" + z10);
                if (d10 && !z10) {
                    ConfigSpHandler b10 = ConfigSpHandler.b(oAIDSettingActivity.getApplicationContext());
                    synchronized (b10.f22478a) {
                        i10 = b10.s().getInt("kit_oaid_mode", 0);
                    }
                    n7.e("OAIDSettingActivity", "getOaidMode: " + i10);
                    if (1 != i10) {
                        r.a(oAIDSettingActivity, true);
                    }
                }
                String str7 = "";
                try {
                    str7 = r.c(oAIDSettingActivity);
                } catch (s unused) {
                    n7.i("OAIDSettingActivity", "getOaid PpsOpenDeviceException");
                }
                if (!e0.a(oAIDSettingActivity)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("limit_track", Boolean.valueOf(z10));
                    Uri I = z1.I(oAIDSettingActivity, "/oaid_track_limit/switch");
                    if (!d0.g(oAIDSettingActivity, I)) {
                        n7.g("OaidAccessUtil", "provider uri invalid.");
                    } else {
                        oAIDSettingActivity.getContentResolver().update(I, contentValues, null, null);
                    }
                }
                String str8 = "";
                try {
                    str8 = r.c(oAIDSettingActivity);
                } catch (s unused2) {
                    n7.i("OAIDSettingActivity", "getNewOaid PpsOpenDeviceException");
                }
                if (z10) {
                    str3 = "51";
                } else {
                    str3 = "36";
                }
                if (z10) {
                    str4 = OaidRecord.LIMIT_OAID_OPEN_KEY;
                } else {
                    str4 = OaidRecord.LIMIT_OAID_CLOSE_KEY;
                }
                oAIDSettingActivity.s(str3, str4);
                if (z10) {
                    str5 = "limitPersonalizedAdOn";
                } else {
                    str5 = "limitPersonalizedAdOff";
                }
                p2.a(new g(oAIDSettingActivity, str5, str7, str8), 5);
                if (oAIDSettingActivity.v() && r.g(oAIDSettingActivity)) {
                    if (z10) {
                        str6 = "1";
                    } else {
                        str6 = "0";
                    }
                    lj ljVar = lj.f31435b;
                    Context applicationContext = oAIDSettingActivity.getApplicationContext();
                    ljVar.getClass();
                    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                    linkedHashMap.put("oaid", str7);
                    linkedHashMap.put("track_limit", str6);
                    ljVar.a(applicationContext, "HMS_OPEN_DEVICE_CLICK_OAID_TRACK_LIMIT", linkedHashMap);
                    return;
                }
                return;
            }
            n7.f("OAIDSettingActivity", "handleAnonymousIdStatusChange, isChecked: %s", Boolean.valueOf(z10));
            l d11 = l.d(oAIDSettingActivity.getApplicationContext());
            String packageName = oAIDSettingActivity.getPackageName();
            synchronized (d11.f22585a) {
                d11.G(packageName).edit().putBoolean("app_ad_limit_key", z10).commit();
            }
            if (z10) {
                str = "51";
            } else {
                str = "36";
            }
            if (z10) {
                str2 = OaidRecord.LIMIT_OAID_OPEN_KEY;
            } else {
                str2 = OaidRecord.LIMIT_OAID_CLOSE_KEY;
            }
            oAIDSettingActivity.s(str, str2);
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* loaded from: classes2.dex */
    public static class e implements d7<String> {

        /* renamed from: a, reason: collision with root package name */
        public final String f24211a;

        public e(String str) {
            this.f24211a = str;
        }

        @Override // ka.d7
        public final void a(y6 y6Var) {
            if (y6Var.f32210b != -1) {
                n7.e("OAIDSettingActivity", "Oaid setting event= " + this.f24211a);
            }
        }
    }

    private void u() {
        int i10;
        int indexOf;
        SpannableString spannableString;
        int i11;
        ActionBar actionBar = getActionBar();
        boolean y = m.y();
        boolean d10 = Cif.d(this);
        if (m()) {
            o();
        }
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            if (!this.M && d10) {
                if (y) {
                    actionBar.setTitle(R.string.opendevice_hw_ad_service);
                } else {
                    actionBar.setTitle(R.string.opendevice_title_oaid);
                }
            } else {
                actionBar.setTitle(R.string.opendevice_hw_ad_service_new);
            }
        } else if (!this.M && d10) {
            if (y) {
                setTitle(R.string.opendevice_hw_ad_service);
            } else {
                setTitle(R.string.opendevice_title_oaid);
            }
        } else {
            setTitle(R.string.opendevice_hw_ad_service_new);
        }
        ImageView imageView = (ImageView) findViewById(R.id.opendevice_reset_arrow_iv);
        ImageView imageView2 = (ImageView) findViewById(R.id.opendevice_more_setting_arrow_iv);
        if ((y && !m()) || Cif.g(this)) {
            i10 = R.drawable.ic_opendevice_ic_public_arrow_right_emui10;
        } else if (m()) {
            i10 = R.drawable.hiad_opendevice_arrow_hm;
        } else {
            i10 = R.drawable.opendevice_ic_public_arrow_right;
        }
        imageView.setImageResource(i10);
        imageView2.setImageResource(i10);
        this.L = (TextView) findViewById(R.id.opendevice_all_advertisers_tv);
        String string = getString(R.string.opendevice_all_advertisers);
        if (!TextUtils.isEmpty(string)) {
            this.L.setText(string.toUpperCase(Locale.getDefault()));
        }
        this.A = (Switch) findViewById(R.id.opendevice_limit_tracking_switch);
        if ((!this.N || e0.a(this)) && !m.I()) {
            this.A.setTrackDrawable(getResources().getDrawable(R.drawable.hiad_switch_selector));
        }
        kj kjVar = new kj(new c());
        this.C = kjVar;
        this.A.setOnCheckedChangeListener(kjVar);
        if ((!this.N && this.f24180w) || e0.a(this)) {
            this.A.setClickable(false);
        } else {
            this.A.setChecked("1".equals(l.d(getApplicationContext()).r(getPackageName())));
        }
        this.D = (TextView) findViewById(R.id.opendevice_limit_tracking_tv);
        this.E = (TextView) findViewById(R.id.opendevice_limit_tracking_desc_tv);
        View findViewById = findViewById(R.id.opendevice_oaid_reset_rl);
        this.F = findViewById;
        a aVar = this.P;
        findViewById.setOnClickListener(aVar);
        this.G = (TextView) findViewById(R.id.opendevice_oaid_reset_tv);
        this.D.setText(R.string.opendevice_limit_ad_tracking);
        this.G.setText(R.string.opendevice_item_reset_ad);
        View findViewById2 = findViewById(R.id.opendevice_oaid_more_rl);
        this.K = findViewById2;
        findViewById2.setOnClickListener(aVar);
        if (!this.f24180w) {
            this.H = findViewById(R.id.opendevice_item_divider1);
            this.I = findViewById(R.id.opendevice_item_divider2);
            this.J = findViewById(R.id.opendevice_fat_item_divider);
            this.F.setVisibility(8);
            this.K.setVisibility(8);
            this.H.setVisibility(8);
            this.I.setVisibility(8);
            this.J.setVisibility(0);
        }
        int i12 = R.color.emui_accent;
        try {
            if (this.f24180w) {
                if (m()) {
                    i11 = R.color.hiad_emui_accent;
                } else {
                    i11 = R.color.emui_accent;
                }
                int color = getResources().getColor(i11);
                int indexOf2 = getString(R.string.opendevice_item_ad_reset_desc).indexOf("%1$s");
                String string2 = getString(R.string.opendevice_limit_ad_tracking_detail);
                SpannableString spannableString2 = new SpannableString(getString(R.string.opendevice_item_ad_reset_desc, string2));
                if (indexOf2 >= 0) {
                    n nVar = new n(this);
                    nVar.f29506t = AboutOaidActivity.class;
                    spannableString2.setSpan(new TypefaceSpan(w.cU), indexOf2, indexOf2 + string2.length(), 33);
                    spannableString2.setSpan(nVar, indexOf2, string2.length() + indexOf2, 33);
                    spannableString2.setSpan(new ForegroundColorSpan(color), indexOf2, string2.length() + indexOf2, 33);
                }
                this.E.setText(spannableString2);
                this.E.setMovementMethod(new q(color, color));
            } else {
                this.E.setText(getString(R.string.opendevice_item_reset_ad_des_new));
            }
        } catch (Resources.NotFoundException unused) {
            n7.i("OAIDSettingActivity", "getResources NotFoundException");
        }
        TextView textView = (TextView) findViewById(R.id.opendevice_oaid_privacy_tv);
        textView.setVisibility(0);
        try {
            if (m()) {
                i12 = R.color.hiad_emui_accent;
            }
            int color2 = getResources().getColor(i12);
            String string3 = getString(R.string.opendevice_ad_privacy_statement);
            if (Cif.a(this).d()) {
                indexOf = getString(R.string.opendevice_privacy_desc).indexOf("%1$s");
                n7.b("OAIDSettingActivity", "privacy and isChina");
                spannableString = new SpannableString(getString(R.string.opendevice_privacy_desc, string3));
            } else {
                indexOf = getString(R.string.opendevice_privacy_oversea_desc).indexOf("%1$s");
                n7.b("OAIDSettingActivity", "privacy and isOverSea");
                spannableString = new SpannableString(getString(R.string.opendevice_privacy_oversea_desc, string3));
            }
            if (indexOf >= 0) {
                n nVar2 = new n(this);
                nVar2.f29506t = SimplePrivacyActivity.class;
                spannableString.setSpan(new TypefaceSpan(w.cU), indexOf, string3.length() + indexOf, 33);
                spannableString.setSpan(nVar2, indexOf, string3.length() + indexOf, 33);
                spannableString.setSpan(new ForegroundColorSpan(color2), indexOf, string3.length() + indexOf, 33);
            }
            textView.setText(spannableString);
            textView.setMovementMethod(new q(color2, color2));
        } catch (Resources.NotFoundException unused2) {
            n7.i("OAIDSettingActivity", "getResources NotFoundException");
        }
        s("38", OaidRecord.OPEN_OAID_SETTING_KEY);
    }

    @Override // com.huawei.opendevice.open.BaseSettingActivity, com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity
    public final void b() {
        n7.e("OAIDSettingActivity", "initLayout");
        if (m()) {
            setContentView(R.layout.opendevice_oaid_setting_hm);
            n7.f("OAIDSettingActivity", "hosVersionName: %s", this.f22388t.f());
        } else {
            setContentView(R.layout.opendevice_oaid_setting);
        }
        this.f22387s = (ViewGroup) findViewById(R.id.ll_content_root);
    }

    @Override // com.huawei.opendevice.open.BaseSettingActivity
    public final int l() {
        if (!this.M && Cif.d(this)) {
            if (!m.y() && m()) {
                return R.string.opendevice_title_oaid;
            }
            return R.string.opendevice_hw_ad_service;
        }
        return R.string.opendevice_hw_ad_service_new;
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
        this.N = Cif.c(this);
        this.O = Cif.a(this).c();
        n7.f("OAIDSettingActivity", "onCreate, isInHms: %s, isInnerDevice: %s, isChina: %s", Boolean.valueOf(this.f24180w), Boolean.valueOf(this.N), Boolean.valueOf(this.O));
        if (!this.f24180w && this.N && d0.p(this)) {
            d0.k(this, "hwpps://oaid_setting");
            finish();
            return;
        }
        boolean z10 = this.f24180w;
        if (!z10 && !this.O) {
            try {
                Intent intent = new Intent("com.google.android.gms.settings.ADS_PRIVACY");
                intent.addFlags(268435456);
                intent.setPackage("com.google.android.gms");
                intent.setClipData(oa.a.f33785b);
                startActivity(intent);
            } catch (Throwable unused) {
                n7.i("HiAdTools", "open GMS ads setting exception.");
            }
            finish();
            return;
        }
        if (z10) {
            try {
                boolean booleanExtra = getIntent().getBooleanExtra("oaid_setting_from_hms", false);
                this.M = booleanExtra;
                n7.f("OAIDSettingActivity", "getIntent, from hms entrance: %s", Boolean.valueOf(booleanExtra));
            } catch (RuntimeException e10) {
                simpleName = e10.getClass().getSimpleName();
                str = "onCreate ";
                n7.g("OAIDSettingActivity", str.concat(simpleName));
                return;
            } catch (Throwable th) {
                simpleName = th.getClass().getSimpleName();
                str = "onCreate ex: ";
                n7.g("OAIDSettingActivity", str.concat(simpleName));
                return;
            }
        }
        r(this);
        p2.a(new i(this), 5);
        e0.b(this);
        u();
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
        if (e0.a(this)) {
            if (!m.I()) {
                this.A.setTrackDrawable(getResources().getDrawable(R.drawable.hiad_switch_selector));
                this.B = true;
            }
            this.A.setChecked(true);
            this.A.setClickable(false);
            return;
        }
        if (this.N) {
            if (!m.I() && this.B) {
                this.A.setTrackDrawable(getResources().getDrawable(R.drawable.hiad_switch_selector_switchenable_emui));
                this.B = false;
            }
            this.C.f31400b = false;
            this.A.setClickable(true);
        }
        p2.d(new b());
    }

    public final void r(Activity activity) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        try {
            attributes.getClass().getDeclaredField("layoutInDisplayCutoutMode").setInt(attributes, 1);
            activity.getWindow().setAttributes(attributes);
        } catch (Throwable unused) {
            n7.g("OAIDSettingActivity", "setLayoutMode error");
        }
    }

    public final void s(String str, String str2) {
        String packageName;
        if (this.f24178u) {
            n7.e("OAIDSettingActivity", "reportEvent is oobe, return");
            return;
        }
        if (this.f24180w) {
            packageName = o2.h(this);
        } else {
            packageName = getPackageName();
        }
        e eVar = new e(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", str2);
            jSONObject.put(ba.f22049a, str);
            jSONObject.put("sdk_version", "3.4.65.300");
            jSONObject.put("package_name", packageName);
            c7.l(this).k("oaidSettingException", jSONObject.toString(), eVar, String.class);
        } catch (JSONException unused) {
            n7.g("OAIDSettingActivity", "reportAnalysisEvent JSONException");
        }
    }

    public final void t(boolean z10) {
        Drawable trackDrawable;
        int i10;
        Switch r02 = this.A;
        if (r02 == null || !this.f24181x || (trackDrawable = r02.getTrackDrawable()) == null) {
            return;
        }
        if (!z10) {
            if (m()) {
                i10 = R.color.hiad_switch_close_hm;
            } else {
                i10 = R.color.hiad_switch_close;
            }
        } else {
            i10 = R.color.emui_accent;
        }
        trackDrawable.setColorFilter(getColor(i10), PorterDuff.Mode.DST_IN);
    }

    public final boolean v() {
        boolean z10;
        if (this.O && !this.f24178u) {
            z10 = true;
        } else {
            z10 = false;
        }
        n7.e("OAIDSettingActivity", "is show ad info: " + z10);
        return z10;
    }
}
