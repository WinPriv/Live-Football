package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: a, reason: collision with root package name */
    public String f24822a;

    /* renamed from: e, reason: collision with root package name */
    public String f24826e;

    /* renamed from: b, reason: collision with root package name */
    public final int f24823b = 999999;

    /* renamed from: c, reason: collision with root package name */
    public final double f24824c = 999999.99d;

    /* renamed from: d, reason: collision with root package name */
    public int f24825d = -1;
    public int f = -1;

    /* renamed from: g, reason: collision with root package name */
    public AtomicBoolean f24827g = null;

    /* renamed from: h, reason: collision with root package name */
    public double f24828h = -1.0d;

    /* renamed from: i, reason: collision with root package name */
    public long f24829i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final Vector<Pair<String, String>> f24830j = new Vector<>();

    public static boolean b(String str) {
        if (str != null && str.length() > 0 && str.length() <= 32) {
            return true;
        }
        return false;
    }

    public final Vector<Pair<String, String>> a() {
        Vector<Pair<String, String>> vector = new Vector<>();
        if (this.f24825d != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f24825d);
            vector.add(new Pair<>("age", sb2.toString()));
        }
        if (!TextUtils.isEmpty(this.f24826e)) {
            vector.add(new Pair<>(GENDER, this.f24826e));
        }
        if (this.f != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f);
            vector.add(new Pair<>(LEVEL, sb3.toString()));
        }
        if (this.f24827g != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f24827g);
            vector.add(new Pair<>(PAYING, sb4.toString()));
        }
        if (this.f24828h != -1.0d) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f24828h);
            vector.add(new Pair<>(IAPT, sb5.toString()));
        }
        if (this.f24829i != 0) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.f24829i);
            vector.add(new Pair<>(USER_CREATION_DATE, sb6.toString()));
        }
        if (!TextUtils.isEmpty(this.f24822a)) {
            vector.add(new Pair<>("segName", this.f24822a));
        }
        vector.addAll(this.f24830j);
        return vector;
    }

    public int getAge() {
        return this.f24825d;
    }

    public String getGender() {
        return this.f24826e;
    }

    public double getIapt() {
        return this.f24828h;
    }

    public AtomicBoolean getIsPaying() {
        return this.f24827g;
    }

    public int getLevel() {
        return this.f;
    }

    public String getSegmentName() {
        return this.f24822a;
    }

    public long getUcd() {
        return this.f24829i;
    }

    public void setAge(int i10) {
        if (i10 > 0 && i10 <= 199) {
            this.f24825d = i10;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, a3.l.j("setAge( ", i10, " ) age must be between 1-199"), 2);
        }
    }

    public void setCustom(String str, String str2) {
        boolean matches;
        boolean matches2;
        if (str == null) {
            matches = false;
        } else {
            try {
                matches = str.matches("^[a-zA-Z0-9]*$");
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        if (matches) {
            if (str2 == null) {
                matches2 = false;
            } else {
                matches2 = str2.matches("^[a-zA-Z0-9]*$");
            }
            if (matches2 && b(str) && b(str2)) {
                String str3 = "custom_" + str;
                Vector<Pair<String, String>> vector = this.f24830j;
                if (vector.size() >= 5) {
                    vector.remove(0);
                }
                vector.add(new Pair<>(str3, str2));
                return;
            }
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
    }

    public void setGender(String str) {
        if (!TextUtils.isEmpty(str)) {
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals("male") || str.toLowerCase(locale).equals("female")) {
                this.f24826e = str;
                return;
            }
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, a3.k.l("setGender( ", str, " ) is invalid"), 2);
    }

    public void setIAPTotal(double d10) {
        double d11 = this.f24824c;
        if (d10 > 0.0d && d10 < d11) {
            this.f24828h = Math.floor(d10 * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d10 + " ) iapt must be between 0-" + d11, 2);
    }

    public void setIsPaying(boolean z10) {
        if (this.f24827g == null) {
            this.f24827g = new AtomicBoolean();
        }
        this.f24827g.set(z10);
    }

    public void setLevel(int i10) {
        int i11 = this.f24823b;
        if (i10 > 0 && i10 < i11) {
            this.f = i10;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, a3.k.j("setLevel( ", i10, " ) level must be between 1-", i11), 2);
        }
    }

    public void setSegmentName(String str) {
        boolean matches;
        if (str == null) {
            matches = false;
        } else {
            matches = str.matches("^[a-zA-Z0-9]*$");
        }
        if (matches && b(str)) {
            this.f24822a = str;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, a3.k.l("setSegmentName( ", str, " ) segment name must be alphanumeric and 1-32 in length"), 2);
        }
    }

    public void setUserCreationDate(long j10) {
        if (j10 > 0) {
            this.f24829i = j10;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, a3.l.k("setUserCreationDate( ", j10, " ) is an invalid timestamp"), 2);
        }
    }
}
