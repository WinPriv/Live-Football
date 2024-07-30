package io.paperdb;

import a3.l;
import android.annotation.SuppressLint;
import android.content.Context;
import com.esotericsoftware.kryo.Serializer;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class Paper {
    static final String DEFAULT_DB_NAME = "io.paperdb";
    static final String TAG = "paperdb";

    @SuppressLint({"StaticFieldLeak"})
    private static Context mContext;
    private static final ConcurrentHashMap<String, Book> mBookMap = new ConcurrentHashMap<>();
    private static final HashMap<Class, Serializer> mCustomSerializers = new HashMap<>();

    public static <T> void addSerializer(Class<T> cls, Serializer<T> serializer) {
        HashMap<Class, Serializer> hashMap = mCustomSerializers;
        if (!hashMap.containsKey(cls)) {
            hashMap.put(cls, serializer);
        }
    }

    public static Book book(String str) {
        if (!str.equals("io.paperdb")) {
            return getBook(null, str);
        }
        throw new PaperDbException("io.paperdb name is reserved for default library name");
    }

    public static Book bookOn(String str, String str2) {
        return getBook(removeLastFileSeparatorIfExists(str), str2);
    }

    public static void clear(Context context) {
        init(context);
        book().destroy();
    }

    public static void delete(String str) {
        book().delete(str);
    }

    public static boolean exist(String str) {
        return book().contains(str);
    }

    public static <T> T get(String str) {
        return (T) book().read(str);
    }

    private static Book getBook(String str, String str2) {
        String str3;
        Book book;
        if (mContext != null) {
            StringBuilder sb2 = new StringBuilder();
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            String p10 = l.p(sb2, str3, str2);
            ConcurrentHashMap<String, Book> concurrentHashMap = mBookMap;
            synchronized (concurrentHashMap) {
                book = concurrentHashMap.get(p10);
                if (book == null) {
                    if (str == null) {
                        book = new Book(mContext, str2, mCustomSerializers);
                    } else {
                        book = new Book(str, str2, mCustomSerializers);
                    }
                    concurrentHashMap.put(p10, book);
                }
            }
            return book;
        }
        throw new PaperDbException("Paper.init is not called");
    }

    public static void init(Context context) {
        mContext = context.getApplicationContext();
    }

    public static <T> Book put(String str, T t10) {
        return book().write(str, t10);
    }

    private static String removeLastFileSeparatorIfExists(String str) {
        if (str.endsWith(File.separator)) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static void setLogLevel(int i10) {
        Iterator<Map.Entry<String, Book>> it = mBookMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().setLogLevel(i10);
        }
    }

    public static <T> T get(String str, T t10) {
        return (T) book().read(str, t10);
    }

    public static Book bookOn(String str) {
        return bookOn(str, "io.paperdb");
    }

    public static Book book() {
        return getBook(null, "io.paperdb");
    }
}
