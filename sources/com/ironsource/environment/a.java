package com.ironsource.environment;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.huawei.hms.ads.br;
import com.ironsource.mediationsdk.ak;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a extends Thread {
    public static final AnonymousClass1 B = new AnonymousClass1();
    public static final C0320a C = new C0320a();

    /* renamed from: v, reason: collision with root package name */
    public final int f24631v;

    /* renamed from: s, reason: collision with root package name */
    public nb.a f24628s = B;

    /* renamed from: t, reason: collision with root package name */
    public final C0320a f24629t = C;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f24630u = new Handler(Looper.getMainLooper());

    /* renamed from: w, reason: collision with root package name */
    public boolean f24632w = false;

    /* renamed from: x, reason: collision with root package name */
    public volatile int f24633x = 0;
    public final int y = 1;

    /* renamed from: z, reason: collision with root package name */
    public int f24634z = 0;
    public final b A = new b();

    /* renamed from: com.ironsource.environment.a$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static class AnonymousClass1 implements nb.a {
        public static String a(int i10) {
            String i11 = a3.l.i("not defined message for ", i10);
            if (i10 != 404) {
                switch (i10) {
                    case 1004:
                        return "malformed url exception";
                    case 1005:
                        break;
                    case 1006:
                        return "http empty response";
                    default:
                        switch (i10) {
                            case 1008:
                                return "socket timeout exception";
                            case br.L /* 1009 */:
                                return "io exception";
                            case 1010:
                                return "uri syntax exception";
                            case 1011:
                                return "http error code";
                            default:
                                switch (i10) {
                                    case 1018:
                                        return "file not found exception";
                                    case 1019:
                                        return "out of memory exception";
                                    case 1020:
                                        return "failed to create folder for file";
                                    default:
                                        return i11;
                                }
                        }
                }
            }
            return "http not found";
        }

        public static byte[] b(byte[] bArr, RSAPublicKey rSAPublicKey) {
            try {
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(1, rSAPublicKey);
                return cipher.doFinal(bArr);
            } catch (Exception e10) {
                IronLog.INTERNAL.error("exception on encryption error: " + e10.getMessage());
                throw new RuntimeException(e10);
            }
        }

        public static int c(Context context) {
            if (context == null) {
                return -1;
            }
            try {
                return context.getResources().getConfiguration().mcc;
            } catch (Exception e10) {
                e10.printStackTrace();
                return -1;
            }
        }

        public static int d(Context context) {
            if (context == null) {
                return -1;
            }
            try {
                return context.getResources().getConfiguration().mnc;
            } catch (Exception e10) {
                e10.printStackTrace();
                return -1;
            }
        }

        public static String e(Context context) {
            if (context != null) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        return telephonyManager.getSimOperator();
                    }
                    return "";
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return "";
                }
            }
            return "";
        }

        public static int f(Context context) {
            if (context != null) {
                try {
                    return ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return -1;
        }

        public static JSONObject b(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errMsg", str);
                jSONObject.put("adViewId", str2);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return jSONObject;
        }

        public static String c() {
            try {
                new ak();
                return ak.a();
            } catch (Throwable unused) {
                return ",kiang";
            }
        }

        public static boolean d() {
            try {
                new ak();
                ak.a();
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public static String c(String str) {
            return Base64.encodeToString(str.getBytes(), 10);
        }

        @Override // nb.a
        public final void b() {
            throw new RuntimeException("ANRHandler has given up");
        }

        public static boolean b(Context context) {
            ConnectivityManager connectivityManager;
            if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                return false;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isConnected()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e10) {
                e10.printStackTrace();
                return false;
            }
        }

        public static byte[] b(String str) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        }

        public static String a(Context context) {
            ConnectivityManager connectivityManager;
            String str;
            StringBuilder sb2 = new StringBuilder();
            if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        String typeName = activeNetworkInfo.getTypeName();
                        int type = activeNetworkInfo.getType();
                        if (type == 0) {
                            str = "3g";
                        } else if (type == 1) {
                            str = "wifi";
                        } else {
                            sb2.append(typeName);
                        }
                        sb2.append(str);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return sb2.toString();
        }

        public static String a(String str) {
            try {
                return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
            } catch (UnsupportedEncodingException unused) {
                return "";
            }
        }

        public static String a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            try {
                return Base64.encodeToString(b(str.getBytes("UTF-8"), (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 0)))), 0).replaceAll(System.getProperty("line.separator"), "");
            } catch (Exception e10) {
                IronLog.INTERNAL.error("exception on string encryption error: " + e10.getMessage());
                e10.printStackTrace();
                return "";
            }
        }

        public static String a(byte[] bArr) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        return sb2.toString();
                    }
                    sb2.append(readLine);
                }
            } catch (Exception e10) {
                IronLog.INTERNAL.error("exception while decompressing " + e10);
                return null;
            }
        }

        public static Map<String, Object> a(Object[][] objArr) {
            HashMap hashMap = new HashMap();
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception unused) {
            }
            return hashMap;
        }

        @Override // nb.a
        public final void a() {
        }

        public static void a(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                throw new Exception("url is null");
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            if (!TextUtils.isEmpty(str2)) {
                intent.setPackage(str2);
            }
            context.startActivity(intent);
        }

        public static byte[] a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
    }

    /* renamed from: com.ironsource.environment.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0320a implements nb.b {
        @Override // nb.b
        public final void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.f24633x = (aVar.f24633x + 1) % Integer.MAX_VALUE;
        }
    }

    public a(int i10) {
        this.f24631v = i10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName("|ANR-ANRHandler|");
        int i10 = -1;
        while (!isInterrupted() && this.f24634z < this.y) {
            int i11 = this.f24633x;
            this.f24630u.post(this.A);
            try {
                Thread.sleep(this.f24631v);
                if (this.f24633x == i11) {
                    if (!this.f24632w && Debug.isDebuggerConnected()) {
                        if (this.f24633x != i10) {
                            Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                        }
                        i10 = this.f24633x;
                    } else {
                        this.f24634z++;
                        this.f24628s.a();
                        String str = e.f24653c;
                        if (str != null && !str.trim().isEmpty()) {
                            new c(e.f24653c, String.valueOf(System.currentTimeMillis()), "ANR").d();
                        }
                    }
                } else {
                    this.f24634z = 0;
                }
            } catch (InterruptedException e10) {
                this.f24629t.a(e10);
                return;
            }
        }
        if (this.f24634z >= this.y) {
            this.f24628s.b();
        }
    }
}
