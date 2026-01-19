package de.xjustiz.core.serialization;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;

/**
 * Serializer for X.Justiz Core messages.
 * Supports XML (canonical) and JSON formats using German property names as
 * defined in the .NET project.
 */
public class XJustizSerializer {

    private final Format format;
    private final ObjectMapper mapper;
    private final boolean failOnUnknownProperties;

    private XJustizSerializer(Format format, boolean failOnUnknownProperties) {
        this.format = format;
        this.failOnUnknownProperties = failOnUnknownProperties;
        this.mapper = createMapper(format, failOnUnknownProperties);
    }

    /**
     * Creates a new builder for configuring the serializer.
     *
     * @return a new builder instance
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Creates a default serializer with XML format (canonical X.Justiz).
     *
     * @return a default serializer instance
     */
    public static XJustizSerializer createDefault() {
        return builder().format(Format.XML).build();
    }

    /**
     * Creates a JSON serializer.
     *
     * @return a JSON serializer instance
     */
    public static XJustizSerializer createJson() {
        return builder().format(Format.JSON).build();
    }

    /**
     * Serializes an object to a string.
     *
     * @param object the object to serialize
     * @return the serialized string
     * @throws SerializationException if serialization fails
     */
    public String serialize(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (IOException e) {
            throw new SerializationException("Failed to serialize object", e);
        }
    }

    /**
     * Serializes an object to a pretty-printed string.
     *
     * @param object the object to serialize
     * @return the pretty-printed serialized string
     * @throws SerializationException if serialization fails
     */
    public String serializePretty(Object object) {
        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        } catch (IOException e) {
            throw new SerializationException("Failed to serialize object", e);
        }
    }

    /**
     * Deserializes a string to an object of the specified type.
     *
     * @param content the string to deserialize
     * @param type    the target type
     * @param <T>     the type parameter
     * @return the deserialized object
     * @throws SerializationException if deserialization fails
     */
    public <T> T deserialize(String content, Class<T> type) {
        try {
            return mapper.readValue(content, type);
        } catch (IOException e) {
            throw new SerializationException("Failed to deserialize content", e);
        }
    }

    /**
     * Gets the configured format.
     *
     * @return the format
     */
    public Format getFormat() {
        return format;
    }

    private static ObjectMapper createMapper(Format format, boolean failOnUnknownProperties) {
        ObjectMapper mapper = format == Format.XML
                ? XmlMapper.builder().build()
                : new ObjectMapper();

        // Configure common settings
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, failOnUnknownProperties);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        return mapper;
    }

    /**
     * Builder for creating XJustizSerializer instances.
     */
    public static class Builder {
        private Format format = Format.XML;
        private boolean failOnUnknownProperties = false;

        private Builder() {
        }

        /**
         * Sets the serialization format.
         *
         * @param format the format to use
         * @return this builder
         */
        public Builder format(Format format) {
            this.format = format;
            return this;
        }

        /**
         * Sets whether to fail on unknown properties during deserialization.
         * Default is false (unknown properties are ignored).
         *
         * @param failOnUnknownProperties whether to fail on unknown properties
         * @return this builder
         */
        public Builder failOnUnknownProperties(boolean failOnUnknownProperties) {
            this.failOnUnknownProperties = failOnUnknownProperties;
            return this;
        }

        /**
         * Builds the serializer.
         *
         * @return a new XJustizSerializer instance
         */
        public XJustizSerializer build() {
            return new XJustizSerializer(format, failOnUnknownProperties);
        }
    }
}
