package pa;

import a3.l;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.db.bean.EncryptionField;
import com.huawei.openalliance.ad.ppskit.utils.m2;
import com.huawei.openalliance.ad.ppskit.utils.u1;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import e0.i;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ka.n7;
import ma.b;
import ma.c;
import ma.e;
import org.json.JSONException;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class a {
    private static final boolean DEBUG = false;
    public static final String ID = "_id";
    public static final String TAG = "RecordBean";
    private static Map<Class, String> dbTypeMap;

    @e
    private byte[] key;

    static {
        HashMap hashMap = new HashMap(4);
        dbTypeMap = hashMap;
        hashMap.put(String.class, "TEXT");
        dbTypeMap.put(Long.TYPE, "INTEGER");
        dbTypeMap.put(Integer.TYPE, "INTEGER");
        dbTypeMap.put(Float.TYPE, "REAL");
        dbTypeMap.put(EncryptionField.class, "TEXT");
    }

    public static boolean p(Field field) {
        boolean z10;
        if (!q(field)) {
            return true;
        }
        String name = field.getName();
        if (!Modifier.isStatic(field.getModifiers()) && name != null && !name.contains("$") && field.isAnnotationPresent(c.class)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public static boolean q(Field field) {
        if (field != null) {
            String name = field.getName();
            if (!Modifier.isStatic(field.getModifiers()) && name != null && !name.contains("$") && !field.isAnnotationPresent(e.class)) {
                return true;
            }
        }
        return false;
    }

    public static String y(Field field) {
        b bVar = (b) field.getAnnotation(b.class);
        if (bVar != null && !TextUtils.isEmpty(bVar.a())) {
            return bVar.a();
        }
        String name = field.getName();
        if (name.endsWith("_")) {
            return name.substring(0, name.length() - 1);
        }
        return name;
    }

    public String k() {
        return "";
    }

    public ContentValues l(Context context) {
        String q10;
        String q11;
        Field[] P = n.P(getClass());
        ContentValues contentValues = new ContentValues();
        int length = P.length;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Field field = P[i10];
                field.setAccessible(true);
                P[i10] = field;
                if (!p(field)) {
                    Object obj = P[i10].get(this);
                    String y = y(P[i10]);
                    if (obj instanceof String) {
                        q10 = (String) obj;
                    } else if (obj instanceof Integer) {
                        contentValues.put(y, (Integer) obj);
                    } else if (obj instanceof Long) {
                        contentValues.put(y, (Long) obj);
                    } else if (obj instanceof Float) {
                        contentValues.put(y, (Float) obj);
                    } else if (obj instanceof EncryptionField) {
                        EncryptionField encryptionField = (EncryptionField) obj;
                        if (this.key == null) {
                            this.key = u1.h(context);
                        }
                        byte[] bArr = this.key;
                        Object b10 = encryptionField.b(bArr);
                        if (b10 instanceof String) {
                            q11 = (String) b10;
                        } else {
                            q11 = y0.q(null, b10);
                        }
                        String a10 = m2.a(q11, bArr);
                        encryptionField.f22474v = a10;
                        contentValues.put(y, a10);
                    } else {
                        q10 = y0.q(null, obj);
                    }
                    contentValues.put(y, q10);
                }
            } catch (IllegalAccessException unused) {
                n7.g(TAG, "toRecord IllegalAccessException");
            }
        }
        return contentValues;
    }

    public final void m(Cursor cursor) {
        Field field;
        Object valueOf;
        Field[] P = n.P(getClass());
        int length = P.length;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Field field2 = P[i10];
                field2.setAccessible(true);
                P[i10] = field2;
                String name = field2.getName();
                if (!Modifier.isStatic(P[i10].getModifiers()) && ID.equals(name)) {
                    int columnIndex = cursor.getColumnIndex(name);
                    if (columnIndex != -1) {
                        P[i10].set(this, cursor.getString(columnIndex));
                    }
                } else if (q(P[i10])) {
                    Class<?> type = P[i10].getType();
                    int columnIndex2 = cursor.getColumnIndex(y(P[i10]));
                    if (columnIndex2 != -1) {
                        if (String.class == type) {
                            field = P[i10];
                            valueOf = cursor.getString(columnIndex2);
                        } else if (Integer.TYPE == type) {
                            field = P[i10];
                            valueOf = Integer.valueOf(cursor.getInt(columnIndex2));
                        } else if (Long.TYPE == type) {
                            field = P[i10];
                            valueOf = Long.valueOf(cursor.getLong(columnIndex2));
                        } else if (Float.TYPE == type) {
                            field = P[i10];
                            valueOf = Float.valueOf(cursor.getFloat(columnIndex2));
                        } else if (EncryptionField.class == type) {
                            n(cursor.getString(columnIndex2), P[i10]);
                        } else {
                            String string = cursor.getString(columnIndex2);
                            Field field3 = P[i10];
                            try {
                                field3.set(this, y0.b(null, string, type, n.n(field3)));
                            } catch (JSONException unused) {
                            } catch (Exception unused2) {
                                n7.g(TAG, "toBean - other field injection Exception");
                            }
                        }
                        field.set(this, valueOf);
                    }
                }
            } catch (Throwable th) {
                i.p(th, "toBean ", TAG);
            }
        }
    }

    public final void n(String str, Field field) {
        Class cls;
        Type genericType = field.getGenericType();
        Class cls2 = null;
        if (genericType instanceof ParameterizedType) {
            Type x10 = n.x((ParameterizedType) genericType);
            Class p10 = n.p(x10);
            if (x10 instanceof ParameterizedType) {
                cls2 = n.p(n.x((ParameterizedType) x10));
            }
            cls = cls2;
            cls2 = p10;
        } else {
            cls = null;
        }
        if (cls2 != null) {
            EncryptionField encryptionField = new EncryptionField(cls2, cls);
            encryptionField.f22474v = str;
            field.set(this, encryptionField);
        } else {
            n7.g(TAG, "Cannot find member class from " + field);
        }
    }

    public final void o(byte[] bArr) {
        if (bArr == null) {
            this.key = null;
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.key = bArr2;
    }

    public final byte[] r() {
        return this.key;
    }

    public final ArrayList u() {
        Field[] P = n.P(getClass());
        ArrayList arrayList = new ArrayList();
        int length = P.length;
        for (int i10 = 0; i10 < length; i10++) {
            Field field = P[i10];
            field.setAccessible(true);
            P[i10] = field;
            if (!p(field)) {
                arrayList.add(y(P[i10]));
            }
        }
        return arrayList;
    }

    public final String v() {
        String x10 = x();
        Field[] P = n.P(getClass());
        StringBuilder s10 = l.s("create table ", x10, " ( _id INTEGER primary key autoincrement ");
        int length = P.length;
        for (int i10 = 0; i10 < length; i10++) {
            Field field = P[i10];
            field.setAccessible(true);
            P[i10] = field;
            if (!p(field)) {
                String str = dbTypeMap.get(P[i10].getType());
                if (str == null) {
                    str = "TEXT";
                }
                String y = y(P[i10]);
                s10.append(" , ");
                s10.append(y);
                s10.append(' ');
                s10.append(str);
                if (k() != null && k().equals(y)) {
                    s10.append(" unique");
                }
            }
        }
        s10.append(" ) ");
        return s10.toString();
    }

    public final String x() {
        return getClass().getSimpleName();
    }
}
