package w;

import a3.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.constant.w;

/* compiled from: Debug.java */
@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public final class a {
    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + w.bE + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    public static String b(int i10, Context context) {
        if (i10 != -1) {
            try {
                i10 = context.getResources().getResourceEntryName(i10);
                return i10;
            } catch (Exception unused) {
                return l.i("?", i10);
            }
        }
        return "UNKNOWN";
    }

    public static String c(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
