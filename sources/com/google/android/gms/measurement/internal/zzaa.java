package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaa extends zzku {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzaa(zzlh zzlhVar) {
        super(zzlhVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i10, int i11) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i10));
        if (zzuVar == null) {
            return false;
        }
        return zzu.zzb(zzuVar).get(i11);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:485|(1:487)(1:489)|488)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:442|(6:443|444|445|446|447|(1:450)(1:449))|451)|44|(5:279|(10:281|282|283|284|285|(2:(4:287|(1:289)|290|(1:293)(1:292))|294)(1:427)|295|296|(3:298|(4:301|(2:333|334)(2:305|(8:307|(4:310|(2:312|313)(1:315)|314|308)|316|317|(4:320|(3:322|323|324)(1:326)|325|318)|327|328|329)(2:331|332))|330|299)|335)|336)(1:441)|337|(10:340|(3:344|(4:347|(5:349|350|(1:352)(1:356)|353|354)(1:357)|355|345)|358)|359|(3:363|(4:366|(3:371|372|373)|374|364)|377)|378|(3:380|(6:383|(2:385|(3:387|388|389))(1:392)|390|391|389|381)|393)|394|(3:403|(8:406|(1:408)|409|(1:411)|412|(3:414|415|416)(1:418)|417|404)|419)|420|338)|426)|46|47|(3:178|(4:181|(10:183|184|(1:186)(1:276)|187|(9:189|190|191|192|193|194|195|196|(3:(11:198|199|200|201|202|203|204|(3:206|207|208)(1:249)|209|210|(1:213)(1:212))|214|215)(4:255|256|248|215))(1:275)|216|(4:219|(3:237|238|239)(4:221|222|(2:223|(2:225|(1:227)(2:228|229))(1:236))|(3:231|232|233)(1:235))|234|217)|240|241|242)(1:277)|243|179)|278)|49|50|(3:77|(6:80|(8:82|83|84|85|86|87|88|(3:(9:90|91|92|93|94|(1:96)(1:153)|97|98|(1:101)(1:100))|102|103)(4:160|161|152|103))(1:176)|104|(2:105|(2:107|(3:143|144|145)(6:109|(2:110|(4:112|(3:114|(1:116)(1:139)|117)(1:140)|118|(1:1)(2:122|(1:124)(2:125|126)))(2:141|142))|(2:131|130)|128|129|130))(0))|146|78)|177)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:493|494))|39|40|(0)(0)|44|(0)|46|47|(0)|49|50|(0)|52|53|(1:54)|74|75) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:1|(2:2|(2:4|(2:6|7)(1:508))(2:509|510))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:485|(1:487)(1:489)|488)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:442|(6:443|444|445|446|447|(1:450)(1:449))|451)|44|(5:279|(10:281|282|283|284|285|(2:(4:287|(1:289)|290|(1:293)(1:292))|294)(1:427)|295|296|(3:298|(4:301|(2:333|334)(2:305|(8:307|(4:310|(2:312|313)(1:315)|314|308)|316|317|(4:320|(3:322|323|324)(1:326)|325|318)|327|328|329)(2:331|332))|330|299)|335)|336)(1:441)|337|(10:340|(3:344|(4:347|(5:349|350|(1:352)(1:356)|353|354)(1:357)|355|345)|358)|359|(3:363|(4:366|(3:371|372|373)|374|364)|377)|378|(3:380|(6:383|(2:385|(3:387|388|389))(1:392)|390|391|389|381)|393)|394|(3:403|(8:406|(1:408)|409|(1:411)|412|(3:414|415|416)(1:418)|417|404)|419)|420|338)|426)|46|47|(3:178|(4:181|(10:183|184|(1:186)(1:276)|187|(9:189|190|191|192|193|194|195|196|(3:(11:198|199|200|201|202|203|204|(3:206|207|208)(1:249)|209|210|(1:213)(1:212))|214|215)(4:255|256|248|215))(1:275)|216|(4:219|(3:237|238|239)(4:221|222|(2:223|(2:225|(1:227)(2:228|229))(1:236))|(3:231|232|233)(1:235))|234|217)|240|241|242)(1:277)|243|179)|278)|49|50|(3:77|(6:80|(8:82|83|84|85|86|87|88|(3:(9:90|91|92|93|94|(1:96)(1:153)|97|98|(1:101)(1:100))|102|103)(4:160|161|152|103))(1:176)|104|(2:105|(2:107|(3:143|144|145)(6:109|(2:110|(4:112|(3:114|(1:116)(1:139)|117)(1:140)|118|(1:1)(2:122|(1:124)(2:125|126)))(2:141|142))|(2:131|130)|128|129|130))(0))|146|78)|177)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:493|494))|507|36|37|38|39|40|(0)(0)|44|(0)|46|47|(0)|49|50|(0)|52|53|(1:54)|74|75|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0a28, code lost:
    
        r0 = r62.zzt.zzaA().zzk();
        r6 = com.google.android.gms.measurement.internal.zzet.zzn(r62.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0a3c, code lost:
    
        if (r7.zzj() == false) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0a3e, code lost:
    
        r7 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0a48, code lost:
    
        r0.zzc("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0a47, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0926, code lost:
    
        if (r12 == null) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0774, code lost:
    
        if (r12 != null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x02f4, code lost:
    
        if (r5 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0224, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0225, code lost:
    
        r17 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0227, code lost:
    
        r18 = "data";
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x022e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x022f, code lost:
    
        r17 = "audience_id";
        r18 = "data";
        r19 = "Database error querying filters. appId";
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x022a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x022b, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x016c, code lost:
    
        if (r9 == null) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01af A[Catch: SQLiteException -> 0x0224, all -> 0x0b15, TRY_LEAVE, TryCatch #12 {SQLiteException -> 0x0224, blocks: (B:40:0x01a9, B:42:0x01af, B:442:0x01bf, B:443:0x01c4, B:445:0x01ce, B:446:0x01de, B:460:0x01ed), top: B:39:0x01a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x01bf A[Catch: SQLiteException -> 0x0224, all -> 0x0b15, TRY_ENTER, TryCatch #12 {SQLiteException -> 0x0224, blocks: (B:40:0x01a9, B:42:0x01af, B:442:0x01bf, B:443:0x01c4, B:445:0x01ce, B:446:0x01de, B:460:0x01ed), top: B:39:0x01a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0834  */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zza(java.lang.String r63, java.util.List r64, java.util.List r65, java.lang.Long r66, java.lang.Long r67) {
        /*
            Method dump skipped, instructions count: 2845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    public final boolean zzb() {
        return false;
    }
}
