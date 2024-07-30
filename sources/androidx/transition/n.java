package androidx.transition;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.bi;
import com.huawei.openalliance.ad.download.app.PPSAppDownloadManager;
import com.huawei.openalliance.ad.ppskit.activity.SafeIntent;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Ad30;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Content;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Precontent;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.d1;
import com.huawei.openalliance.ad.ppskit.utils.g1;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.io.Closeable;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ka.bf;
import ka.c7;
import ka.n7;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TransitionPropagation.java */
/* loaded from: classes.dex */
public abstract class n implements g1 {
    public static void A(Context context) {
        p2.a(new d1(context, 4), 2);
    }

    public static void B(Context context, String str, String str2, Intent intent) {
        String v3 = v(str, str2, intent);
        if (!TextUtils.isEmpty(v3)) {
            c7.l(context).k(com.huawei.openalliance.ad.constant.s.f22112g, v3, null, null);
        }
    }

    public static void C(Context context, xa.a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(ba.f22070t, bi.B);
            jSONObject.putOpt(ba.f22072v, com.huawei.openalliance.ad.constant.w.aE);
            c7.l(context).k(com.huawei.openalliance.ad.constant.s.f, jSONObject.toString(), new xa.b(aVar), String.class);
        } catch (JSONException e10) {
            n7.g("UiMessageNotifyManager", "registerNotify ".concat(e10.getClass().getSimpleName()));
        }
    }

    public static void D(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.w("StreamUtil", "close Throwable:".concat(th.getClass().getSimpleName()));
            }
        }
    }

    public static void E(Object obj, String str, int i10) {
        String simpleName;
        String str2;
        try {
            Method method = obj.getClass().getMethod(str, Integer.TYPE);
            method.setAccessible(true);
            method.invoke(obj, Integer.valueOf(i10));
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str2 = "setIntValue RuntimeException:";
            n7.g("ReflectAPI", str2.concat(simpleName));
        } catch (Exception e11) {
            simpleName = e11.getClass().getSimpleName();
            str2 = "setIntValue Exception:";
            n7.g("ReflectAPI", str2.concat(simpleName));
        }
    }

    public static void F(Object obj, String str, long j10) {
        String simpleName;
        String str2;
        try {
            Method method = obj.getClass().getMethod(str, Long.TYPE);
            method.setAccessible(true);
            method.invoke(obj, Long.valueOf(j10));
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str2 = "setLongValue RuntimeException:";
            n7.g("ReflectAPI", str2.concat(simpleName));
        } catch (Exception e11) {
            simpleName = e11.getClass().getSimpleName();
            str2 = "setLongValue Exception:";
            n7.g("ReflectAPI", str2.concat(simpleName));
        }
    }

    public static void G(Object obj, String str, String str2) {
        String simpleName;
        String str3;
        try {
            Method method = obj.getClass().getMethod(str, String.class);
            method.setAccessible(true);
            method.invoke(obj, str2);
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str3 = "setStringValue RuntimeException:";
            n7.g("ReflectAPI", str3.concat(simpleName));
        } catch (Exception e11) {
            simpleName = e11.getClass().getSimpleName();
            str3 = "setStringValue Exception:";
            n7.g("ReflectAPI", str3.concat(simpleName));
        }
    }

    public static void H(Object obj, String str, String str2, String str3) {
        String simpleName;
        String str4;
        try {
            if ("boolean".equals(str2)) {
                I(obj, Boolean.parseBoolean(str3), str);
            } else if ("int".equals(str2)) {
                E(obj, str, Integer.parseInt(str3));
            } else if ("long".equals(str2)) {
                F(obj, str, Long.parseLong(str3, 10));
            } else if ("String".equals(str2)) {
                G(obj, str, new String(Base64.decode(str3.getBytes("UTF-8"), 0), "UTF-8"));
            }
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str4 = "setBooleanValue RuntimeException:";
            n7.g("ReflectAPI", str4.concat(simpleName));
        } catch (Exception e11) {
            simpleName = e11.getClass().getSimpleName();
            str4 = "setBooleanValue Exception:";
            n7.g("ReflectAPI", str4.concat(simpleName));
        }
    }

    public static void I(Object obj, boolean z10, String str) {
        String simpleName;
        String str2;
        try {
            Method method = obj.getClass().getMethod(str, Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(obj, Boolean.valueOf(z10));
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str2 = "setBooleanValue RuntimeException:";
            n7.g("ReflectAPI", str2.concat(simpleName));
        } catch (Exception e11) {
            simpleName = e11.getClass().getSimpleName();
            str2 = "setBooleanValue Exception:";
            n7.g("ReflectAPI", str2.concat(simpleName));
        }
    }

    public static void J(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                Log.w("StreamUtil", "close HttpURLConnection Exception:".concat(th.getClass().getSimpleName()));
            }
        }
    }

    public static boolean K() {
        if (!W("com.tencent.mm.opensdk.openapi.IWXAPI") && !U("com.tencent.mm.opensdk.openapi.IWXAPI")) {
            return false;
        }
        return true;
    }

    public static boolean L(String str, String str2, Class[] clsArr) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                Class.forName(str).getDeclaredMethod(str2, clsArr);
                return true;
            } catch (ClassNotFoundException unused) {
                n7.h("ReflectAPI", "class not found for %s", str);
            } catch (NoSuchMethodException unused2) {
                n7.h("ReflectAPI", "method not found for %s", str2);
            } catch (Throwable th) {
                n7.h("ReflectAPI", "isMethodAvailable %s", th.getClass().getSimpleName());
            }
        }
        return false;
    }

    public static boolean M(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean N(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            return false;
        }
        return true;
    }

    public static byte[] O(String str) {
        byte[] bArr = new byte[0];
        try {
            return V(str);
        } catch (NumberFormatException e10) {
            n7.i("HexUtil", "hex string 2 byte: ".concat(e10.getClass().getSimpleName()));
            return bArr;
        }
    }

    public static Field[] P(Class cls) {
        Field[] fieldArr;
        if (cls.getSuperclass() != null) {
            fieldArr = P(cls.getSuperclass());
        } else {
            fieldArr = null;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        if (fieldArr != null && fieldArr.length > 0) {
            Field[] fieldArr2 = new Field[declaredFields.length + fieldArr.length];
            System.arraycopy(fieldArr, 0, fieldArr2, 0, fieldArr.length);
            System.arraycopy(declaredFields, 0, fieldArr2, fieldArr.length, declaredFields.length);
            return fieldArr2;
        }
        return declaredFields;
    }

    public static String Q(String str) {
        byte[] bArr;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            try {
                bArr = MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8"));
            } catch (NoSuchAlgorithmException unused) {
                n7.i("Sha256Util", "sha256 NoSuchAlgorithmException");
                bArr = new byte[0];
            }
            return w(bArr);
        } catch (UnsupportedEncodingException unused2) {
            n7.g("Sha256Util", "digest UnsupportedEncodingException");
            return "";
        }
    }

    public static void R(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(ba.f22070t, bi.B);
            jSONObject.putOpt(ba.f22072v, com.huawei.openalliance.ad.constant.w.aF);
            c7.l(context).k(com.huawei.openalliance.ad.constant.s.f, jSONObject.toString(), null, null);
        } catch (JSONException e10) {
            n7.g("UiMessageNotifyManager", "unregisterAllNotify ".concat(e10.getClass().getSimpleName()));
        }
    }

    public static ArrayList T(String str, String str2, AdContentRsp adContentRsp, int i10) {
        ArrayList arrayList = new ArrayList();
        if (adContentRsp == null) {
            return arrayList;
        }
        List<Precontent> A = adContentRsp.A();
        String n10 = adContentRsp.n();
        if (M(A)) {
            return arrayList;
        }
        for (Precontent precontent : A) {
            precontent.b(adContentRsp.C(), i10);
            ContentRecord b10 = bf.b(precontent.a(), new Content(precontent), i10, null, true);
            if (b10 != null) {
                b10.t3(str);
                b10.B(str2);
                b10.E1(0);
            }
            if (b10 != null) {
                b10.D(n10);
                b10.P(adContentRsp.K());
                b10.W(adContentRsp.O());
                b10.x2(precontent.C());
                arrayList.add(b10);
            }
        }
        return arrayList;
    }

    public static boolean U(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
        } catch (ClassNotFoundException unused) {
            n7.h("ReflectAPI", "class not found for %s", str);
        }
        if (ClassLoader.getSystemClassLoader().loadClass(str) == null) {
            return false;
        }
        return true;
    }

    public static byte[] V(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        byte[] bytes = upperCase.getBytes("UTF-8");
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (((byte) (Byte.decode("0x".concat(new String(new byte[]{bytes[i11]}, "UTF-8"))).byteValue() << 4)) ^ Byte.decode("0x".concat(new String(new byte[]{bytes[i11 + 1]}, "UTF-8"))).byteValue());
        }
        return bArr;
    }

    public static boolean W(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            n7.h("ReflectAPI", "class not found for %s", str);
            return false;
        }
    }

    public static int X(String str) {
        Integer q10 = q(17, 0, str);
        if (q10 == null) {
            return 2;
        }
        return q10.intValue();
    }

    public static int Y(String str) {
        Integer q10 = q(11, 0, str);
        if (q10 != null) {
            return q10.intValue();
        }
        return 2;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            ex.I("ReflectAPI", "classNoFound %s", str);
            return null;
        }
    }

    public static Integer b(int i10, int i11, String str) {
        if (TextUtils.isEmpty(str) || i11 < 0) {
            return null;
        }
        String[] split = str.split("-");
        if (split.length < i11 + 1) {
            return null;
        }
        String str2 = split[i11];
        if (TextUtils.isEmpty(str2) || str2.length() <= i10) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str2.substring(i10, i10 + 1)));
        } catch (RuntimeException | Exception e10) {
            ex.I("SwUt", "getSwh ".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    public static Object c(Class cls, String str) {
        if (cls != null && cls != String.class) {
            if (!cls.isPrimitive()) {
                return gb.b.o(cls, str, new Class[0]);
            }
            String str2 = "Response type: " + cls + " not supported!";
            ex.I("RemoteCallUtil", str2);
            throw new IllegalArgumentException(str2);
        }
        return str;
    }

    public static Object d(Object obj, Class cls, String str, Class[] clsArr, Object[] objArr) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Method method = cls.getMethod(str, clsArr);
                method.setAccessible(true);
                return method.invoke(obj, objArr);
            } catch (NoSuchMethodException e10) {
                e0.i.q(e10, "invokeMethod ", "ReflectAPI");
                return null;
            }
        }
        return null;
    }

    public static boolean d0(String str) {
        Integer q10 = q(23, 0, str);
        if (q10 == null || q10.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static String e(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        boolean contains = str.contains("://");
        String str2 = com.huawei.openalliance.ad.constant.w.f22174w;
        if (contains) {
            StringBuilder sb2 = new StringBuilder();
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme != null) {
                sb2.append(scheme);
                sb2.append("://");
            }
            String lastPathSegment = parse.getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = parse.getHost();
            } else {
                sb2.append("******/");
            }
            if (lastPathSegment != null) {
                int length = lastPathSegment.length();
                if (length <= 3) {
                    if (length > 1) {
                        sb2.append((CharSequence) lastPathSegment, 0, length - 1);
                    }
                } else {
                    sb2.append((CharSequence) lastPathSegment, 0, 3);
                }
            }
            sb2.append(com.huawei.openalliance.ad.constant.w.f22174w);
            return sb2.toString();
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf >= 0 && (i10 = lastIndexOf + 1) < str.length()) {
            str = str.substring(i10);
        }
        int length2 = str.length();
        if (length2 <= 3) {
            if (length2 > 1) {
                str2 = str.substring(0, length2 - 1) + com.huawei.openalliance.ad.constant.w.f22174w;
            }
        } else {
            str2 = str.substring(0, 3) + com.huawei.openalliance.ad.constant.w.f22174w;
        }
        return str2;
    }

    public static boolean e0(String str) {
        Integer q10 = q(23, 0, str);
        if (q10 == null || q10.intValue() != 2) {
            return false;
        }
        return true;
    }

    public static String f(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArr) {
                String hexString = Integer.toHexString(b10 & DefaultClassResolver.NAME);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        }
        return "";
    }

    public static int f0(String str) {
        boolean z10;
        Integer q10 = q(22, 0, str);
        if (q10 != null && 1 == q10.intValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return 3;
        }
        Integer q11 = q(0, 2, str);
        if (q11 == null || (q11.intValue() != 1 && q11.intValue() != 2)) {
            return 0;
        }
        return q11.intValue();
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                e0.i.q(th, "close ", "StmUt");
            }
        }
    }

    public static boolean h(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    public static byte[] i(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes("UTF-8");
            for (int i10 = 0; i10 < length; i10++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("0x");
                int i11 = i10 * 2;
                sb2.append(new String(new byte[]{bytes[i11]}, "UTF-8"));
                bArr[i10] = (byte) (((byte) (Byte.decode(sb2.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i11 + 1]}, "UTF-8")).byteValue());
            }
        } catch (NumberFormatException e10) {
            ex.Z("HexUtil", "hex string 2 byte: ".concat(e10.getClass().getSimpleName()));
        }
        return bArr;
    }

    public static Field[] j(Class cls) {
        Field[] fieldArr;
        if (cls.getSuperclass() != null) {
            fieldArr = j(cls.getSuperclass());
        } else {
            fieldArr = null;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        if (fieldArr != null && fieldArr.length > 0) {
            Field[] fieldArr2 = new Field[declaredFields.length + fieldArr.length];
            System.arraycopy(fieldArr, 0, fieldArr2, 0, fieldArr.length);
            System.arraycopy(declaredFields, 0, fieldArr2, fieldArr.length, declaredFields.length);
            return fieldArr2;
        }
        return declaredFields;
    }

    public static boolean k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            ex.I("ReflectAPI", "class not found for %s", str);
            return false;
        }
    }

    public static Object l() {
        try {
            return PPSAppDownloadManager.class.newInstance();
        } catch (ClassNotFoundException | Exception e10) {
            ex.I("ReflectAPI", "createInstance ".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    public static SafeIntent m(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            SafeIntent safeIntent = new SafeIntent(new Intent());
            String optString = jSONObject.optString(ba.f22070t);
            safeIntent.setAction(jSONObject.optString(ba.f22073w));
            safeIntent.putExtra(ba.f22070t, optString);
            JSONObject optJSONObject = jSONObject.optJSONObject(ba.f22071u);
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = optJSONObject.get(next);
                    if (obj instanceof Serializable) {
                        safeIntent.putExtra(next, (Serializable) obj);
                    }
                }
            }
            return safeIntent;
        } catch (JSONException unused) {
            n7.g("MsgConverter", "convertMsgJsonToIntent JSONException");
            return null;
        }
    }

    public static Class n(Field field) {
        int i10;
        if (Map.class.isAssignableFrom(field.getType())) {
            i10 = 1;
        } else if (List.class.isAssignableFrom(field.getType())) {
            i10 = 0;
        } else {
            return null;
        }
        return o(field, i10);
    }

    public static Class o(Field field, int i10) {
        Type[] actualTypeArguments;
        String str;
        Type genericType = field.getGenericType();
        if ((genericType instanceof ParameterizedType) && (actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments()) != null && actualTypeArguments.length > i10) {
            try {
                Type type = actualTypeArguments[i10];
                if (type instanceof Class) {
                    return (Class) type;
                }
                String obj = type.toString();
                int indexOf = obj.indexOf("class ");
                if (indexOf < 0) {
                    indexOf = 0;
                }
                int indexOf2 = obj.indexOf("<");
                if (indexOf2 < 0) {
                    indexOf2 = obj.length();
                }
                return Class.forName(obj.substring(indexOf, indexOf2));
            } catch (ClassNotFoundException unused) {
                str = "getType ClassNotFoundException";
                n7.g("ReflectAPI", str);
                return null;
            } catch (Exception unused2) {
                str = "getType Exception";
                n7.g("ReflectAPI", str);
                return null;
            }
        }
        return null;
    }

    public static Class p(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) p(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return p(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Integer q(int i10, int i11, String str) {
        if (TextUtils.isEmpty(str) || i11 < 0) {
            return null;
        }
        String[] split = str.split("-");
        if (split.length < i11 + 1) {
            return null;
        }
        String str2 = split[i11];
        if (TextUtils.isEmpty(str2) || str2.length() <= i10) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str2.substring(i10, i10 + 1)));
        } catch (RuntimeException | Exception e10) {
            n7.g("SwitchUtil", "getSwh ".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    public static Object r(Class cls, String str) {
        if (cls != null && cls != String.class) {
            if (!cls.isPrimitive()) {
                return y0.o(null, str, cls, new Class[0]);
            }
            String str2 = "Response type: " + cls + " not supported!";
            n7.g("RemoteCallUtil", str2);
            throw new IllegalArgumentException(str2);
        }
        return str;
    }

    public static Object s(Object obj, String str, Class[] clsArr, Object[] objArr, boolean z10) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            try {
                Method method = obj.getClass().getMethod(str, clsArr);
                method.setAccessible(true);
                return method.invoke(obj, objArr);
            } catch (Throwable unused) {
                if (z10) {
                    n7.f31494a.getClass();
                }
                try {
                    Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
                    declaredMethod.setAccessible(true);
                    return declaredMethod.invoke(obj, objArr);
                } catch (Throwable unused2) {
                    n7.f31494a.getClass();
                    return null;
                }
            }
        }
        return null;
    }

    public static Object t(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(str);
            return cls.getDeclaredMethod("getDefault", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable th) {
            e0.i.p(th, "getDefaultTelephoneManager error: ", "n");
            return null;
        }
    }

    public static String u(String str) {
        return y1.j(str);
    }

    public static String v(String str, String str2, Intent intent) {
        SafeIntent safeIntent;
        Bundle extras;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && intent != null && (extras = (safeIntent = new SafeIntent(intent)).getExtras()) != null) {
            Set<String> keySet = extras.keySet();
            JSONObject jSONObject = new JSONObject();
            for (String str3 : keySet) {
                try {
                    jSONObject.putOpt(str3, extras.get(str3));
                } catch (JSONException unused) {
                    n7.g("MsgConverter", "convertMsgToJson - msg json set exception");
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(ba.f22069s, str);
                jSONObject2.put(ba.f22070t, str2);
                jSONObject2.put(ba.f22071u, jSONObject);
                jSONObject2.put(ba.f22073w, safeIntent.getAction());
                return jSONObject2.toString();
            } catch (JSONException unused2) {
                n7.g("MsgConverter", "convertMsgToJson - param json set exception");
            }
        }
        return "";
    }

    public static String w(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArr) {
                String hexString = Integer.toHexString(b10 & DefaultClassResolver.NAME);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        }
        return "";
    }

    public static Type x(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length > 0) {
            Type type = actualTypeArguments[0];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(parameterizedType);
        sb2.append(": index 0 not in range [0,");
        throw new IllegalArgumentException(com.ironsource.adapters.facebook.a.i(sb2, actualTypeArguments.length, ")"));
    }

    public static ArrayList y(String str, String str2, AdContentRsp adContentRsp, int i10) {
        List<Ad30> q10 = adContentRsp.q();
        ArrayList arrayList = new ArrayList();
        if (M(q10)) {
            return arrayList;
        }
        for (Ad30 ad30 : q10) {
            String a10 = ad30.a();
            int b10 = ad30.b();
            String r10 = ad30.r();
            if (200 != b10) {
                n7.f("NetElementGetter", "ad failed, retcode30: %s, slotId: %s.", Integer.valueOf(b10), a10);
            }
            ArrayList arrayList2 = new ArrayList();
            if (ad30.k() != null) {
                arrayList2.addAll(ad30.k());
            }
            if (!M(arrayList2)) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Content content = (Content) it.next();
                    content.g0(adContentRsp.C(), i10);
                    ContentRecord c10 = bf.c(str, str2, a10, content, i10, r10);
                    if (c10 != null) {
                        c10.D(adContentRsp.n());
                        c10.P(adContentRsp.K());
                        c10.W(adContentRsp.O());
                        c10.Z2(adContentRsp.Y());
                        arrayList.add(c10);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ka.zf z(android.content.Context r5, ka.gi r6, java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 4
            r2 = 1
            r3 = 2
            if (r0 == 0) goto La
            goto L39
        La:
            r7.getClass()
            int r0 = r7.hashCode()
            r4 = -1
            switch(r0) {
                case 104396: goto L2c;
                case 94750088: goto L21;
                case 1481625679: goto L16;
                default: goto L15;
            }
        L15:
            goto L36
        L16:
            java.lang.String r0 = "exception"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L1f
            goto L36
        L1f:
            r4 = r3
            goto L36
        L21:
            java.lang.String r0 = "click"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L2a
            goto L36
        L2a:
            r4 = r2
            goto L36
        L2c:
            java.lang.String r0 = "imp"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L35
            goto L36
        L35:
            r4 = 0
        L36:
            switch(r4) {
                case 0: goto L3f;
                case 1: goto L3d;
                case 2: goto L3b;
                default: goto L39;
            }
        L39:
            r7 = 3
            goto L40
        L3b:
            r7 = r1
            goto L40
        L3d:
            r7 = r3
            goto L40
        L3f:
            r7 = r2
        L40:
            if (r7 == r2) goto L58
            if (r7 == r3) goto L52
            if (r7 == r1) goto L4c
            ka.eg r7 = new ka.eg
            r7.<init>(r5, r6)
            goto L5d
        L4c:
            ka.wf r7 = new ka.wf
            r7.<init>(r5, r6)
            goto L5d
        L52:
            ka.bg r7 = new ka.bg
            r7.<init>(r5, r6)
            goto L5d
        L58:
            ka.dg r7 = new ka.dg
            r7.<init>(r5, r6)
        L5d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.n.z(android.content.Context, ka.gi, java.lang.String):ka.zf");
    }

    public abstract Object S();

    public abstract void Z(int i10, int i11, String str, String str2, String str3, String[] strArr);

    public abstract hd.a a0(String str, boolean z10);

    public abstract hd.n b0(int i10, String str, String str2, String str3, String[] strArr);

    public abstract hd.a c0(int i10, hd.q qVar, String str, boolean z10);
}
