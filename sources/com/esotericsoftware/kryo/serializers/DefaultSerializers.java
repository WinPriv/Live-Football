package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.KryoSerializable;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Util;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class DefaultSerializers {

    /* loaded from: classes.dex */
    public static class BigDecimalSerializer extends Serializer<BigDecimal> {
        private final BigIntegerSerializer bigIntegerSerializer = new BigIntegerSerializer();

        public BigDecimalSerializer() {
            setAcceptsNull(true);
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public BigDecimal read(Kryo kryo, Input input, Class<BigDecimal> cls) {
            BigInteger read = this.bigIntegerSerializer.read(kryo, input, BigInteger.class);
            if (read == null) {
                return null;
            }
            int readInt = input.readInt(false);
            if (cls != BigDecimal.class && cls != null) {
                try {
                    Constructor<BigDecimal> constructor = cls.getConstructor(BigInteger.class, Integer.TYPE);
                    if (!constructor.isAccessible()) {
                        try {
                            constructor.setAccessible(true);
                        } catch (SecurityException unused) {
                        }
                    }
                    return constructor.newInstance(read, Integer.valueOf(readInt));
                } catch (Exception e10) {
                    throw new KryoException(e10);
                }
            }
            if (read == BigInteger.ZERO && readInt == 0) {
                return BigDecimal.ZERO;
            }
            return new BigDecimal(read, readInt);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, BigDecimal bigDecimal) {
            if (bigDecimal == null) {
                output.writeVarInt(0, true);
            } else if (bigDecimal == BigDecimal.ZERO) {
                this.bigIntegerSerializer.write(kryo, output, BigInteger.ZERO);
                output.writeInt(0, false);
            } else {
                this.bigIntegerSerializer.write(kryo, output, bigDecimal.unscaledValue());
                output.writeInt(bigDecimal.scale(), false);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class BigIntegerSerializer extends Serializer<BigInteger> {
        public BigIntegerSerializer() {
            setImmutable(true);
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public BigInteger read(Kryo kryo, Input input, Class<BigInteger> cls) {
            int readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                return null;
            }
            byte[] readBytes = input.readBytes(readVarInt - 1);
            if (cls != BigInteger.class && cls != null) {
                try {
                    Constructor<BigInteger> constructor = cls.getConstructor(byte[].class);
                    if (!constructor.isAccessible()) {
                        try {
                            constructor.setAccessible(true);
                        } catch (SecurityException unused) {
                        }
                    }
                    return constructor.newInstance(readBytes);
                } catch (Exception e10) {
                    throw new KryoException(e10);
                }
            }
            if (readVarInt == 2) {
                byte b10 = readBytes[0];
                if (b10 == 0) {
                    return BigInteger.ZERO;
                }
                if (b10 == 1) {
                    return BigInteger.ONE;
                }
                if (b10 == 10) {
                    return BigInteger.TEN;
                }
            }
            return new BigInteger(readBytes);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, BigInteger bigInteger) {
            if (bigInteger == null) {
                output.writeVarInt(0, true);
                return;
            }
            if (bigInteger == BigInteger.ZERO) {
                output.writeVarInt(2, true);
                output.writeByte(0);
            } else {
                byte[] byteArray = bigInteger.toByteArray();
                output.writeVarInt(byteArray.length + 1, true);
                output.writeBytes(byteArray);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class BooleanSerializer extends Serializer<Boolean> {
        public BooleanSerializer() {
            setImmutable(true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.esotericsoftware.kryo.Serializer
        public Boolean read(Kryo kryo, Input input, Class<Boolean> cls) {
            return Boolean.valueOf(input.readBoolean());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Boolean bool) {
            output.writeBoolean(bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public static class ByteSerializer extends Serializer<Byte> {
        public ByteSerializer() {
            setImmutable(true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.esotericsoftware.kryo.Serializer
        public Byte read(Kryo kryo, Input input, Class<Byte> cls) {
            return Byte.valueOf(input.readByte());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Byte b10) {
            output.writeByte(b10.byteValue());
        }
    }

    /* loaded from: classes.dex */
    public static class CalendarSerializer extends Serializer<Calendar> {
        private static final long DEFAULT_GREGORIAN_CUTOVER = -12219292800000L;
        TimeZoneSerializer timeZoneSerializer = new TimeZoneSerializer();

        @Override // com.esotericsoftware.kryo.Serializer
        public Calendar copy(Kryo kryo, Calendar calendar) {
            return (Calendar) calendar.clone();
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Calendar read(Kryo kryo, Input input, Class<Calendar> cls) {
            Calendar calendar = Calendar.getInstance(this.timeZoneSerializer.read(kryo, input, TimeZone.class));
            calendar.setTimeInMillis(input.readLong(true));
            calendar.setLenient(input.readBoolean());
            calendar.setFirstDayOfWeek(input.readInt(true));
            calendar.setMinimalDaysInFirstWeek(input.readInt(true));
            long readLong = input.readLong(false);
            if (readLong != DEFAULT_GREGORIAN_CUTOVER && (calendar instanceof GregorianCalendar)) {
                ((GregorianCalendar) calendar).setGregorianChange(new Date(readLong));
            }
            return calendar;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Calendar calendar) {
            this.timeZoneSerializer.write(kryo, output, calendar.getTimeZone());
            output.writeLong(calendar.getTimeInMillis(), true);
            output.writeBoolean(calendar.isLenient());
            output.writeInt(calendar.getFirstDayOfWeek(), true);
            output.writeInt(calendar.getMinimalDaysInFirstWeek(), true);
            if (calendar instanceof GregorianCalendar) {
                output.writeLong(((GregorianCalendar) calendar).getGregorianChange().getTime(), false);
            } else {
                output.writeLong(DEFAULT_GREGORIAN_CUTOVER, false);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class CharSerializer extends Serializer<Character> {
        public CharSerializer() {
            setImmutable(true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.esotericsoftware.kryo.Serializer
        public Character read(Kryo kryo, Input input, Class<Character> cls) {
            return Character.valueOf(input.readChar());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Character ch) {
            output.writeChar(ch.charValue());
        }
    }

    /* loaded from: classes.dex */
    public static class CharsetSerializer extends Serializer<Charset> {
        public CharsetSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Charset read(Kryo kryo, Input input, Class<Charset> cls) {
            return Charset.forName(input.readString());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Charset charset) {
            output.writeString(charset.name());
        }
    }

    /* loaded from: classes.dex */
    public static class ClassSerializer extends Serializer<Class> {
        public ClassSerializer() {
            setImmutable(true);
            setAcceptsNull(true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.esotericsoftware.kryo.Serializer
        public Class read(Kryo kryo, Input input, Class<Class> cls) {
            Registration readClass = kryo.readClass(input);
            int read = input.read();
            Class type = readClass != null ? readClass.getType() : null;
            return (type == null || !type.isPrimitive() || read == 1) ? type : Util.getWrapperClass(type);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Class cls) {
            kryo.writeClass(output, cls);
            output.writeByte((cls == null || !cls.isPrimitive()) ? 0 : 1);
        }
    }

    /* loaded from: classes.dex */
    public static class CollectionsSingletonListSerializer extends Serializer<List> {
        public CollectionsSingletonListSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public List read(Kryo kryo, Input input, Class<List> cls) {
            return Collections.singletonList(kryo.readClassAndObject(input));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, List list) {
            kryo.writeClassAndObject(output, list.get(0));
        }
    }

    /* loaded from: classes.dex */
    public static class CollectionsSingletonMapSerializer extends Serializer<Map> {
        public CollectionsSingletonMapSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Map read(Kryo kryo, Input input, Class<Map> cls) {
            return Collections.singletonMap(kryo.readClassAndObject(input), kryo.readClassAndObject(input));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Map map) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            kryo.writeClassAndObject(output, entry.getKey());
            kryo.writeClassAndObject(output, entry.getValue());
        }
    }

    /* loaded from: classes.dex */
    public static class CollectionsSingletonSetSerializer extends Serializer<Set> {
        public CollectionsSingletonSetSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Set read(Kryo kryo, Input input, Class<Set> cls) {
            return Collections.singleton(kryo.readClassAndObject(input));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Set set) {
            kryo.writeClassAndObject(output, set.iterator().next());
        }
    }

    /* loaded from: classes.dex */
    public static class CurrencySerializer extends Serializer<Currency> {
        public CurrencySerializer() {
            setImmutable(true);
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Currency read(Kryo kryo, Input input, Class<Currency> cls) {
            String readString = input.readString();
            if (readString == null) {
                return null;
            }
            return Currency.getInstance(readString);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Currency currency) {
            output.writeString(currency == null ? null : currency.getCurrencyCode());
        }
    }

    /* loaded from: classes.dex */
    public static class DateSerializer extends Serializer<Date> {
        private Date create(Kryo kryo, Class<? extends Date> cls, long j10) throws KryoException {
            if (cls != Date.class && cls != null) {
                if (cls == Timestamp.class) {
                    return new Timestamp(j10);
                }
                if (cls == java.sql.Date.class) {
                    return new java.sql.Date(j10);
                }
                if (cls == Time.class) {
                    return new Time(j10);
                }
                try {
                    Constructor<? extends Date> constructor = cls.getConstructor(Long.TYPE);
                    if (!constructor.isAccessible()) {
                        try {
                            constructor.setAccessible(true);
                        } catch (SecurityException unused) {
                        }
                    }
                    return constructor.newInstance(Long.valueOf(j10));
                } catch (Exception unused2) {
                    Date date = (Date) kryo.newInstance(cls);
                    date.setTime(j10);
                    return date;
                }
            }
            return new Date(j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.esotericsoftware.kryo.Serializer
        public Date copy(Kryo kryo, Date date) {
            return create(kryo, date.getClass(), date.getTime());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Date read(Kryo kryo, Input input, Class<Date> cls) {
            return create(kryo, cls, input.readLong(true));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Date date) {
            output.writeLong(date.getTime(), true);
        }
    }

    /* loaded from: classes.dex */
    public static class DoubleSerializer extends Serializer<Double> {
        public DoubleSerializer() {
            setImmutable(true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.esotericsoftware.kryo.Serializer
        public Double read(Kryo kryo, Input input, Class<Double> cls) {
            return Double.valueOf(input.readDouble());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Double d10) {
            output.writeDouble(d10.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static class EnumSerializer extends Serializer<Enum> {
        private Object[] enumConstants;

        public EnumSerializer(Class<? extends Enum> cls) {
            setImmutable(true);
            setAcceptsNull(true);
            Object[] enumConstants = cls.getEnumConstants();
            this.enumConstants = enumConstants;
            if (enumConstants != null) {
                return;
            }
            throw new IllegalArgumentException("The type must be an enum: " + cls);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.esotericsoftware.kryo.Serializer
        public Enum read(Kryo kryo, Input input, Class<Enum> cls) {
            int readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                return null;
            }
            int i10 = readVarInt - 1;
            if (i10 >= 0) {
                Object[] objArr = this.enumConstants;
                if (i10 <= objArr.length - 1) {
                    return (Enum) objArr[i10];
                }
            }
            throw new KryoException("Invalid ordinal for enum \"" + cls.getName() + "\": " + i10);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Enum r32) {
            if (r32 == null) {
                output.writeVarInt(0, true);
            } else {
                output.writeVarInt(r32.ordinal() + 1, true);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class EnumSetSerializer extends Serializer<EnumSet> {
        @Override // com.esotericsoftware.kryo.Serializer
        public EnumSet copy(Kryo kryo, EnumSet enumSet) {
            return EnumSet.copyOf(enumSet);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public EnumSet read(Kryo kryo, Input input, Class<EnumSet> cls) {
            Registration readClass = kryo.readClass(input);
            EnumSet noneOf = EnumSet.noneOf(readClass.getType());
            Serializer serializer = readClass.getSerializer();
            int readInt = input.readInt(true);
            for (int i10 = 0; i10 < readInt; i10++) {
                noneOf.add(serializer.read(kryo, input, null));
            }
            return noneOf;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, EnumSet enumSet) {
            Serializer serializer;
            if (enumSet.isEmpty()) {
                EnumSet complementOf = EnumSet.complementOf(enumSet);
                if (!complementOf.isEmpty()) {
                    serializer = kryo.writeClass(output, complementOf.iterator().next().getClass()).getSerializer();
                } else {
                    throw new KryoException("An EnumSet must have a defined Enum to be serialized.");
                }
            } else {
                serializer = kryo.writeClass(output, enumSet.iterator().next().getClass()).getSerializer();
            }
            output.writeInt(enumSet.size(), true);
            Iterator it = enumSet.iterator();
            while (it.hasNext()) {
                serializer.write(kryo, output, it.next());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class FloatSerializer extends Serializer<Float> {
        public FloatSerializer() {
            setImmutable(true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.esotericsoftware.kryo.Serializer
        public Float read(Kryo kryo, Input input, Class<Float> cls) {
            return Float.valueOf(input.readFloat());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Float f) {
            output.writeFloat(f.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class IntSerializer extends Serializer<Integer> {
        public IntSerializer() {
            setImmutable(true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.esotericsoftware.kryo.Serializer
        public Integer read(Kryo kryo, Input input, Class<Integer> cls) {
            return Integer.valueOf(input.readInt(false));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Integer num) {
            output.writeInt(num.intValue(), false);
        }
    }

    /* loaded from: classes.dex */
    public static class KryoSerializableSerializer extends Serializer<KryoSerializable> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.esotericsoftware.kryo.Serializer
        public KryoSerializable read(Kryo kryo, Input input, Class<KryoSerializable> cls) {
            KryoSerializable kryoSerializable = (KryoSerializable) kryo.newInstance(cls);
            kryo.reference(kryoSerializable);
            kryoSerializable.read(kryo, input);
            return kryoSerializable;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, KryoSerializable kryoSerializable) {
            kryoSerializable.write(kryo, output);
        }
    }

    /* loaded from: classes.dex */
    public static class LocaleSerializer extends Serializer<Locale> {
        public static final Locale SPANISH = new Locale("es", "", "");
        public static final Locale SPAIN = new Locale("es", "ES", "");

        public LocaleSerializer() {
            setImmutable(true);
        }

        public static boolean isSameLocale(Locale locale, String str, String str2, String str3) {
            try {
                if (!locale.getLanguage().equals(str) || !locale.getCountry().equals(str2)) {
                    return false;
                }
                if (!locale.getVariant().equals(str3)) {
                    return false;
                }
                return true;
            } catch (NullPointerException unused) {
                return false;
            }
        }

        public Locale create(String str, String str2, String str3) {
            Locale locale = Locale.getDefault();
            if (isSameLocale(locale, str, str2, str3)) {
                return locale;
            }
            Locale locale2 = Locale.US;
            if (locale != locale2 && isSameLocale(locale2, str, str2, str3)) {
                return locale2;
            }
            Locale locale3 = Locale.ENGLISH;
            if (isSameLocale(locale3, str, str2, str3)) {
                return locale3;
            }
            if (isSameLocale(Locale.GERMAN, str, str2, str3)) {
                return Locale.GERMAN;
            }
            Locale locale4 = SPANISH;
            if (isSameLocale(locale4, str, str2, str3)) {
                return locale4;
            }
            if (isSameLocale(Locale.FRENCH, str, str2, str3)) {
                return Locale.FRENCH;
            }
            if (isSameLocale(Locale.ITALIAN, str, str2, str3)) {
                return Locale.ITALIAN;
            }
            if (isSameLocale(Locale.JAPANESE, str, str2, str3)) {
                return Locale.JAPANESE;
            }
            if (isSameLocale(Locale.KOREAN, str, str2, str3)) {
                return Locale.KOREAN;
            }
            if (isSameLocale(Locale.SIMPLIFIED_CHINESE, str, str2, str3)) {
                return Locale.SIMPLIFIED_CHINESE;
            }
            if (isSameLocale(Locale.CHINESE, str, str2, str3)) {
                return Locale.CHINESE;
            }
            if (isSameLocale(Locale.TRADITIONAL_CHINESE, str, str2, str3)) {
                return Locale.TRADITIONAL_CHINESE;
            }
            if (isSameLocale(Locale.UK, str, str2, str3)) {
                return Locale.UK;
            }
            if (isSameLocale(Locale.GERMANY, str, str2, str3)) {
                return Locale.GERMANY;
            }
            Locale locale5 = SPAIN;
            if (isSameLocale(locale5, str, str2, str3)) {
                return locale5;
            }
            if (isSameLocale(Locale.FRANCE, str, str2, str3)) {
                return Locale.FRANCE;
            }
            if (isSameLocale(Locale.ITALY, str, str2, str3)) {
                return Locale.ITALY;
            }
            if (isSameLocale(Locale.JAPAN, str, str2, str3)) {
                return Locale.JAPAN;
            }
            if (isSameLocale(Locale.KOREA, str, str2, str3)) {
                return Locale.KOREA;
            }
            if (isSameLocale(Locale.CANADA, str, str2, str3)) {
                return Locale.CANADA;
            }
            if (isSameLocale(Locale.CANADA_FRENCH, str, str2, str3)) {
                return Locale.CANADA_FRENCH;
            }
            return new Locale(str, str2, str3);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Locale read(Kryo kryo, Input input, Class<Locale> cls) {
            return create(input.readString(), input.readString(), input.readString());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Locale locale) {
            output.writeAscii(locale.getLanguage());
            output.writeAscii(locale.getCountry());
            output.writeString(locale.getVariant());
        }
    }

    /* loaded from: classes.dex */
    public static class LongSerializer extends Serializer<Long> {
        public LongSerializer() {
            setImmutable(true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.esotericsoftware.kryo.Serializer
        public Long read(Kryo kryo, Input input, Class<Long> cls) {
            return Long.valueOf(input.readLong(false));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Long l10) {
            output.writeLong(l10.longValue(), false);
        }
    }

    /* loaded from: classes.dex */
    public static class ShortSerializer extends Serializer<Short> {
        public ShortSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Short read(Kryo kryo, Input input, Class<Short> cls) {
            return Short.valueOf(input.readShort());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Short sh) {
            output.writeShort(sh.shortValue());
        }
    }

    /* loaded from: classes.dex */
    public static class StringBufferSerializer extends Serializer<StringBuffer> {
        public StringBufferSerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public StringBuffer copy(Kryo kryo, StringBuffer stringBuffer) {
            return new StringBuffer(stringBuffer);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public StringBuffer read(Kryo kryo, Input input, Class<StringBuffer> cls) {
            String readString = input.readString();
            if (readString == null) {
                return null;
            }
            return new StringBuffer(readString);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, StringBuffer stringBuffer) {
            output.writeString(stringBuffer);
        }
    }

    /* loaded from: classes.dex */
    public static class StringBuilderSerializer extends Serializer<StringBuilder> {
        public StringBuilderSerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public StringBuilder copy(Kryo kryo, StringBuilder sb2) {
            return new StringBuilder(sb2);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public StringBuilder read(Kryo kryo, Input input, Class<StringBuilder> cls) {
            return input.readStringBuilder();
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, StringBuilder sb2) {
            output.writeString(sb2);
        }
    }

    /* loaded from: classes.dex */
    public static class StringSerializer extends Serializer<String> {
        public StringSerializer() {
            setImmutable(true);
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public String read(Kryo kryo, Input input, Class<String> cls) {
            return input.readString();
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, String str) {
            output.writeString(str);
        }
    }

    /* loaded from: classes.dex */
    public static class TimeZoneSerializer extends Serializer<TimeZone> {
        public TimeZoneSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public TimeZone read(Kryo kryo, Input input, Class<TimeZone> cls) {
            return TimeZone.getTimeZone(input.readString());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, TimeZone timeZone) {
            output.writeString(timeZone.getID());
        }
    }

    /* loaded from: classes.dex */
    public static class TreeMapSerializer extends MapSerializer {
        private TreeMap createTreeMap(Class<? extends Map> cls, Comparator comparator) {
            if (cls != TreeMap.class && cls != null) {
                try {
                    Constructor<? extends Map> constructor = cls.getConstructor(Comparator.class);
                    if (!constructor.isAccessible()) {
                        try {
                            constructor.setAccessible(true);
                        } catch (SecurityException unused) {
                        }
                    }
                    return (TreeMap) constructor.newInstance(comparator);
                } catch (Exception e10) {
                    throw new KryoException(e10);
                }
            }
            return new TreeMap(comparator);
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public Map create(Kryo kryo, Input input, Class<Map> cls) {
            return createTreeMap(cls, (Comparator) kryo.readClassAndObject(input));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public Map createCopy(Kryo kryo, Map map) {
            return createTreeMap(map.getClass(), ((TreeMap) map).comparator());
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer, com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Map map) {
            kryo.writeClassAndObject(output, ((TreeMap) map).comparator());
            super.write(kryo, output, map);
        }
    }

    /* loaded from: classes.dex */
    public static class TreeSetSerializer extends CollectionSerializer {
        private TreeSet createTreeSet(Class<? extends Collection> cls, Comparator comparator) {
            if (cls != TreeSet.class && cls != null) {
                try {
                    Constructor<? extends Collection> constructor = cls.getConstructor(Comparator.class);
                    if (!constructor.isAccessible()) {
                        try {
                            constructor.setAccessible(true);
                        } catch (SecurityException unused) {
                        }
                    }
                    return (TreeSet) constructor.newInstance(comparator);
                } catch (Exception e10) {
                    throw new KryoException(e10);
                }
            }
            return new TreeSet(comparator);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public /* bridge */ /* synthetic */ Collection create(Kryo kryo, Input input, Class cls) {
            return create(kryo, input, (Class<Collection>) cls);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public TreeSet create(Kryo kryo, Input input, Class<Collection> cls) {
            return createTreeSet(cls, (Comparator) kryo.readClassAndObject(input));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public TreeSet createCopy(Kryo kryo, Collection collection) {
            return createTreeSet(collection.getClass(), ((TreeSet) collection).comparator());
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Collection collection) {
            kryo.writeClassAndObject(output, ((TreeSet) collection).comparator());
            super.write(kryo, output, collection);
        }
    }

    /* loaded from: classes.dex */
    public static class URLSerializer extends Serializer<URL> {
        public URLSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public URL read(Kryo kryo, Input input, Class<URL> cls) {
            try {
                return new URL(input.readString());
            } catch (MalformedURLException e10) {
                throw new KryoException(e10);
            }
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, URL url) {
            output.writeString(url.toExternalForm());
        }
    }

    /* loaded from: classes.dex */
    public static class CollectionsEmptyListSerializer extends Serializer {
        public CollectionsEmptyListSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Object read(Kryo kryo, Input input, Class cls) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Object obj) {
        }
    }

    /* loaded from: classes.dex */
    public static class CollectionsEmptyMapSerializer extends Serializer {
        public CollectionsEmptyMapSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Object read(Kryo kryo, Input input, Class cls) {
            return Collections.EMPTY_MAP;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Object obj) {
        }
    }

    /* loaded from: classes.dex */
    public static class CollectionsEmptySetSerializer extends Serializer {
        public CollectionsEmptySetSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Object read(Kryo kryo, Input input, Class cls) {
            return Collections.EMPTY_SET;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Object obj) {
        }
    }

    /* loaded from: classes.dex */
    public static class VoidSerializer extends Serializer {
        public VoidSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Object read(Kryo kryo, Input input, Class cls) {
            return null;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Object obj) {
        }
    }
}
