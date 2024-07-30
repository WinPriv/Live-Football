package ka;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class y5 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f32207s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a6 f32208t;

    public y5(a6 a6Var, String str) {
        this.f32208t = a6Var;
        this.f32207s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a6 a6Var = this.f32208t;
        w5 w5Var = a6Var.E;
        InputStream inputStream = null;
        if (w5Var != null) {
            w5Var.b();
            a6Var.E = null;
        }
        String str = this.f32207s;
        if (!TextUtils.isEmpty(str)) {
            boolean startsWith = str.startsWith("asset://");
            Context context = a6Var.F;
            if (startsWith) {
                try {
                    inputStream = context.getAssets().open(str.substring(8));
                } catch (IOException e10) {
                    n7.g(a6Var.d(), "loadFile ".concat(e10.getClass().getSimpleName()));
                }
            } else if (str.startsWith("res://")) {
                try {
                    inputStream = context.getResources().openRawResource(Integer.parseInt(str.substring(6)));
                } catch (Throwable th) {
                    e0.i.p(th, "loadFile ", a6Var.d());
                }
            } else if (str.startsWith("content://")) {
                try {
                    inputStream = context.getContentResolver().openInputStream(Uri.parse(str));
                } catch (FileNotFoundException e11) {
                    n7.g(a6Var.d(), "oPIs ".concat(e11.getClass().getSimpleName()));
                }
            } else {
                try {
                    inputStream = new FileInputStream(new File(str));
                } catch (FileNotFoundException e12) {
                    n7.g(a6Var.d(), "loadFile ".concat(e12.getClass().getSimpleName()));
                }
            }
            if (inputStream != null) {
                try {
                    a6Var.E = new w5(inputStream);
                    a6Var.c();
                } catch (Exception unused) {
                    n7.g(a6Var.d(), "exception in creating gif decoder");
                    com.huawei.openalliance.ad.ppskit.utils.d2.a(new z5(a6Var));
                }
            }
        }
    }
}
