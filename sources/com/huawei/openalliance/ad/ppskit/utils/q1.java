package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import com.huawei.openalliance.ad.ppskit.annotations.SecretField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q1 {
    public static final byte[] f = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f22960g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f22961h = new byte[0];

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f22962i = new byte[0];

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f22963j = new byte[0];

    /* renamed from: k, reason: collision with root package name */
    public static q1 f22964k;

    /* renamed from: a, reason: collision with root package name */
    public b f22965a;

    /* renamed from: b, reason: collision with root package name */
    public e f22966b;

    /* renamed from: c, reason: collision with root package name */
    public d f22967c;

    /* renamed from: d, reason: collision with root package name */
    public f f22968d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f22969e;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences.Editor f22970s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f22971t;

        public a(SharedPreferences.Editor editor, c cVar) {
            this.f22970s = editor;
            this.f22971t = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String q10 = y0.q(q1.this.f22969e, this.f22971t);
            SharedPreferences.Editor editor = this.f22970s;
            editor.putString("cache_data", q10);
            editor.commit();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends c {

        @OuterVisible
        List<String> aVideoCodec;

        @OuterVisible
        String acceler;

        @OuterVisible
        String agCountryCode;

        @OuterVisible
        String agVersion;

        @OuterVisible
        String arEngineVersion;

        @OuterVisible
        String baro;

        @OuterVisible
        Boolean baseLocationSwitch;

        @OuterVisible
        String battery;

        @OuterVisible
        String charging;

        @OuterVisible
        String countryCode;

        @OuterVisible
        String cpuCoreCnt;

        @OuterVisible
        String cpuModel;

        @OuterVisible
        String cpuSpeed;

        @OuterVisible
        String deviceMark;

        @OuterVisible
        String emuiVersionName;

        @OuterVisible
        String freeSto;

        @OuterVisible
        String gaid;

        @OuterVisible
        Boolean gaidLimit;

        @OuterVisible
        Integer grpIdCode;

        @OuterVisible
        String gyro;

        @OuterVisible
        Boolean hasAccAndRotate;

        @OuterVisible
        String hmsVersion;

        @OuterVisible
        String hosVersionName;

        @OuterVisible
        String hsfVersion;

        @OuterVisible
        String insAppTypes;

        @OuterVisible
        Boolean isDebug;

        @OuterVisible
        Boolean isEmulator;

        @OuterVisible
        String isHonorPhone;

        @OuterVisible
        String isHuaweiPhone;

        @OuterVisible
        Boolean isLimitTracking;

        @OuterVisible
        Boolean isProxy;

        @OuterVisible
        Boolean isTv;

        @OuterVisible
        String magicuiVersionName;

        @OuterVisible
        String magnet;

        @OuterVisible
        String memorySize;

        @OuterVisible
        String oaid;

        @OuterVisible
        String pdtName;

        @OuterVisible
        String routerCountry;

        /* renamed from: s, reason: collision with root package name */
        public String f22973s;

        @OuterVisible
        String storageSize;

        @OuterVisible
        String sysIntegrity;

        @OuterVisible
        String totalMem;

        @OuterVisible
        String totalSto;

        @OuterVisible
        Integer type;

        @OuterVisible
        Boolean usb;

        @OuterVisible
        String useragent;

        @OuterVisible
        String uuid;

        @OuterVisible
        String vendCountry;

        @OuterVisible
        String vendor;

        @OuterVisible
        String wifiName;

        @OuterVisible
        String xrKitAppVersion;

        @OuterVisible
        public b() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.q1.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final b clone() {
            b bVar = new b();
            bVar.useragent = this.useragent;
            bVar.isHuaweiPhone = this.isHuaweiPhone;
            bVar.isHonorPhone = this.isHonorPhone;
            bVar.hsfVersion = this.hsfVersion;
            bVar.emuiVersionName = this.emuiVersionName;
            bVar.magicuiVersionName = this.magicuiVersionName;
            bVar.hosVersionName = this.hosVersionName;
            bVar.hmsVersion = this.hmsVersion;
            bVar.countryCode = this.countryCode;
            bVar.agVersion = this.agVersion;
            bVar.agCountryCode = this.agCountryCode;
            bVar.sysIntegrity = this.sysIntegrity;
            bVar.oaid = this.oaid;
            bVar.isLimitTracking = this.isLimitTracking;
            bVar.deviceMark = this.deviceMark;
            bVar.wifiName = this.wifiName;
            bVar.pdtName = this.pdtName;
            bVar.cpuModel = this.cpuModel;
            bVar.cpuCoreCnt = this.cpuCoreCnt;
            bVar.cpuSpeed = this.cpuSpeed;
            bVar.totalMem = this.totalMem;
            bVar.totalSto = this.totalSto;
            bVar.freeSto = this.freeSto;
            bVar.vendor = this.vendor;
            bVar.vendCountry = this.vendCountry;
            bVar.routerCountry = this.routerCountry;
            bVar.gyro = this.gyro;
            bVar.acceler = this.acceler;
            bVar.magnet = this.magnet;
            bVar.baro = this.baro;
            bVar.battery = this.battery;
            bVar.charging = this.charging;
            bVar.baseLocationSwitch = this.baseLocationSwitch;
            bVar.arEngineVersion = this.arEngineVersion;
            bVar.xrKitAppVersion = this.xrKitAppVersion;
            bVar.f22973s = this.f22973s;
            bVar.isTv = this.isTv;
            bVar.type = this.type;
            bVar.gaid = this.gaid;
            bVar.gaidLimit = this.gaidLimit;
            bVar.hasAccAndRotate = this.hasAccAndRotate;
            bVar.aVideoCodec = this.aVideoCodec;
            bVar.isProxy = this.isProxy;
            bVar.isDebug = this.isDebug;
            bVar.usb = this.usb;
            bVar.isEmulator = this.isEmulator;
            bVar.grpIdCode = this.grpIdCode;
            bVar.insAppTypes = this.insAppTypes;
            bVar.storageSize = this.storageSize;
            bVar.memorySize = this.memorySize;
            return bVar;
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements Cloneable {
        /* renamed from: a */
        public c clone() {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends c {

        @OuterVisible
        String brand;

        @OuterVisible
        String freeSdcard;

        @OuterVisible
        Boolean isChildMode;

        @OuterVisible
        String isHonor6UpPhone;

        @OuterVisible
        String isHuaweiPhoneNew;

        @OuterVisible
        Boolean isWelinkUser;

        @OuterVisible
        String maker;

        @OuterVisible
        String model;

        @OuterVisible
        Integer sdkType;

        @OuterVisible
        String wifiLevel;

        @OuterVisible
        public d() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.q1.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d clone() {
            d dVar = new d();
            dVar.isHuaweiPhoneNew = this.isHuaweiPhoneNew;
            dVar.isHonor6UpPhone = this.isHonor6UpPhone;
            dVar.sdkType = this.sdkType;
            dVar.brand = this.brand;
            dVar.maker = this.maker;
            dVar.model = this.model;
            dVar.wifiLevel = this.wifiLevel;
            dVar.freeSdcard = this.freeSdcard;
            dVar.isWelinkUser = this.isWelinkUser;
            dVar.isChildMode = this.isChildMode;
            return dVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends c {

        @SecretField
        String androidTag;

        @SecretField
        String deviceTag;

        @SecretField
        String groupId;

        @SecretField
        String hiadUTag;

        @OuterVisible
        public e() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.q1.c
        /* renamed from: a */
        public final c clone() {
            e eVar = new e();
            eVar.deviceTag = this.deviceTag;
            eVar.androidTag = this.androidTag;
            eVar.groupId = this.groupId;
            eVar.hiadUTag = this.hiadUTag;
            return eVar;
        }

        public final Object clone() {
            e eVar = new e();
            eVar.deviceTag = this.deviceTag;
            eVar.androidTag = this.androidTag;
            eVar.groupId = this.groupId;
            eVar.hiadUTag = this.hiadUTag;
            return eVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends c {

        @OuterVisible
        String tag;

        @OuterVisible
        public f() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.q1.c
        /* renamed from: a */
        public final c clone() {
            f fVar = new f();
            fVar.tag = this.tag;
            return fVar;
        }
    }

    public q1(Context context) {
        this.f22969e = context.getApplicationContext().createDeviceProtectedStorageContext();
    }

    public static q1 m(Context context) {
        q1 q1Var;
        synchronized (f22962i) {
            if (f22964k == null) {
                f22964k = new q1(context);
            }
            q1Var = f22964k;
        }
        return q1Var;
    }

    public final void A() {
        if (this.f22968d == null) {
            Context context = this.f22969e;
            f fVar = null;
            String string = context.getSharedPreferences("hiad_sp_tag_cache", 4).getString("cache_data", null);
            if (!TextUtils.isEmpty(string)) {
                fVar = (f) y0.o(context, string, f.class, new Class[0]);
            }
            if (fVar == null) {
                fVar = new f();
            }
            this.f22968d = fVar;
        }
    }

    public final void B() {
        if (this.f22965a == null) {
            Context context = this.f22969e;
            b bVar = null;
            String string = context.getSharedPreferences("hiad_sp_properties_cache", 4).getString("cache_data", null);
            if (string != null && string.length() > 0) {
                bVar = (b) y0.o(context, string, b.class, new Class[0]);
            }
            if (bVar == null) {
                bVar = new b();
            }
            this.f22965a = bVar;
        }
    }

    public final void C() {
        if (this.f22966b == null) {
            Context context = this.f22969e;
            e eVar = null;
            String string = context.getSharedPreferences("hiad_sp_sec_properties_cache", 4).getString("cache_data", null);
            if (string != null && string.length() > 0) {
                eVar = (e) y0.o(context, string, e.class, new Class[0]);
            }
            if (eVar == null) {
                eVar = new e();
            }
            this.f22966b = eVar;
        }
    }

    public final void D() {
        if (this.f22967c == null) {
            Context context = this.f22969e;
            d dVar = null;
            String string = context.getSharedPreferences("hiad_sp_nor_properties_cache", 4).getString("cache_data", null);
            if (string != null && string.length() > 0) {
                dVar = (d) y0.o(context, string, d.class, new Class[0]);
            }
            if (dVar == null) {
                dVar = new d();
            }
            this.f22967c = dVar;
        }
    }

    public final void E(int i10) {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            if (bVar == null) {
                return;
            }
            bVar.grpIdCode = Integer.valueOf(i10);
            n(this.f22965a);
        }
    }

    public final void F(List<String> list) {
        synchronized (f22960g) {
            B();
            if (this.f22965a == null) {
                return;
            }
            if (list != null && !list.isEmpty()) {
                this.f22965a.insAppTypes = y1.e(list);
                n(this.f22965a);
            }
        }
    }

    public final String G() {
        String str;
        synchronized (f22960g) {
            B();
            str = this.f22965a.isHuaweiPhone;
        }
        return str;
    }

    public final void H(String str) {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            bVar.emuiVersionName = str;
            n(bVar);
        }
    }

    public final void I(String str) {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            bVar.magicuiVersionName = str;
            n(bVar);
        }
    }

    public final void J(boolean z10) {
        synchronized (f22963j) {
            D();
            d dVar = this.f22967c;
            if (dVar == null) {
                return;
            }
            dVar.isHuaweiPhoneNew = String.valueOf(z10);
            p(this.f22967c);
        }
    }

    public final void K(String str) {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            bVar.hosVersionName = str;
            n(bVar);
        }
    }

    public final void L(boolean z10) {
        synchronized (f22963j) {
            D();
            d dVar = this.f22967c;
            if (dVar == null) {
                return;
            }
            dVar.isHonor6UpPhone = String.valueOf(z10);
            p(this.f22967c);
        }
    }

    public final String M() {
        String str;
        synchronized (f22960g) {
            B();
            str = this.f22965a.emuiVersionName;
        }
        return str;
    }

    public final void N(String str) {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            bVar.deviceMark = str;
            n(bVar);
        }
    }

    public final String O() {
        String str;
        synchronized (f22960g) {
            B();
            str = this.f22965a.magicuiVersionName;
        }
        return str;
    }

    public final void P(String str) {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            bVar.uuid = str;
            n(bVar);
        }
    }

    public final String Q() {
        String str;
        synchronized (f22960g) {
            B();
            str = this.f22965a.hosVersionName;
        }
        return str;
    }

    public final void R(String str) {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            bVar.countryCode = str;
            n(bVar);
        }
    }

    public final Pair<String, Boolean> S() {
        synchronized (f22960g) {
            B();
            if (!TextUtils.isEmpty(this.f22965a.oaid) && this.f22965a.isLimitTracking != null) {
                b bVar = this.f22965a;
                return new Pair<>(bVar.oaid, bVar.isLimitTracking);
            }
            return null;
        }
    }

    public final String T() {
        String str;
        synchronized (f22960g) {
            B();
            str = this.f22965a.deviceMark;
        }
        return str;
    }

    public final String U() {
        String str;
        synchronized (f22960g) {
            B();
            str = this.f22965a.countryCode;
        }
        return str;
    }

    public final String a() {
        String str;
        synchronized (f22960g) {
            B();
            str = this.f22965a.gyro;
        }
        return str;
    }

    public final String b() {
        String str;
        synchronized (f22960g) {
            B();
            str = this.f22965a.magnet;
        }
        return str;
    }

    public final String c() {
        String str;
        synchronized (f22960g) {
            B();
            str = this.f22965a.baro;
        }
        return str;
    }

    public final void d(String str) {
        synchronized (f22961h) {
            C();
            e eVar = this.f22966b;
            if (eVar == null) {
                return;
            }
            eVar.groupId = str;
            o(eVar, this.f22969e.getSharedPreferences("hiad_sp_sec_properties_cache", 4).edit());
        }
    }

    public final Boolean e() {
        synchronized (f22963j) {
            D();
            d dVar = this.f22967c;
            if (dVar == null) {
                return null;
            }
            return dVar.isWelinkUser;
        }
    }

    public final Boolean f() {
        synchronized (f22963j) {
            D();
            d dVar = this.f22967c;
            if (dVar == null) {
                return null;
            }
            return dVar.isChildMode;
        }
    }

    public final String g() {
        synchronized (f22961h) {
            C();
            e eVar = this.f22966b;
            if (eVar == null) {
                return "";
            }
            return eVar.groupId;
        }
    }

    public final List<String> h() {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            if (bVar == null) {
                return null;
            }
            return bVar.aVideoCodec;
        }
    }

    public final Boolean i() {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            if (bVar == null) {
                return null;
            }
            Boolean bool = bVar.isProxy;
            if (bool != null) {
                return bool;
            }
            return bool;
        }
    }

    public final Boolean j() {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            if (bVar == null) {
                return null;
            }
            Boolean bool = bVar.isDebug;
            if (bool != null) {
                return bool;
            }
            return bool;
        }
    }

    public final Boolean k() {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            if (bVar == null) {
                return null;
            }
            Boolean bool = bVar.usb;
            if (bool != null) {
                return bool;
            }
            return bool;
        }
    }

    public final Boolean l() {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            if (bVar == null) {
                return null;
            }
            Boolean bool = bVar.isEmulator;
            if (bool == null) {
                return null;
            }
            return bool;
        }
    }

    public final void n(b bVar) {
        o(bVar, this.f22969e.getSharedPreferences("hiad_sp_properties_cache", 4).edit());
    }

    public final void o(c cVar, SharedPreferences.Editor editor) {
        if (cVar == null) {
            return;
        }
        p2.d(new a(editor, cVar.clone()));
    }

    public final void p(d dVar) {
        o(dVar, this.f22969e.getSharedPreferences("hiad_sp_nor_properties_cache", 4).edit());
    }

    public final void q(String str, Boolean bool) {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            bVar.oaid = str;
            bVar.isLimitTracking = bool;
            n(bVar);
        }
    }

    public final void r(ArrayList arrayList) {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            if (bVar == null) {
                return;
            }
            bVar.aVideoCodec = arrayList;
            n(bVar);
        }
    }

    public final void s(HashMap hashMap) {
        synchronized (f) {
            A();
            f fVar = this.f22968d;
            if (fVar == null) {
                return;
            }
            fVar.tag = y0.q(null, hashMap);
            o(this.f22968d, this.f22969e.getSharedPreferences("hiad_sp_tag_cache", 4).edit());
        }
    }

    public final void t(boolean z10) {
        synchronized (f22960g) {
            B();
            this.f22965a.isHuaweiPhone = String.valueOf(z10);
            n(this.f22965a);
        }
    }

    public final void u() {
        synchronized (f22960g) {
            B();
        }
        synchronized (f22961h) {
            C();
            D();
        }
        synchronized (f) {
            A();
        }
    }

    public final int v() {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            if (bVar == null) {
                return 8;
            }
            Integer num = bVar.grpIdCode;
            if (num == null) {
                return 8;
            }
            return num.intValue();
        }
    }

    public final String w() {
        synchronized (f22963j) {
            D();
            d dVar = this.f22967c;
            if (dVar == null) {
                return null;
            }
            String str = dVar.isHuaweiPhoneNew;
            if (str == null) {
                return null;
            }
            return str;
        }
    }

    public final String x() {
        synchronized (f22963j) {
            D();
            d dVar = this.f22967c;
            if (dVar == null) {
                return null;
            }
            String str = dVar.isHonor6UpPhone;
            if (str == null) {
                return null;
            }
            return str;
        }
    }

    public final String y() {
        synchronized (f22960g) {
            B();
            b bVar = this.f22965a;
            if (bVar == null) {
                return "";
            }
            return bVar.insAppTypes;
        }
    }

    public final Map<String, String> z() {
        synchronized (f) {
            A();
            f fVar = this.f22968d;
            Map<String, String> map = null;
            if (fVar == null) {
                return null;
            }
            Map<String, String> map2 = (Map) y0.o(null, fVar.tag, Map.class, new Class[0]);
            if (!a0.a.e0(map2)) {
                map = map2;
            }
            return map;
        }
    }
}
