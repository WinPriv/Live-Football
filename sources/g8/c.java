package g8;

import a8.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Tasks;
import com.huawei.openalliance.ad.constant.bj;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;

/* compiled from: FirebaseInstallationServiceClient.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f28531d = Pattern.compile("[0-9]+s");

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f28532e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f28533a;

    /* renamed from: b, reason: collision with root package name */
    public final c8.a<h> f28534b;

    /* renamed from: c, reason: collision with root package name */
    public final e f28535c = new e();

    public c(Context context, c8.a<h> aVar) {
        this.f28533a = context;
        this.f28534b = aVar;
    }

    public static URL a(String str) throws d8.d {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new d8.d(e10.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String b10;
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f28532e));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            Log.w("Firebase-Installations", str4);
            Object[] objArr = new Object[3];
            objArr[0] = str2;
            objArr[1] = str3;
            if (TextUtils.isEmpty(str)) {
                b10 = "";
            } else {
                b10 = s.f.b(", ", str);
            }
            objArr[2] = b10;
            Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr));
        }
    }

    @VisibleForTesting
    public static long d(String str) {
        Preconditions.checkArgument(f28531d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    public static a e(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        String str;
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f28532e));
        Long l10 = 0L;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str4 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str5 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY)) {
                        str2 = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        l10 = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (l10 == null) {
                    str = " tokenExpirationTimestamp";
                } else {
                    str = "";
                }
                if (str.isEmpty()) {
                    bVar = new b(str2, l10.longValue(), 0);
                    jsonReader.endObject();
                } else {
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str3, str4, str5, bVar, 1);
    }

    public static b f(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        String str;
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f28532e));
        Long l10 = 0L;
        jsonReader.beginObject();
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY)) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                l10 = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        if (l10 == null) {
            str = " tokenExpirationTimestamp";
        } else {
            str = "";
        }
        if (str.isEmpty()) {
            return new b(str2, l10.longValue(), 1);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put(bj.f.Code, "a:17.1.4");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(bj.f.Code, "a:17.1.4");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    public final HttpURLConnection c(URL url, String str) throws d8.d {
        String str2;
        byte[] packageCertificateHashBytes;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty(HttpConnection.CONTENT_ENCODING, com.anythink.expressad.foundation.g.f.g.c.f10012d);
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f28533a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            h hVar = this.f28534b.get();
            if (hVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(hVar.a()));
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                } catch (ExecutionException e11) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                }
            }
            try {
                packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            } catch (PackageManager.NameNotFoundException e12) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e12);
            }
            if (packageCertificateHashBytes == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                str2 = null;
                httpURLConnection.addRequestProperty("X-Android-Cert", str2);
                httpURLConnection.addRequestProperty("x-goog-api-key", str);
                return httpURLConnection;
            }
            str2 = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new d8.d("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
