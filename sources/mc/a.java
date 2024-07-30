package mc;

import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.constant.ErrorCode;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes2.dex */
public final class a extends rc.c {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f33025s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f33026t;

    public a(b bVar, int i10) {
        this.f33026t = bVar;
        this.f33025s = i10;
    }

    @Override // rc.c
    public final void a() {
        Throwable th;
        HttpURLConnection httpURLConnection;
        b bVar = this.f33026t;
        try {
            try {
                c cVar = bVar.f33027a;
                if (cVar != null) {
                    cVar.a();
                }
                HttpURLConnection httpURLConnection2 = null;
                try {
                    try {
                        httpURLConnection = (HttpURLConnection) new URL(bVar.c()).openConnection();
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection = null;
                    }
                } catch (Exception unused) {
                } catch (OutOfMemoryError unused2) {
                } catch (StackOverflowError unused3) {
                } catch (Error unused4) {
                } catch (ConnectException unused5) {
                } catch (SocketTimeoutException unused6) {
                } catch (UnknownHostException unused7) {
                } catch (ConnectTimeoutException unused8) {
                }
                try {
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setUseCaches(false);
                    HashMap d10 = bVar.d();
                    if (d10.size() > 0) {
                        for (String str : d10.keySet()) {
                            httpURLConnection.addRequestProperty(str, (String) d10.get(str));
                        }
                    }
                    httpURLConnection.setConnectTimeout(ErrorCode.ERROR_PPS_SERVER_FAILED);
                    httpURLConnection.setReadTimeout(w.f22171t);
                    httpURLConnection.connect();
                    byte[] e10 = bVar.e();
                    if (e10 != null) {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        outputStream.write(e10);
                        outputStream.flush();
                        outputStream.close();
                    }
                    if (httpURLConnection.getResponseCode() != 200) {
                        bVar.i();
                        httpURLConnection.disconnect();
                        return;
                    }
                    InputStream a10 = b.a(httpURLConnection);
                    InputStreamReader inputStreamReader = new InputStreamReader(a10);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb2.append(readLine);
                        }
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    if (a10 != null) {
                        a10.close();
                    }
                    boolean h10 = bVar.h();
                    int i10 = this.f33025s;
                    if (h10) {
                        String sb3 = sb2.toString();
                        httpURLConnection.getHeaderFields();
                        String b10 = bVar.b(sb3);
                        c cVar2 = bVar.f33027a;
                        if (cVar2 != null) {
                            cVar2.a(i10, b10);
                        }
                    } else {
                        httpURLConnection.getHeaderFields();
                        String b11 = bVar.b("");
                        c cVar3 = bVar.f33027a;
                        if (cVar3 != null) {
                            cVar3.a(i10, b11);
                        }
                    }
                    httpURLConnection.disconnect();
                } catch (OutOfMemoryError unused9) {
                    httpURLConnection2 = httpURLConnection;
                    System.gc();
                    bVar.i();
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (StackOverflowError unused10) {
                    httpURLConnection2 = httpURLConnection;
                    System.gc();
                    bVar.i();
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (Error unused11) {
                    httpURLConnection2 = httpURLConnection;
                    System.gc();
                    bVar.i();
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (ConnectException unused12) {
                    httpURLConnection2 = httpURLConnection;
                    bVar.i();
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (SocketTimeoutException unused13) {
                    httpURLConnection2 = httpURLConnection;
                    bVar.i();
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (UnknownHostException unused14) {
                    httpURLConnection2 = httpURLConnection;
                    bVar.i();
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (ConnectTimeoutException unused15) {
                    httpURLConnection2 = httpURLConnection;
                    c cVar4 = bVar.f33027a;
                    if (cVar4 != null) {
                        cVar4.b();
                    }
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (Exception unused16) {
                    httpURLConnection2 = httpURLConnection;
                    bVar.i();
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception unused17) {
                c cVar5 = bVar.f33027a;
                if (cVar5 != null) {
                    cVar5.b();
                }
            }
        } catch (OutOfMemoryError | StackOverflowError unused18) {
            System.gc();
            c cVar6 = bVar.f33027a;
            if (cVar6 != null) {
                cVar6.b();
            }
        }
    }
}
