package ib;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static o f29507b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f29508c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f29509d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final Context f29510a;

    public o(Context context) {
        this.f29510a = context.createDeviceProtectedStorageContext();
    }

    public final String a() {
        String string;
        synchronized (f29509d) {
            string = h().getString("location_confirm_result_key", null);
        }
        return string;
    }

    public final String b() {
        String string;
        synchronized (f29509d) {
            string = h().getString("legal_interest_result_key", null);
        }
        return string;
    }

    public final String c() {
        String string;
        synchronized (f29509d) {
            string = h().getString("switch_confirm_result_key", null);
        }
        return string;
    }

    public final String d() {
        String string;
        synchronized (f29509d) {
            string = h().getString("reset_confirm_result_key", null);
        }
        return string;
    }

    public final String e() {
        String string;
        synchronized (f29509d) {
            string = h().getString("recommendation_switch_confirm_result_key", null);
        }
        return string;
    }

    public final String f() {
        String string;
        synchronized (f29509d) {
            string = h().getString("main_app_track_key", null);
        }
        return string;
    }

    public final String g() {
        String string;
        synchronized (f29509d) {
            string = h().getString("sub_app_track_key", null);
        }
        return string;
    }

    public final SharedPreferences h() {
        return this.f29510a.getSharedPreferences("consent_confirm_sp", 4);
    }
}
