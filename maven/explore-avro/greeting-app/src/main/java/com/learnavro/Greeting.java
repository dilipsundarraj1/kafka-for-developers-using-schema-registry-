/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.learnavro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Greeting extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6252558101484479378L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Greeting\",\"namespace\":\"com.learnavro\",\"fields\":[{\"name\":\"greeting\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"string\",\"logicalType\":\"uuid\"},{\"name\":\"createdDateTime\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"createdDate\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"createdDateTimeLocal\",\"type\":{\"type\":\"long\",\"logicalType\":\"local-timestamp-millis\"}},{\"name\":\"cost\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":4,\"scale\":3}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<Greeting> ENCODER =
      new BinaryMessageEncoder<Greeting>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Greeting> DECODER =
      new BinaryMessageDecoder<Greeting>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Greeting> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Greeting> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Greeting> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Greeting>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Greeting to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Greeting from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Greeting instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Greeting fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence greeting;
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.time.Instant createdDateTime;
  @Deprecated public java.time.LocalDate createdDate;
  @Deprecated public long createdDateTimeLocal;
  @Deprecated public java.nio.ByteBuffer cost;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Greeting() {}

  /**
   * All-args constructor.
   * @param greeting The new value for greeting
   * @param id The new value for id
   * @param createdDateTime The new value for createdDateTime
   * @param createdDate The new value for createdDate
   * @param createdDateTimeLocal The new value for createdDateTimeLocal
   * @param cost The new value for cost
   */
  public Greeting(java.lang.CharSequence greeting, java.lang.CharSequence id, java.time.Instant createdDateTime, java.time.LocalDate createdDate, java.lang.Long createdDateTimeLocal, java.nio.ByteBuffer cost) {
    this.greeting = greeting;
    this.id = id;
    this.createdDateTime = createdDateTime.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
    this.createdDate = createdDate;
    this.createdDateTimeLocal = createdDateTimeLocal;
    this.cost = cost;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return greeting;
    case 1: return id;
    case 2: return createdDateTime;
    case 3: return createdDate;
    case 4: return createdDateTimeLocal;
    case 5: return cost;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
      new org.apache.avro.data.TimeConversions.DateConversion(),
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: greeting = (java.lang.CharSequence)value$; break;
    case 1: id = (java.lang.CharSequence)value$; break;
    case 2: createdDateTime = (java.time.Instant)value$; break;
    case 3: createdDate = (java.time.LocalDate)value$; break;
    case 4: createdDateTimeLocal = (java.lang.Long)value$; break;
    case 5: cost = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'greeting' field.
   * @return The value of the 'greeting' field.
   */
  public java.lang.CharSequence getGreeting() {
    return greeting;
  }


  /**
   * Sets the value of the 'greeting' field.
   * @param value the value to set.
   */
  public void setGreeting(java.lang.CharSequence value) {
    this.greeting = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'createdDateTime' field.
   * @return The value of the 'createdDateTime' field.
   */
  public java.time.Instant getCreatedDateTime() {
    return createdDateTime;
  }


  /**
   * Sets the value of the 'createdDateTime' field.
   * @param value the value to set.
   */
  public void setCreatedDateTime(java.time.Instant value) {
    this.createdDateTime = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Gets the value of the 'createdDate' field.
   * @return The value of the 'createdDate' field.
   */
  public java.time.LocalDate getCreatedDate() {
    return createdDate;
  }


  /**
   * Sets the value of the 'createdDate' field.
   * @param value the value to set.
   */
  public void setCreatedDate(java.time.LocalDate value) {
    this.createdDate = value;
  }

  /**
   * Gets the value of the 'createdDateTimeLocal' field.
   * @return The value of the 'createdDateTimeLocal' field.
   */
  public long getCreatedDateTimeLocal() {
    return createdDateTimeLocal;
  }


  /**
   * Sets the value of the 'createdDateTimeLocal' field.
   * @param value the value to set.
   */
  public void setCreatedDateTimeLocal(long value) {
    this.createdDateTimeLocal = value;
  }

  /**
   * Gets the value of the 'cost' field.
   * @return The value of the 'cost' field.
   */
  public java.nio.ByteBuffer getCost() {
    return cost;
  }


  /**
   * Sets the value of the 'cost' field.
   * @param value the value to set.
   */
  public void setCost(java.nio.ByteBuffer value) {
    this.cost = value;
  }

  /**
   * Creates a new Greeting RecordBuilder.
   * @return A new Greeting RecordBuilder
   */
  public static com.learnavro.Greeting.Builder newBuilder() {
    return new com.learnavro.Greeting.Builder();
  }

  /**
   * Creates a new Greeting RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Greeting RecordBuilder
   */
  public static com.learnavro.Greeting.Builder newBuilder(com.learnavro.Greeting.Builder other) {
    if (other == null) {
      return new com.learnavro.Greeting.Builder();
    } else {
      return new com.learnavro.Greeting.Builder(other);
    }
  }

  /**
   * Creates a new Greeting RecordBuilder by copying an existing Greeting instance.
   * @param other The existing instance to copy.
   * @return A new Greeting RecordBuilder
   */
  public static com.learnavro.Greeting.Builder newBuilder(com.learnavro.Greeting other) {
    if (other == null) {
      return new com.learnavro.Greeting.Builder();
    } else {
      return new com.learnavro.Greeting.Builder(other);
    }
  }

  /**
   * RecordBuilder for Greeting instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Greeting>
    implements org.apache.avro.data.RecordBuilder<Greeting> {

    private java.lang.CharSequence greeting;
    private java.lang.CharSequence id;
    private java.time.Instant createdDateTime;
    private java.time.LocalDate createdDate;
    private long createdDateTimeLocal;
    private java.nio.ByteBuffer cost;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.learnavro.Greeting.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.greeting)) {
        this.greeting = data().deepCopy(fields()[0].schema(), other.greeting);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.createdDateTime)) {
        this.createdDateTime = data().deepCopy(fields()[2].schema(), other.createdDateTime);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.createdDate)) {
        this.createdDate = data().deepCopy(fields()[3].schema(), other.createdDate);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.createdDateTimeLocal)) {
        this.createdDateTimeLocal = data().deepCopy(fields()[4].schema(), other.createdDateTimeLocal);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.cost)) {
        this.cost = data().deepCopy(fields()[5].schema(), other.cost);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing Greeting instance
     * @param other The existing instance to copy.
     */
    private Builder(com.learnavro.Greeting other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.greeting)) {
        this.greeting = data().deepCopy(fields()[0].schema(), other.greeting);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.createdDateTime)) {
        this.createdDateTime = data().deepCopy(fields()[2].schema(), other.createdDateTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.createdDate)) {
        this.createdDate = data().deepCopy(fields()[3].schema(), other.createdDate);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.createdDateTimeLocal)) {
        this.createdDateTimeLocal = data().deepCopy(fields()[4].schema(), other.createdDateTimeLocal);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.cost)) {
        this.cost = data().deepCopy(fields()[5].schema(), other.cost);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'greeting' field.
      * @return The value.
      */
    public java.lang.CharSequence getGreeting() {
      return greeting;
    }


    /**
      * Sets the value of the 'greeting' field.
      * @param value The value of 'greeting'.
      * @return This builder.
      */
    public com.learnavro.Greeting.Builder setGreeting(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.greeting = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'greeting' field has been set.
      * @return True if the 'greeting' field has been set, false otherwise.
      */
    public boolean hasGreeting() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'greeting' field.
      * @return This builder.
      */
    public com.learnavro.Greeting.Builder clearGreeting() {
      greeting = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.learnavro.Greeting.Builder setId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.learnavro.Greeting.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdDateTime' field.
      * @return The value.
      */
    public java.time.Instant getCreatedDateTime() {
      return createdDateTime;
    }


    /**
      * Sets the value of the 'createdDateTime' field.
      * @param value The value of 'createdDateTime'.
      * @return This builder.
      */
    public com.learnavro.Greeting.Builder setCreatedDateTime(java.time.Instant value) {
      validate(fields()[2], value);
      this.createdDateTime = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'createdDateTime' field has been set.
      * @return True if the 'createdDateTime' field has been set, false otherwise.
      */
    public boolean hasCreatedDateTime() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'createdDateTime' field.
      * @return This builder.
      */
    public com.learnavro.Greeting.Builder clearCreatedDateTime() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdDate' field.
      * @return The value.
      */
    public java.time.LocalDate getCreatedDate() {
      return createdDate;
    }


    /**
      * Sets the value of the 'createdDate' field.
      * @param value The value of 'createdDate'.
      * @return This builder.
      */
    public com.learnavro.Greeting.Builder setCreatedDate(java.time.LocalDate value) {
      validate(fields()[3], value);
      this.createdDate = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'createdDate' field has been set.
      * @return True if the 'createdDate' field has been set, false otherwise.
      */
    public boolean hasCreatedDate() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'createdDate' field.
      * @return This builder.
      */
    public com.learnavro.Greeting.Builder clearCreatedDate() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdDateTimeLocal' field.
      * @return The value.
      */
    public long getCreatedDateTimeLocal() {
      return createdDateTimeLocal;
    }


    /**
      * Sets the value of the 'createdDateTimeLocal' field.
      * @param value The value of 'createdDateTimeLocal'.
      * @return This builder.
      */
    public com.learnavro.Greeting.Builder setCreatedDateTimeLocal(long value) {
      validate(fields()[4], value);
      this.createdDateTimeLocal = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'createdDateTimeLocal' field has been set.
      * @return True if the 'createdDateTimeLocal' field has been set, false otherwise.
      */
    public boolean hasCreatedDateTimeLocal() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'createdDateTimeLocal' field.
      * @return This builder.
      */
    public com.learnavro.Greeting.Builder clearCreatedDateTimeLocal() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'cost' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getCost() {
      return cost;
    }


    /**
      * Sets the value of the 'cost' field.
      * @param value The value of 'cost'.
      * @return This builder.
      */
    public com.learnavro.Greeting.Builder setCost(java.nio.ByteBuffer value) {
      validate(fields()[5], value);
      this.cost = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'cost' field has been set.
      * @return True if the 'cost' field has been set, false otherwise.
      */
    public boolean hasCost() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'cost' field.
      * @return This builder.
      */
    public com.learnavro.Greeting.Builder clearCost() {
      cost = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Greeting build() {
      try {
        Greeting record = new Greeting();
        record.greeting = fieldSetFlags()[0] ? this.greeting : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.createdDateTime = fieldSetFlags()[2] ? this.createdDateTime : (java.time.Instant) defaultValue(fields()[2]);
        record.createdDate = fieldSetFlags()[3] ? this.createdDate : (java.time.LocalDate) defaultValue(fields()[3]);
        record.createdDateTimeLocal = fieldSetFlags()[4] ? this.createdDateTimeLocal : (java.lang.Long) defaultValue(fields()[4]);
        record.cost = fieldSetFlags()[5] ? this.cost : (java.nio.ByteBuffer) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Greeting>
    WRITER$ = (org.apache.avro.io.DatumWriter<Greeting>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Greeting>
    READER$ = (org.apache.avro.io.DatumReader<Greeting>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










