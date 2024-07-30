package kb;

import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f32279a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f32280b;

    static {
        String[] strArr = {com.anythink.expressad.d.a.b.f7157da, "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        f32280b = strArr;
        Arrays.sort(strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0110, code lost:
    
        r0.f32275c = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0129, code lost:
    
        r6 = r0.f32277e;
        r8 = r0.f32276d;
        r6 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x012f, code lost:
    
        if (r6 < 5) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0133, code lost:
    
        if ((r6 & 1) == 0) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0135, code lost:
    
        r9 = r6 / 2;
        r11 = new byte[r9];
        r8 = r8 + 1;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x013c, code lost:
    
        if (r12 >= r9) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x013e, code lost:
    
        r11[r12] = (byte) r0.a(r8);
        r8 = r8 + 2;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r8 == ',') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x014a, code lost:
    
        r6 = new java.lang.String(r0.f32278g, r0.f32276d, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x015e, code lost:
    
        throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0127, code lost:
    
        r0.f32277e = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (r8 == ';') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0168, code lost:
    
        throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0169, code lost:
    
        r6 = r6 + 1;
        r0.f32275c = r6;
        r0.f32276d = r6;
        r0.f32277e = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0171, code lost:
    
        r6 = r0.f32275c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0173, code lost:
    
        if (r6 == r7) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0175, code lost:
    
        r8 = r0.f32278g;
        r9 = r8[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0179, code lost:
    
        if (r9 != r13) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        r0.f32276d = r6;
        r0.f32277e = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01e5, code lost:
    
        if (r9 != '\\') goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01e7, code lost:
    
        r8[r0.f32277e] = r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f4, code lost:
    
        r0.f32275c++;
        r0.f32277e++;
        r13 = '\"';
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01f0, code lost:
    
        r8[r0.f32277e] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x017b, code lost:
    
        r0.f32275c = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x017f, code lost:
    
        r6 = r0.f32275c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0181, code lost:
    
        if (r6 >= r7) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        r6 = r0.f32275c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0187, code lost:
    
        if (r0.f32278g[r6] != ' ') goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0189, code lost:
    
        r0.f32275c = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x018e, code lost:
    
        r8 = r0.f32278g;
        r9 = r0.f32276d;
        r6 = new java.lang.String(r8, r9, r0.f32277e - r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x020d, code lost:
    
        throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r6 < r7) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x020e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0213, code lost:
    
        if (r3.isEmpty() != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0215, code lost:
    
        r0 = new java.lang.String[r3.size()];
        r3.toArray(r0);
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0221, code lost:
    
        r4 = new java.util.LinkedList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0226, code lost:
    
        r0 = r17.getSubjectAlternativeNames();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        r8 = r0.f32278g;
        r12 = r8[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r12 == ' ') goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r12 == ';') goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r12 == r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r12 == '+') goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r12 == ',') goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        r9 = r0.f32277e;
        r0.f32277e = r9 + 1;
        r8[r9] = r12;
        r0.f32275c = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        r9 = '\\';
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x022b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        r9 = r0.f32276d;
        r6 = new java.lang.String(r8, r9, r0.f32277e - r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x022c, code lost:
    
        android.util.Log.e("SecurityComp10105308: ".concat(""), "Error parsing certificate.", r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0220, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a0, code lost:
    
        if ("cn".equalsIgnoreCase(r4) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01a6, code lost:
    
        if (r3.isEmpty() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0026, code lost:
    
        if (r4 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01a8, code lost:
    
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01ad, code lost:
    
        r3.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01b0, code lost:
    
        r4 = r0.f32275c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01b2, code lost:
    
        if (r4 < r7) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01b5, code lost:
    
        r6 = r0.f32278g[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01bb, code lost:
    
        if (r6 == ',') goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01bd, code lost:
    
        if (r6 != ';') goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c0, code lost:
    
        if (r6 != '+') goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x002a, code lost:
    
        r6 = r0.f32275c;
        r7 = r0.f32274b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01cc, code lost:
    
        throw new java.lang.IllegalStateException("Malformed DN: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cd, code lost:
    
        r0.f32275c = r4 + 1;
        r4 = r0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d5, code lost:
    
        if (r4 == null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e2, code lost:
    
        throw new java.lang.IllegalStateException("Malformed DN: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r6 >= r7) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007f, code lost:
    
        r6 = r0.f32277e;
        r0.f32277e = r6 + 1;
        r8[r6] = r0.b();
        r0.f32275c++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009e, code lost:
    
        r9 = r0.f32277e;
        r0.f = r9;
        r0.f32275c = r6 + 1;
        r0.f32277e = r9 + 1;
        r8[r9] = ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ac, code lost:
    
        r6 = r0.f32275c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ae, code lost:
    
        if (r6 >= r7) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b0, code lost:
    
        r8 = r0.f32278g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
    
        if (r8[r6] != ' ') goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        r9 = r0.f32277e;
        r0.f32277e = r9 + 1;
        r8[r9] = ' ';
        r0.f32275c = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        r8 = r0.f32278g[r6];
        r9 = '\\';
        r13 = '\"';
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c3, code lost:
    
        if (r6 == r7) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c5, code lost:
    
        r6 = r0.f32278g[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c9, code lost:
    
        if (r6 == ',') goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cb, code lost:
    
        if (r6 == '+') goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cd, code lost:
    
        if (r6 != ';') goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
    
        r8 = r0.f32278g;
        r9 = r0.f32276d;
        r6 = new java.lang.String(r8, r9, r0.f - r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (r8 == '\"') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0056, code lost:
    
        r8 = r0.f32278g;
        r9 = r0.f32276d;
        r6 = new java.lang.String(r8, r9, r0.f32277e - r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e2, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e7, code lost:
    
        if ((r6 + 4) >= r7) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e9, code lost:
    
        r0.f32276d = r6;
        r0.f32275c = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ef, code lost:
    
        r6 = r0.f32275c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f1, code lost:
    
        if (r6 == r7) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f3, code lost:
    
        r8 = r0.f32278g;
        r9 = r8[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f7, code lost:
    
        if (r9 == '+') goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f9, code lost:
    
        if (r9 == ',') goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fb, code lost:
    
        if (r9 != ';') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fe, code lost:
    
        if (r9 != ' ') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0117, code lost:
    
        if (r9 < 'A') goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x011b, code lost:
    
        if (r9 > 'F') goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011d, code lost:
    
        r8[r6] = (char) (r9 + ' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r8 == '#') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0122, code lost:
    
        r0.f32275c = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0100, code lost:
    
        r0.f32277e = r6;
        r0.f32275c = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0106, code lost:
    
        r6 = r0.f32275c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0108, code lost:
    
        if (r6 >= r7) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x010e, code lost:
    
        if (r0.f32278g[r6] != ' ') goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        if (r8 == '+') goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0369 A[EDGE_INSN: B:240:0x0369->B:241:0x0369 BREAK  A[LOOP:10: B:191:0x02b7->B:245:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[LOOP:10: B:191:0x02b7->B:245:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0363  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r16, java.security.cert.X509Certificate r17) throws javax.net.ssl.SSLException {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.c.a(java.lang.String, java.security.cert.X509Certificate):void");
    }
}
