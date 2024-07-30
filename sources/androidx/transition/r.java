package androidx.transition;

import android.os.PersistableBundle;
import android.util.Log;
import android.view.ViewGroup;
import com.onesignal.c3;
import com.onesignal.r3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: ViewGroupOverlayApi18.java */
/* loaded from: classes.dex */
public final class r implements m2.i, y2.d, cc.b {

    /* renamed from: s, reason: collision with root package name */
    public final Object f2493s;

    public r(int i10) {
        if (i10 != 5) {
            this.f2493s = new HashMap();
        } else {
            this.f2493s = new PersistableBundle();
        }
    }

    @Override // m2.i
    public final j2.a a() {
        Object obj = this.f2493s;
        if (((t2.a) ((List) obj).get(0)).c()) {
            return new j2.j((List) obj);
        }
        return new j2.i((List) obj);
    }

    @Override // m2.i
    public final List b() {
        return (List) this.f2493s;
    }

    @Override // m2.i
    public final boolean c() {
        Object obj = this.f2493s;
        if (((List) obj).size() != 1 || !((t2.a) ((List) obj).get(0)).c()) {
            return false;
        }
        return true;
    }

    public final String d(String str) {
        if (str != null) {
            return (String) ((Map) this.f2493s).get(str.toLowerCase(Locale.ENGLISH));
        }
        return null;
    }

    public final Set e() {
        return ((Map) this.f2493s).keySet();
    }

    public final boolean f() {
        return ((PersistableBundle) this.f2493s).containsKey("android_notif_id");
    }

    @Override // y2.d
    public final boolean g(Object obj, File file, y2.g gVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = (InputStream) obj;
        b3.b bVar = (b3.b) this.f2493s;
        byte[] bArr = (byte[]) bVar.c(byte[].class, com.anythink.expressad.exoplayer.b.aX);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream2 = fileOutputStream;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        bVar.put(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        bVar.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
                bVar.put(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    @Override // cc.b
    public final String getLanguage() {
        Object obj = this.f2493s;
        c3 c3Var = (c3) obj;
        ((c3) obj).getClass();
        String str = r3.f27010a;
        c3Var.getClass();
        return r3.f(str, "PREFS_OS_LANGUAGE", com.anythink.expressad.video.dynview.a.a.f11379ac);
    }

    public final boolean i() {
        return ((PersistableBundle) this.f2493s).getBoolean("is_restoring", false);
    }

    public final Integer j() {
        return Integer.valueOf(((PersistableBundle) this.f2493s).getInt("android_notif_id"));
    }

    public final Long k() {
        return Long.valueOf(((PersistableBundle) this.f2493s).getLong("timestamp"));
    }

    public final String l() {
        return ((PersistableBundle) this.f2493s).getString("json_payload");
    }

    public final void m(Long l10) {
        ((PersistableBundle) this.f2493s).putLong("timestamp", l10.longValue());
    }

    public final void n(String str) {
        ((PersistableBundle) this.f2493s).putString("json_payload", str);
    }

    public r(ViewGroup viewGroup) {
        this.f2493s = viewGroup.getOverlay();
    }
}
