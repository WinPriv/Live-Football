package de.javakaffee.kryoserializers.jodatime;

import com.esotericsoftware.kryo.io.Input;
import org.joda.time.Chronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;

/* loaded from: classes2.dex */
enum IdentifiableChronology {
    ISO(null, ISOChronology.getInstance()),
    COPTIC("COPTIC", CopticChronology.getInstance()),
    ETHIOPIC("ETHIOPIC", EthiopicChronology.getInstance()),
    GREGORIAN("GREGORIAN", GregorianChronology.getInstance()),
    JULIAN("JULIAN", JulianChronology.getInstance()),
    ISLAMIC("ISLAMIC", IslamicChronology.getInstance()),
    BUDDHIST("BUDDHIST", BuddhistChronology.getInstance()),
    GJ("GJ", GJChronology.getInstance());

    private final Chronology _chronology;
    private final String _id;

    IdentifiableChronology(String str, Chronology chronology) {
        this._id = str;
        this._chronology = chronology;
    }

    public static String getChronologyId(Chronology chronology) {
        return getIdByChronology(chronology.getClass());
    }

    public static String getIdByChronology(Class<? extends Chronology> cls) throws IllegalArgumentException {
        for (IdentifiableChronology identifiableChronology : values()) {
            if (cls.equals(identifiableChronology._chronology.getClass())) {
                return identifiableChronology._id;
            }
        }
        throw new IllegalArgumentException("Chronology not supported: ".concat(cls.getSimpleName()));
    }

    public static Chronology readChronology(Input input) {
        String readString = input.readString();
        if ("".equals(readString)) {
            readString = null;
        }
        return valueOfId(readString);
    }

    public static Chronology valueOfId(String str) throws IllegalArgumentException {
        if (str == null) {
            return ISO._chronology;
        }
        for (IdentifiableChronology identifiableChronology : values()) {
            if (str.equals(identifiableChronology._id)) {
                return identifiableChronology._chronology;
            }
        }
        throw new IllegalArgumentException("No chronology found for id ".concat(str));
    }

    public String getId() {
        return this._id;
    }
}
