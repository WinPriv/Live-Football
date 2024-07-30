package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.huawei.hms.ads.gl;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static p f18759a;

    /* renamed from: b, reason: collision with root package name */
    private static SharedPreferences f18760b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f18761c;

    public e(p pVar) {
        this.f18761c = p.y().getSharedPreferences("com.applovin.sdk.preferences." + pVar.B(), 0);
        if (!pVar.e()) {
            f18759a = pVar;
        }
    }

    public <T> void a(d<T> dVar, T t10) {
        a((d<d<T>>) dVar, (d<T>) t10, this.f18761c);
    }

    public <T> T b(d<T> dVar, T t10) {
        return (T) b((d<d<T>>) dVar, (d<T>) t10, this.f18761c);
    }

    public <T> void a(String str, T t10, SharedPreferences.Editor editor) {
        a(str, t10, (SharedPreferences) null, editor);
    }

    public <T> T b(d<T> dVar, T t10, SharedPreferences sharedPreferences) {
        return (T) a(dVar.a(), t10, dVar.b(), sharedPreferences);
    }

    public static <T> T b(d<T> dVar, T t10, Context context) {
        return (T) a(dVar.a(), t10, dVar.b(), a(context));
    }

    public <T> void a(d<T> dVar, T t10, SharedPreferences sharedPreferences) {
        a(dVar.a(), (String) t10, sharedPreferences);
    }

    public <T> void a(String str, T t10, SharedPreferences sharedPreferences) {
        a(str, t10, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public static <T> void a(d<T> dVar, T t10, Context context) {
        a(dVar.a(), t10, a(context), (SharedPreferences.Editor) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(String str, T t10, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z10 = true;
        boolean z11 = editor != null;
        if (!z11) {
            editor = sharedPreferences.edit();
        }
        if (t10 != 0) {
            if (t10 instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) t10).booleanValue());
            } else if (t10 instanceof Float) {
                editor.putFloat(str, ((Float) t10).floatValue());
            } else if (t10 instanceof Integer) {
                editor.putInt(str, ((Integer) t10).intValue());
            } else if (t10 instanceof Long) {
                editor.putLong(str, ((Long) t10).longValue());
            } else if (t10 instanceof Double) {
                editor.putLong(str, Double.doubleToRawLongBits(((Double) t10).doubleValue()));
            } else if (t10 instanceof String) {
                editor.putString(str, (String) t10);
            } else if (t10 instanceof Set) {
                editor.putStringSet(str, (Set) t10);
            } else {
                y.i("SharedPreferencesManager", "Unable to put default value of invalid type: " + t10);
                z10 = false;
            }
        } else {
            editor.remove(str);
        }
        if (!z10 || z11) {
            return;
        }
        a(editor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(String str, T t10, Class cls, SharedPreferences sharedPreferences) {
        Object stringSet;
        long longValue;
        int intValue;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!sharedPreferences.contains(str)) {
                return t10;
            }
            if (Boolean.class.equals(cls)) {
                if (t10 != 0) {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) t10).booleanValue()));
                } else {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                }
            } else if (Float.class.equals(cls)) {
                if (t10 != 0) {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, ((Float) t10).floatValue()));
                } else {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, gl.Code));
                }
            } else if (Integer.class.equals(cls)) {
                if (t10 != 0) {
                    if (t10.getClass().equals(Long.class)) {
                        intValue = ((Long) t10).intValue();
                    } else {
                        intValue = ((Integer) t10).intValue();
                    }
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, intValue));
                } else {
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, 0));
                }
            } else if (Long.class.equals(cls)) {
                if (t10 != 0) {
                    if (t10.getClass().equals(Integer.class)) {
                        longValue = ((Integer) t10).longValue();
                    } else {
                        longValue = ((Long) t10).longValue();
                    }
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, longValue));
                } else {
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, 0L));
                }
            } else if (Double.class.equals(cls)) {
                if (t10 != 0) {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) t10).doubleValue()))));
                } else {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
                }
            } else if (String.class.equals(cls)) {
                stringSet = sharedPreferences.getString(str, (String) t10);
            } else {
                stringSet = Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) t10) : t10;
            }
            return stringSet != null ? (T) cls.cast(stringSet) : t10;
        } catch (Throwable th) {
            try {
                p pVar = f18759a;
                if (pVar != null) {
                    pVar.L();
                    if (y.a()) {
                        f18759a.L().b("SharedPreferencesManager", "Error getting value for key: " + str, th);
                    }
                }
                return t10;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
    }

    public <T> void a(d<T> dVar) {
        a(this.f18761c.edit().remove(dVar.a()));
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    private static void a(final SharedPreferences.Editor editor) {
        try {
            p pVar = f18759a;
            if (pVar != null && ((Boolean) pVar.a(b.fv)).booleanValue()) {
                if (Utils.isMainThread()) {
                    if (f18759a.M() != null) {
                        f18759a.M().a(new z(f18759a, new Runnable() { // from class: com.applovin.impl.sdk.c.e.1
                            @Override // java.lang.Runnable
                            public void run() {
                                editor.commit();
                            }
                        }), o.a.BACKGROUND);
                    } else {
                        editor.apply();
                    }
                } else {
                    editor.commit();
                }
            } else {
                editor.apply();
            }
        } catch (Throwable th) {
            y.c("SharedPreferencesManager", "Unable to apply changes", th);
        }
    }

    private static SharedPreferences a(Context context) {
        if (f18760b == null) {
            f18760b = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f18760b;
    }
}
