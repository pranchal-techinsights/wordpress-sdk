package consulting.pigott.wordpress.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = EnumSerializer.class)
@JsonDeserialize(using = CommentStatusDeserializer.class)
public enum CommentStatus {
    OPEN,
    CLOSED;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

    public static CommentStatus fromString(String displayVal) {
        return CommentStatus.valueOf(displayVal.toUpperCase());
    }
}
