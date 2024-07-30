package h1;

import a3.l;
import android.database.Cursor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e0.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28658a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, a> f28659b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<b> f28660c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<d> f28661d;

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f28662a;

        /* renamed from: b, reason: collision with root package name */
        public final String f28663b;

        /* renamed from: c, reason: collision with root package name */
        public final int f28664c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f28665d;

        /* renamed from: e, reason: collision with root package name */
        public final int f28666e;
        public final String f;

        /* renamed from: g, reason: collision with root package name */
        public final int f28667g;

        public a(int i10, int i11, String str, String str2, boolean z10, String str3) {
            this.f28662a = str;
            this.f28663b = str2;
            this.f28665d = z10;
            this.f28666e = i10;
            int i12 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i12 = 3;
                } else if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                    if (!upperCase.contains("BLOB")) {
                        i12 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                    }
                } else {
                    i12 = 2;
                }
            }
            this.f28664c = i12;
            this.f = str3;
            this.f28667g = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f28666e != aVar.f28666e || !this.f28662a.equals(aVar.f28662a) || this.f28665d != aVar.f28665d) {
                return false;
            }
            String str = this.f;
            int i10 = this.f28667g;
            int i11 = aVar.f28667g;
            String str2 = aVar.f;
            if (i10 == 1 && i11 == 2 && str != null && !str.equals(str2)) {
                return false;
            }
            if (i10 == 2 && i11 == 1 && str2 != null && !str2.equals(str)) {
                return false;
            }
            if ((i10 == 0 || i10 != i11 || (str == null ? str2 == null : str.equals(str2))) && this.f28664c == aVar.f28664c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            int hashCode = ((this.f28662a.hashCode() * 31) + this.f28664c) * 31;
            if (this.f28665d) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            return ((hashCode + i10) * 31) + this.f28666e;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Column{name='");
            sb2.append(this.f28662a);
            sb2.append("', type='");
            sb2.append(this.f28663b);
            sb2.append("', affinity='");
            sb2.append(this.f28664c);
            sb2.append("', notNull=");
            sb2.append(this.f28665d);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f28666e);
            sb2.append(", defaultValue='");
            return l.p(sb2, this.f, "'}");
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f28668a;

        /* renamed from: b, reason: collision with root package name */
        public final String f28669b;

        /* renamed from: c, reason: collision with root package name */
        public final String f28670c;

        /* renamed from: d, reason: collision with root package name */
        public final List<String> f28671d;

        /* renamed from: e, reason: collision with root package name */
        public final List<String> f28672e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f28668a = str;
            this.f28669b = str2;
            this.f28670c = str3;
            this.f28671d = Collections.unmodifiableList(list);
            this.f28672e = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f28668a.equals(bVar.f28668a) || !this.f28669b.equals(bVar.f28669b) || !this.f28670c.equals(bVar.f28670c) || !this.f28671d.equals(bVar.f28671d)) {
                return false;
            }
            return this.f28672e.equals(bVar.f28672e);
        }

        public final int hashCode() {
            return this.f28672e.hashCode() + ((this.f28671d.hashCode() + i.b(this.f28670c, i.b(this.f28669b, this.f28668a.hashCode() * 31, 31), 31)) * 31);
        }

        public final String toString() {
            return "ForeignKey{referenceTable='" + this.f28668a + "', onDelete='" + this.f28669b + "', onUpdate='" + this.f28670c + "', columnNames=" + this.f28671d + ", referenceColumnNames=" + this.f28672e + '}';
        }
    }

    /* compiled from: TableInfo.java */
    /* renamed from: h1.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0391c implements Comparable<C0391c> {

        /* renamed from: s, reason: collision with root package name */
        public final int f28673s;

        /* renamed from: t, reason: collision with root package name */
        public final int f28674t;

        /* renamed from: u, reason: collision with root package name */
        public final String f28675u;

        /* renamed from: v, reason: collision with root package name */
        public final String f28676v;

        public C0391c(int i10, int i11, String str, String str2) {
            this.f28673s = i10;
            this.f28674t = i11;
            this.f28675u = str;
            this.f28676v = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(C0391c c0391c) {
            C0391c c0391c2 = c0391c;
            int i10 = this.f28673s - c0391c2.f28673s;
            if (i10 == 0) {
                return this.f28674t - c0391c2.f28674t;
            }
            return i10;
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f28677a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f28678b;

        /* renamed from: c, reason: collision with root package name */
        public final List<String> f28679c;

        public d(String str, List list, boolean z10) {
            this.f28677a = str;
            this.f28678b = z10;
            this.f28679c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f28678b != dVar.f28678b || !this.f28679c.equals(dVar.f28679c)) {
                return false;
            }
            String str = this.f28677a;
            boolean startsWith = str.startsWith("index_");
            String str2 = dVar.f28677a;
            if (startsWith) {
                return str2.startsWith("index_");
            }
            return str.equals(str2);
        }

        public final int hashCode() {
            int hashCode;
            String str = this.f28677a;
            if (str.startsWith("index_")) {
                hashCode = -1184239155;
            } else {
                hashCode = str.hashCode();
            }
            return this.f28679c.hashCode() + (((hashCode * 31) + (this.f28678b ? 1 : 0)) * 31);
        }

        public final String toString() {
            return "Index{name='" + this.f28677a + "', unique=" + this.f28678b + ", columns=" + this.f28679c + '}';
        }
    }

    public c(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        Set<d> unmodifiableSet;
        this.f28658a = str;
        this.f28659b = Collections.unmodifiableMap(hashMap);
        this.f28660c = Collections.unmodifiableSet(hashSet);
        if (hashSet2 == null) {
            unmodifiableSet = null;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(hashSet2);
        }
        this.f28661d = unmodifiableSet;
    }

    public static c a(k1.a aVar, String str) {
        HashSet hashSet;
        boolean z10;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        boolean z11;
        Cursor f = aVar.f("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (f.getColumnCount() > 0) {
                int columnIndex = f.getColumnIndex("name");
                int columnIndex2 = f.getColumnIndex("type");
                int columnIndex3 = f.getColumnIndex("notnull");
                int columnIndex4 = f.getColumnIndex("pk");
                int columnIndex5 = f.getColumnIndex("dflt_value");
                while (f.moveToNext()) {
                    String string = f.getString(columnIndex);
                    String string2 = f.getString(columnIndex2);
                    if (f.getInt(columnIndex3) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    hashMap.put(string, new a(f.getInt(columnIndex4), 2, string, string2, z11, f.getString(columnIndex5)));
                }
            }
            f.close();
            HashSet hashSet2 = new HashSet();
            f = aVar.f("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = f.getColumnIndex("id");
                int columnIndex7 = f.getColumnIndex("seq");
                int columnIndex8 = f.getColumnIndex("table");
                int columnIndex9 = f.getColumnIndex("on_delete");
                int columnIndex10 = f.getColumnIndex("on_update");
                ArrayList b10 = b(f);
                int count = f.getCount();
                int i13 = 0;
                while (i13 < count) {
                    f.moveToPosition(i13);
                    if (f.getInt(columnIndex7) != 0) {
                        i10 = columnIndex6;
                        i11 = columnIndex7;
                        arrayList = b10;
                        i12 = count;
                    } else {
                        int i14 = f.getInt(columnIndex6);
                        i10 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i11 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = b10.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = b10;
                            C0391c c0391c = (C0391c) it.next();
                            int i15 = count;
                            if (c0391c.f28673s == i14) {
                                arrayList2.add(c0391c.f28675u);
                                arrayList3.add(c0391c.f28676v);
                            }
                            b10 = arrayList4;
                            count = i15;
                        }
                        arrayList = b10;
                        i12 = count;
                        hashSet2.add(new b(f.getString(columnIndex8), f.getString(columnIndex9), f.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i13++;
                    columnIndex6 = i10;
                    columnIndex7 = i11;
                    b10 = arrayList;
                    count = i12;
                }
                f.close();
                f = aVar.f("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = f.getColumnIndex("name");
                    int columnIndex12 = f.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                    int columnIndex13 = f.getColumnIndex("unique");
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        hashSet = new HashSet();
                        while (f.moveToNext()) {
                            if ("c".equals(f.getString(columnIndex12))) {
                                String string3 = f.getString(columnIndex11);
                                if (f.getInt(columnIndex13) == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                d c10 = c(aVar, string3, z10);
                                if (c10 != null) {
                                    hashSet.add(c10);
                                }
                            }
                        }
                        return new c(str, hashMap, hashSet2, hashSet);
                    }
                    f.close();
                    hashSet = null;
                    return new c(str, hashMap, hashSet2, hashSet);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new C0391c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d c(k1.a aVar, String str, boolean z10) {
        Cursor f = aVar.f("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = f.getColumnIndex("seqno");
            int columnIndex2 = f.getColumnIndex("cid");
            int columnIndex3 = f.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (f.moveToNext()) {
                    if (f.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(f.getInt(columnIndex)), f.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, arrayList, z10);
            }
            f.close();
            return null;
        } finally {
            f.close();
        }
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        String str = cVar.f28658a;
        String str2 = this.f28658a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map<String, a> map = cVar.f28659b;
        Map<String, a> map2 = this.f28659b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set<b> set2 = cVar.f28660c;
        Set<b> set3 = this.f28660c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set<d> set4 = this.f28661d;
        if (set4 == null || (set = cVar.f28661d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f28658a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Map<String, a> map = this.f28659b;
        if (map != null) {
            i11 = map.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        Set<b> set = this.f28660c;
        if (set != null) {
            i12 = set.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "TableInfo{name='" + this.f28658a + "', columns=" + this.f28659b + ", foreignKeys=" + this.f28660c + ", indices=" + this.f28661d + '}';
    }
}
