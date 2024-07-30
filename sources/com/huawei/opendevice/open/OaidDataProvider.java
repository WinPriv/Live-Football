package com.huawei.opendevice.open;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.activity.n;
import com.anythink.expressad.d.a.b;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import ib.j;
import ib.k;
import ib.v;
import ib.y;
import java.util.List;
import ka.ae;
import ka.n7;

/* loaded from: classes2.dex */
public class OaidDataProvider extends ContentProvider {

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f24212u = {"oaid", "limit_track", "disable_collection"};

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f24213v = {"dr1", "dr2", "dr3", "dr4"};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f24214w = {"app_track_switch"};

    /* renamed from: s, reason: collision with root package name */
    public final UriMatcher f24215s = new UriMatcher(-1);

    /* renamed from: t, reason: collision with root package name */
    public Context f24216t;

    public static MatrixCursor a(Context context) {
        String string;
        String string2;
        String string3;
        String string4;
        ConfigSpHandler b10 = ConfigSpHandler.b(context);
        MatrixCursor matrixCursor = new MatrixCursor(f24213v, 1);
        Object[] objArr = new Object[4];
        synchronized (b10.f22478a) {
            string = b10.s().getString("dr1", null);
        }
        objArr[0] = string;
        synchronized (b10.f22478a) {
            string2 = b10.s().getString("dr2", null);
        }
        objArr[1] = string2;
        synchronized (b10.f22478a) {
            string3 = b10.s().getString("dr3", null);
        }
        objArr[2] = string3;
        synchronized (b10.f22478a) {
            string4 = b10.s().getString("dr4", null);
        }
        objArr[3] = string4;
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (context != null) {
            this.f24216t = context.getApplicationContext();
        }
    }

    public final MatrixCursor b(String str) {
        boolean z10;
        Pair pair;
        String e10;
        IOaidManager B = n.B(this.f24216t);
        String str2 = "";
        if (B instanceof PpsOaidManager) {
            str2 = B.getOpenAnonymousID(str);
            z10 = B.isLimitTracking(str);
        } else if (B instanceof k) {
            k kVar = (k) B;
            synchronized (kVar.f36805b) {
                try {
                    boolean l10 = kVar.l(str);
                    y yVar = (y) kVar.f36804a;
                    if (l10) {
                        yVar.getClass();
                        e10 = "00000000-0000-0000-0000-000000000000";
                    } else {
                        e10 = yVar.e();
                    }
                    n7.c("ATCOaidManager", "check %s track limit: %s", str, Boolean.valueOf(l10));
                    v.c((Context) kVar.f36806c, (y) kVar.f36804a, kVar.m(), Boolean.FALSE, false, false, false);
                    pair = new Pair(e10, Boolean.valueOf(l10));
                } finally {
                    str2 = (String) pair.first;
                    z10 = ((Boolean) pair.second).booleanValue();
                }
            }
            str2 = (String) pair.first;
            z10 = ((Boolean) pair.second).booleanValue();
        } else {
            z10 = true;
        }
        boolean isDisableOaidCollection = B.isDisableOaidCollection();
        MatrixCursor matrixCursor = new MatrixCursor(f24212u, 1);
        matrixCursor.addRow(new Object[]{str2, Boolean.valueOf(z10), Boolean.valueOf(isDisableOaidCollection)});
        return matrixCursor;
    }

    public String c() {
        return "com.huawei.hwid.pps.oaid";
    }

    public final void d(ContentValues contentValues) {
        if (contentValues != null) {
            String asString = contentValues.getAsString("package_name_list");
            if (!TextUtils.isEmpty(asString)) {
                k.j(this.f24216t).k((List) y0.o(null, asString, List.class, String.class));
            }
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        n7.b("OaidDataProvider", b.az);
        return 0;
    }

    public final MatrixCursor e() {
        String str;
        k j10 = k.j(this.f24216t);
        synchronized (j10.f36805b) {
            try {
                str = j10.m();
            } finally {
                boolean isLimitTracking = j10.isLimitTracking("app_track");
                boolean isDisableOaidCollection = j10.isDisableOaidCollection();
                MatrixCursor matrixCursor = new MatrixCursor(f24212u, 1);
                matrixCursor.addRow(new Object[]{str, Boolean.valueOf(isLimitTracking), Boolean.valueOf(isDisableOaidCollection)});
                return matrixCursor;
            }
        }
        boolean isLimitTracking2 = j10.isLimitTracking("app_track");
        boolean isDisableOaidCollection2 = j10.isDisableOaidCollection();
        MatrixCursor matrixCursor2 = new MatrixCursor(f24212u, 1);
        matrixCursor2.addRow(new Object[]{str, Boolean.valueOf(isLimitTracking2), Boolean.valueOf(isDisableOaidCollection2)});
        return matrixCursor2;
    }

    public final void f(ContentValues contentValues) {
        Boolean asBoolean;
        if (contentValues != null && (asBoolean = contentValues.getAsBoolean("limit_track")) != null) {
            k j10 = k.j(this.f24216t);
            boolean booleanValue = asBoolean.booleanValue();
            synchronized (j10.f36805b) {
                try {
                    j10.f29498e.b(booleanValue);
                    v.c((Context) j10.f36806c, (y) j10.f36804a, j10.m(), Boolean.FALSE, true, false, true);
                } finally {
                }
            }
        }
    }

    public final MatrixCursor g() {
        String b10 = k.j(this.f24216t).b();
        MatrixCursor matrixCursor = new MatrixCursor(f24214w, 1);
        matrixCursor.addRow(new Object[]{b10});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        n7.b("OaidDataProvider", "getType");
        return null;
    }

    public final void h(ContentValues contentValues) {
        if (contentValues != null) {
            String asString = contentValues.getAsString("package_name");
            Boolean asBoolean = contentValues.getAsBoolean("limit_track");
            if (asBoolean != null && !TextUtils.isEmpty(asString)) {
                k j10 = k.j(this.f24216t);
                boolean booleanValue = asBoolean.booleanValue();
                synchronized (j10.f36805b) {
                    try {
                        j10.f29498e.d().edit().putBoolean(asString, booleanValue).apply();
                        v.c((Context) j10.f36806c, (y) j10.f36804a, j10.m(), Boolean.FALSE, true, false, true);
                    } finally {
                    }
                }
            }
        }
    }

    public final int i(ContentValues contentValues) {
        if (contentValues != null && this.f24216t != null) {
            new ae(this.f24216t).c(contentValues.getAsInteger("consent_result_type").intValue(), contentValues.getAsString("consent_result"));
            return 1;
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        n7.b("OaidDataProvider", "insert");
        return null;
    }

    public final MatrixCursor j() {
        PpsOaidManager ppsOaidManager = PpsOaidManager.getInstance(this.f24216t);
        String openAnonymousID = ppsOaidManager.getOpenAnonymousID("");
        boolean isLimitTrackingForShow = ppsOaidManager.isLimitTrackingForShow();
        boolean isDisableOaidCollection = ppsOaidManager.isDisableOaidCollection();
        MatrixCursor matrixCursor = new MatrixCursor(f24212u, 1);
        matrixCursor.addRow(new Object[]{openAnonymousID, Boolean.valueOf(isLimitTrackingForShow), Boolean.valueOf(isDisableOaidCollection)});
        return matrixCursor;
    }

    public final int k(ContentValues contentValues) {
        Boolean asBoolean;
        if (contentValues != null && (asBoolean = contentValues.getAsBoolean("limit_track")) != null) {
            PpsOaidManager ppsOaidManager = PpsOaidManager.getInstance(this.f24216t);
            boolean booleanValue = asBoolean.booleanValue();
            synchronized (ppsOaidManager.f36805b) {
                try {
                    y yVar = (y) ppsOaidManager.f36804a;
                    yVar.d().edit().putBoolean("oaid_track_limit", booleanValue).apply();
                    if (1 != yVar.f() && booleanValue) {
                        yVar.b();
                    }
                    v.b((Context) ppsOaidManager.f36806c, (y) ppsOaidManager.f36804a, Boolean.TRUE, true);
                } finally {
                    return 1;
                }
            }
            return 1;
        }
        return 0;
    }

    public final void l(ContentValues contentValues) {
        if (contentValues != null) {
            if (contentValues.getAsBoolean("limit_track") != null) {
                n.B(this.f24216t).resetAnonymousId(Boolean.valueOf(!r2.booleanValue()));
            } else {
                n.B(this.f24216t).resetAnonymousId(null);
            }
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        String simpleName;
        String str;
        UriMatcher uriMatcher = this.f24215s;
        try {
            uriMatcher.addURI(c(), "/oaid/query", 1);
            uriMatcher.addURI(c(), "/oaid_show_state", 6);
            uriMatcher.addURI(c(), "/oaid/reset", 2);
            uriMatcher.addURI(c(), "/oaid_track_limit/switch", 3);
            uriMatcher.addURI(c(), "/oaid_disable_collection/switch", 4);
            uriMatcher.addURI(c(), "/consent_result/update", 5);
            uriMatcher.addURI(c(), "/oaid_consent_state", 7);
            uriMatcher.addURI(c(), "/site_country_relation", 8);
            uriMatcher.addURI(c(), "/brain_switch_show_state", 9);
            uriMatcher.addURI(c(), "/app_track_switch/query_all", 11);
            uriMatcher.addURI(c(), "/app_track_switch/update", 12);
            uriMatcher.addURI(c(), "/app_track_switch/update_all", 13);
            uriMatcher.addURI(c(), "/app_track_switch/delete", 15);
            uriMatcher.addURI(c(), "/oaid/query_show", 16);
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str = "onCreate ";
            n7.g("OaidDataProvider", str.concat(simpleName));
            return true;
        } catch (Throwable th) {
            simpleName = th.getClass().getSimpleName();
            str = "onCreate ex: ";
            n7.g("OaidDataProvider", str.concat(simpleName));
            return true;
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        StringBuilder sb2;
        if (uri == null) {
            return null;
        }
        try {
            if (this.f24216t == null) {
                this.f24216t = getContext();
            }
        } catch (RuntimeException e10) {
            e = e10;
            sb2 = new StringBuilder("query ");
            sb2.append(e.getClass().getSimpleName());
            sb2.append(" msg: ");
            sb2.append(y1.j(e.getMessage()));
            n7.g("OaidDataProvider", sb2.toString());
            n7.a();
            return null;
        } catch (Throwable th) {
            e = th;
            sb2 = new StringBuilder("query ex: ");
            sb2.append(e.getClass().getSimpleName());
            sb2.append(" msg: ");
            sb2.append(y1.j(e.getMessage()));
            n7.g("OaidDataProvider", sb2.toString());
            n7.a();
            return null;
        }
        if (this.f24216t == null) {
            return null;
        }
        int match = this.f24215s.match(uri);
        n7.e("OaidDataProvider", "query code: " + match);
        if (match == 1) {
            String str3 = "UNKNOWN";
            if (strArr2 != null && strArr2.length > 0) {
                str3 = strArr2[0];
            }
            return b(str3);
        }
        if (match == 6) {
            return j();
        }
        if (match == 8) {
            return a(this.f24216t);
        }
        if (match == 11) {
            return g();
        }
        if (match == 16) {
            return e();
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String simpleName;
        String str2;
        Context context;
        Boolean asBoolean;
        if (uri == null) {
            return 0;
        }
        try {
            if (this.f24216t == null) {
                this.f24216t = getContext();
            }
            context = this.f24216t;
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str2 = "update ";
            n7.g("OaidDataProvider", str2.concat(simpleName));
            return 0;
        } catch (Throwable th) {
            simpleName = th.getClass().getSimpleName();
            str2 = "update ex: ";
            n7.g("OaidDataProvider", str2.concat(simpleName));
            return 0;
        }
        if (context == null) {
            return 0;
        }
        new jc.a(context).c();
        int match = this.f24215s.match(uri);
        n7.e("OaidDataProvider", "update code: " + match);
        if (match == 2) {
            l(contentValues);
            return 1;
        }
        if (match == 3) {
            return k(contentValues);
        }
        if (match == 4) {
            if (contentValues == null || (asBoolean = contentValues.getAsBoolean("disable_collection")) == null) {
                return 0;
            }
            n.B(this.f24216t).disableOaidCollection(asBoolean.booleanValue());
            return 1;
        }
        if (match == 5) {
            return i(contentValues);
        }
        if (match == 7) {
            if (this.f24216t != null) {
                p2.a(new j(this), 1);
            }
            return 1;
        }
        if (match == 12) {
            h(contentValues);
            return 1;
        }
        if (match == 13) {
            f(contentValues);
            return 1;
        }
        if (match == 15) {
            d(contentValues);
            return 1;
        }
        return 0;
    }
}
