package g2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.u;
import s2.g;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f28444a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f28445b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f28446c = {80, 75, 3, 4};

    public static g0<h> a(final String str, Callable<f0<h>> callable) {
        final h hVar;
        Throwable th;
        h hVar2;
        if (str == null) {
            hVar = null;
        } else {
            hVar = l2.g.f32344b.f32345a.get(str);
        }
        if (hVar != null) {
            return new g0<>(new Callable() { // from class: g2.k
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new f0(h.this);
                }
            }, false);
        }
        HashMap hashMap = f28444a;
        if (str != null && hashMap.containsKey(str)) {
            return (g0) hashMap.get(str);
        }
        g0<h> g0Var = new g0<>(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c0 c0Var = new c0() { // from class: g2.l
                @Override // g2.c0
                public final void onResult(Object obj) {
                    HashMap hashMap2 = p.f28444a;
                    hashMap2.remove(str);
                    atomicBoolean.set(true);
                    if (hashMap2.size() == 0) {
                        p.h(true);
                    }
                }
            };
            synchronized (g0Var) {
                f0<h> f0Var = g0Var.f28404d;
                if (f0Var != null && (hVar2 = f0Var.f28396a) != null) {
                    c0Var.onResult(hVar2);
                }
                g0Var.f28401a.add(c0Var);
            }
            c0 c0Var2 = new c0() { // from class: g2.m
                @Override // g2.c0
                public final void onResult(Object obj) {
                    HashMap hashMap2 = p.f28444a;
                    hashMap2.remove(str);
                    atomicBoolean.set(true);
                    if (hashMap2.size() == 0) {
                        p.h(true);
                    }
                }
            };
            synchronized (g0Var) {
                f0<h> f0Var2 = g0Var.f28404d;
                if (f0Var2 != null && (th = f0Var2.f28397b) != null) {
                    c0Var2.onResult(th);
                }
                g0Var.f28402b.add(c0Var2);
            }
            if (!atomicBoolean.get()) {
                hashMap.put(str, g0Var);
                if (hashMap.size() == 1) {
                    h(false);
                }
            }
        }
        return g0Var;
    }

    public static f0<h> b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2);
            }
            return f(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new f0<>(e10);
        }
    }

    public static f0<h> c(InputStream inputStream, String str) {
        try {
            Logger logger = okio.q.f33861a;
            okio.a0 a0Var = new okio.a0();
            if (inputStream != null) {
                okio.u uVar = new okio.u(new okio.n(inputStream, a0Var));
                String[] strArr = r2.c.f34841w;
                return d(new r2.d(uVar), str, true);
            }
            throw new IllegalArgumentException("in == null");
        } finally {
            s2.g.b(inputStream);
        }
    }

    public static f0 d(r2.d dVar, String str, boolean z10) {
        try {
            try {
                h a10 = q2.w.a(dVar);
                if (str != null) {
                    l2.g.f32344b.f32345a.put(str, a10);
                }
                f0 f0Var = new f0(a10);
                if (z10) {
                    s2.g.b(dVar);
                }
                return f0Var;
            } catch (Exception e10) {
                f0 f0Var2 = new f0(e10);
                if (z10) {
                    s2.g.b(dVar);
                }
                return f0Var2;
            }
        } catch (Throwable th) {
            if (z10) {
                s2.g.b(dVar);
            }
            throw th;
        }
    }

    public static f0<h> e(Context context, int i10, String str) {
        Boolean bool;
        try {
            InputStream openRawResource = context.getResources().openRawResource(i10);
            Logger logger = okio.q.f33861a;
            okio.a0 a0Var = new okio.a0();
            if (openRawResource != null) {
                okio.u uVar = new okio.u(new okio.n(openRawResource, a0Var));
                try {
                    okio.u peek = uVar.peek();
                    byte[] bArr = f28446c;
                    int length = bArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            if (peek.readByte() != bArr[i11]) {
                                bool = Boolean.FALSE;
                                break;
                            }
                            i11++;
                        } else {
                            peek.close();
                            bool = Boolean.TRUE;
                            break;
                        }
                    }
                } catch (Exception unused) {
                    s2.c.f35104a.getClass();
                    bool = Boolean.FALSE;
                } catch (NoSuchMethodError unused2) {
                    bool = Boolean.FALSE;
                }
                if (bool.booleanValue()) {
                    return f(context, new ZipInputStream(new u.a()), str);
                }
                return c(new u.a(), str);
            }
            throw new IllegalArgumentException("in == null");
        } catch (Resources.NotFoundException e10) {
            return new f0<>(e10);
        }
    }

    public static f0<h> f(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return g(context, zipInputStream, str);
        } finally {
            s2.g.b(zipInputStream);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f0<h> g(Context context, ZipInputStream zipInputStream, String str) {
        b0 b0Var;
        FileOutputStream fileOutputStream;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            h hVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    Logger logger = okio.q.f33861a;
                    okio.u uVar = new okio.u(new okio.n(zipInputStream, new okio.a0()));
                    String[] strArr = r2.c.f34841w;
                    hVar = (h) d(new r2.d(uVar), null, false).f28396a;
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        if (!name.contains(".ttf") && !name.contains(".otf")) {
                            zipInputStream.closeEntry();
                        }
                        String[] split = name.split("/");
                        String str2 = split[split.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        try {
                            fileOutputStream = new FileOutputStream(file);
                        } catch (Throwable th) {
                            s2.c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th);
                        }
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            Typeface createFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                s2.c.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            hashMap2.put(str3, createFromFile);
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                            break;
                        }
                    }
                    String[] split2 = name.split("/");
                    hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (hVar == null) {
                return new f0<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str4 = (String) entry.getKey();
                Iterator<b0> it = hVar.f28409d.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        b0Var = it.next();
                        if (b0Var.f28367c.equals(str4)) {
                            break;
                        }
                    } else {
                        b0Var = null;
                        break;
                    }
                }
                if (b0Var != null) {
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    g.a aVar = s2.g.f35111a;
                    int width = bitmap.getWidth();
                    int i10 = b0Var.f28365a;
                    int i11 = b0Var.f28366b;
                    if (width != i10 || bitmap.getHeight() != i11) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    b0Var.f28368d = bitmap;
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z10 = false;
                for (l2.c cVar : hVar.f28410e.values()) {
                    if (cVar.f32332a.equals(entry2.getKey())) {
                        cVar.f32335d = (Typeface) entry2.getValue();
                        z10 = true;
                    }
                }
                if (!z10) {
                    s2.c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (hashMap.isEmpty()) {
                Iterator<Map.Entry<String, b0>> it2 = hVar.f28409d.entrySet().iterator();
                while (it2.hasNext()) {
                    b0 value = it2.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    String str5 = value.f28367c;
                    if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                            value.f28368d = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        } catch (IllegalArgumentException e10) {
                            s2.c.c("data URL did not have correct base64 format.", e10);
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, b0> entry3 : hVar.f28409d.entrySet()) {
                if (entry3.getValue().f28368d == null) {
                    return new f0<>(new IllegalStateException("There is no image for " + entry3.getValue().f28367c));
                }
            }
            if (str != null) {
                l2.g.f32344b.f32345a.put(str, hVar);
            }
            return new f0<>(hVar);
        } catch (IOException e11) {
            return new f0<>(e11);
        }
    }

    public static void h(boolean z10) {
        ArrayList arrayList = new ArrayList(f28445b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((h0) arrayList.get(i10)).a();
        }
    }

    public static String i(int i10, Context context) {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }
}
