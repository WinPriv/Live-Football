package androidx.work;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import r1.h;

/* compiled from: Data.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f2613b = h.e("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final b f2614c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2615a;

    /* compiled from: Data.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f2616a = new HashMap();

        public final void a(HashMap hashMap) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                HashMap hashMap2 = this.f2616a;
                if (value == null) {
                    hashMap2.put(str, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                        int i10 = 0;
                        if (cls == boolean[].class) {
                            boolean[] zArr = (boolean[]) value;
                            String str2 = b.f2613b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i10 < zArr.length) {
                                boolArr[i10] = Boolean.valueOf(zArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            byte[] bArr = (byte[]) value;
                            String str3 = b.f2613b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i10 < bArr.length) {
                                bArr2[i10] = Byte.valueOf(bArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, bArr2);
                        } else if (cls == int[].class) {
                            int[] iArr = (int[]) value;
                            String str4 = b.f2613b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i10 < iArr.length) {
                                numArr[i10] = Integer.valueOf(iArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, numArr);
                        } else if (cls == long[].class) {
                            long[] jArr = (long[]) value;
                            String str5 = b.f2613b;
                            Long[] lArr = new Long[jArr.length];
                            while (i10 < jArr.length) {
                                lArr[i10] = Long.valueOf(jArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, lArr);
                        } else if (cls == float[].class) {
                            float[] fArr = (float[]) value;
                            String str6 = b.f2613b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i10 < fArr.length) {
                                fArr2[i10] = Float.valueOf(fArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, fArr2);
                        } else if (cls == double[].class) {
                            double[] dArr = (double[]) value;
                            String str7 = b.f2613b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i10 < dArr.length) {
                                dArr2[i10] = Double.valueOf(dArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, dArr2);
                        } else {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                        }
                    } else {
                        hashMap2.put(str, value);
                    }
                }
            }
        }
    }

    static {
        b bVar = new b(new HashMap());
        b(bVar);
        f2614c = bVar;
    }

    public b() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(7:4|5|6|7|(2:9|10)|12|13)|14|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        android.util.Log.e(r1, "Error in Data#fromByteArray: ", r8);
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0060: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:97), block:B:36:0x005f */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.work.b a(byte[] r8) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            java.lang.String r1 = androidx.work.b.f2613b
            int r2 = r8.length
            r3 = 10240(0x2800, float:1.4349E-41)
            if (r2 > r3) goto L74
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r8)
            r8 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3c java.lang.ClassNotFoundException -> L3e java.io.IOException -> L40
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L3c java.lang.ClassNotFoundException -> L3e java.io.IOException -> L40
            int r8 = r4.readInt()     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L3a
        L1d:
            if (r8 <= 0) goto L2d
            java.lang.String r5 = r4.readUTF()     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L3a
            java.lang.Object r6 = r4.readObject()     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L3a
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L36 java.lang.ClassNotFoundException -> L38 java.io.IOException -> L3a
            int r8 = r8 + (-1)
            goto L1d
        L2d:
            r4.close()     // Catch: java.io.IOException -> L31
            goto L51
        L31:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
            goto L51
        L36:
            r8 = move-exception
            goto L5f
        L38:
            r8 = move-exception
            goto L44
        L3a:
            r8 = move-exception
            goto L44
        L3c:
            r2 = move-exception
            goto L61
        L3e:
            r4 = move-exception
            goto L41
        L40:
            r4 = move-exception
        L41:
            r7 = r4
            r4 = r8
            r8 = r7
        L44:
            android.util.Log.e(r1, r0, r8)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L51
            r4.close()     // Catch: java.io.IOException -> L4d
            goto L51
        L4d:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L51:
            r3.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L59:
            androidx.work.b r8 = new androidx.work.b
            r8.<init>(r2)
            return r8
        L5f:
            r2 = r8
            r8 = r4
        L61:
            if (r8 == 0) goto L6b
            r8.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L6b:
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L73
        L6f:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L73:
            throw r2
        L74:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.a(byte[]):androidx.work.b");
    }

    public static byte[] b(b bVar) {
        ObjectOutputStream objectOutputStream;
        String str = f2613b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
                objectOutputStream = null;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            objectOutputStream.writeInt(bVar.f2615a.size());
            for (Map.Entry entry : bVar.f2615a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e11) {
                Log.e(str, "Error in Data#toByteArray: ", e11);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                Log.e(str, "Error in Data#toByteArray: ", e12);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e13) {
            e = e13;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e14) {
                    Log.e(str, "Error in Data#toByteArray: ", e14);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e15) {
                Log.e(str, "Error in Data#toByteArray: ", e15);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e16) {
                    Log.e(str, "Error in Data#toByteArray: ", e16);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e17) {
                Log.e(str, "Error in Data#toByteArray: ", e17);
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        HashMap hashMap = this.f2615a;
        Set<String> keySet = hashMap.keySet();
        if (!keySet.equals(bVar.f2615a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = hashMap.get(str);
            Object obj3 = bVar.f2615a.get(str);
            if (obj2 != null && obj3 != null) {
                if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z10 = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                } else {
                    z10 = obj2.equals(obj3);
                }
            } else if (obj2 == obj3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f2615a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        HashMap hashMap = this.f2615a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public b(b bVar) {
        this.f2615a = new HashMap(bVar.f2615a);
    }

    public b(HashMap hashMap) {
        this.f2615a = new HashMap(hashMap);
    }
}
