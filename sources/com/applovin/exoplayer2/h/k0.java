package com.applovin.exoplayer2.h;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.MenuItem;
import com.applovin.exoplayer2.h.s;
import com.applovin.exoplayer2.h.u;
import com.google.android.material.navigation.NavigationBarView;
import com.hamkho.livefoot.Activities.FootballScores.MainFootballScores;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.ag;
import d6.o;
import g4.o;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k4.e1;
import okhttp3.Call;
import okhttp3.EventListener;
import org.jsoup.helper.HttpConnection;
import x3.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements s.a, o.a, o.a, NavigationBarView.b, EventListener.Factory {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15370s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f15371t;

    public /* synthetic */ k0(Object obj, int i10) {
        this.f15370s = i10;
        this.f15371t = obj;
    }

    @Override // com.google.android.material.navigation.NavigationBarView.b
    public final void a(MenuItem menuItem) {
        MainFootballScores mainFootballScores = (MainFootballScores) this.f15371t;
        int i10 = MainFootballScores.f21461t;
        mainFootballScores.getClass();
        int itemId = menuItem.getItemId();
        if (itemId != R.id.AllLeagues) {
            if (itemId == R.id.AllScores) {
                mainFootballScores.c(new z8.a());
                return;
            }
            return;
        }
        mainFootballScores.c(new x8.a());
    }

    @Override // g4.o.a
    public final Object apply(Object obj) {
        InputStream inputStream;
        int i10 = this.f15370s;
        Object obj2 = this.f15371t;
        switch (i10) {
            case 1:
                x3.b bVar = (x3.b) obj2;
                b.a aVar = (b.a) obj;
                bVar.getClass();
                URL url = aVar.f36323a;
                String c10 = d4.a.c("CctTransportBackend");
                if (Log.isLoggable(c10, 4)) {
                    Log.i(c10, String.format("Making request to: %s", url));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f36323a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(bVar.f36322g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
                httpURLConnection.setRequestProperty(HttpConnection.CONTENT_ENCODING, com.anythink.expressad.foundation.g.f.g.c.f10012d);
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.c.f10012d);
                String str = aVar.f36325c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            x7.d dVar = bVar.f36317a;
                            y3.j jVar = aVar.f36324b;
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                            x7.e eVar = dVar.f36486a;
                            x7.f fVar = new x7.f(bufferedWriter, eVar.f36490a, eVar.f36491b, eVar.f36492c, eVar.f36493d);
                            fVar.f(jVar);
                            fVar.h();
                            fVar.f36496b.flush();
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            Integer valueOf = Integer.valueOf(responseCode);
                            String c11 = d4.a.c("CctTransportBackend");
                            if (Log.isLoggable(c11, 4)) {
                                Log.i(c11, String.format("Status Code: %d", valueOf));
                            }
                            d4.a.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                            d4.a.a(httpURLConnection.getHeaderField(HttpConnection.CONTENT_ENCODING), "CctTransportBackend", "Content-Encoding: %s");
                            if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                                if (responseCode != 200) {
                                    return new b.C0506b(responseCode, null, 0L);
                                }
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                try {
                                    if (com.anythink.expressad.foundation.g.f.g.c.f10012d.equals(httpURLConnection.getHeaderField(HttpConnection.CONTENT_ENCODING))) {
                                        inputStream = new GZIPInputStream(inputStream2);
                                    } else {
                                        inputStream = inputStream2;
                                    }
                                    try {
                                        b.C0506b c0506b = new b.C0506b(responseCode, null, y3.n.a(new BufferedReader(new InputStreamReader(inputStream))).f36637a);
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        return c0506b;
                                    } finally {
                                    }
                                } finally {
                                }
                            } else {
                                return new b.C0506b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (ConnectException e10) {
                    e = e10;
                    d4.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new b.C0506b(500, null, 0L);
                } catch (UnknownHostException e11) {
                    e = e11;
                    d4.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new b.C0506b(500, null, 0L);
                } catch (IOException e12) {
                    e = e12;
                    d4.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new b.C0506b(ag.f21998i, null, 0L);
                } catch (v7.b e13) {
                    e = e13;
                    d4.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new b.C0506b(ag.f21998i, null, 0L);
                }
            case 2:
                g4.o oVar = (g4.o) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                w3.b bVar2 = g4.o.f28502x;
                oVar.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + oVar.f28504t.a()).execute();
                return null;
            default:
                Map map = (Map) obj2;
                Cursor cursor = (Cursor) obj;
                w3.b bVar3 = g4.o.f28502x;
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    Set set = (Set) map.get(Long.valueOf(j10));
                    if (set == null) {
                        set = new HashSet();
                        map.put(Long.valueOf(j10), set);
                    }
                    set.add(new o.b(cursor.getString(1), cursor.getString(2)));
                }
                return null;
        }
    }

    @Override // okhttp3.EventListener.Factory
    public final EventListener create(Call call) {
        EventListener lambda$factory$0;
        lambda$factory$0 = EventListener.lambda$factory$0((EventListener) this.f15371t, call);
        return lambda$factory$0;
    }

    @Override // com.applovin.exoplayer2.h.s.a
    public final s createProgressiveMediaExtractor() {
        return u.a.b((com.applovin.exoplayer2.e.l) this.f15371t);
    }

    @Override // d6.o.a
    public final void invoke(Object obj) {
        ((e1.c) obj).Z((List) this.f15371t);
    }
}
