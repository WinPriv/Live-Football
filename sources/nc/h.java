package nc;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.w;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class h {

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f33504a;

        /* renamed from: b, reason: collision with root package name */
        public Object f33505b;

        public static a a() {
            a aVar = new a();
            aVar.f33504a = 0;
            return aVar;
        }

        public static a b(Object obj) {
            a aVar = new a();
            aVar.f33504a = 1;
            aVar.f33505b = obj;
            return aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public static String a(String str, String str2) {
            for (String str3 : str2.split(",")) {
                str = h.f(1, str, str3.replaceAll("#01;", ","));
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "";
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        boolean a(Object obj);

        a b(Object obj);
    }

    /* loaded from: classes2.dex */
    public static class d {
        public static String a(String str, String str2) {
            for (String str3 : str2.split(",")) {
                if (str3.contains("#")) {
                    String[] split = str3.split("#");
                    String str4 = split[0];
                    StringBuilder o = a3.k.o(".*<", str4, ".*?>(.*?", split[1], ".*?)</");
                    o.append(str4);
                    o.append(">");
                    str = h.f(1, str, o.toString());
                } else {
                    str = h.f(1, str, e0.i.g("<", str3, ".*?>(.*?)</", str3, ">"));
                }
            }
            if (!TextUtils.isEmpty(str)) {
                String f = h.f(1, str, "<!\\[CDATA\\[(.*?)\\]\\]>");
                if (!TextUtils.isEmpty(f)) {
                    return f;
                }
                return str;
            }
            return "";
        }

        public static String b(String str, String str2) {
            try {
                String f = h.f(1, str, "<" + str2 + ">(.*?)</" + str2 + ">");
                if (!TextUtils.isEmpty(f)) {
                    String[] split = f.split(w.bE);
                    return String.valueOf(Integer.parseInt(split[2].substring(0, 2)) + (Integer.parseInt(split[1].substring(0, 2)) * 60) + (Integer.parseInt(split[0].substring(0, 2)) * 60 * 60));
                }
                return "";
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    public static Object a(Object obj, String str, StringBuffer stringBuffer, c cVar) {
        Object obj2;
        Object a10;
        Object a11;
        if (obj != null && obj.getClass().getName().startsWith(str)) {
            stringBuffer.append(obj.getClass().getName().concat(","));
            try {
                ArrayList arrayList = new ArrayList();
                for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                    arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
                }
                if (arrayList.size() != 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Field field = (Field) it.next();
                        field.setAccessible(true);
                        Object obj3 = field.get(obj);
                        if (obj3 != null) {
                            if (cVar.a(obj3)) {
                                a b10 = cVar.b(obj3);
                                int i10 = b10.f33504a;
                                if (i10 == 0) {
                                    continue;
                                } else {
                                    if (i10 == 1) {
                                        return b10.f33505b;
                                    }
                                    if (i10 == -1 && (obj2 = b10.f33505b) != null && !stringBuffer.toString().contains(obj2.getClass().getName()) && (a10 = a(obj2, str, stringBuffer, cVar)) != null) {
                                        return a10;
                                    }
                                }
                            } else if (!stringBuffer.toString().contains(obj3.getClass().getName()) && (a11 = a(obj3, str, stringBuffer, cVar)) != null) {
                                return a11;
                            }
                        }
                    }
                    return null;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static Object b(String str, String str2) {
        try {
            Object invoke = Class.forName(str).getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Field[] declaredFields = invoke.getClass().getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    if (field.get(invoke) instanceof Map) {
                        Map map = (Map) field.get(invoke);
                        if (map == null) {
                            return null;
                        }
                        Object obj = map.get(str2);
                        if (obj instanceof WeakReference) {
                            return ((WeakReference) obj).get();
                        }
                        return map.get(str2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            return Uri.parse(str).getQueryParameter("id");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void d(Class cls, ArrayList arrayList) {
        if (cls != null) {
            try {
                if (!cls.getName().equals(Object.class.getName())) {
                    Field[] declaredFields = cls.getDeclaredFields();
                    if (declaredFields != null && declaredFields.length > 0) {
                        arrayList.addAll(Arrays.asList(declaredFields));
                    }
                    d(cls.getSuperclass(), arrayList);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static Object e(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String f(int i10, String str, String str2) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        String[] strArr = new String[1];
        newFixedThreadPool.submit(new g(str2, str, strArr, i10, newFixedThreadPool));
        try {
            synchronized (newFixedThreadPool) {
                newFixedThreadPool.wait(500L);
            }
            newFixedThreadPool.shutdown();
            String str3 = strArr[0];
            if (str3 != null) {
                return str3;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static void g(Class cls, ArrayList arrayList) {
        if (cls != null) {
            try {
                if (!cls.getName().equals(Object.class.getName())) {
                    Method[] declaredMethods = cls.getDeclaredMethods();
                    if (declaredMethods != null && declaredMethods.length > 0) {
                        arrayList.addAll(Arrays.asList(declaredMethods));
                    }
                    g(cls.getSuperclass(), arrayList);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static String h(String str) {
        Properties properties = new Properties();
        try {
            properties.load(new StringReader("unicodedString=".concat(String.valueOf(str))));
        } catch (IOException unused) {
        }
        return properties.getProperty("unicodedString");
    }
}
