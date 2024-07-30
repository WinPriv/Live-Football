package a8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: HeartBeatInfoStorage.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f369a;

    public l(Context context, String str) {
        this.f369a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        long j10 = this.f369a.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.f369a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f369a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f369a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 - 1).commit();
    }

    public final synchronized void b() {
        SharedPreferences.Editor edit = this.f369a.edit();
        int i10 = 0;
        for (Map.Entry<String, ?> entry : this.f369a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String d10 = d(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(d10)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(d10);
                    i10++;
                    edit.putStringSet(key, hashSet);
                } else {
                    edit.remove(key);
                }
            }
        }
        if (i10 == 0) {
            edit.remove("fire-count");
        } else {
            edit.putLong("fire-count", i10);
        }
        edit.commit();
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f369a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(d(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            this.f369a.edit().putLong("fire-global", currentTimeMillis).commit();
        }
        return arrayList;
        return arrayList;
    }

    public final synchronized String d(long j10) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j10).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f369a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void f(String str) {
        String e10 = e(str);
        if (e10 == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f369a.getStringSet(e10, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f369a.edit().remove(e10).commit();
        } else {
            this.f369a.edit().putStringSet(e10, hashSet).commit();
        }
    }

    public final synchronized boolean g(long j10) {
        if (this.f369a.contains("fire-global")) {
            long j11 = this.f369a.getLong("fire-global", -1L);
            synchronized (this) {
                if (!d(j11).equals(d(j10))) {
                    this.f369a.edit().putLong("fire-global", j10).commit();
                    return true;
                }
                return false;
            }
        }
        this.f369a.edit().putLong("fire-global", j10).commit();
        return true;
    }

    public final synchronized void h(long j10, String str) {
        String d10 = d(j10);
        if (this.f369a.getString("last-used-date", "").equals(d10)) {
            String e10 = e(d10);
            if (e10 == null) {
                return;
            }
            if (e10.equals(str)) {
                return;
            }
            i(str, d10);
            return;
        }
        long j11 = this.f369a.getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            a();
            j11 = this.f369a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f369a.getStringSet(str, new HashSet()));
        hashSet.add(d10);
        this.f369a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", d10).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f369a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f369a.edit().putStringSet(str, hashSet).commit();
    }
}
