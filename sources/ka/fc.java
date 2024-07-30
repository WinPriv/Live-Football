package ka;

import android.content.ContentValues;
import android.content.Context;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class fc {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: t, reason: collision with root package name */
        public static final /* synthetic */ a[] f31176t = {new C0424a(), new b(), new c()};

        /* renamed from: s, reason: collision with root package name */
        public final int f31177s;

        /* JADX INFO: Fake field, exist only in values array */
        a EF2;

        /* renamed from: ka.fc$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum C0424a extends a {
            public C0424a() {
                super("INVALID", 0, 0);
            }

            @Override // ka.fc.a
            public final int a(String str, Context context) {
                return 0;
            }
        }

        /* loaded from: classes2.dex */
        public enum b extends a {
            public b() {
                super("REPORT_APP_INSTALL_LIST", 1, 1);
            }

            @Override // ka.fc.a
            public final int a(String str, Context context) {
                ub ubVar;
                synchronized (ub.f31944e) {
                    if (ub.f31943d == null) {
                        ub.f31943d = new ub(context);
                    }
                    ubVar = ub.f31943d;
                }
                ubVar.getClass();
                com.huawei.openalliance.ad.ppskit.utils.p2.a(new sb(ubVar, str), 1);
                return 1;
            }
        }

        /* loaded from: classes2.dex */
        public enum c extends a {
            public c() {
                super("REPORT_APP_INSTALL_APPS", 2, 2);
            }

            @Override // ka.fc.a
            public final int a(String str, Context context) {
                ub ubVar;
                synchronized (ub.f31944e) {
                    if (ub.f31943d == null) {
                        ub.f31943d = new ub(context);
                    }
                    ubVar = ub.f31943d;
                }
                ubVar.getClass();
                com.huawei.openalliance.ad.ppskit.utils.p2.a(new tb(ubVar, str), 1);
                return 1;
            }
        }

        public a() {
            throw null;
        }

        public a(String str, int i10, int i11) {
            this.f31177s = i11;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f31176t.clone();
        }

        public abstract int a(String str, Context context);

        @Override // java.lang.Enum
        public final String toString() {
            return "AppDataCollectionCmd: " + this.f31177s + ", " + super.toString().toLowerCase(Locale.ENGLISH);
        }
    }

    public static void a(Context context, String str, String str2) {
        if ("appInstallList".equals(str2)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("pps_inner_command", (Integer) 1);
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new ec(str, context, contentValues), 2);
        } else if ("insAppsList".equals(str2)) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("pps_inner_command", (Integer) 2);
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new ec(str, context, contentValues2), 2);
        }
    }

    public static void b(String str, Context context, ContentValues contentValues) {
        a aVar;
        try {
            int intValue = contentValues.getAsInteger("pps_inner_command").intValue();
            a[] values = a.values();
            if (intValue >= 0 && intValue < values.length) {
                n7.f("AppDataCollectionProvider", "execute %s", values[intValue].toString());
                aVar = values[intValue];
                aVar.a(str, context);
            }
            aVar = values[0];
            aVar.a(str, context);
        } catch (Throwable th) {
            e0.i.p(th, "update ex: ", "AppDataCollectionProvider");
        }
    }
}
